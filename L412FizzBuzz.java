package String;

import java.util.ArrayList;
import java.util.List;

public class L412FizzBuzz {
    //TC=O(1) SC=O(n) or O(1) if we do not consider space to store the elemets
    public List<String> fizzBuzz(int n) {
        List<String> ans= new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0) ans.add("FizzBuzz");
            else if(i%3==0) ans.add("Fizz");
            else if(i%5==0) ans.add("Buzz");
            else ans.add(Integer.toString(i));
        }
        return ans;
    }
}
