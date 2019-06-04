package io.github.henryhuang;

import io.github.henryhuang.rules.Buzz;
import io.github.henryhuang.rules.BuzzGen2;
import io.github.henryhuang.rules.Fizz;
import io.github.henryhuang.rules.FizzGen2;
import io.github.henryhuang.rules.MultiRules;
import io.github.henryhuang.rules.ShoutRule;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class ShouterGen2 extends Shouter {

  private static final ShoutRule[] DEFAULT_CROAK_RULES = new ShoutRule[]{
      new MultiRules(new FizzGen2(), new BuzzGen2()),
      new FizzGen2(),
      new BuzzGen2(),
  };

  public ShouterGen2() {
    super(DEFAULT_CROAK_RULES);
  }

}
