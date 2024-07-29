/*
    Thanachote Ngamkana
    6510450411
*/
package abstractfactory;

import decorators.PoliteQuack;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import quack.Quackable;

public class PoliteFactory extends AbstractDuckFactory {

  @Override
  public Quackable createMallardDuck() {
    return new PoliteQuack(new MallardDuck());
  }

  @Override
  public Quackable createRedheadDuck() {
    return new PoliteQuack(new RedheadDuck());
  }

  @Override
  public Quackable createDuckCall() {
    return new PoliteQuack(new DuckCall());
  }

  @Override
  public Quackable createRubberDuck() {
    return new PoliteQuack(new RubberDuck());
  }
}
