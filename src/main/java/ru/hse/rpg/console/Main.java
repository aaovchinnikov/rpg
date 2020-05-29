package ru.hse.rpg.console;

import java.util.Scanner;

import ru.hse.rpg.characters.Hero;
import ru.hse.rpg.characters.Monster;
import ru.hse.rpg.characters.levels.Per500LevelUp;
import ru.hse.rpg.characters.xp.FlatXP;
import ru.hse.rpg.health.InMemoryHealth;
import ru.hse.rpg.resists.FireResist;
import ru.hse.rpg.resists.PercentageResist;
import ru.hse.rpg.resists.maps.ConcurrentResistsMap;

public final class Main {
	public static void main(String[] args) {
		new ConsoleGame(
			new Scanner(System.in), 
			new Hero("SanSey", 20, 0, new FlatXP(), new Per500LevelUp()),
			new Monster(
				new InMemoryHealth(60),
				new ConcurrentResistsMap(
					new FireResist(
						new PercentageResist(10)
					)
				)
			)
		).run();
	}
}
