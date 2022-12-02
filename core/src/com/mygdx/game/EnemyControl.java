package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import BuilderPackage.DealerEnemy;
import BuilderPackage.EnemyBuilder;
import java.util.Random;

public class EnemyControl {

	private boolean allEnemyDestroyed = false;
	private Coleccion lancelot = new Coleccion();

	public EnemyControl(int cantidadEnemigos) {
		
		int cont = 0;
		int y = 0;
		int x = 0;
		for (int i = 0; i < cantidadEnemigos; i++) {
			int cadencia_aparte = this.numeroRandom();

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
			enemy.sumCadencia(cadencia_aparte);

			lancelot.addColection(enemy);
			cont++;
			x++;
		}
	}
	public Coleccion getEscuadra() {
		return lancelot;
	}
	public void setEscuadra(Coleccion lancelot) {
		this.lancelot=lancelot;
	}


	public boolean isFinished() {
		return this.allEnemyDestroyed;
	}

	public void mostrar(SpriteBatch batch, float delta) {
		lancelot.DrawColection(batch, delta);

	}
	
	public int numeroRandom() {
		int min = 85;
		int max = 500;

		Random random = new Random();

		return random.nextInt(max + min) + min;
	}

}
