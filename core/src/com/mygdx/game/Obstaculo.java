package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Obstaculo extends Entidad {
	private int size;
	private int velY;
	private int magnitudVel;

	public Obstaculo(int x,int y,int vida,int velY, int size, int mag,Texture spr){
		super(x,y,vida,spr);
		
        /*validar que borde de esfera no quede fuera
    	if (x-size < 0) setX(x+size);
    	if (x+size > Gdx.graphics.getWidth())setX(x-size);
         
        validar que borde de esfera no quede fuera
    	if (y-size < 0) setY(y+size);
    	if (y+size > Gdx.graphics.getHeight())setY(y-size);
    	
		this.size = size;
		this.velY = velY;
		this.magnitudVel = mag;*/
	}
	
	/*public void update() {
		setY(getY() + velY);
		
		if (getY() < 0) {
			destruirEntidad();
		}
		
		setPosicion(getX(), getY());
	}*/
	
	//public void pintarEntidad(SpriteBatch batch) {getAspecto().draw(batch);}
	
	//public void destruirEntidad() {getSound().dispose();}
	
	public void colicionEntidad(Entidad ent) {}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(SpriteBatch batch, float time) {
		// TODO Auto-generated method stub
		
	}

}
