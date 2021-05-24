package com.whitewoodcity;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){
        Main.launch(Main.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        var game = new Game();
        var gamePanel = Game.embeddedLaunch(game);

        stage.setScene(new Scene(gamePanel));
        stage.show();
    }
}
