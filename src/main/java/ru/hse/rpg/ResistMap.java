package ru.hse.rpg;

public interface ResistMap {
	/**
	 * @throws IllegalArgumentException if map doesn't have resist of provided type
	 * @param resist
	 */
	Resist get(Class<? extends Resist> clazz);
}
