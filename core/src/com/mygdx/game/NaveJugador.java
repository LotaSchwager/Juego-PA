package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;

import StrategyPackage.Strategy;

public class NaveJugador extends Nave {
	private int puntaje = 0;
	private int speed = 300;
	private Strategy str;


	private static NaveJugador naveJugador = null;

	private NaveJugador(int x, int y, int vida, Texture imagen, Sound destroy, Bullet disparo) {
		super(x, y, vida, imagen, destroy, disparo);
	}

	public static NaveJugador getNaveJugador(int x, int y, int vida, Texture imagen, Sound destroy, Bullet disparo) {

		if (naveJugador == null) {
			naveJugador = new NaveJugador(x,y,vida,imagen,destroy,disparo);
		}
		return naveJugador;
	}

	public int getPuntaje() {
		return puntaje;
	}

	public void setPuntaje(int puntaje) {
		this.puntaje = puntaje;
	}

	public void setStr(Strategy str) {
		this.str = str;
	}

	public void activarStr() {
		str.cambiarPU(this);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void draw(SpriteBatch batch, float time) {
		movimiento();
		disparo(time);
		balas.DrawColection(batch, time);
		spr.draw(batch);
	}

	@Override
	public void draw(SpriteBatch batch, float time, Coleccion enemigos) {
		movimiento();
		disparo(time);

		balas.DrawColection(batch, time);
		balas.checkMultipleColition(enemigos);
		spr.draw(batch);
	}

	public void disparo(float time) {

		Bullet aux = this.getDisparo();
		aux.setXY(this.getX(), this.getY());

		if (time != tanterior) {

			if (Gdx.input.isKeyPressed(Input.Keys.SPACE) && (time / 100 % 1 == 0)) {
				balas.addColection(aux);
				System.out.println("shoot");

			} else if (Gdx.input.isKeyJustPressed(Input.Keys.SPACE)) {
				balas.addColection(aux);
				System.out.println("shoot");
				tanterior++;
			}
		}
		tanterior = time;
	}

	public void movimiento() {

		if (Gdx.input.isKeyPressed(Input.Keys.LEFT) && spr.getX() > 0) {
			spr.setX(spr.getX() - Gdx.graphics.getDeltaTime() * speed);
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT) && spr.getX() + spr.getWidth() < Gdx.graphics.getWidth()) {
			spr.setX(spr.getX() + Gdx.graphics.getDeltaTime() * speed);
		}

	}

}
