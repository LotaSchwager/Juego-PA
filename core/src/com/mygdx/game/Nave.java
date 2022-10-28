package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class Nave extends Entidad implements Acciones{
	private Bala municion;
	private boolean herido;
	private boolean destruido;
	private Sound death;
	private Sound hit;
	

	public Nave(int vida, Rectangle hitbox, Sound elim, Texture spr, Sound death, Sound hit) {
		super(vida, hitbox, elim, spr);
		this.municion = new Bala(1);
		this.herido = false;
		this.destruido = false;
		this.death = death;
		this.hit = hit;
	}
	
	public Bala getMunicion() {
		return municion;
	}
	
	public void setMunicion(Bala municion) {
		this.municion = municion;
	}
	
	public boolean getHerido() {
		return herido;
	}
	
	public boolean getDestruido() {
		return destruido;
	}
	
	public void setDestruido(boolean destruido) {
		 this.destruido = destruido;
	}
	
}
