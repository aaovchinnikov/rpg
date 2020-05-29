package ru.hse.rpg;

public interface AttackTarget {
	AttackTarget apply(Damage damage);
	boolean isDead();
}
