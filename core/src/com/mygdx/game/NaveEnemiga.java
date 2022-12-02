package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.Coleccion;

import BuilderPackage.EnemyType;

public class NaveEnemiga extends Nave {

	private EnemyType enemytype;
	private int puntaje;
	private float speedX;
	private float speedY;
	private int cadencia = 0;
	private Coleccion balas = new Coleccion();

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
		Bullet aux = new Bullet(getX() + 10, getY() + 10, 1, 0, -15, getDisparo());
		
		if (time != cadencia) {
			if (((time * 10000000) % 10) % 2 == 0 && cadencia >= 65) {
				balas.addColection(aux);
				cadencia = 0;
			} else {
				cadencia++;
			}

		}
	}

	@Override
	public void draw(SpriteBatch batch, float time) {
		movimiento();
		disparo(time);
		balas.DrawColection(batch, time);
		spr.draw(batch);
	}
	
	public void draw(SpriteBatch batch, float time, Coleccion enemigos) {
		System.out.println("WARN:esta entidad no requiere de coleccion");
		this.draw(batch, time);
		
		
	}

}
