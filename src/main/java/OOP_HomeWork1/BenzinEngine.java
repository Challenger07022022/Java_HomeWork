package OOP_HomeWork1;

public class BenzinEngine extends Engine {

    @Override
    protected void startInternal() {
        System.out.println("Бензиновый двигатель запущен!");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Бензиновый двигатель остановлен!");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Бензиновый дроссель открыт на %d%n", level);
    }
    public void check() {
        System.out.println("Все хорошо!");
    }
}
