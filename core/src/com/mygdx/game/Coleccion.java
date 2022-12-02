package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Coleccion {

	private ArrayList<Entidad> coleccion = new ArrayList<>();

	public void DrawColection(SpriteBatch batch, float time) {

		for (int i = 0; i < coleccion.size(); i++) {
			Entidad aux = coleccion.get(i);
			if (!aux.getKill()) {
				aux.draw(batch, time);
			} else {
				coleccion.remove(i);
			}
		}

	}

	public Entidad getColection(int i) {
		return coleccion.get(i);
	}

	public int getsize() {
		return coleccion.size();
	}

	public void addColection(Entidad e) {
		coleccion.add(e);
	}

	public static void checkMultipleColition(Coleccion jefe, Coleccion objetivo) {
		// la primera deberia tener un parametro bullet o almenos una funcion
		// checkcolition
		for (int i = 0; i < jefe.getsize(); i++) {
			Bullet aux = (Bullet) jefe.getColection(i);
			for (int j = 0; j < objetivo.getsize(); j++) {
				aux.checkCollision(objetivo.getColection(j));
			}
		}
	}

}
