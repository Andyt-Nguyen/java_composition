public class Monitor {
    private String model;
    private String manufactor;
    private int size;
    private Resolution nativeResolution;

    Monitor(String model, String manufactor, int size, Resolution nativeResolution) {
        this.model = model;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in color " + color);
    }

    /**
     * @return String return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return String return the manufactor
     */
    public String getManufactor() {
        return manufactor;
    }

    /**
     * @param manufactor the manufactor to set
     */
    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    /**
     * @return int return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return Resolution return the nativeResolution
     */
    public Resolution getNativeResolution() {
        return nativeResolution;
    }

    /**
     * @param nativeResolution the nativeResolution to set
     */
    public void setNativeResolution(Resolution nativeResolution) {
        this.nativeResolution = nativeResolution;
    }

}