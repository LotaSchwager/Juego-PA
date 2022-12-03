package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import BuilderPackage.DealerEnemy;
import BuilderPackage.EnemyBuilder;
import java.util.Random;

public class EnemyControl {

	private Coleccion lancelot = new Coleccion();
	private float tanterior=0;

	public EnemyControl(int cantidadEnemigos) {

		int cont = 0;
		int y = 0;
		int x = 0;
		for (int i = 0; i < cantidadEnemigos; i++) {

			if (cont == 10) {

				y += -30;
				x = 0;
				double dif = (10 - ((double) cantidadEnemigos - i)) / 2;

				if (dif > 0) {
					x += 1;
				}
				cont = 0;

			}

			DealerEnemy dealer = new DealerEnemy();
			EnemyBuilder builder = new EnemyBuilder();
			dealer.createLancelot(builder);
			NaveEnemiga enemy = builder.getEnemy();

			enemy.setX(x * 45);
			enemy.setY(y);

			lancelot.addColection(enemy);
			cont++;
			x++;
		}
	}

	public Coleccion getEscuadra() {
		return lancelot;
	}

	public void setEscuadra(Coleccion lancelot) {
		this.lancelot = lancelot;
	}

	public boolean isFinished() {
		if(lancelot.getsize()==0) {
			return true;
		}
		return false;
	}

	public void mostrar(SpriteBatch batch, float time) {
		
		
		lancelot.DrawColection(batch, time);
		
		NaveEnemiga aux = (NaveEnemiga) lancelot.getColection(this.numeroRandom());
		
		if (time != tanterior) {
			
			if (time / aux.getCadencia()  % 1 == 0) {
				aux.disparo(time);

			}
		}
		tanterior = time;
	}

	public int numeroRandom() {
		
		if(lancelot.getsize()==0) {
			return 0;
		}
		
		Random random = new Random();
		int ret=random.nextInt(lancelot.getsize());
		
		if(ret >= lancelot.getsize()) {
			return lancelot.getsize()-1;
		}
		
		return ret;
	}

}
