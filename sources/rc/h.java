package rc;

import com.google.firebase.firestore.f0;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.o0;
import com.google.firebase.firestore.v0;
import com.google.firebase.firestore.x0;
import com.google.firebase.firestore.z;
import java.util.ArrayList;
import lc.d;
import sc.a;
import sc.b;

/* compiled from: QuerySnapshotsStreamHandler */
public class h implements d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    f0 f37922a;

    /* renamed from: b  reason: collision with root package name */
    v0 f37923b;

    /* renamed from: c  reason: collision with root package name */
    o0 f37924c;

    /* renamed from: d  reason: collision with root package name */
    n.a f37925d;

    public h(v0 v0Var, Boolean bool, n.a aVar) {
        this.f37923b = v0Var;
        this.f37924c = bool.booleanValue() ? o0.INCLUDE : o0.EXCLUDE;
        this.f37925d = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(d.b bVar, x0 x0Var, z zVar) {
        if (zVar != null) {
            bVar.error("firebase_firestore", zVar.getMessage(), a.a(zVar));
            bVar.a();
            g((Object) null);
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(x0Var.g().size());
        ArrayList arrayList3 = new ArrayList(x0Var.e().size());
        for (n j10 : x0Var.g()) {
            arrayList2.add(b.j(j10, this.f37925d).e());
        }
        for (com.google.firebase.firestore.h g10 : x0Var.e()) {
            arrayList3.add(b.g(g10, this.f37925d).f());
        }
        arrayList.add(arrayList2);
        arrayList.add(arrayList3);
        arrayList.add(b.m(x0Var.h()).d());
        bVar.success(arrayList);
    }

    public void g(Object obj) {
        f0 f0Var = this.f37922a;
        if (f0Var != null) {
            f0Var.remove();
            this.f37922a = null;
        }
    }

    public void h(Object obj, d.b bVar) {
        this.f37922a = this.f37923b.d(this.f37924c, new g(this, bVar));
    }
}
