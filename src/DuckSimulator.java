/*
    Thanachote Ngamkana
    6510450411
*/
public class DuckSimulator {
  public static void main(String[] args) {
    DuckSimulator duckSimulator = new DuckSimulator();
    duckSimulator.simulate();
  }

  void simulate() {
    Quackable mallardDuck = new QuackCounter(new MallardDuck());
    Quackable redheadDuck = new RedheadDuck();
    Quackable duckCall = new DuckCall();
    Quackable rubberDuck = new RubberDuck();

    Goose goose = new Goose();
    Quackable gooseQuack = new GooseAdaptor(goose);

    System.out.println("\nDuck Simulator");

    simulate(gooseQuack);
    simulate(mallardDuck);
    simulate(redheadDuck);
    simulate(duckCall);
    simulate(rubberDuck);

    System.out.println(QuackCounter.getNumOfQuacks());
  }

  void simulate(Quackable duck) {
    duck.quack();
  }


}
