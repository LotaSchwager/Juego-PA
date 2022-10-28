package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

public abstract class NaveEnemiga extends Nave{
	private int killPoints;
	private Sound idle;
	
	public NaveEnemiga(int vida, Rectangle hitbox, Sound elim, Texture spr, Sound death, Sound hit, int kill, Sound idle) {
		super(vida, hitbox, elim, spr, death, hit);
		this.killPoints = kill;
		this.idle = idle;
	}

	public int getPoints() {
		return killPoints;
	}
}
