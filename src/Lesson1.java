public class Lesson1 {
  /**
   * task1
   */
  public void printThreeWords() {
    System.out.println("Orange");
    System.out.println("Banana");
    System.out.println("Apple");
  }

  /**
   * task2
   */
  public void checkSumSign() {
    int a = 42;
    int b = 69;
    int sum = a + b;

    if (sum < 0) {
      System.out.println("Сумма отрицательная");
    } else {
      System.out.println("Сумма положительная");
    }
  }

  /**
   * task3
   */
  public void printColor() {
    int value = 3;

    if (value > 100) {
      System.out.println("Зеленый");
    } else if (value > 0) {
      System.out.println("Желтый");
    } else {
      System.out.println("Красный");
    }
  }

  /**
   * task4
   */
  public void compareNumbers() {
    int a = 5;
    int b = 6;

    if (a < b) {
      System.out.println("a < b");
    } else {
      System.out.println("a >= b");
    }
  }

  /**
   * task5
   */
  public boolean compare(int left, int right) {
    int sum = left + right;

    return sum >= 10 && sum <= 20;
  }

  /**
   * task6
   */
  public void checkNumber(int value) {

    if (value < 0) {
      System.out.println("Число отрицательное");
    } else {
      System.out.println("Число положительное");
    }
  }
}
