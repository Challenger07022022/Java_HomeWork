package OOP_HomeWork2;

public class Wheel implements Checkable {

    public void rotate(){
        System.out.println("Колесо крутится");
    }

    @Override
    public void check() {
        System.out.println("Все хорошо с колесом");
    }

}
