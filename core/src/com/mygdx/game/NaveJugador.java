package com.mygdx.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public class NaveJugador extends Nave {
	private int puntaje;

	public NaveJugador(int x,int y,int vida, Rectangle hitbox, Sound elim, Texture spr, Sound death, Sound hit) {
		super(x,y,vida, hitbox, elim, spr, death, hit);
		this.puntaje = 0;
	}

	@Override
	public void disparo() {
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

	@Override
	public void pintarEntidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destruirEntidad() {
		// TODO Auto-generated method stub
		
	}
	
	public int getPuntaje() {
		return this.puntaje;
	}

	@Override
	public void disparo(Input entrada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void movimiento() {
		// TODO Auto-generated method stub
		
	}

}
