/*
    Thanachote Ngamkana
    6510450411
*/
package adapters;
import gooses.Goose;
import quack.Quackable;


public class GooseAdaptor implements Quackable {
  Goose goose;

  public GooseAdaptor(Goose goose) {
    this.goose = goose;
  }

  @Override
  public void quack() {
    goose.honk();
  }
}
