package com.mafideju.service;

import com.mafideju.model.Speaker;
import com.mafideju.repository.HibernateSpeakerRepositoryImpl;
import com.mafideju.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
