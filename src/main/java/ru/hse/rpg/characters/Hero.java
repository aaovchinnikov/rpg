package ru.hse.rpg.characters;

import ru.hse.rpg.AttackTarget;
import ru.hse.rpg.Attacker;
import ru.hse.rpg.ExperienceStrategy;
import ru.hse.rpg.LevelUpStrategy;
import ru.hse.rpg.damages.FireDamage;

public final class Hero implements Attacker {
	private final String name;
	private final int attack;
	private final int experience;
	private final ExperienceStrategy xpStrategy;
	private final LevelUpStrategy luStratagy;
	
	/**
	 * @param attack
	 */
	public Hero(String name, int attack, int experience, ExperienceStrategy xpStrategy, LevelUpStrategy luStratagy) {
		this.name = name;
		this.attack = attack;
		this.experience = experience;
		this.xpStrategy = xpStrategy;
		this.luStratagy = luStratagy;
	}

	@Override
	public AttackTarget attack(AttackTarget target) {
		System.out.println("Hero " + this.name + " attacks monster with attack power " + attack);
		return target.apply(
			new FireDamage(
				this.attack
			)
		);
	}
	
	public Hero gainXP(int points) {
		final int gained = this.xpStrategy.points(points);
		final int currentLevel = this.luStratagy.level(this.experience);
		final int newLevel = this.luStratagy.level(this.experience + gained);
		System.out.println("Hero " + this.name + " gains " + gained + " XP");
		if(currentLevel < newLevel) {
			System.out.println("Hero " + this.name + " gains level " + newLevel);
		}
		return new Hero(
			this.name,
			this.attack,
			this.experience + gained,
			this.xpStrategy,
			this.luStratagy
		);
	}
}
