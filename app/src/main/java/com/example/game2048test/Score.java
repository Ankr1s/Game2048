package com.example.game2048test;

public class Score {

    private int id;
    private String name;
    private String score;
    private String time;



    public Score() {
    }

    public Score(String name, String score, String time) {
        this.name = name;
        this.score = score;
        this.time = time;
    }

    public Score(int id, String name, String score, String time) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public String getTime() {
        return time;
    }
}
