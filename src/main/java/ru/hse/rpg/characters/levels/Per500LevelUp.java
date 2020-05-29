package ru.hse.rpg.characters.levels;

import ru.hse.rpg.LevelUpStrategy;

public class Per500LevelUp implements LevelUpStrategy {

	@Override
	public int level(int experience) {
		return experience / 500 + 1;
	}
}
