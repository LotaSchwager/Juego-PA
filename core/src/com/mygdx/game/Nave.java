package com.mygdx.game;

import com.badlogic.gdx.Gdx;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;




public abstract class Nave extends Entidad {
	
    protected Sprite spr;
    
    
    public Nave(int x, int y, Texture tx) {
    	super(x,y,tx);
    }
    
   

}

