package com.mafideju.service;

import com.mafideju.model.Speaker;
import com.mafideju.repository.HibernateSpeakerRepositoryImpl;
import com.mafideju.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
        System.out.println("No args Constructor");
    }

    public SpeakerServiceImpl (SpeakerRepository speakerRepository) {
        System.out.println("SpeakerServiceImpl repository Constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        System.out.println("Speaker Service Setter");
        this.repository = repository;
    }
}
