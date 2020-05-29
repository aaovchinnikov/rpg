package ru.hse.rpg.characters;

import ru.hse.rpg.AttackTarget;
import ru.hse.rpg.Damage;

public final class DeadMonster implements AttackTarget{

	@Override
	public AttackTarget apply(Damage damage) {
		System.out.println("Monster is already dead. Attack is useless and causes no damage.");
		return this;
	}

	@Override
	public boolean isDead() {
		return true;
	}

}
