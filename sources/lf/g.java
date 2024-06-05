package lf;

import java.io.IOException;

/* compiled from: ForwardingSink */
public abstract class g implements r {

    /* renamed from: a  reason: collision with root package name */
    private final r f36259a;

    public g(r rVar) {
        if (rVar != null) {
            this.f36259a = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void V0(c cVar, long j10) throws IOException {
        this.f36259a.V0(cVar, j10);
    }

    public void close() throws IOException {
        this.f36259a.close();
    }

    public t e() {
        return this.f36259a.e();
    }

    public void flush() throws IOException {
        this.f36259a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f36259a.toString() + ")";
    }
}
