package com.mafideju.firstSpringApp.repositories;

import com.mafideju.firstSpringApp.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
