/*
    Thanachote Ngamkana
    6510450411
*/

package decorators;

import quack.Quackable;

public class PoliteQuack implements Quackable {
  private final Quackable quackable;

  public PoliteQuack(Quackable quackable) {
    this.quackable = quackable;
  }

  @Override
  public void quack() {
    quackable.quack();
    System.out.println("ka");
  }
}
