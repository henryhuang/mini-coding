package io.github.henryhuang.rules;

/**
 * To apply multiple shoutRules.
 *
 * Created by Henry Huang on 2019/6/4.
 */
public class MultiRules implements ShoutRule {

  private ShoutRule[] shoutRules;

  public MultiRules(ShoutRule... shoutRules) {
    this.shoutRules = shoutRules;
  }

  @Override
  public boolean isMatched(int num) {
    for (ShoutRule shoutRule : shoutRules) {
      if (!shoutRule.isMatched(num)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String getStringToShow(int num) {
    StringBuilder sb = new StringBuilder();
    for (ShoutRule shoutRule : shoutRules) {
      if (shoutRule.isMatched(num)) {
        sb.append(shoutRule.getStringToShow(num));
      }
    }
    return sb.toString();
  }

}
