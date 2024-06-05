package mb;

import android.content.Context;
import bb.b;
import bb.c;
import com.unity3d.scar.adapter.common.d;
import n4.g;

/* compiled from: ScarAdBase */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f36305a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f36306b;

    /* renamed from: c  reason: collision with root package name */
    protected c f36307c;

    /* renamed from: d  reason: collision with root package name */
    protected lb.a f36308d;

    /* renamed from: e  reason: collision with root package name */
    protected b f36309e;

    /* renamed from: f  reason: collision with root package name */
    protected d f36310f;

    public a(Context context, c cVar, lb.a aVar, d dVar) {
        this.f36306b = context;
        this.f36307c = cVar;
        this.f36308d = aVar;
        this.f36310f = dVar;
    }

    public void b(b bVar) {
        g b10 = this.f36308d.b(this.f36307c.a());
        if (bVar != null) {
            this.f36309e.a(bVar);
        }
        c(b10, bVar);
    }

    /* access modifiers changed from: protected */
    public abstract void c(g gVar, b bVar);

    public void d(T t10) {
        this.f36305a = t10;
    }
}
