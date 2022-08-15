/*
Given an array of women and an array of men, either:

Return null if the two arrays are of different sizes.
If the sizes match, return an array of pairs, with the first woman
paired with the first man, second woman paired with the second man, etc.
* */
//The Below algorithm solves this challenge
import java.util.List;
public class ZipIt {
    /**
     * Takes in two arrays and if the arrays are the same size it pairs
     * each index to eachother as a 2d array (ex. (ashley,becka) (john, zach) -> (ashley,john),(zach,becka))
     * @param men first list to pair
     * @param women second list to pair 
     * @return Returns a 2d array of pairs, if arrays are different sizes returns null.
     */
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
}
