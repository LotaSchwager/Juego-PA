package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveEnemiga extends Nave{

	private int puntaje = 0;
	private float speedX;
	private float speedY;
	
	public NaveEnemiga(int x, int y, Texture tx) {
		super(x, y, tx);
		
	}
	
	public void draw(SpriteBatch batch) {
		movimiento();
		spr.draw(batch);
	}

	public void movimiento(){
		spr.setX(100);
		spr.setY(100);	
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
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
}
