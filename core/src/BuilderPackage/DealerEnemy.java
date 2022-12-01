package BuilderPackage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class DealerEnemy {

	public void createLancelot(Builder builder) {
		builder.setEnemyType(EnemyType.LANCELOT);

		builder.setPuntaje(10);
		builder.setSpeedX(5f);
		builder.setSpeedY(-10f);
		builder.setTexture(new Texture (Gdx.files.internal("MainShip3.png")));
		builder.setVida(1);
		builder.setX(10);
		builder.setY(700);
		builder.setDisparo(new Texture (Gdx.files.internal("Rocket2.png")));
	}

	public void createBaronRojo(Builder builder) {
		builder.setEnemyType(EnemyType.BARONROJO);

		builder.setPuntaje(10);
		builder.setSpeedX(0);
		builder.setSpeedY(1);
		builder.setTexture(null);
		builder.setVida(100);
		builder.setX(0);
		builder.setY(0);
		builder.setDisparo(null);
	}
}
