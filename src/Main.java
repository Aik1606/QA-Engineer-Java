import java.lang.ArrayIndexOutOfBoundsException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[][] myArr = {new String[4], new String[4], new String[5], new String[4]};
        try {
            firstExercise(myArr);
        } catch (MyArraySizeException e) {
            System.out.println("Произошла ошибка MyArraySizeException '" + e.getMessage()+ "'");
        }

        String[][] myArr2 = {
            {"2", "3", "4", "12"},
            {"2", "1", "h", "0"},
            {"-3", "1", "123", "12"},
            {"2", "3", "4", "1"}
        };
        try {
            firstExercise(myArr2);
        } catch (MyArrayDataException e) {
            System.out.println("Произошла ошибка MyArrayDataException '" + e.getMessage()+ "'");
        }
       try {
           System.out.println(myArr[6]);
       } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Произошла ошибка ArrayIndexOutOfBoundsException '" + e.getMessage()+ "'");
       }


    }


    private static void secondExercise(String[][] array) {
        int total = 0;
        for (int rowIndex =0; rowIndex < array.length; rowIndex++) {
            for (int colIndex = 0; colIndex < array[rowIndex].length; colIndex++) {
               String value = array[rowIndex][colIndex];
               try {
                   total += Integer.parseInt(value);
               } catch (NumberFormatException e) {
                   throw new MyArrayDataException("в ячейке ["+rowIndex+"]["+colIndex+"] лежат неверные данные");
               }

            }
        }
        System.out.println("Сумма всех чисел равна " + total);
    }

    private static void firstExercise(String[][] array) {
        int columnsCount = array.length;

        if (columnsCount != 4) {
            throw new MyArraySizeException("размер не равен 4x4");
        }

        for (int i = 0; i < columnsCount; i++) {
            int rowsCount = array[i].length;
            if (rowsCount != 4) {
                throw new MyArraySizeException("размер не равен 4x4");
            }
        }
      secondExercise(array);
    }
}