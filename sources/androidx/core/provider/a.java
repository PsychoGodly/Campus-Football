package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;

/* compiled from: CallbackWithHandler */
class a {

    /* renamed from: a  reason: collision with root package name */
    private final g.c f2987a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f2988b;

    /* renamed from: androidx.core.provider.a$a  reason: collision with other inner class name */
    /* compiled from: CallbackWithHandler */
    class C0038a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f2989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f2990b;

        C0038a(g.c cVar, Typeface typeface) {
            this.f2989a = cVar;
            this.f2990b = typeface;
        }

        public void run() {
            this.f2989a.b(this.f2990b);
        }
    }

    /* compiled from: CallbackWithHandler */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g.c f2992a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f2993b;

        b(g.c cVar, int i10) {
            this.f2992a = cVar;
            this.f2993b = i10;
        }

        public void run() {
            this.f2992a.a(this.f2993b);
        }
    }

    a(g.c cVar, Handler handler) {
        this.f2987a = cVar;
        this.f2988b = handler;
    }

    private void a(int i10) {
        this.f2988b.post(new b(this.f2987a, i10));
    }

    private void c(Typeface typeface) {
        this.f2988b.post(new C0038a(this.f2987a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f3017a);
        } else {
            a(eVar.f3018b);
        }
    }
}
