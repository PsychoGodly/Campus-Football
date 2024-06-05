package com.google.android.play.integrity.internal;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
final class g extends h {

    /* renamed from: a  reason: collision with root package name */
    private final long f26079a;

    g(int i10, long j10) {
        this.f26079a = j10;
    }

    public final int a() {
        return 3;
    }

    public final long b() {
        return this.f26079a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            hVar.a();
            if (this.f26079a == hVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j10 = this.f26079a;
        return -724379968 ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        long j10 = this.f26079a;
        return "EventRecord{eventType=3, eventTimestamp=" + j10 + "}";
    }
}
