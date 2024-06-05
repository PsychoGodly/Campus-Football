package te;

import java.util.concurrent.CancellationException;
import pe.t0;

/* compiled from: FlowExceptions.kt */
public final class j extends CancellationException {
    public j() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        if (t0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
