package io.github.henryhuang;

import com.sun.tools.javac.util.Assert;
import io.github.henryhuang.rules.Buzz;
import io.github.henryhuang.rules.Fizz;
import io.github.henryhuang.rules.MultiRules;
import io.github.henryhuang.rules.Rule;

/**
 * Fun game.
 *
 * Created by Henry Huang on 2019/6/3.
 */
public class FunGame {

  private Integer numStart;
  private Integer numEnd;
  private Rule[] rules;

  private static final Rule[] DEFAULT_RULES = new Rule[]{
      new MultiRules(new Fizz(), new Buzz()),
      new Fizz(),
      new Buzz()
  };

  public FunGame(Integer numStart, Integer numEnd) {
    this(numStart, numEnd, DEFAULT_RULES);
  }

  public FunGame(Integer numStart, Integer numEnd, Rule[] rules) {
    this.numStart = numStart;
    this.numEnd = numEnd;
    this.rules = rules;
  }

  public void play() {

    Assert.checkNonNull(numStart);
    Assert.checkNonNull(numEnd);
    Assert.checkNonNull(this.rules);

    for (int i = numStart; i <= this.numEnd; i++) {
      croak(i);
    }

  }

  private void croak(int number) {
    for (Rule rule : this.rules) {
      if (rule.isMatched(number)) {
        System.out.println(rule.getStringToShow(number));
        return;
      }
    }
    System.out.println(number);
  }

}
