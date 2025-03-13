package lesson9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class Main {
  public static void main(String[] args) {
    task1();
    task2();
  }

  public static void task2() {
    TelephoneBook book = new TelephoneBook();
    book.add("Иванов", "45-45-45");
    book.add("Иванов", "46-46-45");
    book.add("Петров", "45-45-45");
    book.add("Сазонов", "45-43-45");
    book.add("Мутантов", "45-40-45");
    System.out.println(book);
    System.out.println(book.get("Иванов"));
    System.out.println(book.get("Петров"));
    System.out.println(book.get("вано"));

}



  public static void expel(Set<Student> students) {
    students.removeIf(student -> {
      if (student.gen() < 3) {
        System.out.println(student + "отчислен");
        return true;
      }
      return false;
    });
    for (Student student : students) {
      System.out.println(student + " оcтались");
    }
  }

  public static void transfer(Set<Student> students) {
    for (Student student : students) {
      if (student.gen() >= 3) {
        student.transfer();
      }
    }
  }

  public static void printStudents(Set<Student> students, int course) {
    System.out.println("на курсе "  + course + " обучаются:");
    for (Student student : students) {
      if (student.course == course) {
        System.out.println(student.name);
      }
    }
  }

  public static void task1() {

    Set<Student> students = new HashSet<>();

    String[] names = {"Иван", "Мария", "Алексей", "Ольга", "Дмитрий", "Анна", "Сергей", "Елена", "Андрей", "Татьяна",
        "Павел", "Юлия", "Николай", "Екатерина", "Артем", "Наталья", "Игорь", "Светлана", "Владимир", "Виктория", "Михаил"};
    String[] groups = {"Ф1", "Ф2", "Ф3", "Ф4", "Ф5"};
    String[] subjects = {"Математика", "Физика", "Химия", "Биология", "История", "Литература", "Информатика"};
    int[] courses = {1, 2, 3, 4, 5};

    for (int i = 0; i < 21; i++) {
      String name = names[i % names.length];
      String group = groups[(int) (Math.random() * groups.length)];
      int course = courses[(int) (Math.random() * courses.length)];

      HashMap<String, Integer> grades = new HashMap<>();
      for (int j = 0; j < 3; j++) { // Добавляем 3 случайных предмета с оценками
        String subject = subjects[(int) (Math.random() * subjects.length)];
        int grade = (int) (Math.random() * 4) + 2; // Оценка от 2 до 5
        grades.put(subject, grade);
      }

      students.add(new Student(name, group, course, grades));
    }

    // Вывод всех студентов
    for (Student student : students) {
      System.out.println(student);
    }
    transfer(students);
    expel(students);
    printStudents(students, 2);
  }
}