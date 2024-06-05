package p1;

import android.content.Context;
import t1.a;

/* compiled from: Trackers */
public class g {

    /* renamed from: e  reason: collision with root package name */
    private static g f21123e;

    /* renamed from: a  reason: collision with root package name */
    private a f21124a;

    /* renamed from: b  reason: collision with root package name */
    private b f21125b;

    /* renamed from: c  reason: collision with root package name */
    private e f21126c;

    /* renamed from: d  reason: collision with root package name */
    private f f21127d;

    private g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f21124a = new a(applicationContext, aVar);
        this.f21125b = new b(applicationContext, aVar);
        this.f21126c = new e(applicationContext, aVar);
        this.f21127d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f21123e == null) {
                f21123e = new g(context, aVar);
            }
            gVar = f21123e;
        }
        return gVar;
    }

    public a a() {
        return this.f21124a;
    }

    public b b() {
        return this.f21125b;
    }

    public e d() {
        return this.f21126c;
    }

    public f e() {
        return this.f21127d;
    }
}
