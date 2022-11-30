package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entidad {
	private int vida;
    protected Sprite spr;
    
    public Entidad(int x, int y, Texture imagen, int vida) {
    	spr = new Sprite(imagen);
    	spr.setPosition(x, y);
    	spr.setOriginCenter();
    	this.vida = vida;
    }
    
    public int getVida() {return vida;}
    
    public void setVida(int vida) {this.vida = vida;}
    
    public int getX() {return (int) spr.getX();}
    
    public int getY() {return (int) spr.getY();}
    
    public Sprite getSpr() {return this.spr;}
    
    public abstract void draw(SpriteBatch batch);
    
    public abstract void dispose();
    
    public abstract Rectangle getArea();

}
