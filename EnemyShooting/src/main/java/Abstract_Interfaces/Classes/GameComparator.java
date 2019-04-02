package Abstract_Interfaces.Classes;

import java.util.Comparator;

public class GameComparator implements Comparator<Enemy> {

	public int compare(Enemy o1, Enemy o2) {
		if (o1.getYBullet() == o2.getYBullet()) {
			return 0;
		} else
			return -1;

	}

}
