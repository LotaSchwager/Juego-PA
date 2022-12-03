package BuilderPackage;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Bullet;

public interface Builder {
	
	void setEnemyType(EnemyType et);
	void setPuntaje(int puntaje);
	void setSpeedX(float sx);
	void setSpeedY(float sy);
	void setX(int x);
	void setY(int y);
	void setVida(int vida);
	void setTexture(Texture tx);
	void setDisparo(Bullet disparo);
	void setDestroy(Sound des);
}
