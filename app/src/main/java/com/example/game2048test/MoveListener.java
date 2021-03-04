package com.example.game2048test;


public interface MoveListener {

    public void onMove(int score, boolean gameOver, boolean newSquare);
}
