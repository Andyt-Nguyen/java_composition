public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerBtn();
        drawLogo();
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200, 1500, "yellow");
    }

}
