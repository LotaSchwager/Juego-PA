package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public abstract class Nave extends Entidad implements Acciones{
    
    public Nave(int x, int y, Texture tx, int vida) {
    	super(x,y,tx,vida);
    }
    
}

