package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Coleccion {
	
	private  ArrayList<Entidad> coleccion = new ArrayList<>();
	
	public void DrawColection(SpriteBatch batch,float time) {
		
		for(int i=0;i<coleccion.size();i++) {
			Entidad aux=coleccion.get(i);
			if(!aux.getKill()) {
				aux.draw(batch,time);
			}else {
				coleccion.remove(i);
			}
		}
		
	}
	
	public void addColection(Entidad e) {
		coleccion.add(e);
	}

}
