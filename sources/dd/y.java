package dd;

import dd.y;
import java.util.concurrent.TimeUnit;
import r6.i;

/* compiled from: ForwardingChannelBuilder */
public abstract class y<T extends y<T>> extends v0<T> {
    protected y() {
    }

    /* access modifiers changed from: protected */
    public abstract v0<?> e();

    /* renamed from: f */
    public T c(long j10, TimeUnit timeUnit) {
        e().c(j10, timeUnit);
        return g();
    }

    /* access modifiers changed from: protected */
    public final T g() {
        return this;
    }

    /* renamed from: h */
    public T d() {
        e().d();
        return g();
    }

    public String toString() {
        return i.c(this).d("delegate", e()).toString();
    }
}
