package ru.hse.rpg.console;

import java.util.Scanner;

import ru.hse.rpg.AttackTarget;
import ru.hse.rpg.characters.Hero;

public final class ConsoleGame {
	private final Scanner scanner;
	private final Hero initialHero;
	private final AttackTarget initialMonster;
	
	/**
	 * @param hero
	 * @param monster
	 */
	public ConsoleGame(Scanner scanner, Hero initialHero, AttackTarget initialMonster) {
		this.scanner = scanner;
		this.initialHero = initialHero;
		this.initialMonster = initialMonster;
		
	}

	public void run() {
		Hero hero = this.initialHero;
		AttackTarget monster = this.initialMonster;
		while(true) {
			System.out.print("Press Enter key to attack monster ");
			scanner.nextLine();
			monster = hero.attack(monster);
			if(monster.isDead()) {
				System.out.println("Monster dies");
				hero = hero.gainXP(100);
				System.out.println("New Monster appeears");
				monster = initialMonster;
			}
			System.out.println();
		}
	}
}
