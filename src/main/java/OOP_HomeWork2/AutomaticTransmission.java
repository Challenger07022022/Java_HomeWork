package OOP_HomeWork2;

public class AutomaticTransmission extends Transmission implements Checkable {
    @Override
    public void switchGear(int number) {
        if (number > 0)
            System.out.println("Перевод рычага переключения передач в положение D");
        else if (number < 0)
            System.out.println("Перевод рычага переключения передач в положение R");
        else
            System.out.println("Перевод рычага переключения передач в положение P");
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с автоматической трансмиссией");
    }
}

