package io.github.henryhuang;

import io.github.henryhuang.rules.BuzzGen2;
import io.github.henryhuang.rules.FizzGen2;
import io.github.henryhuang.rules.MultiRules;
import io.github.henryhuang.rules.Rule;

/**
 * Fun game generation 2.
 *
 * Created by Henry Huang on 2019/6/4.
 */
public class FunGameGen2 extends FunGame {

  private static final Rule[] DEFAULT_RULES = new Rule[]{
      new MultiRules(new FizzGen2(), new BuzzGen2()),
      new FizzGen2(),
      new BuzzGen2()
  };

  public FunGameGen2(Integer numStart, Integer numEnd) {
    super(numStart, numEnd, DEFAULT_RULES);
  }

}
