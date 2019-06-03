package io.github.henryhuang.rules;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class FizzGen2 implements Rule {

  @Override
  public boolean isMatched(int num) {
    return num % 3 == 0 || String.valueOf(num).contains("3");
  }

  @Override
  public String getStringToShow(int num) {
    return "Fizz";
  }

}
