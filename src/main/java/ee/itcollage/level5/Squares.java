package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Squares {

    //todo fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 => 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers){
        List<Integer> squares = new ArrayList<>();
        for(Integer integer : integers){
            squares.add(integer * integer);
        }
        return squares;
    }
}
