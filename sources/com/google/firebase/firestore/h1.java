package com.google.firebase.firestore;

import com.google.firebase.firestore.n;
import com.google.protobuf.t1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p8.b;
import p8.d0;
import u7.f;
import u7.l;
import u7.z;
import y6.q;
import y7.v;

/* compiled from: UserDataWriter */
public class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseFirestore f26478a;

    /* renamed from: b  reason: collision with root package name */
    private final n.a f26479b;

    /* compiled from: UserDataWriter */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26480a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.firebase.firestore.n$a[] r0 = com.google.firebase.firestore.n.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26480a = r0
                com.google.firebase.firestore.n$a r1 = com.google.firebase.firestore.n.a.PREVIOUS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26480a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.n$a r1 = com.google.firebase.firestore.n.a.ESTIMATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.firestore.h1.a.<clinit>():void");
        }
    }

    public h1(FirebaseFirestore firebaseFirestore, n.a aVar) {
        this.f26478a = firebaseFirestore;
        this.f26479b = aVar;
    }

    private List<Object> a(b bVar) {
        ArrayList arrayList = new ArrayList(bVar.n0());
        for (d0 f10 : bVar.g()) {
            arrayList.add(f(f10));
        }
        return arrayList;
    }

    private Object c(d0 d0Var) {
        f d10 = f.d(d0Var.y0());
        l f10 = l.f(d0Var.y0());
        f t10 = this.f26478a.t();
        if (!d10.equals(t10)) {
            v.e("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", f10.l(), d10.f(), d10.e(), t10.f(), t10.e());
        }
        return new m(f10, this.f26478a);
    }

    private Object d(d0 d0Var) {
        int i10 = a.f26480a[this.f26479b.ordinal()];
        if (i10 == 1) {
            d0 b10 = u7.v.b(d0Var);
            if (b10 == null) {
                return null;
            }
            return f(b10);
        } else if (i10 != 2) {
            return null;
        } else {
            return e(u7.v.a(d0Var));
        }
    }

    private Object e(t1 t1Var) {
        return new q(t1Var.j0(), t1Var.i0());
    }

    /* access modifiers changed from: package-private */
    public Map<String, Object> b(Map<String, d0> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : map.entrySet()) {
            hashMap.put((String) next.getKey(), f((d0) next.getValue()));
        }
        return hashMap;
    }

    public Object f(d0 d0Var) {
        switch (z.G(d0Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(d0Var.r0());
            case 2:
                if (d0Var.B0().equals(d0.c.INTEGER_VALUE)) {
                    return Long.valueOf(d0Var.w0());
                }
                return Double.valueOf(d0Var.u0());
            case 3:
                return e(d0Var.A0());
            case 4:
                return d(d0Var);
            case 5:
                return d0Var.z0();
            case 6:
                return f.c(d0Var.s0());
            case 7:
                return c(d0Var);
            case 8:
                return new d0(d0Var.v0().i0(), d0Var.v0().j0());
            case 9:
                return a(d0Var.q0());
            case 10:
                return b(d0Var.x0().i0());
            default:
                throw y7.b.a("Unknown value type: " + d0Var.B0(), new Object[0]);
        }
    }
}
