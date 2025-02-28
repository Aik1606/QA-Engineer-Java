//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Figure triangle = new Triangle(3.9, 5.0, 7.9, "green", "blue");
      Figure rectangle = new Rectangle(3.9, 5.0, "orange", "red");
      Figure circle = new Circle(34,  "black", "pink");
      System.out.println(circle.getFillColor());
      System.out.println(circle.getArea());
      System.out.println(circle.getPerimeter());
      System.out.println(circle.getBoundaryColor());
      Cat cat = new Cat("Барсик", 28);
      cat.run(120);
      cat.run(-3);
      cat.run(500);
      cat.swim(100);

      System.out.printf("Создано %d животных%n", Animal.getCount());

      Animal dog = new Dog("Ибрагим");
      dog.run(450);
      dog.run(550);
      dog.run(-1);
      dog.swim(5);
      dog.swim(10);
      dog.swim(-1);

      System.out.printf("Создано %d животных%n", Animal.getCount());

      catEat(cat);
  }

  static public void catEat(Cat cat) {
    CapFood capFood = new CapFood(10);
    System.out.printf("В миске 1 %d еды%n", capFood.food);
    CapFood capFood2 = new CapFood(27);
    cat.eat(capFood);

    System.out.printf("В миске 1 осталось %d еды%n", capFood.food);
    if (cat.isFullFilled()) {
      System.out.printf("%s теперь сыт%n", cat.name);
    } else {
      System.out.printf("В миске 2 %d еды%n", capFood2.food);
      cat.eat(capFood2);
      System.out.printf("В миске 2 осталось %d еды%n", capFood2.food);

      if (cat.isFullFilled()) {
        System.out.printf("%s теперь сыт%n", cat.name);
      } else {
        System.out.printf("%s все еще голоден", cat.name);
      }
    }
  }
}
