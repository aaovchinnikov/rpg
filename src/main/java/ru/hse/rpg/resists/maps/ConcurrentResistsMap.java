package ru.hse.rpg.resists.maps;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import ru.hse.rpg.Resist;
import ru.hse.rpg.ResistMap;

public final class ConcurrentResistsMap implements ResistMap {
	private final Map<Class<? extends Resist>, Resist> map = new ConcurrentHashMap<>();
	
	public ConcurrentResistsMap(Resist... resists) {
		for(Resist resist: resists) {
			Class<? extends Resist> clazz = resist.getClass();
			if (this.map.containsKey(clazz)) {
				throw new IllegalArgumentException("ResistsMap already has resist of provided type");
			} else {
				this.map.put(resist.getClass(), resist);	
			}
		}
	}
	
	@Override
	public Resist get(Class<? extends Resist> clazz) {
		if (! this.map.containsKey(clazz)) {
			throw new IllegalArgumentException("ResistsMap doesn't have resist of provided type");
		} else {
			return this.map.get(clazz);	
		}
	}
}
