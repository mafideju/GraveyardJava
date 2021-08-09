package com.mafideju.repository;

import com.mafideju.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
