package rc;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.f0;
import com.google.firebase.firestore.m;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.o0;
import com.google.firebase.firestore.z;
import lc.d;
import sc.a;

/* compiled from: DocumentSnapshotsStreamHandler */
public class b implements d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    f0 f37909a;

    /* renamed from: b  reason: collision with root package name */
    FirebaseFirestore f37910b;

    /* renamed from: c  reason: collision with root package name */
    m f37911c;

    /* renamed from: d  reason: collision with root package name */
    o0 f37912d;

    /* renamed from: f  reason: collision with root package name */
    n.a f37913f;

    public b(FirebaseFirestore firebaseFirestore, m mVar, Boolean bool, n.a aVar) {
        this.f37910b = firebaseFirestore;
        this.f37911c = mVar;
        this.f37912d = bool.booleanValue() ? o0.INCLUDE : o0.EXCLUDE;
        this.f37913f = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(d.b bVar, n nVar, z zVar) {
        if (zVar != null) {
            bVar.error("firebase_firestore", zVar.getMessage(), a.a(zVar));
            bVar.a();
            g((Object) null);
            return;
        }
        bVar.success(sc.b.j(nVar, this.f37913f).e());
    }

    public void g(Object obj) {
        f0 f0Var = this.f37909a;
        if (f0Var != null) {
            f0Var.remove();
            this.f37909a = null;
        }
    }

    public void h(Object obj, d.b bVar) {
        this.f37909a = this.f37911c.d(this.f37912d, new a(this, bVar));
    }
}
