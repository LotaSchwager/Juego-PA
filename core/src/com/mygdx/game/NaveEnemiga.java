package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

import BuilderPackage.EnemyType;

public class NaveEnemiga extends Nave {

	private EnemyType enemytype;
	private int puntaje;
	private float speedX;
	private float speedY;

	public NaveEnemiga(int x, int y, int vida, int puntaje, float sx, float sy, EnemyType et, Texture disparo,
			Texture tx) {
		super(x, y, vida, disparo, tx);
		this.puntaje = puntaje;
		this.speedX = sx;
		this.speedY = sy;
		this.enemytype = et;
	}

	public void draw(SpriteBatch batch) {
		movimiento();
		spr.draw(batch);
	}

	public void movimiento() {
		spr.setX(spr.getX() + speedX);
		if (spr.getX() < 0 || spr.getX() + spr.getWidth() > Gdx.graphics.getWidth()) {
			speedX *= -1;
			spr.setY(spr.getY() + speedY);
		}

	}

	public void setEnemyType(EnemyType et) {
		this.enemytype = et;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public void dispose() {
	}

	public float getSpeedY() {
		return speedY;
	}

	public void setSpeedY(float speedY) {
		this.speedY = speedY;
	}

	public float getSpeedX() {
		return speedX;
	}

	public void setSpeedX(float speedX) {
		this.speedX = speedX;
	}

	public Rectangle getArea() {
		return this.getSpr().getBoundingRectangle();
	}

	@Override
	public void disparo(float time) {
		// TODO Auto-generated method stub

	}

	@Override
	public void draw(SpriteBatch batch, float time) {
		// TODO Auto-generated method stub

	}

}
