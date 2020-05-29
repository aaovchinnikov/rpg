package ru.hse.rpg.characters.xp;

import ru.hse.rpg.ExperienceStrategy;

public class FlatXP implements ExperienceStrategy {

	@Override
	public int points(int points) {
		return points;
	}

}
