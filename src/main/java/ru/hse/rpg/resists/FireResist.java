package ru.hse.rpg.resists;

import ru.hse.rpg.Resist;

public final class FireResist implements Resist {
	private final Resist origin;
	
	/**
	 * @param origin
	 */
	public FireResist(Resist origin) {
		this.origin = origin;
	}

	@Override
	public int apply(int damage) {
		return this.origin.apply(damage);
	}
}
