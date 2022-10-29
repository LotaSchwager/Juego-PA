package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public abstract class Entidad {
	private int vida;
    protected Sprite spr;
    private Texture aspecto;
    
    public Entidad(int x, int y, Texture imagen) {
    	aspecto = imagen;
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
    
    public void setPosition(float x, float y) {
    	spr.setPosition(x, y); 
    }
    
    public abstract void draw(SpriteBatch batch, PantallaJuego juego);
    
    public abstract void dispose();
    


}
