package com.applovin.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class aj extends wl {

    /* renamed from: b  reason: collision with root package name */
    private long f6537b = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private long[] f6538c = new long[0];

    /* renamed from: d  reason: collision with root package name */
    private long[] f6539d = new long[0];

    public aj() {
        super(new g7());
    }

    private static Double d(yg ygVar) {
        return Double.valueOf(Double.longBitsToDouble(ygVar.s()));
    }

    private static HashMap e(yg ygVar) {
        int A = ygVar.A();
        HashMap hashMap = new HashMap(A);
        for (int i10 = 0; i10 < A; i10++) {
            String h10 = h(ygVar);
            Object a10 = a(ygVar, i(ygVar));
            if (a10 != null) {
                hashMap.put(h10, a10);
            }
        }
        return hashMap;
    }

    private static HashMap f(yg ygVar) {
        HashMap hashMap = new HashMap();
        while (true) {
            String h10 = h(ygVar);
            int i10 = i(ygVar);
            if (i10 == 9) {
                return hashMap;
            }
            Object a10 = a(ygVar, i10);
            if (a10 != null) {
                hashMap.put(h10, a10);
            }
        }
    }

    private static ArrayList g(yg ygVar) {
        int A = ygVar.A();
        ArrayList arrayList = new ArrayList(A);
        for (int i10 = 0; i10 < A; i10++) {
            Object a10 = a(ygVar, i(ygVar));
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return arrayList;
    }

    private static String h(yg ygVar) {
        int C = ygVar.C();
        int d10 = ygVar.d();
        ygVar.g(C);
        return new String(ygVar.c(), d10, C);
    }

    private static int i(yg ygVar) {
        return ygVar.w();
    }

    public long a() {
        return this.f6537b;
    }

    /* access modifiers changed from: protected */
    public boolean a(yg ygVar) {
        return true;
    }

    public long[] b() {
        return this.f6539d;
    }

    public long[] c() {
        return this.f6538c;
    }

    private static Object a(yg ygVar, int i10) {
        if (i10 == 8) {
            return e(ygVar);
        }
        if (i10 == 10) {
            return g(ygVar);
        }
        if (i10 == 11) {
            return c(ygVar);
        }
        if (i10 == 0) {
            return d(ygVar);
        }
        if (i10 == 1) {
            return b(ygVar);
        }
        if (i10 == 2) {
            return h(ygVar);
        }
        if (i10 != 3) {
            return null;
        }
        return f(ygVar);
    }

    private static Date c(yg ygVar) {
        Date date = new Date((long) d(ygVar).doubleValue());
        ygVar.g(2);
        return date;
    }

    /* access modifiers changed from: protected */
    public boolean b(yg ygVar, long j10) {
        if (i(ygVar) != 2 || !"onMetaData".equals(h(ygVar)) || i(ygVar) != 8) {
            return false;
        }
        HashMap e10 = e(ygVar);
        Object obj = e10.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f6537b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = e10.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f6538c = new long[size];
                this.f6539d = new long[size];
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f6538c = new long[0];
                        this.f6539d = new long[0];
                    } else {
                        this.f6538c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f6539d[i10] = ((Double) obj5).longValue();
                        i10++;
                    }
                }
                this.f6538c = new long[0];
                this.f6539d = new long[0];
            }
        }
        return false;
    }

    private static Boolean b(yg ygVar) {
        boolean z10 = true;
        if (ygVar.w() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
