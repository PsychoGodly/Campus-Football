package com.google.firebase.firestore;

import java.util.Map;
import u7.i;
import u7.l;
import y7.x;

/* compiled from: DocumentSnapshot */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseFirestore f26505a;

    /* renamed from: b  reason: collision with root package name */
    private final l f26506b;

    /* renamed from: c  reason: collision with root package name */
    private final i f26507c;

    /* renamed from: d  reason: collision with root package name */
    private final a1 f26508d;

    /* compiled from: DocumentSnapshot */
    public enum a {
        NONE,
        ESTIMATE,
        PREVIOUS;
        

        /* renamed from: d  reason: collision with root package name */
        static final a f26512d = null;

        static {
            a aVar;
            f26512d = aVar;
        }
    }

    n(FirebaseFirestore firebaseFirestore, l lVar, i iVar, boolean z10, boolean z11) {
        this.f26505a = (FirebaseFirestore) x.b(firebaseFirestore);
        this.f26506b = (l) x.b(lVar);
        this.f26507c = iVar;
        this.f26508d = new a1(z11, z10);
    }

    static n b(FirebaseFirestore firebaseFirestore, i iVar, boolean z10, boolean z11) {
        return new n(firebaseFirestore, iVar.getKey(), iVar, z10, z11);
    }

    static n c(FirebaseFirestore firebaseFirestore, l lVar, boolean z10) {
        return new n(firebaseFirestore, lVar, (i) null, z10, false);
    }

    public boolean a() {
        return this.f26507c != null;
    }

    public Map<String, Object> d() {
        return e(a.f26512d);
    }

    public Map<String, Object> e(a aVar) {
        x.c(aVar, "Provided serverTimestampBehavior value must not be null.");
        h1 h1Var = new h1(this.f26505a, aVar);
        i iVar = this.f26507c;
        if (iVar == null) {
            return null;
        }
        return h1Var.b(iVar.getData().k());
    }

    public boolean equals(Object obj) {
        i iVar;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!this.f26505a.equals(nVar.f26505a) || !this.f26506b.equals(nVar.f26506b) || ((iVar = this.f26507c) != null ? !iVar.equals(nVar.f26507c) : nVar.f26507c != null) || !this.f26508d.equals(nVar.f26508d)) {
            return false;
        }
        return true;
    }

    public a1 f() {
        return this.f26508d;
    }

    public m g() {
        return new m(this.f26506b, this.f26505a);
    }

    public int hashCode() {
        int hashCode = ((this.f26505a.hashCode() * 31) + this.f26506b.hashCode()) * 31;
        i iVar = this.f26507c;
        int i10 = 0;
        int hashCode2 = (hashCode + (iVar != null ? iVar.getKey().hashCode() : 0)) * 31;
        i iVar2 = this.f26507c;
        if (iVar2 != null) {
            i10 = iVar2.getData().hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f26508d.hashCode();
    }

    public String toString() {
        return "DocumentSnapshot{key=" + this.f26506b + ", metadata=" + this.f26508d + ", doc=" + this.f26507c + '}';
    }
}
