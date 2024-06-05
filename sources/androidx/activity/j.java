package androidx.activity;

import fe.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import sd.w;

/* compiled from: FullyDrawnReporter.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f708a;

    /* renamed from: b  reason: collision with root package name */
    private final a<w> f709b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f710c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f711d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f712e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f713f;

    /* renamed from: g  reason: collision with root package name */
    private final List<a<w>> f714g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f715h = new i(this);

    public j(Executor executor, a<w> aVar) {
        m.e(executor, "executor");
        m.e(aVar, "reportFullyDrawn");
        this.f708a = executor;
        this.f709b = aVar;
    }

    /* access modifiers changed from: private */
    public static final void d(j jVar) {
        m.e(jVar, "this$0");
        synchronized (jVar.f710c) {
            jVar.f712e = false;
            if (jVar.f711d == 0 && !jVar.f713f) {
                jVar.f709b.invoke();
                jVar.b();
            }
            w wVar = w.f38141a;
        }
    }

    public final void b() {
        synchronized (this.f710c) {
            this.f713f = true;
            for (a invoke : this.f714g) {
                invoke.invoke();
            }
            this.f714g.clear();
            w wVar = w.f38141a;
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f710c) {
            z10 = this.f713f;
        }
        return z10;
    }
}
