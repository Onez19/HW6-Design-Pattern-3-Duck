/*
    Thanachote Ngamkana
    6510450411
*/
package composite;

import quack.Quackable;

import java.util.*;

public class Flock implements Quackable {
  List<Quackable> quackables = new ArrayList<Quackable>();
  Quackable quackLeader;

  @Override
  public void quack() {

    if (quackLeader != null) {
      for (int i = 0; i < 3; i++) {
        quackLeader.quack();
      }
    }

    for (Quackable q : quackables) {
      if (q != quackLeader) {
        q.quack();
      }
    }
  }

  public void add(Quackable quackable) {
    if (quackables.isEmpty()) {
      quackLeader = quackable;
    }
    quackables.add(quackable);
  }
}
