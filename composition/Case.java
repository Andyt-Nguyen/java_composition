
public class Case {
    private String model;
    private String manufactor;
    private String powerSupply;
    private Dimensions dimensions;

    Case(String model, String manufactor, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufactor = manufactor;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerBtn() {
        System.out.println("Power: Button Pressed");
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
     * @return String return the powerSupply
     */
    public String getPowerSupply() {
        return powerSupply;
    }

    /**
     * @param powerSupply the powerSupply to set
     */
    public void setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
    }

    /**
     * @return Dimensions return the dimensions
     */
    public Dimensions getDimensions() {
        return dimensions;
    }

    /**
     * @param dimensions the dimensions to set
     */
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }

}