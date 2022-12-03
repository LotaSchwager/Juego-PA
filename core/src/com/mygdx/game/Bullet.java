package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Bullet extends Entidad {

	private int xSpeed;
	private int ySpeed;
	private float cadencia;
	private Sound shoot;
	private boolean activo=false;

	public Bullet(int vida, int xSpeed, int ySpeed, Texture tx, Sound shoot) {
		super(0, 0, vida, tx, null);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
		this.setShoot(shoot);
	}

	public float getCadencia() {
		return cadencia;
	}

	public void setCadencia(float cadencia) {
		this.cadencia = cadencia;
	}

	public Sound getShoot() {
		return shoot;
	}

	public void setShoot(Sound shoot) {
		this.shoot = shoot;
	}

	public void update() {
		spr.setPosition(spr.getX() + xSpeed, spr.getY() + ySpeed);
		if (spr.getX() < 0 || spr.getX() + spr.getWidth() > Gdx.graphics.getWidth()) {
			setKill(true);
		}
		if (spr.getY() < 0 || spr.getY() + spr.getHeight() > Gdx.graphics.getHeight()) {
			setKill(true);
		}
	}

	public void draw(SpriteBatch batch, float time) {

		spr.draw(batch);
		update();
		if(!activo) {
			shoot.play();
			activo=true;
		}
		
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void draw(SpriteBatch batch, float time, Coleccion enemigos) {
		System.out.println("WARN:esta entidad no requiere de coleccion");
		this.draw(batch, time);

	}

	public boolean checkCollision(Entidad obst) {
		if (spr.getBoundingRectangle().overlaps(obst.getArea())) {
			this.dispose();
			obst.dispose();
			return true;

		}
		return false;
	}

	public void dispose() {
		this.setKill(true);
	}

}