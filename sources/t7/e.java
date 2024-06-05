package t7;

import java.util.Comparator;
import u7.l;
import y7.g0;

/* compiled from: DocumentReference */
class e {

    /* renamed from: c  reason: collision with root package name */
    static final Comparator<e> f30387c = d.f38402a;

    /* renamed from: d  reason: collision with root package name */
    static final Comparator<e> f30388d = c.f38388a;

    /* renamed from: a  reason: collision with root package name */
    private final l f30389a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30390b;

    public e(l lVar, int i10) {
        this.f30389a = lVar;
        this.f30390b = i10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int e(e eVar, e eVar2) {
        int c10 = eVar.f30389a.compareTo(eVar2.f30389a);
        if (c10 != 0) {
            return c10;
        }
        return g0.l(eVar.f30390b, eVar2.f30390b);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int f(e eVar, e eVar2) {
        int l10 = g0.l(eVar.f30390b, eVar2.f30390b);
        if (l10 != 0) {
            return l10;
        }
        return eVar.f30389a.compareTo(eVar2.f30389a);
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f30390b;
    }

    /* access modifiers changed from: package-private */
    public l d() {
        return this.f30389a;
    }
}
