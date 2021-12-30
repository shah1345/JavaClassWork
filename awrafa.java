
import java.util.ArrayList;
        import java.util.Collections;
public class awrafa {
    public static void main(String[] args){

        ArrayList<Car2> a = new ArrayList<>();
        a.add(new Car2(150.0, 5));
        a.add(new Car2(120.0, 9));
        a.add(new Car2(125.0, 8));
        a.add(new Car2(120.0, 7));









        Collections.sort(a);
        for(Car2 c : a){
            System.out.println(c.speed+ " "+c.durability);
        }
    }


    }


class Car2 implements Comparable{
    double speed;
    int durability;
    public Car2(double speed, int durability){
        this.speed = speed;
        this.durability = durability;
    }


    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public double getdurability() {
        return durability;
    }
    public void setdurability(double spdurabilityeed) {
        this.durability = durability;
    }


    @Override
    public int compareTo(Object o) {
        int compareage= (int) ((Car2)o).getSpeed();

        return (int) (this.speed-compareage);
    }
}