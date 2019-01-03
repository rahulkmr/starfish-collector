package com.mygdx.game.starfish;

import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.Action;


public class Starfish extends BaseActor {
    public Starfish(float x, float y, Stage s) {
        super(x, y, s);

        loadTexture("assets/starfish.png");

        Action spin = Actions.rotateBy(30, 1);
        addAction(Actions.forever(spin));
    }
}