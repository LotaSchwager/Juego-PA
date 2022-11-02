package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

public class NaveJugador extends Nave{
	int puntaje = 0;
	int speed = 300;
	
	public NaveJugador(int x, int y, Texture imagen) {
		super(x,y,imagen);
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

	@Override
	public void draw(SpriteBatch batch) {
		movimiento();
		spr.draw(batch);
		
	}

	public void movimiento() {
		
		
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) && spr.getX() > 0) spr.setX(spr.getX()- Gdx.graphics.getDeltaTime() * speed);
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) && spr.getX() + spr.getWidth() < Gdx.graphics.getWidth()) spr.setX(spr.getX()+ Gdx.graphics.getDeltaTime()* speed);

		
	}



}
