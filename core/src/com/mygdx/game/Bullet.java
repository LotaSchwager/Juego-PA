package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Bullet extends Entidad {

	private int xSpeed;
	private int ySpeed;
	private int cadencia;

	public Bullet(int x, int y, int vida, int xSpeed, int ySpeed, Texture tx) {
		super(x, y, vida, tx);
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
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

	}

	public boolean checkCollision(Entidad obst) {
		if (spr.getBoundingRectangle().overlaps(obst.getArea())) {
			// Se destruyen ambos
			return true;

		}
		return false;
	}

	public void dispose() {

	}

}