package DomainClasses;

public class EnemyBullet {

	private int enemyXBullet;
	private int enemyYbullet;

	public EnemyBullet() {

	}

	EnemyBullet(int enemyXBullet, int enemyYBullet) {
		this.enemyXBullet = enemyXBullet;
		this.enemyYbullet = enemyYBullet;
	}

	public int getEnemyXBullet() {
		return enemyXBullet;
	}

	public void setEnemyXBullet(int enemyXBullet) {
		this.enemyXBullet = enemyXBullet;
	}

	public int getEnemyYbullet() {
		return enemyYbullet;
	}

	public void setEnemyYbullet(int enemyYbullet) {
		this.enemyYbullet = enemyYbullet;
	}

}
