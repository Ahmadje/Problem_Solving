package FizzBuzz;
////////////Print Array (Divides by both 3 and 5 =>> FizzBuzz), (Divides by 3 =>> Fizz), (Not divisible by 3 or 5 =>> add the number)///////////////

import java.util.ArrayList;
import java.util.List;

public class solution {
    public List<String> fizzBuzz(int n) {

        // ans list
        List<String> ans = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {

            ans.add(
                    i % 15 == 0 ? "FizzBuzz" :
                            i % 5 == 0 ? "Buzz" :
                                    i % 3 == 0 ? "Fizz" :
                                            String.valueOf(i)
            );

//            if (i % 3 == 0 & i % 5 == 0) {
//                // Divides by both 3 and 5, add FizzBuzz
//                ans.add("FizzBuzz");
//            } else if (i % 3 == 0) {
//                // Divides by 3, add Fizz
//                ans.add("Fizz");
//            } else if (i % 5 == 0) {
//                // Divides by 5, add Buzz
//                ans.add("Buzz");
//            } else {
//                // Not divisible by 3 or 5, add the number
//                ans.add(Integer.toString(i));
//            }
        }

        return ans;
    }
}