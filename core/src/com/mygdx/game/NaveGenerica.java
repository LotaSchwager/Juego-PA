package com.mygdx.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class NaveGenerica extends NaveEnemiga {

	public NaveGenerica(int vida, Rectangle hitbox, Sound elim, Texture spr, Sound death, Sound hit, int kill,
			Sound idle) {
		super(vida, hitbox, elim, spr, death, hit, kill, idle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pintarEntidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destruirEntidad() {
		// TODO Auto-generated method stub
		
	}
	
	public void movimiento(int x, int y) {
		
	}
	
	public int getPoints() {
		return this.getPoints();
	}

	@Override
	public void disparo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disparo(Input entrada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movimiento() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movimiento(Input entrada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movIzq() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movDer() {
		// TODO Auto-generated method stub
		
	}

}
