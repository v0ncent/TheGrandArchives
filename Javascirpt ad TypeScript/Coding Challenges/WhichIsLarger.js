/*
Your function will be passed two functions, f and g, that don't take any parameters.
Your function has to call them, and return a string which indicates which function returned the larger number.

If f returns the larger number, return the string f.
If g returns the larger number, return the string g.
If the functions return the same number, return the string neither.
 */
//the below algorithm solves the above problem
function wichIsLarger(f, g) {
    if (g() < f()) {
        return "f";
    }
    if (f() < g()) {
        return "g";
    }
    return "neither";
}
