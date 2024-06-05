package n2;

import android.util.Pair;
import java.io.IOException;
import n2.x2;
import p3.q;
import p3.t;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class w2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x2.a f36469a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f36470b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f36471c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f36472d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IOException f36473f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f36474g;

    public /* synthetic */ w2(x2.a aVar, Pair pair, q qVar, t tVar, IOException iOException, boolean z10) {
        this.f36469a = aVar;
        this.f36470b = pair;
        this.f36471c = qVar;
        this.f36472d = tVar;
        this.f36473f = iOException;
        this.f36474g = z10;
    }

    public final void run() {
        this.f36469a.W(this.f36470b, this.f36471c, this.f36472d, this.f36473f, this.f36474g);
    }
}
