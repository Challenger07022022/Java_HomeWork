package OOP_HomeWork2;

public class DieselEngine extends Engine implements Checkable{

    @Override
    protected void startInternal() {
        System.out.println("Дизельный двигатель запущен!");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Дизельный двигатель остановлен!");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Дизельный дроссель открыт на %d%n", level);
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с дизельным двигателем");
    }
}
