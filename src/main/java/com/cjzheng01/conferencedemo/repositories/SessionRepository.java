package com.cjzheng01.conferencedemo.repositories;

import com.cjzheng01.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
