import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class InputOutput {
    private static Scanner scanner = new Scanner(System.in);

    public static Map<String, Object> inputCriteria() {
        Map<String, Object> criteria = new HashMap<>();

        System.out.println("Enter the number corresponding to the desired criterion:");
        System.out.println("1 - RAM (4 Gb, 8 Gb, 16 Gb)");
        System.out.println("2 - Storage (512 Gb, 1 Tb)");
        System.out.println("3 - OS (Windows, MacOS, Linux)");
        System.out.println("4 - Screen Size (15, 17)");
        System.out.println("5 - Processor (2 GHz, 3 GHz)");
        System.out.println("6 - Manufacturer (HP, Lenovo, Dell, Apple)");

        System.out.print("Choose a criterion: ");
        int selectedCriterion = scanner.nextInt();

        switch (selectedCriterion) {
            case 1:
                System.out.print("Enter RAM size: ");
                String ramSize = scanner.next();
                criteria.put("RAM", ramSize);
                break;
            case 2:
                System.out.print("Enter storage size: ");
                String storageSize = scanner.next();
                criteria.put("Storage", storageSize);
                break;
            case 3:
                System.out.print("Enter OS: ");
                String os = scanner.next();
                criteria.put("OS", os);
                break;
            case 4:
                System.out.print("Enter screen size: ");
                String screenSize = scanner.next();
                criteria.put("ScreenSize", screenSize);
                break;
            case 5:
                System.out.print("Enter processor type: ");
                String processor = scanner.next();
                criteria.put("Processor", processor);
                break;
            case 6:
                System.out.print("Enter manufacturer: ");
                String manufacturer = scanner.next();
                criteria.put("Manufacturer", manufacturer);
                break;
            default:
                System.out.println("Invalid criterion choice.");
        }

        return criteria;
    }

    public static Map<String, Object> inputMinValues(Map<String, Object> criteria) {
        Map<String, Object> minValues = new HashMap<>();

        for (Map.Entry<String, Object> entry : criteria.entrySet()) {
            String criterion = entry.getKey();
            Object value = entry.getValue();

            System.out.print("Enter minimum value for " + criterion + ": ");
            String minValue = scanner.next();
            minValues.put(criterion, minValue);
        }

        return minValues;
    }

    public static void outputResult(Set<Notebook> result) {
        for (Notebook notebook : result) {
            System.out.println("Model: " + notebook.getModel());
            // Print other notebook characteristics
            // ...
            System.out.println();
        }
    }
}
