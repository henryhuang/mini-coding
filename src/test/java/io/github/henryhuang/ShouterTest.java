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
public class ShouterTest {

  private Shouter shouter;

  @Before
  public void beforeInit() {
    this.shouter = new Shouter();
  }

  @Test
  public void testShoutFizzIfNumberIsOnlyMultiplesOfThree() {
    assertEquals("Fizz", this.shouter.shout(33));
  }

  @Test
  public void testGetNoFizzIfNumberIsNotMultiplesOfThree() {
    assertNotEquals("Fizz", this.shouter.shout(4));
    assertNotEquals("Fizz", this.shouter.shout(31));
  }

  @Test
  public void testShoutBuzzIfNumberIsOnlyMultiplesOfFive() {
    assertEquals("Buzz", this.shouter.shout(10));
  }

  @Test
  public void testShoutNoBuzzIfNumberIsNotMultiplesOfFive() {
    assertNotEquals("Buzz", this.shouter.shout(11));
    assertNotEquals("Buzz", this.shouter.shout(52));
  }

  @Test
  public void testShoutFizzBuzzIfNumberIsBothMultiplesOfThreeAndFive() {
    assertEquals("FizzBuzz", this.shouter.shout(15));
  }

  @Test
  public void testShoutNoFizzBuzzIfNumberIsNotMultiplesOfThreeAndFive() {
    assertNotEquals("FizzBuzz", this.shouter.shout(6));
    assertNotEquals("FizzBuzz", this.shouter.shout(35));
  }

}
