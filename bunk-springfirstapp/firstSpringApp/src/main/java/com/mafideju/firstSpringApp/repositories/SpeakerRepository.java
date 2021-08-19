package com.mafideju.firstSpringApp.repositories;

import com.mafideju.firstSpringApp.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
