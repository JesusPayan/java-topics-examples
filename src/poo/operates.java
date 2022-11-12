package poo;

public class operates implements Operate{

    public static int  suma(int x, int y) {
        return x+y;
    }


    public static double suma(double[] doubleArray) {
        double sum = 0.0;
        for (int i = 0; i< doubleArray.length;i++){
            System.out.println(doubleArray[i]);
            sum=sum+doubleArray[i];
        }
        return sum;
    }
    public static int suma(int[] intArray) {
        int sum = 0;
        for (int i= 0; i< intArray.length;i++){
            sum=sum+intArray[i];
        }

    return sum;
        }

    public static void main(String[] args) {
        int [] numbers ={1,2,3,5,4};
        double [] numbers2 = {1.0,2.5,3.4,5,4};
        System.out.println(suma(1,2));
        System.out.println(suma(numbers));
        System.out.println(suma(numbers2));



    }
}
