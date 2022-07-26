//Authored By @v0ncent
public class ReverseAString {
    //Below is an algorithm that can reverse any string without using .reverse() method
    /**
     * Reverses a string without using the .reverse() method
     * @param string string to be reversed
     * @return returns a stringified StringBuilder object containing the reversed string
     * */
    static String reverseString(String string){
        String[] characters = string.split("");
        StringBuilder reversed = new StringBuilder();
        for(int i = characters.length - 1; i>=0; i--){
            reversed.append(characters[i]);
        }
        return reversed.toString();
    }
}
