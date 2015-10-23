package no.hal.sokoban.util;

public class Direction {

	public final int dx, dy;
	public final char c;

	private Direction(int dx, int dy, char c) {
		this.dx = dx;
		this.dy = dy;
		this.c = c;
	}
	
	public final static Direction
		UP = new Direction(0, -1, 'u'),
		DOWN = new Direction(0, 1, 'd'),
		LEFT = new Direction(-1, 0, 'l'),
		RIGHT = new Direction(1, 0, 'r');

	public final static Direction[] DIRECTIONS = {
			UP, DOWN, LEFT, RIGHT
	};
	
	public static Direction valueOf(char c) {
		for (int i = 0; i < DIRECTIONS.length; i++) {
			Direction direction = DIRECTIONS[i];
			if (Character.toLowerCase(c) == direction.c) {
				return direction;
			}
		}
		return null;
	}

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
