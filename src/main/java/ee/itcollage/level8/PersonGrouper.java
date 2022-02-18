package ee.itcollage.level8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;


public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people) {
        Map<String, Person> mapResult = new HashMap<>();
        for (Person p : people) {
            mapResult.put(p.getIdCode(), p);
        }
        return mapResult;
    }
}

