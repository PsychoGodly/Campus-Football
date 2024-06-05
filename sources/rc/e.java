package rc;

import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.h0;
import java.util.Objects;
import lc.d;
import sc.a;

/* compiled from: LoadBundleStreamHandler */
public class e implements d.C0413d {

    /* renamed from: a  reason: collision with root package name */
    private d.b f37917a;

    /* renamed from: b  reason: collision with root package name */
    private final FirebaseFirestore f37918b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f37919c;

    public e(FirebaseFirestore firebaseFirestore, byte[] bArr) {
        this.f37918b = firebaseFirestore;
        this.f37919c = bArr;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(d.b bVar, Exception exc) {
        bVar.error("firebase_firestore", exc.getMessage(), a.a(exc));
        g((Object) null);
    }

    public void g(Object obj) {
        this.f37917a.a();
    }

    public void h(Object obj, d.b bVar) {
        this.f37917a = bVar;
        h0 E = this.f37918b.E(this.f37919c);
        Objects.requireNonNull(bVar);
        E.a(new d(bVar));
        E.addOnFailureListener(new c(this, bVar));
    }
}
