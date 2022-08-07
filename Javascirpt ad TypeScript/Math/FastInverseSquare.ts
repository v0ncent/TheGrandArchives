//Below is the TypeScript and Javascript  adaTptation of Quake 3 Arenas famous Q_rsqrt method
/*
* Originally Written in C the Q_rsqrt method was originally needed to make the process of
* taking 1/sqrt(float) way easier and less computer intensive for the machines at the time.
* Nowadays computers are much more powerful, but this algorithm is a classic and just too interesting
* to not be included within this library.
*
* 1/sqrt(float) is needed to normalize a vector (meaning scale it to length 1). This is then used to compute
* angles of incidence and reflection for lighting and shading in 3d graphic engines.
* */
function Q_rsqrt(float:number){
    let i:number;
    let x2, y:number;
    const threehalfs = 1.5;
  
    x2 = float * 0.5;
    y = float;

    //evil floating bit level hacking
    const buf = new ArrayBuffer(4);
    (new Float32Array(buf))[0] = float;
    i =  (new Uint32Array(buf))[0];

    i = (0x5f3759df - (i >> 1)); //What the fuck?
    (new Uint32Array(buf))[0] = i;
    y = (new Float32Array(buf))[0];
    
    for(let i = 0; i< 4; i++){
        y  = y * ( threehalfs - ( x2 * y * y ) );   // run newtons method 4 times for more accuracy
    }

    return y;
}