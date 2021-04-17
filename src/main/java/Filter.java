import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }
    /**
     * Обрезает список значений.
     * Если значение >= treshold (пороговому), то оно копируется
     * в новый список значений.
     * @param source входной список значений
     * @return список значений после фильтрации
     */
    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Пороговое значение: " + treshold);
        logger.log("Список до фильтрации: " + source);
        List<Integer> result = source.stream().filter(f -> f >= treshold).collect(Collectors.toList());
        logger.log("Список после фильтрации: " + result);
        logger.log("Не вошло в список - " + (source.size()-result.size()) + " эл." );
        return result;
    }
}
