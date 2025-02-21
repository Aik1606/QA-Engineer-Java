import java.util.Arrays;

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

    System.out.println("\nTask 6 \n");
    lesson1.checkNumber(6);
    lesson1.checkNumber(-2);
    lesson1.checkNumber(0);

    System.out.println("\nTask 7 \n");
    System.out.println(lesson1.isPositive(6));
    System.out.println(lesson1.isPositive(-2));

    System.out.println("\nTask 8 \n");
    lesson1.repeat("hello ", 3);

    System.out.println("\nTask 9 \n");
    System.out.println(lesson1.isLeapYear(300));

    System.out.println("\nTask 10 \n");
    System.out.println(Arrays.toString(lesson1.arrayXor()));

    System.out.println("\nTask 11 \n");
    System.out.println(Arrays.toString(lesson1.arrayFill()));

    System.out.println("\nTask 12 \n");
    System.out.println(Arrays.toString(lesson1.arrayMulti()));

    System.out.println("\nTask 13 \n");
    System.out.println(Arrays.deepToString(lesson1.arrayDiag()));

    System.out.println("\nTask 14 \n");
    System.out.println(Arrays.toString(lesson1.arrayMake(5, 6)));
  }
}
