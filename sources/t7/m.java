package t7;

import g7.c;
import java.util.Map;
import u7.i;
import u7.j;
import u7.l;

/* compiled from: LocalDocumentsResult */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int f30482a;

    /* renamed from: b  reason: collision with root package name */
    private final c<l, i> f30483b;

    m(int i10, c<l, i> cVar) {
        this.f30482a = i10;
        this.f30483b = cVar;
    }

    public static m a(int i10, Map<l, d1> map) {
        c<l, i> a10 = j.a();
        for (Map.Entry next : map.entrySet()) {
            a10 = a10.h((l) next.getKey(), ((d1) next.getValue()).a());
        }
        return new m(i10, a10);
    }

    public int b() {
        return this.f30482a;
    }

    public c<l, i> c() {
        return this.f30483b;
    }
}
