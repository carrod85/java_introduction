package ee.itcollage.level7;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.apache.commons.collections4.CollectionUtils;

public class UniquenessService {

    //todo fix tests
    // pro tip: never remove anything from a list
    public static List<Integer> uniqueNumbers(List<Integer> numbers){
        if (CollectionUtils.isEmpty(numbers)) {
            return numbers;
        }
//        numbers.stream().distinct().collect(Collectors.toList());
        return new ArrayList<>(new TreeSet<>(numbers));
    }

}
