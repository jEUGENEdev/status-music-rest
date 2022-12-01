package com.jeugenedev.status_music.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@RestController
@RequestMapping("/download-server/download/files/file")
public class DownloadController {
    private void returnApk(String version, String apkName, HttpServletResponse response) throws IOException {
        InputStream inputStream = getClass().getResourceAsStream(String.format("/files/%s/%s.apk", version, apkName));
        response.setContentType("application/vnd.android.package-archive");
        inputStream.transferTo(response.getOutputStream());
        inputStream.close();
    }

    @RequestMapping(value = "/v1/apk/streammusic/get/streammusic-v1.0.0.apk", method = {RequestMethod.GET, RequestMethod.POST})
    public void apk1_0_0(HttpServletResponse response) throws IOException {
        returnApk("v1", "streammusic-v1.0.0", response);
    }

    @RequestMapping(value = "/v1/apk/streammusic/get/streammusic-v1.0.1.apk", method = {RequestMethod.GET, RequestMethod.POST})
    public void apk1_0_1(HttpServletResponse response) throws IOException {
        returnApk("v1", "streammusic-v1.0.1", response);
    }
}
