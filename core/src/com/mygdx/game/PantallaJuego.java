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

import BuilderPackage.DealerEnemy;
import BuilderPackage.EnemyBuilder;
import StrategyPackage.DisparoRapido;
import StrategyPackage.Strategy;

public class PantallaJuego implements Screen {

	private SpaceNavigation game;
	private OrthographicCamera camera;
	private SpriteBatch batch;
	private NaveJugador naveP;
	private float time = 0;
	private EnemyControl control;
	private Bullet Pdisp;

	public PantallaJuego(SpaceNavigation game) {
		
		
		this.game = game;

		batch = game.getBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 800, 640);
		
		Pdisp = new Bullet( 1, 0, 15, new Texture(Gdx.files.internal("Rocket2.png")),
				Gdx.audio.newSound(Gdx.files.internal("Disparo.ogg")));
		
		Pdisp.setCadencia(600);
		naveP = NaveJugador.getNaveJugador(Gdx.graphics.getWidth() / 2, 30, 1, new Texture(Gdx.files.internal("playerShip.png")),
				null, Pdisp);
		control = new EnemyControl(1);
		
		

	}

	public void dibujaEncabezado() {
		CharSequence str = "Pantalla de juego";
		game.getFont().getData().setScale(2f);
		game.getFont().draw(batch, str, 10, 30);
	}

	@Override
	public void render(float delta) {
		if(control.isFinished()) {
			control = new EnemyControl(50);
			Strategy str;
			str=new DisparoRapido();
			naveP.setStr(str);
			naveP.activarStr(); 
		}
		time += (int) (delta * 100);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		dibujaEncabezado();
		
		naveP.draw(batch, time, control.getEscuadra());
		control.mostrar(batch, time);
		System.out.println(control.getEscuadra().getsize());
		
		
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
