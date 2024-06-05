package va;

import lc.j;
import lc.k;
import xa.d;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f38910a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k.d f38911b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f38912c;

    public /* synthetic */ w(j jVar, k.d dVar, i iVar) {
        this.f38910a = jVar;
        this.f38911b = dVar;
        this.f38912c = iVar;
    }

    public final void run() {
        this.f38912c.R(new d(this.f38910a, this.f38911b));
    }
}
