package Program105;

import java.util.concurrent.Callable;

class CallableMaker {
    private final int num;
    long ans = 1;

    CallableMaker(int num) {
        this.num = num;
    }

    Callable<Long> c = new Callable<Long>() {
        public Long call() throws Exception {
            for (int i = 1; i <= num; i++) {
                ans = ans*i;
            }
            return ans;
        };
    };    
}