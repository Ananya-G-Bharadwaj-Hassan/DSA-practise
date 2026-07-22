public class NextPrime {
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // divisible → not prime
        }
        return true;
    }

    // Method to find the next prime after n
    public static int nextPrime(int n) {
        int candidate = n + 1; // start checking from the next number
        while (!isPrime(candidate)) {
            candidate++; // keep incrementing until a prime is found
        }
        return candidate;
    }

    public static void main(String[] args) {
        int n = 7; // example input
        System.out.println("Next prime after " + n + " is: " + nextPrime(n));
    }
}