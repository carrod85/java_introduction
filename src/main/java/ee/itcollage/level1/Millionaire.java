package ee.itcollage.level1;

import ee.itcollage.level8.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Millionaire {

    public static void main(String[] args) {
        //todo create a Garage.
        Garage atelier = new Garage();
        // create a Garage and put Ferrari in it.
        Ferrari spider = new Ferrari();
        spider.setBrand("spider");
        // print out Ferrari and make it print out sth nice (other than ee.itcollage.level1.Ferrari@1c20c684)
        System.out.println(spider);
        // add a list of cars to Garage
        Ferrari uno = new Ferrari();
        Ferrari dos = new Ferrari();
        List<Ferrari> ferraris = Collections.EMPTY_LIST;
        Collections.addAll(ferraris=new ArrayList<Ferrari>(), uno,dos);
        uno.setBrand("uno");
        dos.setBrand("dos");
        atelier.addList(ferraris);

        // add another Ferrari to Garage
        Ferrari other = new Ferrari();
        other.setBrand("cavalino");
        atelier.add(other);
        atelier.add(spider);
        // make Garage print out a list of cars in it
        atelier.printList();
    }

}
