package ee.itcollage.level3;

public class LargestNumber {

    //todo make tests work
    public static void main(String[] args) {
        //check if works ->
        System.out.println(pickLargest(-1,1));// same situation inside the class i can call the method

        System.out.println(pickLargest(1,2,5));
    }

    public static int pickLargest(int x1, int x2){
        if(x1 >= x2)
            return x1;
        else
            return x2;
    }

    public static int pickLargest(int x1, int x2, int x3){
        if (x1>x2 && x1>x3)
            return x1;
        else if(x2>x1 && x2>x3)
            return x2;
        else if (x1==x2 && x1==x3){
            return x1;
        }
        else if (x1==x2 && x1>x3){
            return x1;
        }
        else if (x1==x3 && x1>x2){
            return x1;
        }
        else if (x2==x3 && x1<x2){
            return x2;
        }
        else
            return x3;
    }
}
