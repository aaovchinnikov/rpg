package ru.hse.rpg;

public interface Health {
	Health decrease(int delta);
	Health increase(int delta);
	boolean isZeroOrNegative();
}
