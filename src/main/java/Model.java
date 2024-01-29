import java.util.ArrayList;
import java.util.List;

public class Model {
    private List<Integer> numbers;

    // Создаем конструктор
    public Model() {
        numbers = new ArrayList<>();
    }

    // Геттеры и сеттеры
    public void setNumbers(List<Integer> numbers){
        this.numbers =numbers;
    }

    public List<Integer> getNumbers(){
        return numbers;
    }

    // Метод вычисление среднего числа из четных чисел

    public double calculateAverageOfEvenNumbers() {
        return numbers.stream()
                .filter(numbers -> numbers % 2 == 0)
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0); // выводит ноль в случае если не получили значение
    }
}
