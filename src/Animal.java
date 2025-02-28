public abstract class Animal {
  String name;


  public static int getCount() {
    return count;
  }

  private static int count = 0;

  public Animal(String name) {
    this.name = name;

    ++Animal.count;
  }

  abstract int getRunLimit();
  abstract int getSwimLimit();

  public void run(int length) {
    if (length <= 0) {
      System.out.println("Длина должна быть больше нуля");

      return;
    }

    if (length < this.getRunLimit()) {
      System.out.printf("%s, пробежала %d m.%n", this.name, length);

      return;
    }

    System.out.printf("%s не пробежать чем %d м.%n", this.getClass().getSimpleName(), this.getRunLimit());
  }

  public void swim(int length) {
    if (length <= 0) {
      System.out.println("Длина должна быть больше нуля");

      return;
    }

    if (length < this.getSwimLimit()) {
      System.out.printf("%s, проплыла %d m.%n", this.name, length);

      return;
    }

    System.out.printf("%s не проплыла чем %d м.%n", this.getClass().getSimpleName(), this.getSwimLimit());
  }
}
