package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;

public abstract class Entidad {
	private int vida;
	private Rectangle hitbox;
	private Sound eliminacion;
	private Sprite aspecto;
	private int x;
	private int y;
	
	public Entidad(int x,int y,int vida, Rectangle hitbox, Sound elim, Texture spr){
		this.x=x;
		this.y=y;
		this.vida = vida;
		this.hitbox = hitbox;
		this.eliminacion = elim;
		this.aspecto = new Sprite(spr);
	}
	
	public abstract void pintarEntidad();
	public abstract void destruirEntidad();
	
	public int getVida() {
		return vida;
	}
	
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public Rectangle getHitbox() {
		return hitbox;
	}
	
	public void SetHitbox (Rectangle hitbox) {
		this.hitbox = hitbox;
	}
}
