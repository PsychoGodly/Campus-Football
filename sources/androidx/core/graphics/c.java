package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: Insets */
public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f2897e = new c(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f2898a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2899b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2900c;

    /* renamed from: d  reason: collision with root package name */
    public final int f2901d;

    /* compiled from: Insets */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private c(int i10, int i11, int i12, int i13) {
        this.f2898a = i10;
        this.f2899b = i11;
        this.f2900c = i12;
        this.f2901d = i13;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.f2898a, cVar2.f2898a), Math.max(cVar.f2899b, cVar2.f2899b), Math.max(cVar.f2900c, cVar2.f2900c), Math.max(cVar.f2901d, cVar2.f2901d));
    }

    public static c b(int i10, int i11, int i12, int i13) {
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return f2897e;
        }
        return new c(i10, i11, i12, i13);
    }

    public static c c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static c d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f2898a, this.f2899b, this.f2900c, this.f2901d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2901d == cVar.f2901d && this.f2898a == cVar.f2898a && this.f2900c == cVar.f2900c && this.f2899b == cVar.f2899b;
    }

    public int hashCode() {
        return (((((this.f2898a * 31) + this.f2899b) * 31) + this.f2900c) * 31) + this.f2901d;
    }

    public String toString() {
        return "Insets{left=" + this.f2898a + ", top=" + this.f2899b + ", right=" + this.f2900c + ", bottom=" + this.f2901d + '}';
    }
}
