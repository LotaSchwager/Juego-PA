package com.mygdx.game;

import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class PantallaJuego implements Screen {

	private SpaceNavigation game;
	private OrthographicCamera camera;	
	private SpriteBatch batch;
	private NaveJugador naveP;
	private NaveEnemiga naveE;
	


	public PantallaJuego(SpaceNavigation game) {
		this.game = game;

		batch = game.getBatch();
		camera = new OrthographicCamera();	
		camera.setToOrtho(false, 800, 640);
		naveP = new NaveJugador(Gdx.graphics.getWidth()/2,30,new Texture (Gdx.files.internal("playerShip.png")));
		naveE = new NaveEnemiga(Gdx.graphics.getWidth()/2,700,new Texture (Gdx.files.internal("Mainship3.png")));
		
		
		
	}
    
	public void dibujaEncabezado() {
		CharSequence str = "Pantalla de juego";
		game.getFont().getData().setScale(2f);		
		game.getFont().draw(batch, str, 10, 30);
	}
	@Override
	public void render(float delta) {
		  Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
          batch.begin();
		  dibujaEncabezado();
		  naveP.draw(batch);
		  naveE.draw(batch);
   
	      batch.end();

	}
    
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
   
}
