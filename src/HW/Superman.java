package HW;

public class Superman implements CanFly,CanRun,CanSwim {


  @Override
  public void fly() {
    System.out.println("Умеет летать");
  }

  @Override
  public void run() {
    System.out.println("Умеет бегать");
  }

  @Override
  public void swim() {
    System.out.println("умеет плавать");
  }
}
