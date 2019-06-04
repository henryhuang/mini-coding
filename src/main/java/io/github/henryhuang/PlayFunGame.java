package io.github.henryhuang;

/**
 * Created by Henry Huang on 2019/6/4.
 */
public class PlayFunGame {

  public static void main(String[] args) {

    int numStart = 1;
    int numEnd = 100;

    Shouter shouter = new Shouter();
    for (int i = numStart; i <= numEnd; i++) {
      System.out.println(shouter.shout(i));
    }

    System.out.println("=======================");

    Shouter shouterGen2 = new ShouterGen2();
    for (int j = numStart; j <= numEnd; j++) {
      System.out.println(shouterGen2.shout(j));
    }

  }

}
