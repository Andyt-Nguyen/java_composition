public class Kitchen {
    String floor;
    String counter;
    String sink;

    Kitchen(String floor, String counter, String sink) {
        this.floor = floor;
        this.counter = counter;
        this.sink = sink;
    }

    public void typeFloor() {
        System.out.println("The floor in the kitchen is " + floor);
    }

    /**
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @return the counter
     */
    public String getCounter() {
        return counter;
    }

    /**
     * @return the sink
     */
    public String getSink() {
        return sink;
    }

    /**
     * @param counter the counter to set
     */
    public void setCounter(String counter) {
        this.counter = counter;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }

    /**
     * @param sink the sink to set
     */
    public void setSink(String sink) {
        this.sink = sink;
    }
}