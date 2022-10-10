package OOP_HomeWork1;

public class Door {

    private boolean openDoor;
    private boolean blockDoor;

    public void open(int number){
        this.openDoor = true;
        System.out.println("Дверь " + number + " открыта!");
    }

    public void closed(int number){
        this.openDoor = false;
        System.out.println("Дверь " + number + " закрыта!");
    }

    public void blocked(int number){
        if (!this.openDoor){
            this.blockDoor = true;
            System.out.println("Дверь " + number + " заблокирована!");
        }
    }

    public void unblocked(int number){
        if (this.blockDoor){
            this.blockDoor = false;
            System.out.println("Дверь " + number + " разблокирована!");
        }
    }
}
