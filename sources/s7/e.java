package s7;

import com.google.auto.value.AutoValue;
import u7.l;
import y7.g0;

@AutoValue
/* compiled from: IndexEntry */
public abstract class e implements Comparable<e> {
    public static e c(int i10, l lVar, byte[] bArr, byte[] bArr2) {
        return new a(i10, lVar, bArr, bArr2);
    }

    /* renamed from: a */
    public int compareTo(e eVar) {
        int compare = Integer.compare(g(), eVar.g());
        if (compare != 0) {
            return compare;
        }
        int c10 = f().compareTo(eVar.f());
        if (c10 != 0) {
            return c10;
        }
        int i10 = g0.i(d(), eVar.d());
        if (i10 != 0) {
            return i10;
        }
        return g0.i(e(), eVar.e());
    }

    public abstract byte[] d();

    public abstract byte[] e();

    public abstract l f();

    public abstract int g();
}
