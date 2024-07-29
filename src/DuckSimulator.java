/*
    Thanachote Ngamkana
    6510450411
*/

import abstractfactory.AbstractDuckFactory;
import abstractfactory.CounterFactory;
import abstractfactory.DuckFactory;
import abstractfactory.PoliteFactory;
import adapters.PigeonAdaptor;
import composite.Flock;
import decorators.PoliteQuack;
import ducks.DuckCall;
import ducks.MallardDuck;
import ducks.RedheadDuck;
import ducks.RubberDuck;
import gooses.Goose;
import adapters.GooseAdaptor;
import pigeons.Pigeon;
import decorators.QuackCounter;
import quack.Quackable;

public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator duckSimulator = new DuckSimulator();
    AbstractDuckFactory duckFactory = new DuckFactory();
    AbstractDuckFactory counterFactory = new CounterFactory();
    AbstractDuckFactory politeFactory = new PoliteFactory();


    Quackable mallardDuck = new QuackCounter(new MallardDuck());
    Quackable redheadDuck = new RedheadDuck();
    Quackable duckCall = new DuckCall();
    Quackable rubberDuck = new PoliteQuack(new RubberDuck());


    Flock flock = new Flock();
    flock.add(mallardDuck);
    flock.add(redheadDuck);
    flock.add(duckCall);
    flock.add(rubberDuck);

    flock.quack();

    duckSimulator.simulate();
    duckSimulator.simulate(duckFactory);
    duckSimulator.simulate(counterFactory);
    duckSimulator.simulate(politeFactory);
  }

  void simulate() {
    Quackable mallardDuck = new QuackCounter(new MallardDuck());
    Quackable redheadDuck = new RedheadDuck();
    Quackable duckCall = new DuckCall();
    Quackable rubberDuck = new PoliteQuack(new RubberDuck());

    Goose goose = new Goose();
    Quackable gooseQuack = new GooseAdaptor(goose);

    Goose goose2 = new Goose();
    Quackable gooseQuack2 = new PoliteQuack(new GooseAdaptor(goose2));


    Pigeon pigeon = new Pigeon();
    Quackable pigeonQuack = new PigeonAdaptor(pigeon);

    System.out.println("\nDuck Simulator");

    simulate(gooseQuack2);
    simulate(gooseQuack);
    simulate(pigeonQuack);
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);

    System.out.println(QuackCounter.getNumOfQuacks());

  }

  void simulate(AbstractDuckFactory abstractDuckFactory) {
    Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
    Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
    Quackable duckCall = abstractDuckFactory.createDuckCall();
    Quackable rubberDuck = abstractDuckFactory.createRubberDuck();


    System.out.println("\nDuck Simulator Factory");

    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);
  }

  void simulate(Quackable duck) {
    duck.quack();
  }


}
