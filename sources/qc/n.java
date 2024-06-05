package qc;

import com.google.firebase.firestore.c;
import java.util.List;
import qc.y;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f37529a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ y.c f37530b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f37531c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ y.v f37532d;

    public /* synthetic */ n(c cVar, y.c cVar2, List list, y.v vVar) {
        this.f37529a = cVar;
        this.f37530b = cVar2;
        this.f37531c = list;
        this.f37532d = vVar;
    }

    public final void run() {
        w.X(this.f37529a, this.f37530b, this.f37531c, this.f37532d);
    }
}
