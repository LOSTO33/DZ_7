import java.util.Scanner;

public class СalculateInterface {
    Scanner scanner ;

    public СalculateInterface() {

        scanner = new Scanner(System.in);
    }

        public int SafeNumber(String message){
            System.out.println(message);
            return scanner.nextInt();

    }

    public void showMenu() {
        System.out.println("Меню:");
        System.out.println("1. Найти сумму");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение: ");
        System.out.println("4. Деление");
        System.out.println("5. Выход");
    }

    public int getUserChoice() {
        System.out.print("Выберите действие: ");
        return scanner.nextInt();
    }

}
