package rc;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.f0;
import lc.d;

/* compiled from: SnapshotsInSyncStreamHandler */
public class j implements d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    f0 f37927a;

    /* renamed from: b  reason: collision with root package name */
    FirebaseFirestore f37928b;

    public j(FirebaseFirestore firebaseFirestore) {
        this.f37928b = firebaseFirestore;
    }

    public void g(Object obj) {
        f0 f0Var = this.f37927a;
        if (f0Var != null) {
            f0Var.remove();
            this.f37927a = null;
        }
    }

    public void h(Object obj, d.b bVar) {
        this.f37927a = this.f37928b.g(new i(bVar));
    }
}
