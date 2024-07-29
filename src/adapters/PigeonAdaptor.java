/*
    Thanachote Ngamkana
    6510450411
*/
package adapters;

import pigeons.Pigeon;
import quack.Quackable;

public class PigeonAdaptor implements Quackable {
  Pigeon pigeon;

  public PigeonAdaptor(Pigeon pigeon) {
    this.pigeon = pigeon;
  }

  @Override
  public void quack() {
    pigeon.coo();
    pigeon.coo();
  }
}
