package org.uma.data.ingestion.service;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.uma.data.ingestion.dto.RawDto;
import org.uma.data.ingestion.entity.Raw;
import org.uma.data.ingestion.repository.RawRepository;

@Service
public class RawService {

    @Autowired
    RawRepository repository;

    public void insert(RawDto raw) {

        DozerBeanMapper mapper = new DozerBeanMapper();

        Raw entity = mapper.map(raw, Raw.class);

        repository.save(entity);
    }

    public List<RawDto> getAll() {

        DozerBeanMapper mapper = new DozerBeanMapper();
        List<Raw> raws = repository.findAll();
        List<RawDto> out = new ArrayList<RawDto>();

        raws.forEach(r -> out.add(mapper.map(r, RawDto.class)));

        return out;
    }
}
