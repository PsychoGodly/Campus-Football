package com.google.firebase.firestore;

import r7.a1;
import u7.u;

/* compiled from: CollectionReference */
public class g extends v0 {
    g(u uVar, FirebaseFirestore firebaseFirestore) {
        super(a1.b(uVar), firebaseFirestore);
        if (uVar.k() % 2 != 1) {
            throw new IllegalArgumentException("Invalid collection reference. Collection references must have an odd number of segments, but " + uVar.d() + " has " + uVar.k());
        }
    }
}
