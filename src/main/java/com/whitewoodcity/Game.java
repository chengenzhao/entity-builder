package com.whitewoodcity;

import com.almasb.fxgl.app.CursorInfo;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import javafx.scene.Cursor;

public class Game extends GameApplication {
    @Override
    protected void initSettings(GameSettings settings) {
        settings.setDefaultCursor(new CursorInfo("cursor.png",3,3));
    }
}
