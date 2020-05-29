package ru.hse.rpg.characters;

import ru.hse.rpg.AttackTarget;
import ru.hse.rpg.Damage;
import ru.hse.rpg.Health;
import ru.hse.rpg.ResistMap;

public final class Monster implements AttackTarget {
	private final Health health;
	private final ResistMap resists;
	
	/**
	 * @param health
	 * @param resists
	 */
	public Monster(Health health, ResistMap resists) {
		this.health = health;
		this.resists = resists;
	}
	
	@Override
	public AttackTarget apply(Damage damage) {
		final int delta = damage.damage(this.resists);
		System.out.println("Monster recieves " + delta + " points of damage");
		final Health newHealth = this.health.decrease(delta);
		System.out.println("Monster now have " + newHealth);
		if (newHealth.isZeroOrNegative()) {
			return new DeadMonster();
		} else {
			return new Monster(
				newHealth,
				this.resists
			);
		}
	}
	
	@Override
	public boolean isDead() {
		return false;
	}
}