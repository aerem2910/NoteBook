import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NotebookShop {
    private Set<Notebook> notebooks;

    public NotebookShop() {
        notebooks = new HashSet<>();
    }

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public Set<Notebook> filterNotebooks(Map<String, Object> criteria, Map<String, Object> minValues) {
        Set<Notebook> result = new HashSet<>();

        for (Notebook notebook : notebooks) {
            boolean matches = true;

            for (Map.Entry<String, Object> entry : criteria.entrySet()) {
                String criterion = entry.getKey();
                Object value = entry.getValue();
                Object minValue = minValues.get(criterion);

                switch (criterion) {
                    case "RAM":
                        matches = matches && (notebook.getRamGb() == Integer.parseInt((String) value) &&
                                notebook.getRamGb() >= Integer.parseInt((String) minValue));
                        break;
                    case "Storage":
                        matches = matches && notebook.getStorage().equals(value) &&
                                notebook.getStorage().compareTo((String) minValue) >= 0;
                        break;
                    case "OS":
                        matches = matches && notebook.getOs().equals(value) &&
                                notebook.getOs().compareTo((String) minValue) >= 0;
                        break;
                    case "ScreenSize":
                        matches = matches && (notebook.getScreenSize() == Integer.parseInt((String) value) &&
                                notebook.getScreenSize() >= Integer.parseInt((String) minValue));
                        break;
                    case "Processor":
                        matches = matches && notebook.getProcessor().equals(value) &&
                                notebook.getProcessor().compareTo((String) minValue) >= 0;
                        break;
                    case "Manufacturer":
                        matches = matches && notebook.getManufacturer().equals(value) &&
                                notebook.getManufacturer().compareTo((String) minValue) >= 0;
                        break;
                    // Добавьте обработку для других критериев, если необходимо
                }
            }

            if (matches) {
                result.add(notebook);
            }
        }

        return result;
    }
}

