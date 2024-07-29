/*
    Thanachote Ngamkana
    6510450411
*/
import java.util.*;
public class Flock implements Quackable{
  List<Quackable> quackables = new ArrayList<Quackable>();

  @Override
  public void quack() {

    for(Quackable q : quackables){
      q.quack();
    }
  }

  public void add(Quackable quackable){
    quackables.add(quackable);
  }
}
