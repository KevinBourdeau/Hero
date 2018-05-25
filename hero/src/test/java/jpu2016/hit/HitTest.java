package jpu2016.hit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HitTest {
	
	private Hit hit;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.hit = new Hit(1, 10, TypeHit.NORMAL);
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetStrength() {
		final int expected = 1;
		 assertEquals(expected, this.hit.getStrength());
	}

	@Test
	public void testGetRange() {
		final int expected = 10;
		 assertEquals(expected, this.hit.getRange());
	}

	@Test
	public void testGetTypeHit() {
		final TypeHit expected = TypeHit.NORMAL;
		 assertEquals(expected, this.hit.getTypeHit());
	}
	
	@Test 
	public void GivenAStrenghOf101WhenCreatingAHitShouldThrowStrengthExeption(){
		try {
			 new Hit(101, 1, TypeHit.NORMAL);
			 fail("Should throw exception when Strength > 101");
			 } catch (final Exception e) {
			 final String expected = "Strength out of range";
			 assertEquals(expected, e.getMessage());
			 }
	}
	
	@Test 
	public void GivenAStrenghOfMinus1WhenCreatingAHitShouldThrowStrengthExeption(){
		try {
			 new Hit(-1, 1, TypeHit.NORMAL);
			 fail("Should throw exception when Strength < 0");
			 } catch (final Exception e) {
			 final String expected = "Strength out of range";
			 assertEquals(expected, e.getMessage());
			 }
	}
	
	@Test 
	public void GivenARangeOf11WhenCreatingAHitShouldThrowRangeExeption(){
		try {
			 new Hit(1, 11, TypeHit.NORMAL);
			 fail("Should throw exception when Range > 11");
			 } catch (final Exception e) {
			 final String expected = "Range out of range";
			 assertEquals(expected, e.getMessage());
			 }
	}
	
	@Test 
	public void GivenARangeOfMinus1WhenCreatingAHitShouldThrowRangeExeption(){
		try {
			 new Hit(1, -1, TypeHit.NORMAL);
			 fail("Should throw exception when Range < 0");
			 } catch (final Exception e) {
			 final String expected = "Range out of range";
			 assertEquals(expected, e.getMessage());
			 }
	}

}
