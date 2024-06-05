package t7;

import java.util.Map;
import y7.t;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g3 f38393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ byte[] f38394b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f38395c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f38396d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f38397f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Map f38398g;

    public /* synthetic */ c3(g3 g3Var, byte[] bArr, int i10, int i11, t tVar, Map map) {
        this.f38393a = g3Var;
        this.f38394b = bArr;
        this.f38395c = i10;
        this.f38396d = i11;
        this.f38397f = tVar;
        this.f38398g = map;
    }

    public final void run() {
        this.f38393a.q(this.f38394b, this.f38395c, this.f38396d, this.f38397f, this.f38398g);
    }
}
