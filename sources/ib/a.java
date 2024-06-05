package ib;

import android.content.Context;
import bb.b;
import bb.c;
import com.unity3d.scar.adapter.common.d;
import n4.g;

/* compiled from: ScarAdBase */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f33292a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f33293b;

    /* renamed from: c  reason: collision with root package name */
    protected c f33294c;

    /* renamed from: d  reason: collision with root package name */
    protected hb.a f33295d;

    /* renamed from: e  reason: collision with root package name */
    protected b f33296e;

    /* renamed from: f  reason: collision with root package name */
    protected d f33297f;

    public a(Context context, c cVar, hb.a aVar, d dVar) {
        this.f33293b = context;
        this.f33294c = cVar;
        this.f33295d = aVar;
        this.f33297f = dVar;
    }

    public void b(b bVar) {
        g b10 = this.f33295d.b(this.f33294c.a());
        if (bVar != null) {
            this.f33296e.a(bVar);
        }
        c(b10, bVar);
    }

    /* access modifiers changed from: protected */
    public abstract void c(g gVar, b bVar);

    public void d(T t10) {
        this.f33292a = t10;
    }
}
