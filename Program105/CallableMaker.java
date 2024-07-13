package Program105;

import java.util.concurrent.Callable;

class CallableMaker {
    private final int num;

    CallableMaker(int num) {
        this.num = num;
    }

    Callable<Long> c = new Callable<Long>() {
        public Long call() throws Exception {
            
            return (long)1;
        };
    };    
}