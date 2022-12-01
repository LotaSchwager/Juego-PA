package BuilderPackage;

import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.NaveEnemiga;

public class EnemyBuilder implements Builder {
	
	private int vida;
	private EnemyType enemytype;
	private float speedX;
	private float speedY;
	private int puntaje;
	private int x;
	private int y;
	private Texture tx;
	
	@Override
	public void setEnemyType(EnemyType et) {this.enemytype = et;}
	
	@Override
	public void setPuntaje(int puntaje) {this.puntaje = puntaje;}
	
	@Override
	public void setSpeedX(float sx) {this.speedX = sx;}
	
	@Override
	public void setSpeedY(float sy) {this.speedY = sy;}
	
	@Override
	public void setX(int x) {this.x = x;}
	
	@Override
	public void setY(int y) {this.y = y;}
	
	@Override
	public void setVida(int vida) {this.vida = vida;}
	
	@Override
	public void setTexture(Texture tx) {this.tx = tx;}
	
	public NaveEnemiga getEnemy() {
		return new NaveEnemiga(x,y,tx,vida,puntaje,speedX,speedY,enemytype);
	}

}