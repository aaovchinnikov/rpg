package ru.hse.rpg.damages;

import ru.hse.rpg.Damage;
import ru.hse.rpg.Resist;
import ru.hse.rpg.ResistMap;
import ru.hse.rpg.resists.FireResist;

public final class FireDamage implements Damage {
	private final int value;
	
	/**
	 * @param value
	 */
	public FireDamage(int value) {
		this.value = value;
	}

	@Override
	public int damage(ResistMap map) {
		Resist resist = map.get(FireResist.class);
		return resist.apply(value);
	}

}
