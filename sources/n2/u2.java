package n2;

import android.util.Pair;
import n2.x2;
import p3.q;
import p3.t;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x2.a f36454a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f36455b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f36456c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f36457d;

    public /* synthetic */ u2(x2.a aVar, Pair pair, q qVar, t tVar) {
        this.f36454a = aVar;
        this.f36455b = pair;
        this.f36456c = qVar;
        this.f36457d = tVar;
    }

    public final void run() {
        this.f36454a.R(this.f36455b, this.f36456c, this.f36457d);
    }
}
