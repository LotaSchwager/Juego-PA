package BuilderPackage;

import com.badlogic.gdx.graphics.Texture;

public interface Builder {
	
	void setEnemyType(EnemyType et);
	void setPuntaje(int puntaje);
	void setSpeedX(float sx);
	void setSpeedY(float sy);
	void setX(int x);
	void setY(int y);
	void setVida(int vida);
	void setTexture(Texture tx);
}
