package com.mygdx.game;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import BuilderPackage.DealerEnemy;
import BuilderPackage.EnemyBuilder;

public class EnemyControl {

	private boolean allEnemyDestroyed = false;
	private Coleccion lancelot = new Coleccion();

	public EnemyControl(int cantidadEnemigos) {
		if (!(cantidadEnemigos % 2 == 0)) {
			cantidadEnemigos++;
		}
		int cont = 0;
		int y = 0;
		int x = 0;
		for (int i = 0; i < cantidadEnemigos; i++) {

			if (cont == 10) {

				y += -30;
				x = 0;
				double dif = (10 - ((double) cantidadEnemigos - i)) / 2;
				System.out.println(dif);
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

	public boolean isFinished() {
		return this.allEnemyDestroyed;
	}

	public void mostrar(SpriteBatch batch, float delta) {
		lancelot.DrawColection(batch, delta);

	}

}
