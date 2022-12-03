package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public abstract class Nave extends Entidad implements Acciones {

	
	protected Bullet disparo;
	protected float tanterior = 0;
	
	protected Coleccion balas = new Coleccion();

	public Nave(int x, int y, int vida, Texture tx,Sound destroy,Bullet disparo) {
		super(x, y, vida, tx,destroy);
		this.disparo = disparo;
	}

	public Bullet getDisparo() {
		Bullet aux=new Bullet(disparo.getVida(),disparo.getxSpeed(),disparo.getySpeed(),disparo.getSpr().getTexture(),disparo.getShoot());
		return aux;
	}
	public void setDisparo(Bullet disparo) {
		this.disparo = disparo;
	}

	
}
