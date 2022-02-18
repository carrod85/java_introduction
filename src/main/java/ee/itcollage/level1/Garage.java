package ee.itcollage.level1;

import java.util.ArrayList;
import java.util.List;

public class Garage {

    private List<Ferrari> ferrari = new ArrayList<>();

    public void add(Ferrari ferrari) {
        this.ferrari.add(ferrari);
    }

    public void addList(List<Ferrari> ferrari){this.ferrari.addAll(ferrari) ;}

    public void printList(){
        for (Ferrari car: this.ferrari){
            System.out.println(car.toString());
        }
    }
}
