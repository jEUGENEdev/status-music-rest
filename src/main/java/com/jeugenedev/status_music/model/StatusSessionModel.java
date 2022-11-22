package com.jeugenedev.status_music.model;

import com.jeugenedev.status_music.entity.StatusSession;
import com.jeugenedev.status_music.repos.StatusSessionRepos;
import com.jeugenedev.status_music.utils.StringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatusSessionModel {
    private StatusSessionRepos statusSessionRepos;
    private StringGenerator stringGenerator;

    @Autowired
    public StatusSessionModel(StatusSessionRepos statusSessionRepos, StringGenerator stringGenerator) {
        this.statusSessionRepos = statusSessionRepos;
        this.stringGenerator = stringGenerator;
    }

    public String createSession(String ip) {
        String path = stringGenerator.generateLatinString(100);
        StatusSession statusSession = statusSessionRepos.save(new StatusSession(path, null, null, ip));
        return statusSession.toString();
    }
}
