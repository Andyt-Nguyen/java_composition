public class Motherboard {
    private String model;
    private String manufactotor;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    Motherboard(String model, String manufactotor, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufactotor = manufactotor;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }
    

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading");
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
     * @return String return the manufactotor
     */
    public String getManufactotor() {
        return manufactotor;
    }

    /**
     * @param manufactotor the manufactotor to set
     */
    public void setManufactotor(String manufactotor) {
        this.manufactotor = manufactotor;
    }

    /**
     * @return int return the ramSlots
     */
    public int getRamSlots() {
        return ramSlots;
    }

    /**
     * @param ramSlots the ramSlots to set
     */
    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    /**
     * @return int return the cardSlots
     */
    public int getCardSlots() {
        return cardSlots;
    }

    /**
     * @param cardSlots the cardSlots to set
     */
    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    /**
     * @return String return the bios
     */
    public String getBios() {
        return bios;
    }

    /**
     * @param bios the bios to set
     */
    public void setBios(String bios) {
        this.bios = bios;
    }

}