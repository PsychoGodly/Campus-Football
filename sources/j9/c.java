package j9;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ExpandedRow */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f29088a;

    /* renamed from: b  reason: collision with root package name */
    private final int f29089b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f29090c;

    c(List<b> list, int i10, boolean z10) {
        this.f29088a = new ArrayList(list);
        this.f29089b = i10;
        this.f29090c = z10;
    }

    /* access modifiers changed from: package-private */
    public List<b> a() {
        return this.f29088a;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f29089b;
    }

    /* access modifiers changed from: package-private */
    public boolean c(List<b> list) {
        return this.f29088a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f29088a.equals(cVar.a()) || this.f29090c != cVar.f29090c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f29088a.hashCode() ^ Boolean.valueOf(this.f29090c).hashCode();
    }

    public String toString() {
        return "{ " + this.f29088a + " }";
    }
}
