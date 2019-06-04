package io.github.henryhuang.rules;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class Buzz implements ShoutRule {

  @Override
  public boolean isMatched(int num) {
    return num % 5 == 0;
  }

  @Override
  public String getStringToShow(int num) {
    return "Buzz";
  }

}
