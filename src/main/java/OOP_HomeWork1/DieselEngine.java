package OOP_HomeWork1;

public class DieselEngine extends Engine {

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

    public void check() {
        System.out.println("Все хорошо!");
    }
}
