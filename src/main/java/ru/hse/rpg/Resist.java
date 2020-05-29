package ru.hse.rpg;

/**
 * @apiNote it's better to have extendible interface instead of closed set of resists, declared as enumeration.
 * @author Alexander Ovchinnikov
 *
 */
public interface Resist {
	int apply(int damage);
}
