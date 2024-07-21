package Program110;

public class Tester {
    Functional_Interface fi = new Functional_Interface() {
        public boolean isPrime(int n) {
            boolean prime = false;
            for (int i = 2; i <= n; i++) {
                if (n % 2 == 0) {
                    prime = true;
                }
                else {
                    return prime;
                }
            }
            return prime;
        };
    };

    boolean primeNum = fi.isPrime(0);
}
