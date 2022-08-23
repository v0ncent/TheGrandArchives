/**
 * Create a function that will return an integer number corresponding to the amount of digits in the given integer num.
 */
//the below algorithm solves the above challenge
const getNumberOfDidgets = (num:number) => {
   return Math.abs(num).toString().length;
}