public class FactorialRecursion {
    public static void main(String[] args) {
        //fact(4)
        //4*fact(3)
        System.out.println(factorial(4));

    }

    static int factorial(int n){
        if (n==1){
            return 1;
        }else
            return(n*factorial(n-1));


    }
}


