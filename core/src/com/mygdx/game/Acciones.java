package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public interface Acciones {
	
	public void disparo();
	public void disparo(Input entrada);
	public void movimiento();
	public void movimiento(Input entrada);
	public void movIzq();
	public void movDer();
	

}
