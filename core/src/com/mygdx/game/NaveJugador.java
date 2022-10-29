package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

public class NaveJugador extends Nave{
	int puntaje = 0;
	
	public NaveJugador(int x, int y, Texture imagen) {
		super(x,y,imagen);
	}
	
	public int getPuntaje() {
		return puntaje;
	}
	
	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}


    public void draw(SpriteBatch batch, PantallaJuego juego){
        float x =  spr.getX();
        float y =  spr.getY();
        
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT)) spr.setX(spr.getX()- Gdx.graphics.getDeltaTime() * 300);
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT)) spr.setX(spr.getX()+ Gdx.graphics.getDeltaTime()* 300);
    	if (Gdx.input.isKeyPressed(Input.Keys.DOWN)) spr.setY(spr.getY() - Gdx.graphics.getDeltaTime()* 300/3);    
        if (Gdx.input.isKeyPressed(Input.Keys.UP)) spr.setY(spr.getY() + Gdx.graphics.getDeltaTime()* 300/3);
         
         
 		spr.draw(batch);
       
    }


	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}



}
