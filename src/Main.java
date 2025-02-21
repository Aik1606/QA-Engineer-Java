
public class Main {
  public static void main(String[] args) {
    Lesson1 lesson1 = new Lesson1();

    System.out.println("Task 1 \n");
    lesson1.printThreeWords();

    System.out.println("\nTask 2 \n");
    lesson1.checkSumSign();

    System.out.println("\nTask 3 \n");
    lesson1.printColor();

    System.out.println("\nTask 4 \n");
    lesson1.compareNumbers();

    System.out.println("\nTask 5 \n");
    System.out.println(lesson1.compare(6, 8));
    System.out.println(lesson1.compare(13, 16));

  }
}
