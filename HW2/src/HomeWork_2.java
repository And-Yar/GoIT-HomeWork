import java.util.Scanner;

public class HomeWork_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите Ваше имя");
        String line = sc.nextLine();

        System.out.println("Введите Ваш город проживания");
        String line1 = sc.nextLine();

        int line2;
        while (true) {
            try {
                System.out.println("Введите Ваш возраст");
                line2 = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Пожалуйста введите числовое значение");
                sc.nextLine();
            }
        }

        System.out.println("Введите Ваше хобби");
        String line3 = sc.nextLine();

        // Вариант 1 (табличный)
        System.out.println("Вариант 1 (табличный):");
        System.out.println("Имя: "+ line);
        System.out.println("Город: "+ line1);
        System.out.println("Возраст: "+line2);
        System.out.println("Хобби: "+line3);
        System.out.println();

        // Вариант 2 (текстовый)
        System.out.println("Вариант 2 (текстовый):");
        System.out.println("Человек по имени "+line+" живет в городе " +line1 +".");
        System.out.println("Этому человеку "+line2 +" лет и любит он заниматься "+ line3 +".");
        System.out.println();

        // Вариант 3 (иной)
        System.out.println("Вариант 3 (иной):");
        System.out.println(line +" - имя");
        System.out.println(line1 +" - город");
        System.out.println(line2 +" - возраст");
        System.out.println(line3 +" - хобби");

    }
}
