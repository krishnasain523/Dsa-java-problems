package Numbers;
public class fractionsum {
    // Function to find GCD (HCF)
   public static int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    public static void sumoffraction(int num1,int den1,int num2,int den2)
    {
       int numeritor=(num1*den2)+(num2*den1);
       int denominator=(den1*den2);
       int g=gcd(numeritor, denominator);
       numeritor/=g;
       denominator/=g;
       System.out.println("the sum of"+ " num1/den1+num2/den2"+"="+numeritor+"/"+denominator);
    }
    public static void main(String[] args) {
        int num1=1;
        int num2=3;
        int den1=2;
        int den2=2;
        sumoffraction(num1,den1,num2,den2);
    }
}
