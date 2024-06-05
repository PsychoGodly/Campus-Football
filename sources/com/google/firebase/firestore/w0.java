package com.google.firebase.firestore;

import com.google.firebase.firestore.n;
import java.util.Map;
import u7.i;
import u7.l;
import y7.b;
import y7.x;

/* compiled from: QueryDocumentSnapshot */
public class w0 extends n {
    private w0(FirebaseFirestore firebaseFirestore, l lVar, i iVar, boolean z10, boolean z11) {
        super(firebaseFirestore, lVar, iVar, z10, z11);
    }

    static w0 h(FirebaseFirestore firebaseFirestore, i iVar, boolean z10, boolean z11) {
        return new w0(firebaseFirestore, iVar.getKey(), iVar, z10, z11);
    }

    public Map<String, Object> d() {
        Map<String, Object> d10 = super.d();
        b.d(d10 != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return d10;
    }

    public Map<String, Object> e(n.a aVar) {
        x.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        Map<String, Object> e10 = super.e(aVar);
        b.d(e10 != null, "Data in a QueryDocumentSnapshot should be non-null", new Object[0]);
        return e10;
    }
}
