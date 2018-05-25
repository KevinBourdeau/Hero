package jpu2016.craft;

import jpu2016.hero.IHero;
import jpu2016.hit.Hit;

public abstract class Craft {
	private final IHero hero;

	public Craft(final IHero hero) {
		this.hero = hero;
	}

	public abstract Hit getHit();
}
