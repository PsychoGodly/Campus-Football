package eb;

import android.content.Context;
import bb.b;
import bb.c;
import com.google.android.gms.ads.query.AdInfo;
import com.unity3d.scar.adapter.common.d;
import n4.g;

/* compiled from: ScarAdBase */
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f32486a;

    /* renamed from: b  reason: collision with root package name */
    protected Context f32487b;

    /* renamed from: c  reason: collision with root package name */
    protected c f32488c;

    /* renamed from: d  reason: collision with root package name */
    protected z4.a f32489d;

    /* renamed from: e  reason: collision with root package name */
    protected b f32490e;

    /* renamed from: f  reason: collision with root package name */
    protected d f32491f;

    public a(Context context, c cVar, z4.a aVar, d dVar) {
        this.f32487b = context;
        this.f32488c = cVar;
        this.f32489d = aVar;
        this.f32491f = dVar;
    }

    public void b(b bVar) {
        if (this.f32489d != null) {
            g c10 = new g.a().setAdInfo(new AdInfo(this.f32489d, this.f32488c.a())).c();
            if (bVar != null) {
                this.f32490e.a(bVar);
            }
            c(c10, bVar);
            return;
        }
        this.f32491f.handleError(com.unity3d.scar.adapter.common.b.g(this.f32488c));
    }

    /* access modifiers changed from: protected */
    public abstract void c(g gVar, b bVar);

    public void d(T t10) {
        this.f32486a = t10;
    }
}
