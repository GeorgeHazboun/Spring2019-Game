package Abstract_Interfaces.Classes;

import DomainClasses.Bullet;

public abstract class Enemy extends Bullet {

	private int xEnemy;
	private int yEnemy;
	private Bullet yBulletEnemy;

	public Enemy() {

	}

	public Enemy(int x, int y, Bullet YBullet) {
		this.xEnemy = x;
		this.yEnemy = y;
		;
	}

	public int getX() {
		return xEnemy;
	}

	public void setX(int x) {
		this.xEnemy = x;
	}

	public int getY() {
		return yEnemy;
	}

	public void setY(int y) {
		this.yEnemy = y;
	}

}
