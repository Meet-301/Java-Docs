package Program105;

import java.util.concurrent.Callable;

class CallableMaker implements Callable<Long> {
    private final int num;

    CallableMaker(int num) {
        this.num = num;
    }

    @Override
    public Long call() throws Exception {
        long ans = 1;
        for (int i = 1; i <= num; i++) {
            ans *= i;
        }
        return ans;
    }
}