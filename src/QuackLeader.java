/*
    Thanachote Ngamkana
    6510450411
*/
public class QuackLeader implements Quackable {
  Quackable quackable;
  int numQuack;

  public QuackLeader(Quackable quackable, int numQuack) {
    this.quackable = quackable;
    this.numQuack = numQuack;
  }

  @Override
  public void quack() {
    for (int i = 0; i < numQuack; i++) {
      quackable.quack();
    }
  }

}
