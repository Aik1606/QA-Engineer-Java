//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
  Animal cat = new Cat ("Барсик");
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
    Animal.count = 666;

  }
}