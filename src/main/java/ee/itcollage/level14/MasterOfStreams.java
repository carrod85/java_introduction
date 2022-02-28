package ee.itcollage.level14;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MasterOfStreams {

    private static final List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static List<Integer> convertMe() {
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 1) {
                result.add(num * 2);
            }
        }
        return result;
    }
    public static void main(String[] args){
        List<Integer> result = nums.stream().filter(n -> n % 2 ==1 )
                        .map(n -> n * 2)
                        .collect(Collectors.toList());
        System.out.println(result);


        Integer numbers= nums.stream()
                .reduce(0, Integer::sum);
        System.out.println(numbers);
    }
    //TODO convert method convertMe using streams
    public static List<Integer> converted() {
        List<Integer> result = nums.stream().filter(n -> n % 2 ==1 )
                .map(n -> n*2)
                .collect(Collectors.toList());

        return result;
    }

    //TODO create map using stream, where words would be grouped up by their length
    public static Map<Integer, List<String>> mapWordsByLength(List<String> words)  {
        Map<Integer, List<String>> strByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));
        return strByLength;
    }
}
