//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    String[][] myArr = {new String[4], new String[4], new String[5], new String[4]};
    firstExercise(myArr);
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
    }
}