package va;

import lc.j;
import lc.k;
import xa.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f38913a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f38914b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f38915c;

    public /* synthetic */ x(j jVar, k.d dVar, i iVar) {
        this.f38913a = jVar;
        this.f38914b = dVar;
        this.f38915c = iVar;
    }

    public final void run() {
        this.f38915c.v(new d(this.f38913a, this.f38914b));
    }
}
