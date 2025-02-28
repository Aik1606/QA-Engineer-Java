public class CapFood {
  int food;

  public CapFood(int food) {
    this.food = food;
  }

  public int decrease(int food) {
    if (food < this.food && food > 0) {
      this.food -= food;

      return food;
    }

    return  0;
  }
}
