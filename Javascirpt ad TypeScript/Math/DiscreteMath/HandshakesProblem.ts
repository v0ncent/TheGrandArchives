/*
A group of N individuals want to shake hands with each other, how many handshakes total will be
needed for them to do so?

There can be no repeat handshakes between people.
*/
// The below algorithm can calculate the total # of handshakes for any N sized group

const calculateHandshakes = (n:number)=>{
    return (n * (n - 1)) / 2
}