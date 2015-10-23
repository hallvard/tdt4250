package no.hal.sokoban.util;

public class Cell {

	private final static String ALT_EMPTY = "-_";
	
	private final static char WALL = '#';
	private final static char EMPTY = ' ';

	private static final char TARGET = '.';
	private final static char PLAYER = '@', PLAYER_ON_TARGET = '+';
	private final static char BOX = '$', BOX_ON_TARGET = '*';

	private final char background, foreground;
	
	private Cell(char background, char foreground) {
		this.background = background;
		this.foreground = foreground;
	}

	private static Cell valueOf(char background, char foreground) {
		return new Cell(background, foreground);
	}

	public static Cell valueOf(Cell background, Cell foreground) {
		return new Cell(background.background, foreground.foreground);
	}
	
	public static Cell valueOf(Cell background) {
		return new Cell(background.background, EMPTY);
	}
	
	public static Cell valueOf(char c) {
		if (ALT_EMPTY.indexOf(c) >= 0) {
			c = EMPTY;
		}
		if (c == BOX || c == PLAYER) {
			return valueOf(EMPTY, c);
		} else if (c == BOX_ON_TARGET) {
			return valueOf(TARGET, BOX);
		} else if (c == PLAYER_ON_TARGET) {
			return valueOf(TARGET, PLAYER);
		} else {
			return valueOf(c, EMPTY);
		}
	}
	
	public boolean isOccupied() {
		return background == WALL || foreground != EMPTY;
	}
	
	public boolean isTarget() {
		return background == TARGET;
	}

	public boolean isPlayer() {
		return foreground == PLAYER;
	}

	public boolean isBox() {
		return foreground == BOX;
	}
	
	public String toName() {
		switch (toChar()) {
		case TARGET: 			return "target";
		case WALL: 				return "wall";
		case BOX: 				return "box";
		case BOX_ON_TARGET: 	return "box_on_target";
		case PLAYER: 			return "player";
		case PLAYER_ON_TARGET: 	return "player_on_target";
		}
		return "empty";
	}

	public char toChar() {
		if (foreground == EMPTY) {
			return background;
		} else if (background == EMPTY && foreground == BOX) {
			return BOX;
		} else if (background == EMPTY) {
			return foreground;
		} else if (background == TARGET) {
			if (foreground == BOX) {
				return BOX_ON_TARGET;
			} else if (foreground == PLAYER) {
				return PLAYER_ON_TARGET;
			}
		}
		return EMPTY;
	}
	
	public static Cell valueOf(String s) {
		return (s.length() == 1 ? valueOf(s.charAt(0)) : null);
	}

	@Override
	public String toString() {
		return String.valueOf(toChar());
	}
}
