public class House {
    Kitchen kitchen;
    LivingRoom livingRoom;

    House(Kitchen kitchen, LivingRoom livingRoom) {
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
    }

    public void getItems() {
        kitchen.typeFloor();
        livingRoom.typeTv();
    }


}
