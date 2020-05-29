package ru.hse.rpg.health;

import ru.hse.rpg.Health;

public final class InMemoryHealth implements Health{
	private final int health;

	/**
	 * @param health
	 */
	public InMemoryHealth(int health) {
		this.health = health;
	}

	@Override
	public Health decrease(int delta) {
		return new InMemoryHealth(this.health - delta);
	}

	@Override
	public Health increase(int delta) {
		return new InMemoryHealth(this.health + delta);
	}

	@Override
	public boolean isZeroOrNegative() {
		return this.health <=0;
	}
	
	@Override
	public String toString() {
		return String.valueOf(health);
	}
}
