public class DiscreteMath {
    /*
A group of N individuals want to shake hands with each other, how many handshakes total will be
needed for them to do so?
There can be no repeat handshakes between people.
*/
// The below algorithm can calculate the total # of handshakes for any N sized group
    static int calculateHandshakes(int n){
        return (n * (n-1)) / 2;
    }
/*
Suppose a user has a pool of data and are tasked to create a sequence of data with no repeats, and needs
to get the total number of sequences possible with the dataset.
Ex: I have a list of colors B,G,W
I need to get the total number of sequences I can make with no repeat colors.
 */
//The below algorithm solves the above issue with n representing the total amount of data.
    static int getTotalSequences(int n){
        int fact = 1;
        if (n != 1 && n != 0) {
            for (int i = n; i >= 1; i--) {
                fact = fact * i;
            }
        }
        return fact;
    }
}
