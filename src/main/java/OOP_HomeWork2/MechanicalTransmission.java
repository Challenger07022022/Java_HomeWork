package OOP_HomeWork2;

public class MechanicalTransmission extends Transmission implements Checkable, GearSwitchable {
    @Override
    public void switchGear(int number) {
        super.switchGear(number);
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с механической трансмиссией");
    }
}

