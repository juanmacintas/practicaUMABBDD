package org.uma.data.ingestion.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.uma.data.ingestion.dto.CleanDto;
import org.uma.data.ingestion.entity.Clean;
import org.uma.data.ingestion.entity.Raw;
import org.uma.data.ingestion.repository.CleanRepository;
import org.uma.data.ingestion.repository.RawRepository;

@Service
public class CleanService {

    @Autowired
    RawRepository rawRepository;

    @Autowired
    CleanRepository cleanRepository;

    @Value("${org.uma.data.clean}")
    Integer cleanPercentaje;

    public List<CleanDto> clean() {

        // retrieve all raw data
        List<Raw> rawdata = rawRepository.findAll();

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
        rawdata.forEach(r -> cleanRepository.save(mapper.map(r, Clean.class)));

        return getAll();
    }

    public List<CleanDto> getAll() {

        DozerBeanMapper mapper = new DozerBeanMapper();
        List<Clean> raws = cleanRepository.findAll();
        List<CleanDto> out = new ArrayList<CleanDto>();

        raws.forEach(r -> out.add(mapper.map(r, CleanDto.class)));

        return out;
    }
}
