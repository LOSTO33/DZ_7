public class Сalculatcontrol {
    public СalculateInterface view;
    Sum sum = new Sum();
    Division division = new Division();
    Multiplication multiplication = new Multiplication();
    Subtraction subtraction = new Subtraction();
    int a;
    int b;

    public Сalculatcontrol() {

        this.view = view;
    }


    public void run() {
        int choice;

        do {
            view.showMenu();
            choice = view.getUserChoice();
            view.SafeNumber();
            switch (choice) {
                case 1:
                    sum.add(a,b);
                    break;
                case 2:
                    subtraction.add(a,b);

                    break;
                case 3:
                    multiplication.add(a,b);

                    break;
                case 4:
                    division.add(a,b);
            }
        } while (choice != 5);
    }
    }


