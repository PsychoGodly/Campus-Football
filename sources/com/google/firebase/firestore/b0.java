package com.google.firebase.firestore;

import android.content.Context;
import b8.a;
import com.google.firebase.firestore.FirebaseFirestore;
import d7.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import x7.i0;
import y6.f;
import y6.g;
import y6.n;

/* compiled from: FirestoreMultiDbComponent */
class b0 implements g, FirebaseFirestore.a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, FirebaseFirestore> f26433a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final f f26434b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f26435c;

    /* renamed from: d  reason: collision with root package name */
    private final a<b> f26436d;

    /* renamed from: e  reason: collision with root package name */
    private final a<c7.b> f26437e;

    /* renamed from: f  reason: collision with root package name */
    private final i0 f26438f;

    b0(Context context, f fVar, a<b> aVar, a<c7.b> aVar2, i0 i0Var) {
        this.f26435c = context;
        this.f26434b = fVar;
        this.f26436d = aVar;
        this.f26437e = aVar2;
        this.f26438f = i0Var;
        fVar.h(this);
    }

    public synchronized void a(String str, n nVar) {
        Iterator it = new ArrayList(this.f26433a.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((FirebaseFirestore) entry.getValue()).M();
            y7.b.d(!this.f26433a.containsKey(entry.getKey()), "terminate() should have removed its entry from `instances` for key: %s", entry.getKey());
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized FirebaseFirestore b(String str) {
        FirebaseFirestore firebaseFirestore;
        firebaseFirestore = this.f26433a.get(str);
        if (firebaseFirestore == null) {
            firebaseFirestore = FirebaseFirestore.G(this.f26435c, this.f26434b, this.f26436d, this.f26437e, str, this, this.f26438f);
            this.f26433a.put(str, firebaseFirestore);
        }
        return firebaseFirestore;
    }

    public synchronized void remove(String str) {
        this.f26433a.remove(str);
    }
}
