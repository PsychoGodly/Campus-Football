package w2;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import k4.a0;
import s2.k;

/* compiled from: ScriptTagPayloadReader */
final class d extends e {

    /* renamed from: b  reason: collision with root package name */
    private long f23538b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private long[] f23539c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    private long[] f23540d = new long[0];

    public d() {
        super(new k());
    }

    private static Boolean g(a0 a0Var) {
        boolean z10 = true;
        if (a0Var.G() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private static Object h(a0 a0Var, int i10) {
        if (i10 == 0) {
            return j(a0Var);
        }
        if (i10 == 1) {
            return g(a0Var);
        }
        if (i10 == 2) {
            return n(a0Var);
        }
        if (i10 == 3) {
            return l(a0Var);
        }
        if (i10 == 8) {
            return k(a0Var);
        }
        if (i10 == 10) {
            return m(a0Var);
        }
        if (i10 != 11) {
            return null;
        }
        return i(a0Var);
    }

    private static Date i(a0 a0Var) {
        Date date = new Date((long) j(a0Var).doubleValue());
        a0Var.U(2);
        return date;
    }

    private static Double j(a0 a0Var) {
        return Double.valueOf(Double.longBitsToDouble(a0Var.z()));
    }

    private static HashMap<String, Object> k(a0 a0Var) {
        int K = a0Var.K();
        HashMap<String, Object> hashMap = new HashMap<>(K);
        for (int i10 = 0; i10 < K; i10++) {
            String n10 = n(a0Var);
            Object h10 = h(a0Var, o(a0Var));
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
        return hashMap;
    }

    private static HashMap<String, Object> l(a0 a0Var) {
        HashMap<String, Object> hashMap = new HashMap<>();
        while (true) {
            String n10 = n(a0Var);
            int o10 = o(a0Var);
            if (o10 == 9) {
                return hashMap;
            }
            Object h10 = h(a0Var, o10);
            if (h10 != null) {
                hashMap.put(n10, h10);
            }
        }
    }

    private static ArrayList<Object> m(a0 a0Var) {
        int K = a0Var.K();
        ArrayList<Object> arrayList = new ArrayList<>(K);
        for (int i10 = 0; i10 < K; i10++) {
            Object h10 = h(a0Var, o(a0Var));
            if (h10 != null) {
                arrayList.add(h10);
            }
        }
        return arrayList;
    }

    private static String n(a0 a0Var) {
        int M = a0Var.M();
        int f10 = a0Var.f();
        a0Var.U(M);
        return new String(a0Var.e(), f10, M);
    }

    private static int o(a0 a0Var) {
        return a0Var.G();
    }

    /* access modifiers changed from: protected */
    public boolean b(a0 a0Var) {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean c(a0 a0Var, long j10) {
        if (o(a0Var) != 2 || !"onMetaData".equals(n(a0Var)) || a0Var.a() == 0 || o(a0Var) != 8) {
            return false;
        }
        HashMap<String, Object> k10 = k(a0Var);
        Object obj = k10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f23538b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = k10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f23539c = new long[size];
                this.f23540d = new long[size];
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f23539c = new long[0];
                        this.f23540d = new long[0];
                    } else {
                        this.f23539c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f23540d[i10] = ((Double) obj5).longValue();
                        i10++;
                    }
                }
                this.f23539c = new long[0];
                this.f23540d = new long[0];
            }
        }
        return false;
    }

    public long d() {
        return this.f23538b;
    }

    public long[] e() {
        return this.f23540d;
    }

    public long[] f() {
        return this.f23539c;
    }
}
