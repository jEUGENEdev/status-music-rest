package com.jeugenedev.status_music.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/download-server/download/files")
public class DownloadController {
    @RequestMapping(value = "/file/v1/apk/streammusic/get/streammusic-v1.apk", method = {RequestMethod.GET, RequestMethod.POST})
    public void apk(HttpServletResponse response) throws IOException {
        InputStream inputStream = getClass().getResourceAsStream("/files/v1/streammusic.apk");
        response.setContentType("application/vnd.android.package-archive");
        inputStream.transferTo(response.getOutputStream());
        inputStream.close();
    }
}
