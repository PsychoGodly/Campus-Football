package cb;

import com.unity3d.scar.adapter.common.a;

/* compiled from: SignalCallbackListener */
public class d<T> implements a<T> {

    /* renamed from: a  reason: collision with root package name */
    private a f31950a;

    /* renamed from: b  reason: collision with root package name */
    private g<T> f31951b;

    /* renamed from: c  reason: collision with root package name */
    private f f31952c;

    public d(a aVar, f fVar) {
        this(aVar, (g) null, fVar);
    }

    public void a(String str) {
        this.f31952c.d(str);
        this.f31950a.b();
    }

    public void b(String str, String str2, T t10) {
        this.f31952c.a(str, str2);
        g<T> gVar = this.f31951b;
        if (gVar != null) {
            gVar.b(str, t10);
        }
        this.f31950a.b();
    }

    public d(a aVar, g<T> gVar, f fVar) {
        this.f31950a = aVar;
        this.f31951b = gVar;
        this.f31952c = fVar;
    }
}
