import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product("Метла", "12.02.2024","Хогвартс", "Россия", 500, true);
        product.about();

        //task 2

        Product[] productArray = new Product[5];
        productArray[0] = new Product("Метла", "12.02.2024","Хогвартс", "Россия", 500, true);
        productArray[1] = new Product("Метла1", "13.02.2024","OOO Зеленоглазое такси", "РФ", 450, true);
        productArray[2] = new Product("Метла2", "14.02.2024","ООО На-На-На", "Россия", 400, false);
        productArray[3] = new Product("Метла3", "15.02.2024","ООО Пошла", "Казахстан", 350, false);
        productArray[4] = new Product("Метла4", "16.02.2024","ИП Карасев", "СССР", 300, true);
        System.out.println(Arrays.toString(productArray));

        //Task 3
        Park park = new Park("ДиснейЛэнд", new Park.Attraction[]{
            new Park.Attraction("Горки", "10 - 22", 300),
            new Park.Attraction("Карусель", "10 - 21", 250),
            new Park.Attraction("Комната смеха", "11 - 21", 350),
        });
        System.out.println(park);
    }
}

