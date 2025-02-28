public class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  @Override
  protected int getRunLimit() {
    return 200;
  }

  @Override
  protected int getSwimLimit() {
    return 0;
  }

  @Override
  public void swim(int length) {
   System.out.println("Кот не умеет плавать");
  }
}
