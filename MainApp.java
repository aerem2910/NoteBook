import java.util.Map;
import java.util.Set;

public class MainApp {
    public static void main(String[] args) {
        NotebookShop notebookShop = new NotebookShop();

        // Добавляем несколько ноутбуков в магазин
        notebookShop.addNotebook(new Notebook("Model1", 8, "1 Tb", "Windows", 15, "2 GHz", "HP"));
        notebookShop.addNotebook(new Notebook("Model2", 16, "512 Gb", "MacOS", 17, "3 GHz", "Apple"));
        notebookShop.addNotebook(new Notebook("Model3", 4, "1 Tb", "Linux", 15, "2 GHz", "Dell"));
        notebookShop.addNotebook(new Notebook("Model4", 16, "2 Tb", "Linux", 17, "3 GHz", "HP"));
        notebookShop.addNotebook(new Notebook("Model5", 4, "512 Gb", "Windows", 15, "2 GHz", "Dell"));
        notebookShop.addNotebook(new Notebook("Model6", 8, "1 Tb", "MacOS", 15, "3 GHz", "Apple"));
        notebookShop.addNotebook(new Notebook("Model7", 4, "512 Gb", "Linux", 17, "2 GHz", "HP"));
        notebookShop.addNotebook(new Notebook("Model8", 8, "4 Tb", "Linux", 15, "3 GHz", "Dell"));
        notebookShop.addNotebook(new Notebook("Model9", 4, "512 Gb", "Windows", 15, "2 GHz", "HP"));
        notebookShop.addNotebook(new Notebook("Model10", 8, "2 Tb", "Linux", 17, "3 GHz", "Acer"));
        notebookShop.addNotebook(new Notebook("Model11", 16, "1 Tb", "Windows", 15, "2 GHz", "Dell"));
        notebookShop.addNotebook(new Notebook("Model12", 6, "4 Tb", "Linux", 17, "2 GHz", "Dell"));

        // Запрашиваем критерии фильтрации
        Map<String, Object> criteria = InputOutput.inputCriteria();

        // Запрашиваем минимальные значения для критериев
        Map<String, Object> minValues = InputOutput.inputMinValues(criteria);

        // Фильтруем ноутбуки
        Set<Notebook> result = notebookShop.filterNotebooks(criteria, minValues);

        // Выводим результат
        InputOutput.outputResult(result);
    }
}
