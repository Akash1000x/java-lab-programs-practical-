// import java.util.Scanner;

// class Prime
// {
//     public static void main(String args[]){

//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the number to be tested for prime ");
//         int n= in.nextInt();
//         int i;
//         for(i=2;i<=n;i++){
//             if( n%i == 0 && i  != n ){
//                 System.out.println(n+">>>>> not prime");
//                 break;
//             }
//         }
//         if(i==n){
//             System.out.println(n+ ">>>>Number is prime.");

//         }
//     }
// }
import java.util.Scanner;

class Prime {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be tested for prime ");
        int n = in.nextInt();

        if (n == 1) {
            System.out.println(n + " is not prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }
        }
    }
}
