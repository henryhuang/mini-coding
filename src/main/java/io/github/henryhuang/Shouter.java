package io.github.henryhuang;

import io.github.henryhuang.rules.Buzz;
import io.github.henryhuang.rules.ShoutRule;
import io.github.henryhuang.rules.Fizz;
import io.github.henryhuang.rules.MultiRules;
import io.github.henryhuang.rules.Normal;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class Shouter {

  private static final ShoutRule NORMAL_RULE = new Normal();

  private static final ShoutRule[] DEFAULT_CROAK_RULES = new ShoutRule[]{
      new MultiRules(new Fizz(), new Buzz()),
      new Fizz(),
      new Buzz(),
  };

  private ShoutRule[] rules;

  public Shouter() {
    this(null);
  }

  public Shouter(ShoutRule[] rules) {
    if (rules == null) {
      this.rules = DEFAULT_CROAK_RULES;
    } else {
      this.rules = rules;
    }
  }

  public String shout(int number) {
    for (ShoutRule shoutRule : rules) {
      if (shoutRule.isMatched(number)) {
        return shoutRule.getStringToShow(number);
      }
    }
    return NORMAL_RULE.getStringToShow(number);
  }

}
