package androidx.lifecycle;

import androidx.lifecycle.i;
import kotlin.jvm.internal.m;

/* compiled from: SingleGeneratedAdapterObserver.kt */
public final class SingleGeneratedAdapterObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final f f3873a;

    public SingleGeneratedAdapterObserver(f fVar) {
        m.e(fVar, "generatedAdapter");
        this.f3873a = fVar;
    }

    public void onStateChanged(p pVar, i.a aVar) {
        m.e(pVar, "source");
        m.e(aVar, "event");
        this.f3873a.a(pVar, aVar, false, (v) null);
        this.f3873a.a(pVar, aVar, true, (v) null);
    }
}
