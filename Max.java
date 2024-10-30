public class Max {


    public static int countFactors(int n){
        int num = 1;
        int factors = 0;
        while(num>0){
            if ((n%num)==0){
                factors++;
            }
        num++;
        }
        return factors;
    }

    public static boolean isPrime(int n){
        int factors = countFactors(n);
        if (factors==2){
            return true;
        }else{
            return false;
        }
    }

    public static int countPrimes(int n){
        int num = 1;
        int primes = 0;
        while(num <= n){
            if (isPrime(num)){
                primes++;
        }
        num++;
    }
    return primes;
}

    public static void main (String[]args){

        System.out.println(isPrime(27));
        System.out.println(countFactors(24));
        System.out.println(countPrimes(24));

    }
}
