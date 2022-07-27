public class FastInverseSquare {
    //Below is the Java adaptation of Quake 3 Arenas famous Q_rsqrt method
    /*
    * Originally Written in C the Q_rsqrt method was originally needed to make the process of
    * taking 1/sqrt(float) way easier and less computer intensive for the machines at the time.
    * Nowadays computers are much more powerful, but this algorithm is a classic and just too interesting
    * to not be included within this library.
    *
    * 1/sqrt(float) is needed to normalize a vector (meaning scale it to length 1). This is then used to compute
    * angles of incidence and reflection for lighting and shading in 3d graphic engines.
    * */
    /**
     * Returns the inverse square of a given float value very optimized.
     * @param number Float to take inverse square of
     * @return Returns inverse square of given float
     * */
    static float Q_rsqrt(float number) {
        float numberHalf = 0.5f * number; //multiply .5f (float literal) by x
        int i = Float.floatToIntBits(number); // store floating-point bits in integer primitive
        i = 0x5f3759df - (i >> 1); // initial guess for Newton's Method
        number = Float.intBitsToFloat(i); //convert new bits back into float value
        for (int j =0; j<4; j++){  //run 4 rounds of Newton's method for increased accuracy
            number *= (1.5f - numberHalf * number * number);
        }
        return number;
    }
}
