package te;

import kotlin.coroutines.jvm.internal.e;
import xd.d;
import xd.g;

/* compiled from: ChannelFlow.kt */
final class x<T> implements d<T>, e {

    /* renamed from: a  reason: collision with root package name */
    private final d<T> f38720a;

    /* renamed from: b  reason: collision with root package name */
    private final g f38721b;

    public x(d<? super T> dVar, g gVar) {
        this.f38720a = dVar;
        this.f38721b = gVar;
    }

    public e getCallerFrame() {
        d<T> dVar = this.f38720a;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    public g getContext() {
        return this.f38721b;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public void resumeWith(Object obj) {
        this.f38720a.resumeWith(obj);
    }
}
