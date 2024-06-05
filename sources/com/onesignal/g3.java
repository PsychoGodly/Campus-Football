package com.onesignal;

import com.onesignal.f3;
import com.onesignal.k3;
import com.onesignal.v0;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: OSTriggerController */
class g3 {

    /* renamed from: a  reason: collision with root package name */
    v0 f27827a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<String, Object> f27828b = new ConcurrentHashMap<>();

    /* compiled from: OSTriggerController */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27829a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.onesignal.f3$b[] r0 = com.onesignal.f3.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27829a = r0
                com.onesignal.f3$b r1 = com.onesignal.f3.b.EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.NOT_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.EXISTS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.CONTAINS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.NOT_EXISTS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.LESS_THAN     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.GREATER_THAN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.LESS_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f27829a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.onesignal.f3$b r1 = com.onesignal.f3.b.GREATER_THAN_OR_EQUAL_TO     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.g3.a.<clinit>():void");
        }
    }

    g3(v0.c cVar) {
        this.f27827a = new v0(cVar);
    }

    private boolean b(ArrayList<f3> arrayList) {
        Iterator<f3> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!d(it.next())) {
                return false;
            }
        }
        return true;
    }

    private boolean d(f3 f3Var) {
        f3.a aVar = f3Var.f27741b;
        if (aVar == f3.a.UNKNOWN) {
            return false;
        }
        if (aVar != f3.a.CUSTOM) {
            return this.f27827a.c(f3Var);
        }
        f3.b bVar = f3Var.f27743d;
        Object obj = this.f27828b.get(f3Var.f27742c);
        if (obj == null) {
            if (bVar == f3.b.NOT_EXISTS) {
                return true;
            }
            if (bVar != f3.b.NOT_EQUAL_TO || f3Var.f27744e == null) {
                return false;
            }
            return true;
        } else if (bVar == f3.b.EXISTS) {
            return true;
        } else {
            if (bVar == f3.b.NOT_EXISTS) {
                return false;
            }
            if (bVar != f3.b.CONTAINS) {
                if (obj instanceof String) {
                    Object obj2 = f3Var.f27744e;
                    if ((obj2 instanceof String) && l((String) obj2, (String) obj, bVar)) {
                        return true;
                    }
                }
                Object obj3 = f3Var.f27744e;
                if ((!(obj3 instanceof Number) || !(obj instanceof Number) || !j((Number) obj3, (Number) obj, bVar)) && !i(f3Var.f27744e, obj, bVar)) {
                    return false;
                }
                return true;
            } else if (!(obj instanceof Collection) || !((Collection) obj).contains(f3Var.f27744e)) {
                return false;
            } else {
                return true;
            }
        }
    }

    private boolean i(Object obj, Object obj2, f3.b bVar) {
        if (obj == null) {
            return false;
        }
        if (bVar.a()) {
            String obj3 = obj.toString();
            String obj4 = obj2.toString();
            if (obj2 instanceof Number) {
                obj4 = new DecimalFormat("0.#").format(obj2);
            }
            return l(obj3, obj4, bVar);
        } else if (!(obj2 instanceof String) || !(obj instanceof Number)) {
            return false;
        } else {
            return k((Number) obj, (String) obj2, bVar);
        }
    }

    private boolean j(Number number, Number number2, f3.b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (a.f27829a[bVar.ordinal()]) {
            case 1:
                if (doubleValue2 == doubleValue) {
                    return true;
                }
                return false;
            case 2:
                if (doubleValue2 != doubleValue) {
                    return true;
                }
                return false;
            case 3:
            case 4:
            case 5:
                k3.r0 r0Var = k3.r0.ERROR;
                k3.A1(r0Var, "Attempted to use an invalid operator with a numeric value: " + bVar.toString());
                return false;
            case 6:
                return doubleValue2 < doubleValue;
            case 7:
                return doubleValue2 > doubleValue;
            case 8:
                return doubleValue2 < doubleValue || doubleValue2 == doubleValue;
            case 9:
                int i10 = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                return i10 > 0 || i10 == 0;
            default:
                return false;
        }
    }

    private boolean k(Number number, String str, f3.b bVar) {
        try {
            return j(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private boolean l(String str, String str2, f3.b bVar) {
        int i10 = a.f27829a[bVar.ordinal()];
        if (i10 == 1) {
            return str.equals(str2);
        }
        if (i10 == 2) {
            return !str.equals(str2);
        }
        k3.r0 r0Var = k3.r0.ERROR;
        k3.A1(r0Var, "Attempted to use an invalid operator for a string trigger comparison: " + bVar.toString());
        return false;
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, Object> map) {
        synchronized (this.f27828b) {
            for (String next : map.keySet()) {
                this.f27828b.put(next, map.get(next));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c(i1 i1Var) {
        if (i1Var.f27846c.size() == 0) {
            return true;
        }
        Iterator<ArrayList<f3>> it = i1Var.f27846c.iterator();
        while (it.hasNext()) {
            if (b(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Object e(String str) {
        synchronized (this.f27828b) {
            if (!this.f27828b.containsKey(str)) {
                return null;
            }
            Object obj = this.f27828b.get(str);
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x001c A[LOOP:1: B:7:0x001c->B:21:0x001c, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean f(com.onesignal.i1 r7, java.util.Collection<java.lang.String> r8) {
        /*
            r6 = this;
            java.util.ArrayList<java.util.ArrayList<com.onesignal.f3>> r0 = r7.f27846c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.Iterator r8 = r8.iterator()
        L_0x000a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            java.util.ArrayList<java.util.ArrayList<com.onesignal.f3>> r2 = r7.f27846c
            java.util.Iterator r2 = r2.iterator()
        L_0x001c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x000a
            java.lang.Object r3 = r2.next()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x002c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x001c
            java.lang.Object r4 = r3.next()
            com.onesignal.f3 r4 = (com.onesignal.f3) r4
            java.lang.String r5 = r4.f27742c
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L_0x0048
            java.lang.String r4 = r4.f27740a
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x002c
        L_0x0048:
            r7 = 1
            return r7
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.g3.f(com.onesignal.i1, java.util.Collection):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0012 A[LOOP:0: B:5:0x0012->B:20:0x0012, LOOP_END, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(com.onesignal.i1 r5) {
        /*
            r4 = this;
            java.util.ArrayList<java.util.ArrayList<com.onesignal.f3>> r0 = r5.f27846c
            r1 = 0
            if (r0 == 0) goto L_0x003b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x000c
            goto L_0x003b
        L_0x000c:
            java.util.ArrayList<java.util.ArrayList<com.onesignal.f3>> r5 = r5.f27846c
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r5.next()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0022:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0012
            java.lang.Object r2 = r0.next()
            com.onesignal.f3 r2 = (com.onesignal.f3) r2
            com.onesignal.f3$a r2 = r2.f27741b
            com.onesignal.f3$a r3 = com.onesignal.f3.a.CUSTOM
            if (r2 == r3) goto L_0x0038
            com.onesignal.f3$a r3 = com.onesignal.f3.a.UNKNOWN
            if (r2 != r3) goto L_0x0022
        L_0x0038:
            return r1
        L_0x0039:
            r5 = 1
            return r5
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.g3.g(com.onesignal.i1):boolean");
    }

    /* access modifiers changed from: package-private */
    public void h(Collection<String> collection) {
        synchronized (this.f27828b) {
            for (String remove : collection) {
                this.f27828b.remove(remove);
            }
        }
    }
}
