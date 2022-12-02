package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
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
	private int cadencia;
	private int tiempo = 0;

	public NaveEnemiga(int x, int y, int vida, int puntaje,int cadencia ,float sx, float sy, EnemyType et, Texture disparo,
			Texture tx,Sound destroy,Sound shoot) {
		super(x, y, vida, disparo, tx,destroy,shoot);
		this.puntaje = puntaje;
		this.speedX = sx;
		this.speedY = sy;
		this.enemytype = et;
		this.cadencia = cadencia;
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
		this.setKill(true);
		Sound shoot = getDestroy();
		shoot.play();
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
	
	public void sumCadencia(int cadencia) {this.cadencia += cadencia;}

	@Override
	public void disparo(float time) {
		Bullet aux = new Bullet(getX()+10,getY()+10,1,0,-15,getDisparo());
		if(time!=tiempo) {
			if(((time * 10000000) % 10) % 2 == 0 && tiempo >= cadencia) {
				balas.addColection(aux);
				tiempo = 0;
			}else {
				tiempo++;
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
