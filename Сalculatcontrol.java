public class Сalculatcontrol {
    СalculateInterface view = new СalculateInterface();
    Sum sum = new Sum();
    Division division = new Division();
    Multiplication multiplication = new Multiplication();
    Subtraction subtraction = new Subtraction();
    int a;
    int result;
    int b;

    public Сalculatcontrol() {

        this.view = view;
    }


    public void run() {
        int choice;

        do {
            view.showMenu();
            choice = view.getUserChoice();
            a = view.SafeNumber("Введите первое число.");
            b = view.SafeNumber("Введите первое число.");
            switch (choice) {
                case 1:
                    result= sum.add(a,b);
                    System.out.println(result);
                break;
                case 2:
                    result = subtraction.add(a,b);
                    System.out.println(result);
                    break;
                case 3:
                    result = multiplication.add(a,b);
                    System.out.println(result);
                    break;
                case 4:
                    result = division.add(a,b);
                    System.out.println(result);
                    break;
            }
        } while (choice != 5);
    }

}


