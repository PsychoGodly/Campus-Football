package lf;

import java.io.IOException;

/* compiled from: ForwardingSource */
public abstract class h implements s {

    /* renamed from: a  reason: collision with root package name */
    private final s f36260a;

    public h(s sVar) {
        if (sVar != null) {
            this.f36260a = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public void close() throws IOException {
        this.f36260a.close();
    }

    public t e() {
        return this.f36260a.e();
    }

    public final s h() {
        return this.f36260a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f36260a.toString() + ")";
    }
}
