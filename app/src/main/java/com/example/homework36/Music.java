package com.example.homework36;

public class Music {
    private String count;
    private String time;
    private String singer;
    private String nameMusic;

    public Music(String count, String time, String singer, String nameMusic) {
        this.count = count;
        this.time = time;
        this.singer = singer;
        this.nameMusic = nameMusic;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getNameMusic() {
        return nameMusic;
    }

    public void setNameMusic(String nameMusic) {
        this.nameMusic = nameMusic;
    }
}
