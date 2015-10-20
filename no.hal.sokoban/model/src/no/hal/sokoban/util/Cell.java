package no.hal.sokoban.util;

public class Cell {

	private final String ALT_EMPTY = "-_";
	
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

	public static Cell valueOf(Cell background, Cell foreground) {
		return new Cell(background.background, foreground.foreground);
	}
	
	public static Cell valueOf(Cell background) {
		return new Cell(background.background, EMPTY);
	}
	
	public Cell(char c) {
		if (ALT_EMPTY.indexOf(c) >= 0) {
			c = EMPTY;
		}
		if (c == BOX || c == PLAYER) {
			background = EMPTY;
			foreground = c;
		} else if (c == BOX_ON_TARGET) {
			background = TARGET;
			foreground = BOX;
		} else if (c == PLAYER_ON_TARGET) {
			background = TARGET;
			foreground = PLAYER;
		} else {
			background = c;
			foreground = EMPTY;
		}
	}
	
	// used for default cells, i.e. walls
	public Cell() {
		this(WALL);
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
		return (s.length() == 1 ? new Cell(s.charAt(0)) : null);
	}

	@Override
	public String toString() {
		return String.valueOf(toChar());
	}
}
