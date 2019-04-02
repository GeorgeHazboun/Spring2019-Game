package DomainClasses;

public class Player extends Bullet {
	private int xPlayer;
	private int Yplayer;
	private Bullet playerBullet;

	public int getxPlayer() {
		return xPlayer;
	}

	public int getYplayer() {
		return Yplayer;
	}

	public void setYplayer(int yplayer) {
		Yplayer = yplayer;
	}

	public void setxPlayer(int xPlayer) {
		this.xPlayer = xPlayer;
	}

}
