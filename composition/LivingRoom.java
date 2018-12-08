public class LivingRoom {
    private String floor;
    private String tv;
    private String table;

    LivingRoom(String floor, String tv, String table) {
        this.floor = floor;
        this.tv = tv;
        this.table = table;
    }

    public void typeTv() {
        System.out.println("The Tv brand name is " + tv);
    }

    /**
     * @return the floor
     */
    public String getFloor() {
        return floor;
    }

    /**
     * @param floor the floor to set
     */
    public void setFloor(String floor) {
        this.floor = floor;
    }
    
    /**
     * @return the table
     */
    public String getTable() {
        return table;
    }

    /**
     * @param table the table to set
     */
    public void setTable(String table) {
        this.table = table;
    }

    /**
     * @return the tv
     */
    public String getTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(String tv) {
        this.tv = tv;
    }

}