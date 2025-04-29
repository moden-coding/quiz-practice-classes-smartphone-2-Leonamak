public class Smartphone {
    private String brand;
    private String model;
    private int storage;
    private int battery;
    private boolean isOn;

    public Smartphone(String brand, String model, int storage, int battery) {
        this.brand = brand;
        this.model = model;
        this.storage = storage;
        this.battery = battery;
    }

    public boolean turnOn() {
        if (battery != 0) {
            isOn = true;
        } else {
            isOn = false;
        }
        return isOn;
    }

    public boolean turnOff() {
        isOn = false;
        return isOn;
    }

    public void chargePhone(int charge) {
        if (battery + charge >= 100) {
            battery = 100;
        } else {
            battery = battery + charge;
        }
        System.out.println("Your phone is charged to " + battery + "%");
    }

    public String toString() {
        return "Brand: " + brand + ", Model: " + model + ", Storage: " + storage + ", Battery: " + battery + ", On: "
                + isOn;
    }
}