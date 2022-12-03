package StrategyPackage;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.Bullet;
import com.mygdx.game.NaveJugador;

public class DisparoRapido implements Strategy{

	@Override
	public void cambiarPU(NaveJugador usuario) {
		Bullet disparo = new Bullet( 1, 0, 10, new Texture(Gdx.files.internal("Rocket2.png")),
				Gdx.audio.newSound(Gdx.files.internal("Disparo.ogg")));
		
		usuario.setDisparo(disparo);
		
	}

}
