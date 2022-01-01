package org.uma.data.ingestion.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.uma.data.ingestion.dto.RawDto;
import org.uma.data.ingestion.entity.Raw;
import org.uma.data.ingestion.repository.RawRepository;

@Service
public class CleanService {

    @Autowired
    RawRepository repository;

    @Value("${org.uma.data.clean}")
    Integer cleanPercentaje;
    
    public List<RawDto> clean() {

        // retrieve all raw data
        List<Raw> rawdata = repository.findAll();

        // decide number of rows to remove
        Integer rowsToRemove = rawdata.size()/cleanPercentaje;

        // create random seed
        Random rand = new Random(); 

        // remove rows to clean
        for (int i = 0; i < rowsToRemove; i++) {
            int int_random = rand.nextInt(rawdata.size());
            rawdata.remove(int_random);
        }

        // prepare return data
        DozerBeanMapper mapper = new DozerBeanMapper();
        List<RawDto> out = new ArrayList<RawDto>();
        rawdata.forEach(r -> out.add(mapper.map(r, RawDto.class)));

        return out;
    }
}
