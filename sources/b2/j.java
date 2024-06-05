package b2;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: ExecutionModule */
abstract class j {
    static Executor a() {
        return new m(Executors.newSingleThreadExecutor());
    }
}
