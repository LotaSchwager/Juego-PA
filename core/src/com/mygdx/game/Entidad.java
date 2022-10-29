package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public abstract class Entidad {
	private int vida;
    private Sprite spr;
    private Sound sonidoMuerte;
    private Texture aspecto;
    
    public Entidad(int x, int y, Texture imagen,Sound sound) {
    	sonidoMuerte = sound;
    	aspecto = imagen;
    	spr = new Sprite(aspecto);
    	spr.setPosition(x, y);
    	spr.setBounds(x, y, 45, 45);

    }
    
    public abstract void draw();
    
    public abstract void dispose();
    
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

}
