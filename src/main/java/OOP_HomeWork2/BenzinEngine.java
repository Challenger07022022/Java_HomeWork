package OOP_HomeWork2;

public class BenzinEngine extends Engine implements Checkable {

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

    @Override
    public void check() {
        System.out.println("Все хорошо c бензиновым двигателем");
    }
}
