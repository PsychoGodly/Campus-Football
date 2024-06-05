package androidx.lifecycle;

import androidx.lifecycle.i;
import kotlin.jvm.internal.m;

/* compiled from: CompositeGeneratedAdaptersObserver.kt */
public final class CompositeGeneratedAdaptersObserver implements m {

    /* renamed from: a  reason: collision with root package name */
    private final f[] f3821a;

    public CompositeGeneratedAdaptersObserver(f[] fVarArr) {
        m.e(fVarArr, "generatedAdapters");
        this.f3821a = fVarArr;
    }

    public void onStateChanged(p pVar, i.a aVar) {
        m.e(pVar, "source");
        m.e(aVar, "event");
        v vVar = new v();
        for (f a10 : this.f3821a) {
            a10.a(pVar, aVar, false, vVar);
        }
        for (f a11 : this.f3821a) {
            a11.a(pVar, aVar, true, vVar);
        }
    }
}
