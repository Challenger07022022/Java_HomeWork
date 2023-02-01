package algorithms.HW2;

public class Notebook {
    private final double PRICE;
    private final int RAM;
    private final Brand BRAND;

    public Notebook(double price, int ram, Brand brand) {
        PRICE = price;
        RAM = ram;
        BRAND = brand;
    }

    public double getPRICE() {
        return PRICE;
    }

    public int getRAM() {
        return RAM;
    }

    public Brand getBRAND() {
        return BRAND;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "PRICE=" + PRICE +
                ", RAM=" + RAM +
                ", BRAND=" + BRAND +
                '}';
    }
}
