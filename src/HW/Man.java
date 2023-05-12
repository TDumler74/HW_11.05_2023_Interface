package HW;

public class Man implements CanSwim, CanRun{

  @Override
  public void run() {
    System.out.println("Man can run");

  }

  @Override
  public void swim() {
    System.out.println("Man can swim");

  }
}
