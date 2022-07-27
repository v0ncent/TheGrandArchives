//Authored By @v0ncent
public class ReverseAString {
    //Below is an algorithm that can reverse any string without using .reverse() method
    /**
     * Reverses a string without using the .reverse() method
     * @param string string to be reversed
     * @return returns a stringified StringBuilder object containing the reversed string
     * */
    static String reverseString(String string){
        String[] characters = string.split(""); //split string at empty space to get individual characters into a list
        StringBuilder reversed = new StringBuilder(); //create string builder object
        for(int i = characters.length - 1; i>=0; i--){ //loop through characters list backwards
            reversed.append(characters[i]); //append the characters at the index to the string builder obj
        }
        return reversed.toString(); //return stringified string builder obj containing reversed characters
    }
}
