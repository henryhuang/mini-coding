package io.github.henryhuang.rules;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class Normal implements ShoutRule {

  @Override
  public boolean isMatched(int num) {
    return true;
  }

  @Override
  public String getStringToShow(int num) {
    return String.valueOf(num);
  }
}
