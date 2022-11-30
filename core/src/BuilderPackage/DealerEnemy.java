package BuilderPackage;

public class DealerEnemy {
	
	public void createLancelot(Builder builder) {
		builder.setEnemyType(EnemyType.LANCELOT);
		
		builder.setPuntaje(10);
		builder.setSpeedX(0);
		builder.setSpeedY(1);
		builder.setTexture(null);
		builder.setVida(100);
		builder.setX(0);
		builder.setY(0);
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
	}
}
