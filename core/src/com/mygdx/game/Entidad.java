package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entidad {
	private int vida;
	private boolean kill = false;
	private Sound destroy;
	protected Sprite spr;

	public Entidad(int x, int y, int vida, Texture imagen,Sound destroy) {
		spr = new Sprite(imagen);
		spr.setPosition(x, y);
		spr.setOriginCenter();
		this.vida = vida;
		this.destroy = destroy;
	}

	public void setSpr(Sprite spr) {
		this.spr = spr;
	}

	public Sound getDestroy() {
		return destroy;
	}

	public void setDestroy(Sound destroy) {
		this.destroy = destroy;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public boolean getKill() {
		return kill;
	}

	public void setKill(boolean kill) {
		this.kill = kill;
	}

	public Sprite getSpr() {
		return spr;
	}

	public Rectangle getArea() {
		return this.getSpr().getBoundingRectangle();
	}

	public int getX() {
		return (int) spr.getX();
	}

	public void setX(int x) {
		spr.setX(spr.getX() + x);
	}

	public int getY() {
		return (int) spr.getY();
	}

	public void setY(int y) {
		spr.setY(spr.getY() + y);
	}

	public abstract void draw(SpriteBatch batch, float time);

	public abstract void draw(SpriteBatch batch, float time, Coleccion enemigos);

	public abstract void dispose();

}
