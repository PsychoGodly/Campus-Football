package com.google.firebase.firestore;

import com.google.protobuf.i;
import y7.g0;
import y7.x;

/* compiled from: Blob */
public class f implements Comparable<f> {

    /* renamed from: a  reason: collision with root package name */
    private final i f26455a;

    private f(i iVar) {
        this.f26455a = iVar;
    }

    public static f c(i iVar) {
        x.c(iVar, "Provided ByteString must not be null.");
        return new f(iVar);
    }

    public static f d(byte[] bArr) {
        x.c(bArr, "Provided bytes array must not be null.");
        return new f(i.o(bArr));
    }

    /* renamed from: a */
    public int compareTo(f fVar) {
        return g0.j(this.f26455a, fVar.f26455a);
    }

    public i e() {
        return this.f26455a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && this.f26455a.equals(((f) obj).f26455a);
    }

    public byte[] f() {
        return this.f26455a.J();
    }

    public int hashCode() {
        return this.f26455a.hashCode();
    }

    public String toString() {
        return "Blob { bytes=" + g0.A(this.f26455a) + " }";
    }
}
