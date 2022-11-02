package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class NaveEnemiga extends Nave{

	private int puntaje = 0;
	private float speedX = 5f;
	private float speedY = -10f;
	
	public NaveEnemiga(int x, int y, Texture tx) {
		super(x, y, tx);
		
	}
	
	public void draw(SpriteBatch batch) {
		movimiento();
		spr.draw(batch);
	}

	public void movimiento(){
		spr.setX(spr.getX()+speedX);
		if(spr.getX() < 0 || spr.getX() + spr.getWidth() > Gdx.graphics.getWidth()) {
			speedX*=-1; 
			spr.setY(spr.getY()+speedY);
		}
			
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
