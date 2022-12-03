package BuilderPackage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Bullet;

public class DealerEnemy {

	public void createLancelot(Builder builder) {

		Bullet bala = new Bullet(1, 0, -15, new Texture(Gdx.files.internal("Rocket2.png")),
				Gdx.audio.newSound(Gdx.files.internal("Disparo.ogg")));
		
		bala.setCadencia(100);

		builder.setEnemyType(EnemyType.LANCELOT);

		builder.setPuntaje(10);
		builder.setSpeedX(5f);
		builder.setSpeedY(-30f);
		builder.setTexture(new Texture(Gdx.files.internal("MainShip3.png")));
		builder.setVida(1);
		builder.setX(10);
		builder.setY(700);
		builder.setDisparo(bala);
		builder.setDestroy(Gdx.audio.newSound(Gdx.files.internal("hurt.ogg")));
	}

	public void createBaronRojo(Builder builder) {
		Bullet bala = new Bullet(1, 0, -15, new Texture(Gdx.files.internal("Rocket2.png")),
				Gdx.audio.newSound(Gdx.files.internal("Disparo.ogg")));
		
		bala.setCadencia(25);
		
		builder.setEnemyType(EnemyType.BARONROJO);

		builder.setPuntaje(10);
		builder.setSpeedX(0);
		builder.setSpeedY(1);
		builder.setTexture(null);
		builder.setVida(100);
		builder.setX(0);
		builder.setY(0);
		builder.setDisparo(bala);
	}
}
