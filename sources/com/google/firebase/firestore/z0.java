package com.google.firebase.firestore;

import java.util.HashSet;
import java.util.List;
import v7.d;
import y7.x;

/* compiled from: SetOptions */
public final class z0 {

    /* renamed from: c  reason: collision with root package name */
    static final z0 f26588c = new z0(false, (d) null);

    /* renamed from: d  reason: collision with root package name */
    private static final z0 f26589d = new z0(true, (d) null);

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26590a;

    /* renamed from: b  reason: collision with root package name */
    private final d f26591b;

    private z0(boolean z10, d dVar) {
        x.a(dVar == null || z10, "Cannot specify a fieldMask for non-merge sets()", new Object[0]);
        this.f26590a = z10;
        this.f26591b = dVar;
    }

    public static z0 c() {
        return f26589d;
    }

    public static z0 d(List<q> list) {
        HashSet hashSet = new HashSet();
        for (q c10 : list) {
            hashSet.add(c10.c());
        }
        return new z0(true, d.b(hashSet));
    }

    public d a() {
        return this.f26591b;
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return this.f26590a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z0.class != obj.getClass()) {
            return false;
        }
        z0 z0Var = (z0) obj;
        if (this.f26590a != z0Var.f26590a) {
            return false;
        }
        d dVar = this.f26591b;
        d dVar2 = z0Var.f26591b;
        if (dVar != null) {
            return dVar.equals(dVar2);
        }
        if (dVar2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = (this.f26590a ? 1 : 0) * true;
        d dVar = this.f26591b;
        return i10 + (dVar != null ? dVar.hashCode() : 0);
    }
}
