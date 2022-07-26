package StringManipulation;
public class ReverseString {
    /**
     * Reverses a string without using .reverse() method.
     * @param string a string to be reversed
     * @return returns a string builder object toStringed containing the parameter reversed
     * */
    //This algorithm reverses a string without using reverse() method
    static String reverseString(String string){
        String[] sequence = string.split(""); //split string characters into an array to get separate characters
        StringBuilder reversed = new StringBuilder(); //create new instance of StringBuilder() object
        for(int i = sequence.length - 1; i >= 0; i--){ //loop backwards through sequence array
            reversed.append(sequence[i]); //append sequence @ index to string builder
        }
        return reversed.toString(); //return StringBuilder object .toString()ed
    }
    public static void main(String[] args){
        String reverseMe = "!eM esreveR";
        System.out.println(reverseString(reverseMe));
    }
}
