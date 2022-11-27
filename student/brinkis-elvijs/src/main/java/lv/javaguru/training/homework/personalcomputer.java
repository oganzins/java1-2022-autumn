package lv.javaguru.training.homework;

public class personalcomputer {

    private static String  monitor;
    private String mouse;
    private String keyboard;
    private int ram;

    public personalcomputer(String monitor, String mouse, String keyboard, int ram) {
    }

    String getMonitor() {return monitor;}
    String getMouse() {return mouse;}
    String getKeyboard() {return keyboard;}

    public void setMonitor(String monitor) { this.monitor = monitor;}
    public void setMouse(String mouse) { this.mouse = mouse;}
    public void setKeyboard(String keyboard) { this.keyboard = keyboard;}
    public void setRam(int ram) { this.ram = ram;}
}




