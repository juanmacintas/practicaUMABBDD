package org.restalion.data.ingestion.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.restalion.data.ingestion.dto.RawDto;
import org.restalion.data.ingestion.entities.Raw;
import org.restalion.data.ingestion.repository.RawRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Iterator<Raw> raws = repository.findAll().iterator();
        List<RawDto> out = new ArrayList<RawDto>();

        while(raws.hasNext()) {
            out.add(mapper.map(raws.next(), RawDto.class));
        }

        return out;
    }
}
