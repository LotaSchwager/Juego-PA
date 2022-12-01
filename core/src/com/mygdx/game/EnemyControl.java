package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import BuilderPackage.DealerEnemy;
import BuilderPackage.EnemyBuilder;

public class EnemyControl {
	
	private int cantidadEnemigos;
	private ArrayList<Entidad> lancelot = new ArrayList<>();
	private boolean allEnemyDestroyed = false;
	
	public EnemyControl(int cantidadEnemigos) {
		this.cantidadEnemigos = cantidadEnemigos;
		
		for(int i = 0; i < cantidadEnemigos; i++) {
			DealerEnemy dealer = new DealerEnemy();
			EnemyBuilder builder = new EnemyBuilder();
			dealer.createLancelot(builder);
			
			NaveEnemiga enemy = builder.getEnemy();
			lancelot.add(enemy);
		}
	}
	
	public boolean isFinished() {return this.allEnemyDestroyed;}
	
	public void mostrar(SpriteBatch batch, float delta){
		for (int i = 0; i < lancelot.size();i++) {
			Entidad enemigo = lancelot.get(i);
			enemigo.draw(batch, delta);
		}
		
	}

}
