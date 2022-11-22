package com.jeugenedev.status_music.repos;

import com.jeugenedev.status_music.entity.StatusSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusSessionRepos extends JpaRepository<StatusSession, Long> {
}
