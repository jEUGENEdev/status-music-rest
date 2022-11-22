package com.jeugenedev.status_music.entity;

import javax.persistence.*;

@Entity
public class StatusSession {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(length = 100)
    private String pathValue;
    @Column(length = 1024)
    private String musicAvatarLink;
    private String musicName;
    @Column(length = 64)
    private String ownerIpAddress;

    public StatusSession() {}

    public StatusSession(String pathValue, String musicAvatarLink, String musicName, String ownerIpAddress) {
        this.pathValue = pathValue;
        this.musicAvatarLink = musicAvatarLink;
        this.musicName = musicName;
        this.ownerIpAddress = ownerIpAddress;
    }

    public long getId() {
        return id;
    }

    public String getPathValue() {
        return pathValue;
    }

    public void setPathValue(String pathValue) {
        this.pathValue = pathValue;
    }

    public String getMusicAvatarLink() {
        return musicAvatarLink;
    }

    public void setMusicAvatarLink(String musicAvatarLink) {
        this.musicAvatarLink = musicAvatarLink;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getOwnerIpAddress() {
        return ownerIpAddress;
    }

    public void setOwnerIpAddress(String ownerIpAddress) {
        this.ownerIpAddress = ownerIpAddress;
    }

    @Override
    public String toString() {
        return "StatusSession{" +
                "id=" + id +
                ", pathValue='" + pathValue + '\'' +
                ", musicAvatarLink='" + musicAvatarLink + '\'' +
                ", musicName='" + musicName + '\'' +
                ", ownerIpAddress='" + ownerIpAddress + '\'' +
                '}';
    }
}
