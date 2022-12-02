package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public abstract class Nave extends Entidad implements Acciones {

	private Texture disparo;
	protected float cadencia = 1;
	protected float Tanterior = 0;
	private Sound shoot;
	protected Coleccion balas = new Coleccion();

	public Nave(int x, int y, int vida, Texture disparo, Texture tx,Sound destroy,Sound shoot) {
		super(x, y, vida, tx,destroy);
		this.disparo = disparo;
		this.shoot= shoot;
	}

	public void setDisparo(Texture disparo) {
		this.disparo = disparo;
	}

	public void setCadencia(float cadencia) {

		this.cadencia = 60 / cadencia;
	}

	public Texture getDisparo() {
		return disparo;
	}

}
