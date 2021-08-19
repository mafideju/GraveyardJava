package com.mafideju.repository;

import com.mafideju.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Marcio");
        speaker.setLastName("Rodrigues");

//        speaker.setFirstName("Miriam");
//        speaker.setLastName("Makeba");

        speakers.add(speaker);

        return speakers;
    }
}
