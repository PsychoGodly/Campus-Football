package hd;

import lf.f;

/* compiled from: Header */
public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final f f32997d = f.h(":status");

    /* renamed from: e  reason: collision with root package name */
    public static final f f32998e = f.h(":method");

    /* renamed from: f  reason: collision with root package name */
    public static final f f32999f = f.h(":path");

    /* renamed from: g  reason: collision with root package name */
    public static final f f33000g = f.h(":scheme");

    /* renamed from: h  reason: collision with root package name */
    public static final f f33001h = f.h(":authority");

    /* renamed from: i  reason: collision with root package name */
    public static final f f33002i = f.h(":host");

    /* renamed from: j  reason: collision with root package name */
    public static final f f33003j = f.h(":version");

    /* renamed from: a  reason: collision with root package name */
    public final f f33004a;

    /* renamed from: b  reason: collision with root package name */
    public final f f33005b;

    /* renamed from: c  reason: collision with root package name */
    final int f33006c;

    public d(String str, String str2) {
        this(f.h(str), f.h(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f33004a.equals(dVar.f33004a) || !this.f33005b.equals(dVar.f33005b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f33004a.hashCode()) * 31) + this.f33005b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", new Object[]{this.f33004a.u(), this.f33005b.u()});
    }

    public d(f fVar, String str) {
        this(fVar, f.h(str));
    }

    public d(f fVar, f fVar2) {
        this.f33004a = fVar;
        this.f33005b = fVar2;
        this.f33006c = fVar.p() + 32 + fVar2.p();
    }
}
