package ru.hse.rpg;

public interface LevelUpStrategy {
	/**
	 * Returns character level computed based on provided experience points
	 * @param experience
	 * @return
	 */
	int level(int experience);
}
