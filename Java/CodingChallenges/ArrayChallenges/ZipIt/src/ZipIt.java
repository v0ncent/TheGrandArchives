/*
Given an array of women and an array of men, either:

Return null if the two arrays are of different sizes.
If the sizes match, return an array of pairs, with the first woman
paired with the first man, second woman paired with the second man, etc.
* */

import java.util.Arrays;
import java.util.List;

public class ZipIt {
    static String[][] zipIt(List<String>men, List<String>women){
        if(men.size() != women.size()){
            return null;
        }
        String[][] pairs = new String[men.size()][2];
        for(int i = 0; i < men.size(); i++){
            for (int j = 0; j < women.size(); j++) {
                pairs[i][0] = men.get(i);
                pairs[j][1] = women.get(j);
            }
        }
        return pairs;
    }
    public static void main(String[] args){
        List<String> women = List.of("Tesha","Sally");
        List<String> men = List.of("Austin","joe");
        System.out.println(Arrays.deepToString(zipIt(men, women)));
    }

}
