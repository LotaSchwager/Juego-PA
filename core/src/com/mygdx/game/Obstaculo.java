package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class Obstaculo extends Entidad {
	private int size;
	private int velX;
	private int velY;
	private int magnitudVel;

	public Obstaculo(int x,int y,int vida, Rectangle hitbox, Sound elim, Texture spr, int velX, int velY, int size, int mag){
		super(x,y,vida, hitbox, elim, spr);
		this.size = size;
		this.velX = velX;
		this.velY = velY;
		this.magnitudVel = mag;
	}

	@Override
	public void pintarEntidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destruirEntidad() {
		// TODO Auto-generated method stub
		
	}
	
	public void colicionEntidad(Entidad ent) {
	}

}