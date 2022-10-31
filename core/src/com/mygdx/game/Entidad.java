package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Entidad {
	private int vida;
    protected Sprite spr;
    
    public Entidad(int x, int y, Texture imagen) {
    	spr = new Sprite(imagen); 
    	spr.setPosition(x, y);
    	spr.setOriginCenter();

    }
    
    public int getVida() {
    	return vida;
    }
    
    
    public void setVida(int vida) {
    	this.vida = vida;
    }
    
    public int getX() {
    	return (int) spr.getX();
    }
    
    public int getY() {
    	return (int) spr.getY();
    }
    
    
    public abstract void draw(SpriteBatch batch);
    
    public abstract void dispose();
    


}
