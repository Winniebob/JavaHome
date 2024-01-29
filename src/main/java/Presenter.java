
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Presenter {
    // объявляем максимальное и минимальное число элементов массива
    private static final int MIN_NUMBERS = 3;
    private static final int MAX_NUMBERS = 100;
    private Model model;
    private View view;
    private Scanner scanner;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    // запуск меню
    public void start() {
        view.showMenu();
        menu();
    }

    // действия в меню
    private void menu() {
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                inputNumbers();
                break;

            case 2:
                System.exit(0);
                break;
            default:
                System.out.println(" There is no function under this number. Try again. ");
                menu();
        }
    }

    // Ввод чисел с проверкой на количество с последующим расчетом среднего числа
    private void inputNumbers(){
        view.showInputPrompt();
        List<Integer> numbers = new ArrayList<>();
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] inputNumbers = input.split(" ");
        if (inputNumbers.length < MIN_NUMBERS || inputNumbers.length > MAX_NUMBERS){
            System.out.println(" Invalid number of numbers. Return to menu ");
            start();
            return;
        }
        for (String numberStr : inputNumbers){
            int number = Integer.parseInt(numberStr);
            numbers.add(number);
        }
        model.setNumbers(numbers);
        view.showNumbers(numbers);
        double average = model.calculateAverageOfEvenNumbers();
        view.showAverage(average);
        start();
    }
}
