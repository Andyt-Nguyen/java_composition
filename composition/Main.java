class Main {
    public static void main(String args[]) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("22B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27in Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePc = new PC(theCase, monitor, motherboard);
        thePc.powerUp();


        Kitchen kitchen = new Kitchen("wood", "marble", "stainless steel");
        LivingRoom livingRoom = new LivingRoom("carpet", "Panasonic", "glass");
        House house = new House(kitchen, livingRoom);

        house.getItems();
    }
}
