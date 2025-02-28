public class Dog extends Animal {
  public Dog(String name) {
    super(name);
  }

  @Override
  int getRunLimit() {
    return 500;
  }

  @Override
  protected int getSwimLimit() {
    return 10;
  }
}
