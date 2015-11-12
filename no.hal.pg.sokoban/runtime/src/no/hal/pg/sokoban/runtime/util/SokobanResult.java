package no.hal.pg.sokoban.runtime.util;

import java.io.Serializable;

import no.hal.sokoban.util.Direction;

public class SokobanResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3284051246266653320L;

	private final String moves;

	private SokobanResult(String moves) {
		this.moves = moves;
	}

	private int countMoves(boolean moves, boolean pushes) {
		int count = 0;
		for (int i = 0; i < this.moves.length(); i++) {
			boolean push = Character.isUpperCase(this.moves.charAt(i));
			if (moves && (! push) || pushes && push) {
				count++;
			}
		}
		return count;
	}
	
	public int getCount() {
		return countMoves(true, true);
	}

	public String getMoves() {
		return moves;
	}
	
	public int getMoveCount() {
		return countMoves(true, false);
	}
	
	public int getPushCount() {
		return countMoves(false, true);
	}
	
	@Override
	public String toString() {
		return moves;
	}

	public static SokobanResult valueOf(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Direction.valueOf(c) == null) {
				throw new IllegalArgumentException(c + " is not a legal move");
			}
		}
		return new SokobanResult(s);
	}
}
