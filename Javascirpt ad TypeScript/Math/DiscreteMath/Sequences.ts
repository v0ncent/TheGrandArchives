/*
Suppose a user has a pool of data and are tasked to create a sequence of data with no repeats, and needs
to get the total number of sequences possible with the dataset.

Ex: I have a list of colors B,G,W
I need to get the total number of sequences I can make with no repeat colors.
 */
//The below algorithm solves the above issue.
function getTotalSequences(n:number){
    let fact = 1;
    if (n == 0 || n==1){
        return fact;
    } else {
        for(let i = n; i>=1; i--){
            fact = fact * i;
        }
        return fact;
    }
}