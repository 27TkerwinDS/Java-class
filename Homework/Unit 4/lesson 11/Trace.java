public class Trace{
    public static void main(String[] args){
        double len = 2;
        double result = cubeVolume(len);
        System.out.println(result);
        len = 10;
        result = cubeVolume(len);
        System.out.println(result);
    }
    public static double cubeVolume(double sideLength)
    {   
        double volume = sideLength * sideLength * sideLength;
    return volume;
    }

}
/*
 * This is where i am going to track the veriables (didn't include .0 because redundent)
 * where| len | side langth | volume | resut
 *    3 |   2 |    n/a      |   n/a  |  n/a
 *    4 |   2 |    n/a      |   n/a  | CubeVolume of len
 *   10 |   2 |      2      |   n/a  | CubeVolume of len
 *   12 |   2 |      2      |     8  | CubeVolume of len
 *    4 |   2 |      2      |     8  |   8
 *    6 |  10 |      2      |     8  |   8
 *    7 |  10 |      2      |     8  | CubeVolume of len
 *   10 |  10 |     10      |     8  | CubeVolume of len
 *   12 |  10 |     10      |  1000  | CubeVolume of len
 *    7 |  10 |     10      |  1000  |  1000
 */