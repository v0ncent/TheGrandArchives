import java.util.ArrayList;
import java.util.List;

//Authored by v0ncent
public class FactorsOfNumbers {
    //Below are two algorithms that can be used to get an array of its factors from a given number
    static List<Integer> getFactors(int number){

        List<Integer> factors = new ArrayList<>();

        if(number < 0){ //if number is negative
            for (int i = number; i<= Math.abs(number); i++){
                if(i==0){ //skip so we dont divide by 0
                    continue;
                }else if(number % i == 0){ //if mod i returns 0 it is a factor
                    factors.add(i);
                }
            }
        } else { //if number is positive
            for (int i = 1; i<=number; i++){ //loop from 1 - number
                if(number % i == 0){ //if mod returns 0 it is a factor
                    factors.add(i);
                }
            }
        }
        return factors;
    }
}
