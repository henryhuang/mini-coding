package io.github.henryhuang;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class Main {

  public static void main(String[] args) {
    // Initial requirements
    new FunGame(1, 100).play();
    System.out.println("===========================");
    // State 2, new requirements
    new FunGameGen2(1, 100).play();
  }

}
