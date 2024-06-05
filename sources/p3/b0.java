package p3;

import java.io.IOException;
import p3.e0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e0.a f36848a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e0 f36849b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ q f36850c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ t f36851d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ IOException f36852f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ boolean f36853g;

    public /* synthetic */ b0(e0.a aVar, e0 e0Var, q qVar, t tVar, IOException iOException, boolean z10) {
        this.f36848a = aVar;
        this.f36849b = e0Var;
        this.f36850c = qVar;
        this.f36851d = tVar;
        this.f36852f = iOException;
        this.f36853g = z10;
    }

    public final void run() {
        this.f36848a.n(this.f36849b, this.f36850c, this.f36851d, this.f36852f, this.f36853g);
    }
}
