public class Notebook {
    private String model;
    private int ramGb;
    private String storage;
    private String os;
    private int screenSize;
    private String processor;
    private String manufacturer;

    public Notebook(String model, int ramGb, String storage, String os, int screenSize, String processor, String manufacturer) {
        this.model = model;
        this.ramGb = ramGb;
        this.storage = storage;
        this.os = os;
        this.screenSize = screenSize;
        this.processor = processor;
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getRamGb() {
        return ramGb;
    }

    public String getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getProcessor() {
        return processor;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
