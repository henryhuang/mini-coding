package io.github.henryhuang;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for FunGame.
 *
 * Created by Henry Huang on 2019/6/4.
 */
public class ShouterGen2Test {

  private Shouter shouter;

  @Before
  public void beforeInit() {
    this.shouter = new ShouterGen2();
  }

  @Test
  public void testShoutFizzIfNumberIsOnlyMultiplesOfThree() {
    assertEquals("Fizz", this.shouter.shout(33));
  }

  @Test
  public void testGetNoFizzIfNumberIsNotMultiplesOfThree() {
    assertNotEquals(this.shouter.shout(4), "Fizz");
  }

  @Test
  public void testShoutFizzIfNumberHas3() {
    assertEquals("Fizz", this.shouter.shout(31));
  }

  @Test
  public void testShoutBuzzIfNumberIsOnlyMultiplesOfFive() {
    assertEquals("Buzz", this.shouter.shout(10));
  }

  @Test
  public void testShoutNoBuzzIfNumberIsNotMultiplesOfFive() {
    assertNotEquals("Buzz", this.shouter.shout(11));
  }

  @Test
  public void testShoutBuzzIfNumberHas5() {
    assertEquals("Buzz", this.shouter.shout(52));
  }

  @Test
  public void testShoutFizzBuzzIfNumberIsBothMultiplesOfThreeAndFive() {
    assertEquals("FizzBuzz", this.shouter.shout(15));
  }

  @Test
  public void testShoutNoFizzBuzzIfNumberIsNotMultiplesOfThreeAndFiveOrNotHasThem() {
    assertNotEquals("FizzBuzz", this.shouter.shout(6));
  }

  @Test
  public void testShoutFizzIfNumberHasBoth3And5() {
    assertEquals("FizzBuzz", this.shouter.shout(35));
  }

}
