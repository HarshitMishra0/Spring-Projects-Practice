package com.springProject.projectspringframework;

public class AppGamingBasicsJava {
    public static void main(String args[]){

       // var game = new MarioGame();
       // var game = new SuperContraGame();
        var game = new PacmanGame();

        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
