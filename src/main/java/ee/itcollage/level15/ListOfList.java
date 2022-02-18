package ee.itcollage.level15;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ListOfList {

    private static final List<Integer> firstList = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
    private static final List<Integer> secondList = IntStream.rangeClosed(11, 100).boxed().collect(Collectors.toList());
    private static final List<Integer> thirdList = IntStream.rangeClosed(101, 1000).boxed().collect(Collectors.toList());

    private static final List<List<Integer>> numbers = List.of(firstList, secondList, thirdList);

    //Read method name to understand what to do. You are not allowed to use regular lists, use only list of list with name numbers.
    //Only streams are allowed
    //Read about Stream::flatmap()

    public static void main(String[] args){
        List<Integer> mylist = numbers.stream().flatMap(pList->pList.stream()).filter(n -> n % 7 ==0 ).collect(Collectors.toList());
        System.out.println(mylist);
    }
    public static List<Integer> findFirst20NumbersDividableBy7() {
        List<Integer> mylist = numbers.stream().flatMap(pList->pList.stream()).filter(n -> n % 7 ==0 ).limit(20).collect(Collectors.toList());
        return mylist;
    }
}
