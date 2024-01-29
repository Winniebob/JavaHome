import java.util.List;

public class View {

    // Внешний вид нашего меню
    public void showMenu(){
        System.out.println(" Menu: ");
        System.out.println("1. Input numbers ");
        System.out.println("2. Exit ");
    }

    public void showInputPrompt() {
        System.out.println(" Enter numbers separated by spaces: ");
    }

    public void showNumbers(List<Integer> numbers){
        System.out.println(" Entered numbers: " + numbers);
    }

    public void showAverage(double average){
        System.out.println(" Average of all even numbers " + average);
    }
}
