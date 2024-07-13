package Program105;

import java.util.concurrent.Callable;

class CallableMaker {
    Callable<String> c = new Callable<String>() {
        public String call() throws Exception {
            return "";
        };
    };    
}