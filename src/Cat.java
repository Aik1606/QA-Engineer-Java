public class Cat extends Animal {
  int wantFood;

  public Cat(String name, int wantFood) {
    super(name);

    this.wantFood = wantFood;
  }

  public void eat(CapFood capFood) {
    wantFood -= capFood.decrease(wantFood);
  }

  public boolean isFullFilled()  {
    return this.wantFood == 0;
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
