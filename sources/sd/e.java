package sd;

import ke.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: KotlinVersion.kt */
public final class e implements Comparable<e> {

    /* renamed from: f  reason: collision with root package name */
    public static final a f38114f = new a((h) null);

    /* renamed from: g  reason: collision with root package name */
    public static final e f38115g = f.a();

    /* renamed from: a  reason: collision with root package name */
    private final int f38116a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38117b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38118c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38119d;

    /* compiled from: KotlinVersion.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public e(int i10, int i11, int i12) {
        this.f38116a = i10;
        this.f38117b = i11;
        this.f38118c = i12;
        this.f38119d = c(i10, i11, i12);
    }

    private final int c(int i10, int i11, int i12) {
        boolean z10 = false;
        if (new c(0, 255).m(i10) && new c(0, 255).m(i11) && new c(0, 255).m(i12)) {
            z10 = true;
        }
        if (z10) {
            return (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i10 + '.' + i11 + '.' + i12).toString());
    }

    /* renamed from: a */
    public int compareTo(e eVar) {
        m.e(eVar, "other");
        return this.f38119d - eVar.f38119d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        if (eVar != null && this.f38119d == eVar.f38119d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f38119d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f38116a);
        sb2.append('.');
        sb2.append(this.f38117b);
        sb2.append('.');
        sb2.append(this.f38118c);
        return sb2.toString();
    }
}
