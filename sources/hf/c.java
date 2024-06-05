package hf;

import bf.q;
import lf.f;

/* compiled from: Header */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final f f33078d = f.h(":");

    /* renamed from: e  reason: collision with root package name */
    public static final f f33079e = f.h(":status");

    /* renamed from: f  reason: collision with root package name */
    public static final f f33080f = f.h(":method");

    /* renamed from: g  reason: collision with root package name */
    public static final f f33081g = f.h(":path");

    /* renamed from: h  reason: collision with root package name */
    public static final f f33082h = f.h(":scheme");

    /* renamed from: i  reason: collision with root package name */
    public static final f f33083i = f.h(":authority");

    /* renamed from: a  reason: collision with root package name */
    public final f f33084a;

    /* renamed from: b  reason: collision with root package name */
    public final f f33085b;

    /* renamed from: c  reason: collision with root package name */
    final int f33086c;

    /* compiled from: Header */
    interface a {
        void a(q qVar);
    }

    public c(String str, String str2) {
        this(f.h(str), f.h(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f33084a.equals(cVar.f33084a) || !this.f33085b.equals(cVar.f33085b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.f33084a.hashCode()) * 31) + this.f33085b.hashCode();
    }

    public String toString() {
        return cf.c.r("%s: %s", this.f33084a.u(), this.f33085b.u());
    }

    public c(f fVar, String str) {
        this(fVar, f.h(str));
    }

    public c(f fVar, f fVar2) {
        this.f33084a = fVar;
        this.f33085b = fVar2;
        this.f33086c = fVar.p() + 32 + fVar2.p();
    }
}
