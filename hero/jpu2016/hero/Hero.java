package jpu2016.hero;

import jpu2016.craft.Craft;
import jpu2016.hit.Hit;

public abstract class Hero implements IHero {
	private Craft craft;

	public Hero() {
	}

	@Override
	public Hit getHit() {
		return null;
	}

	public void setCraft(final Craft craft) {
		this.craft = craft;
	}
}
