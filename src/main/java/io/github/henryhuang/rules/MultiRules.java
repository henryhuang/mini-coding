package io.github.henryhuang.rules;

/**
 * To apply multiple rules.
 *
 * Created by Henry Huang on 2019/6/4.
 */
public class MultiRules implements Rule {

  private Rule[] rules;

  public MultiRules(Rule... rules) {
    this.rules = rules;
  }

  @Override
  public boolean isMatched(int num) {
    for (Rule rule : rules) {
      if (!rule.isMatched(num)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public String getStringToShow(int num) {
    StringBuilder sb = new StringBuilder();
    for (Rule rule : rules) {
      if (rule.isMatched(num)) {
        sb.append(rule.getStringToShow(num));
      }
    }
    return sb.toString();
  }

}
