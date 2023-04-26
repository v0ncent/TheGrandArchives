float Q_Sqrt(float x) {
    float xHalf = 0.5f * x;
    int i = *(int*)&x; // store floating point bits in integer pointer
    i = 0x5f3759df - (i >> 1); // initial guess for newtons method
    x = *(float*)&i; // convert back to float
    x = x*(1.5f - xHalf*x*x); // one round of newtons method
    return x;
}

