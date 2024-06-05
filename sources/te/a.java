package te;

import java.util.concurrent.CancellationException;
import pe.t0;
import se.f;

/* compiled from: FlowExceptions.kt */
public final class a extends CancellationException {

    /* renamed from: a  reason: collision with root package name */
    public final transient f<?> f38643a;

    public a(f<?> fVar) {
        super("Flow was aborted, no more elements needed");
        this.f38643a = fVar;
    }

    public Throwable fillInStackTrace() {
        if (t0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
