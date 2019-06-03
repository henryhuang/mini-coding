package io.github.henryhuang.rules;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class BuzzGen2 implements Rule {

  @Override
  public boolean isMatched(int num) {
    return num % 5 == 0 || String.valueOf(num).contains("5");
  }

  @Override
  public String getStringToShow(int num) {
    return "Buzz";
  }

}
