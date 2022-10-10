package OOP_HomeWork1;

public class Engine {

    private Boolean work;

    public void start() {
        this.work = true;
        System.out.println("Двигатель запущен!");
    }

    public void stop() {
        this.work = false;
        System.out.println("Двигатель остановлен!");
    }

    public void throttleUp(int level) {
        if (this.work)
            System.out.printf("Дроссель открыт на %d%n", level);
    }

    public Boolean getWork() {
        return work;
    }
}
