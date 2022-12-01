package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;

public abstract class Nave extends Entidad implements Acciones{
    
	private Texture disparo;
	
    public Nave(int x, int y,int vida,Texture disparo, Texture tx) {
    	super(x,y,vida,tx);
    	this.disparo=disparo;
    }
    
    public void setDisparo(Texture disparo) {this.disparo=disparo;}
    public Texture getDisparo() {return disparo;}
    
    

}

