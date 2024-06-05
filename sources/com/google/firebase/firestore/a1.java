package com.google.firebase.firestore;

/* compiled from: SnapshotMetadata */
public class a1 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f26429a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f26430b;

    a1(boolean z10, boolean z11) {
        this.f26429a = z10;
        this.f26430b = z11;
    }

    public boolean a() {
        return this.f26429a;
    }

    public boolean b() {
        return this.f26430b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        if (this.f26429a == a1Var.f26429a && this.f26430b == a1Var.f26430b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26429a ? 1 : 0) * true) + (this.f26430b ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f26429a + ", isFromCache=" + this.f26430b + '}';
    }
}
