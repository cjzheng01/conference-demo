package com.cjzheng01.conferencedemo.repositories;

import com.cjzheng01.conferencedemo.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
