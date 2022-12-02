package com.mygdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

public class NaveJugador extends Nave{
	private int puntaje = 0;
	private int speed = 300;
	
	public NaveJugador(int x, int y,int vida,Texture disparo,Texture imagen,Sound destroy,Sound shoot) {
		super(x,y,vida,disparo,imagen,destroy,shoot);
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
	public void draw(SpriteBatch batch,float time) {
		movimiento();
		disparo(time);
		balas.DrawColection(batch,time);
		spr.draw(batch);
	}

	@Override
	public void draw(SpriteBatch batch,float time,Coleccion enemigos) {
		movimiento();
		disparo(time);
		
		balas.DrawColection(batch,time);
		balas.checkMultipleColition(enemigos);
		spr.draw(batch);
	}
	
	public void disparo(float time) {
		
		Bullet aux = new Bullet(getX()+10,getY()+10,1,0,15,getDisparo());
		if(time!=Tanterior) {
			if(Gdx.input.isKeyPressed(Input.Keys.SPACE) && ( ((time/100)/cadencia) % 1 == 0 )) {
				balas.addColection(aux);
			}else if(Gdx.input.isKeyJustPressed(Input.Keys.SPACE)){
				balas.addColection(aux);
				Tanterior++;
			}
		}
		Tanterior=time;
	}

	public void movimiento() {
		
		
        if (Gdx.input.isKeyPressed(Input.Keys.LEFT) && spr.getX() > 0) {
        	spr.setX(spr.getX()- Gdx.graphics.getDeltaTime() * speed);
    	}
        if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) && spr.getX() + spr.getWidth() < Gdx.graphics.getWidth()) {
        	spr.setX(spr.getX()+ Gdx.graphics.getDeltaTime()* speed);
    	}

		
	}



}
