package ru.hse.rpg.resists;

import ru.hse.rpg.Resist;

public final class PercentageResist implements Resist {
	private final int percentage;
	
	/**
	 * @param percentage
	 */
	public PercentageResist(int percentage) {
		this.percentage = percentage;
	}

	@Override
	public int apply(int damage) {
		return damage * (100 - this.percentage) / 100;
	}
}
