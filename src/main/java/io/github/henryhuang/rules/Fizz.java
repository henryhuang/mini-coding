package io.github.henryhuang.rules;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class Fizz implements Rule {

  @Override
  public boolean isMatched(int num) {
    return num % 3 == 0;
  }

  @Override
  public String getStringToShow(int num) {
    return "Fizz";
  }

}
