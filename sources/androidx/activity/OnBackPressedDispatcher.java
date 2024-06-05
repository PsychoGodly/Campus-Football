package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.internal.n;
import sd.w;
import td.h;

/* compiled from: OnBackPressedDispatcher.kt */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f683a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final h<l> f684b = new h<>();

    /* renamed from: c  reason: collision with root package name */
    private fe.a<w> f685c;

    /* renamed from: d  reason: collision with root package name */
    private OnBackInvokedCallback f686d;

    /* renamed from: e  reason: collision with root package name */
    private OnBackInvokedDispatcher f687e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f688f;

    /* compiled from: OnBackPressedDispatcher.kt */
    private final class LifecycleOnBackPressedCancellable implements m, a {

        /* renamed from: a  reason: collision with root package name */
        private final i f689a;

        /* renamed from: b  reason: collision with root package name */
        private final l f690b;

        /* renamed from: c  reason: collision with root package name */
        private a f691c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f692d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, i iVar, l lVar) {
            kotlin.jvm.internal.m.e(iVar, "lifecycle");
            kotlin.jvm.internal.m.e(lVar, "onBackPressedCallback");
            this.f692d = onBackPressedDispatcher;
            this.f689a = iVar;
            this.f690b = lVar;
            iVar.a(this);
        }

        public void cancel() {
            this.f689a.d(this);
            this.f690b.e(this);
            a aVar = this.f691c;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f691c = null;
        }

        public void onStateChanged(p pVar, i.a aVar) {
            kotlin.jvm.internal.m.e(pVar, "source");
            kotlin.jvm.internal.m.e(aVar, "event");
            if (aVar == i.a.ON_START) {
                this.f691c = this.f692d.c(this.f690b);
            } else if (aVar == i.a.ON_STOP) {
                a aVar2 = this.f691c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == i.a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    static final class a extends n implements fe.a<w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f693a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f693a = onBackPressedDispatcher;
        }

        public final void invoke() {
            this.f693a.g();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    static final class b extends n implements fe.a<w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f694a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(OnBackPressedDispatcher onBackPressedDispatcher) {
            super(0);
            this.f694a = onBackPressedDispatcher;
        }

        public final void invoke() {
            this.f694a.e();
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public static final c f695a = new c();

        private c() {
        }

        /* access modifiers changed from: private */
        public static final void c(fe.a aVar) {
            kotlin.jvm.internal.m.e(aVar, "$onBackInvoked");
            aVar.invoke();
        }

        public final OnBackInvokedCallback b(fe.a<w> aVar) {
            kotlin.jvm.internal.m.e(aVar, "onBackInvoked");
            return new m(aVar);
        }

        public final void d(Object obj, int i10, Object obj2) {
            kotlin.jvm.internal.m.e(obj, "dispatcher");
            kotlin.jvm.internal.m.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            kotlin.jvm.internal.m.e(obj, "dispatcher");
            kotlin.jvm.internal.m.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    private final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        private final l f696a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f697b;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, l lVar) {
            kotlin.jvm.internal.m.e(lVar, "onBackPressedCallback");
            this.f697b = onBackPressedDispatcher;
            this.f696a = lVar;
        }

        public void cancel() {
            this.f697b.f684b.remove(this.f696a);
            this.f696a.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f696a.g((fe.a<w>) null);
                this.f697b.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f683a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f685c = new a(this);
            this.f686d = c.f695a.b(new b(this));
        }
    }

    public final void b(p pVar, l lVar) {
        kotlin.jvm.internal.m.e(pVar, "owner");
        kotlin.jvm.internal.m.e(lVar, "onBackPressedCallback");
        i lifecycle = pVar.getLifecycle();
        if (lifecycle.b() != i.b.DESTROYED) {
            lVar.a(new LifecycleOnBackPressedCancellable(this, lifecycle, lVar));
            if (Build.VERSION.SDK_INT >= 33) {
                g();
                lVar.g(this.f685c);
            }
        }
    }

    public final a c(l lVar) {
        kotlin.jvm.internal.m.e(lVar, "onBackPressedCallback");
        this.f684b.add(lVar);
        d dVar = new d(this, lVar);
        lVar.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            lVar.g(this.f685c);
        }
        return dVar;
    }

    public final boolean d() {
        h<l> hVar = this.f684b;
        if ((hVar instanceof Collection) && hVar.isEmpty()) {
            return false;
        }
        for (l c10 : hVar) {
            if (c10.c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        l lVar;
        h<l> hVar = this.f684b;
        ListIterator<l> listIterator = hVar.listIterator(hVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                lVar = null;
                break;
            }
            lVar = listIterator.previous();
            if (lVar.c()) {
                break;
            }
        }
        l lVar2 = lVar;
        if (lVar2 != null) {
            lVar2.b();
            return;
        }
        Runnable runnable = this.f683a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        kotlin.jvm.internal.m.e(onBackInvokedDispatcher, "invoker");
        this.f687e = onBackInvokedDispatcher;
        g();
    }

    public final void g() {
        boolean d10 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f687e;
        OnBackInvokedCallback onBackInvokedCallback = this.f686d;
        if (onBackInvokedDispatcher != null && onBackInvokedCallback != null) {
            if (d10 && !this.f688f) {
                c.f695a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
                this.f688f = true;
            } else if (!d10 && this.f688f) {
                c.f695a.e(onBackInvokedDispatcher, onBackInvokedCallback);
                this.f688f = false;
            }
        }
    }
}
