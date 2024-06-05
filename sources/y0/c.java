package y0;

import c1.d;
import c1.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery */
public class c implements e, d {

    /* renamed from: j  reason: collision with root package name */
    static final TreeMap<Integer, c> f23713j = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    private volatile String f23714a;

    /* renamed from: b  reason: collision with root package name */
    final long[] f23715b;

    /* renamed from: c  reason: collision with root package name */
    final double[] f23716c;

    /* renamed from: d  reason: collision with root package name */
    final String[] f23717d;

    /* renamed from: f  reason: collision with root package name */
    final byte[][] f23718f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f23719g;

    /* renamed from: h  reason: collision with root package name */
    final int f23720h;

    /* renamed from: i  reason: collision with root package name */
    int f23721i;

    private c(int i10) {
        this.f23720h = i10;
        int i11 = i10 + 1;
        this.f23719g = new int[i11];
        this.f23715b = new long[i11];
        this.f23716c = new double[i11];
        this.f23717d = new String[i11];
        this.f23718f = new byte[i11][];
    }

    public static c j(String str, int i10) {
        TreeMap<Integer, c> treeMap = f23713j;
        synchronized (treeMap) {
            Map.Entry<Integer, c> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                c value = ceilingEntry.getValue();
                value.n(str, i10);
                return value;
            }
            c cVar = new c(i10);
            cVar.n(str, i10);
            return cVar;
        }
    }

    private static void q() {
        TreeMap<Integer, c> treeMap = f23713j;
        if (treeMap.size() > 15) {
            int size = treeMap.size() - 10;
            Iterator<Integer> it = treeMap.descendingKeySet().iterator();
            while (true) {
                int i10 = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i10;
                } else {
                    return;
                }
            }
        }
    }

    public void C(int i10, double d10) {
        this.f23719g[i10] = 3;
        this.f23716c[i10] = d10;
    }

    public void N(int i10, long j10) {
        this.f23719g[i10] = 2;
        this.f23715b[i10] = j10;
    }

    public void S(int i10, byte[] bArr) {
        this.f23719g[i10] = 5;
        this.f23718f[i10] = bArr;
    }

    public void close() {
    }

    public void h(d dVar) {
        for (int i10 = 1; i10 <= this.f23721i; i10++) {
            int i11 = this.f23719g[i10];
            if (i11 == 1) {
                dVar.j0(i10);
            } else if (i11 == 2) {
                dVar.N(i10, this.f23715b[i10]);
            } else if (i11 == 3) {
                dVar.C(i10, this.f23716c[i10]);
            } else if (i11 == 4) {
                dVar.t(i10, this.f23717d[i10]);
            } else if (i11 == 5) {
                dVar.S(i10, this.f23718f[i10]);
            }
        }
    }

    public String i() {
        return this.f23714a;
    }

    public void j0(int i10) {
        this.f23719g[i10] = 1;
    }

    /* access modifiers changed from: package-private */
    public void n(String str, int i10) {
        this.f23714a = str;
        this.f23721i = i10;
    }

    public void t(int i10, String str) {
        this.f23719g[i10] = 4;
        this.f23717d[i10] = str;
    }

    public void u() {
        TreeMap<Integer, c> treeMap = f23713j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f23720h), this);
            q();
        }
    }
}
