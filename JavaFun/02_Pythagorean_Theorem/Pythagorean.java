import java.lang.Math;

public  class Pythagorean{
    public static double calculateHypotenuse(int lenA, int lenB)
    {
        return(Math.sqrt(lenA*lenA+lenB*lenB));
    }

    public static void main(String args[]) {
        System.out.println(calculateHypotenuse(5,4));
    }
}
