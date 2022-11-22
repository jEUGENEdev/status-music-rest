package com.jeugenedev.status_music.controller;

import com.jeugenedev.status_music.model.StatusSessionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/status.session")
public class StatusSessionController {
    private StatusSessionModel statusSessionModel;

    @Autowired
    public StatusSessionController(StatusSessionModel statusSessionModel) {
        this.statusSessionModel = statusSessionModel;
    }

    @PostMapping("/create")
    public String createSession(HttpServletRequest request) {
        return statusSessionModel.createSession(request.getRemoteAddr());
    }
}
