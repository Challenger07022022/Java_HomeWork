package OOP_HomeWork4;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> box;

    public Box() {
        this.box = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        this.box.add(fruit);
    }

    public void pourOver(Box<T> otherBox){
        T fruit = this.box.get(0);
        while (!this.box.isEmpty()){
            this.box.remove(0);
            otherBox.addFruit(fruit);
        }
    }

    public double getWeight(){
        if (!this.box.isEmpty()){
            return this.box.size() * this.box.get(0).weight();
        }
        return 0;
    }

    public boolean compare (Box<? extends Fruit> otherBox){
        return getWeight() == otherBox.getWeight();
    }
}
