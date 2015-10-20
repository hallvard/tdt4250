package no.hal.sokoban.util;

public class Direction {

	public final int dx, dy;

	private Direction(int dx, int dy) {
		this.dx = dx;
		this.dy = dy;
	}
	
	public final static Direction
		UP = new Direction(0, -1),
		DOWN = new Direction(0, 1),
		LEFT = new Direction(-1, 0),
		RIGHT = new Direction(1, 0);

	public final static Direction[] DIRECTIONS = {
			UP, DOWN, LEFT, RIGHT
	};
	
	public static Direction valueOf(int dx, int dy) {
		for (int i = 0; i < DIRECTIONS.length; i++) {
			Direction direction = DIRECTIONS[i];
			if (dx == direction.dx && dy == direction.dy) {
				return direction;
			}
		}
		return null;
	}
	
	public Direction opposite() {
		return valueOf(-dx, -dy);
	}
}
