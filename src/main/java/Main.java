import java.util.*;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numFilter;
        Filter filter;
        Logger logger = Logger.getInstance();
        logger.log("Начало работы программы");
        List<Integer> newList = initList();
        logger.log("Список проинициализирован: " + newList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        numFilter = scanner.nextInt();
        filter = new Filter(numFilter);
        filter.filterOut(newList);
        logger.log("Завершаем программу");
        }

    public static List<Integer> initList() {
        int listLength;
        int maxVal;
        List<Integer> valList = new ArrayList<>();
        Random random = new Random();
        Logger logger = Logger.getInstance();

        logger.log("Просим пользователя ввести входные данные для списка");

        System.out.println("Введите размер списка:");
        listLength = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");
        maxVal = scanner.nextInt();

        logger.log(" Создаём и наполняем список");


        for(int i = 0; i < listLength; i++) {
            valList.add(random.nextInt(maxVal + 1));
        }
        System.out.println("Вот случайный список: " + valList);
        return valList;
    }
}
