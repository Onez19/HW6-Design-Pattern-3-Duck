/*
    Thanachote Ngamkana
    6510450411
*/
public class QuackCounter implements Quackable {
  private static int numOfQuacks = 0;
  Quackable quackable;

  public QuackCounter(Quackable quackable) {
    this.quackable = quackable;
  }

  @Override
  public void quack() {
    quackable.quack();
    numOfQuacks++;
  }

  public static int getNumOfQuacks() {
    return numOfQuacks;
  }
}
