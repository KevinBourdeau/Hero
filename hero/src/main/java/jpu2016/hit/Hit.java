package jpu2016.hit;

public class Hit {
	private final int			strength;
	private final int			range;
	private final TypeHit	typeHit;

	public Hit(final int strength, final int range, final TypeHit typeHit) {
		this.strength = strength;
		this.range = range;
		this.typeHit = typeHit;
	}

	public int getStrength() {
		return this.strength;
	}

	public int getRange() {
		return this.range;
	}

	public TypeHit getTypeHit() {
		return this.typeHit;
	}
}
