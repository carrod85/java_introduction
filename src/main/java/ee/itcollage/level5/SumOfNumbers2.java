package ee.itcollage.level5;

import java.util.List;
import org.apache.commons.collections4.CollectionUtils;

public class SumOfNumbers2 {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (integerList == null || CollectionUtils.isEmpty(integerList)) {

            //todo add gradle dependency for apache collectionutils and rewrite this condition with isNotEmpty
            return null;
        }
        Integer sumTotal = 0;

        for(Integer i=0; i< integerList.size();i++){
            sumTotal = sumTotal + integerList.get(i);
        }

        return sumTotal;
    }

}
