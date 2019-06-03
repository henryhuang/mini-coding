package io.github.henryhuang.rules;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public interface Rule {

  /**
   * Check if the number is match this rule.
   * @param num the number
   * @return true if matched or false if non-matched
   */
  boolean isMatched(int num);

  /**
   * Get the string to show.
   * @param num The source num
   * @return The string to show
   */
  String getStringToShow(int num);

}
