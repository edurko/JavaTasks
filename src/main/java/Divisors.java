import java.util.*;

public class Divisors {

    public static void main(String[] args) {
    divisors(12);
    divisors(25);
    divisors(13);

    }

    public static List<Integer> divisors(int number) {
        List<Integer> divisors = new ArrayList<>();
        if (number > 1) {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    divisors.add(i);
                }
            }
        } else {
            throw new IllegalArgumentException("Method do not accepts numbers less then 1");
        }

        if (divisors.isEmpty()){
            System.out.println("'"+number+" is prime'");
        }else {
           for(Integer element : divisors){
               System.out.print(element +", ");
           }
            System.out.println();
        }
        return divisors;
    }
}
