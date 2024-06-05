package sc;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a1;
import com.google.firebase.firestore.b1;
import com.google.firebase.firestore.e;
import com.google.firebase.firestore.h;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.q;
import com.google.firebase.firestore.v0;
import com.google.firebase.firestore.x0;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import qc.y;

/* compiled from: PigeonParser */
public class b {

    /* compiled from: PigeonParser */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38110a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f38111b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f38112c;

        /* renamed from: d  reason: collision with root package name */
        static final /* synthetic */ int[] f38113d;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0079 */
        static {
            /*
                qc.y$c[] r0 = qc.y.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38113d = r0
                r1 = 1
                qc.y$c r2 = qc.y.c.SERVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.google.firebase.firestore.h$b[] r0 = com.google.firebase.firestore.h.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38112c = r0
                com.google.firebase.firestore.h$b r2 = com.google.firebase.firestore.h.b.ADDED     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r0 = 2
                int[] r2 = f38112c     // Catch:{ NoSuchFieldError -> 0x002e }
                com.google.firebase.firestore.h$b r3 = com.google.firebase.firestore.h.b.MODIFIED     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                r2 = 3
                int[] r3 = f38112c     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.google.firebase.firestore.h$b r4 = com.google.firebase.firestore.h.b.REMOVED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                qc.y$w[] r3 = qc.y.w.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f38111b = r3
                qc.y$w r4 = qc.y.w.NONE     // Catch:{ NoSuchFieldError -> 0x004a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004a }
            L_0x004a:
                int[] r3 = f38111b     // Catch:{ NoSuchFieldError -> 0x0054 }
                qc.y$w r4 = qc.y.w.ESTIMATE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r3 = f38111b     // Catch:{ NoSuchFieldError -> 0x005e }
                qc.y$w r4 = qc.y.w.PREVIOUS     // Catch:{ NoSuchFieldError -> 0x005e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                qc.y$x[] r3 = qc.y.x.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f38110a = r3
                qc.y$x r4 = qc.y.x.CACHE     // Catch:{ NoSuchFieldError -> 0x006f }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r1 = f38110a     // Catch:{ NoSuchFieldError -> 0x0079 }
                qc.y$x r3 = qc.y.x.SERVER_AND_CACHE     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                int[] r0 = f38110a     // Catch:{ NoSuchFieldError -> 0x0083 }
                qc.y$x r1 = qc.y.x.SERVER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sc.b.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r1.equals("not-in") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.firebase.firestore.s a(java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            java.lang.String r0 = "fieldPath"
            boolean r1 = r6.containsKey(r0)
            java.lang.String r2 = "Invalid operator"
            java.lang.String r3 = "op"
            r4 = 0
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r6.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r6.get(r0)
            com.google.firebase.firestore.q r0 = (com.google.firebase.firestore.q) r0
            java.lang.String r3 = "value"
            java.lang.Object r6 = r6.get(r3)
            r1.hashCode()
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1039747489: goto L_0x0093;
                case 60: goto L_0x0088;
                case 62: goto L_0x007d;
                case 1084: goto L_0x0072;
                case 1921: goto L_0x0067;
                case 1952: goto L_0x005c;
                case 1983: goto L_0x0051;
                case 3365: goto L_0x0046;
                case 135338771: goto L_0x003a;
                case 355289138: goto L_0x002d;
                default: goto L_0x002a;
            }
        L_0x002a:
            r4 = -1
            goto L_0x009c
        L_0x002d:
            java.lang.String r4 = "array-contains-any"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0036
            goto L_0x002a
        L_0x0036:
            r4 = 9
            goto L_0x009c
        L_0x003a:
            java.lang.String r4 = "array-contains"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0043
            goto L_0x002a
        L_0x0043:
            r4 = 8
            goto L_0x009c
        L_0x0046:
            java.lang.String r4 = "in"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x004f
            goto L_0x002a
        L_0x004f:
            r4 = 7
            goto L_0x009c
        L_0x0051:
            java.lang.String r4 = ">="
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005a
            goto L_0x002a
        L_0x005a:
            r4 = 6
            goto L_0x009c
        L_0x005c:
            java.lang.String r4 = "=="
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0065
            goto L_0x002a
        L_0x0065:
            r4 = 5
            goto L_0x009c
        L_0x0067:
            java.lang.String r4 = "<="
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0070
            goto L_0x002a
        L_0x0070:
            r4 = 4
            goto L_0x009c
        L_0x0072:
            java.lang.String r4 = "!="
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x007b
            goto L_0x002a
        L_0x007b:
            r4 = 3
            goto L_0x009c
        L_0x007d:
            java.lang.String r4 = ">"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0086
            goto L_0x002a
        L_0x0086:
            r4 = 2
            goto L_0x009c
        L_0x0088:
            java.lang.String r4 = "<"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0091
            goto L_0x002a
        L_0x0091:
            r4 = 1
            goto L_0x009c
        L_0x0093:
            java.lang.String r5 = "not-in"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto L_0x009c
            goto L_0x002a
        L_0x009c:
            switch(r4) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00cc;
                case 3: goto L_0x00c7;
                case 4: goto L_0x00c2;
                case 5: goto L_0x00bd;
                case 6: goto L_0x00b8;
                case 7: goto L_0x00b1;
                case 8: goto L_0x00ac;
                case 9: goto L_0x00a5;
                default: goto L_0x009f;
            }
        L_0x009f:
            java.lang.Error r6 = new java.lang.Error
            r6.<init>(r2)
            throw r6
        L_0x00a5:
            java.util.List r6 = (java.util.List) r6
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.c(r0, r6)
            return r6
        L_0x00ac:
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.b(r0, r6)
            return r6
        L_0x00b1:
            java.util.List r6 = (java.util.List) r6
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.g(r0, r6)
            return r6
        L_0x00b8:
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.f(r0, r6)
            return r6
        L_0x00bd:
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.d(r0, r6)
            return r6
        L_0x00c2:
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.i(r0, r6)
            return r6
        L_0x00c7:
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.j(r0, r6)
            return r6
        L_0x00cc:
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.e(r0, r6)
            return r6
        L_0x00d1:
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.h(r0, r6)
            return r6
        L_0x00d6:
            java.util.List r6 = (java.util.List) r6
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.k(r0, r6)
            return r6
        L_0x00dd:
            java.lang.Object r0 = r6.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "queries"
            java.lang.Object r6 = r6.get(r1)
            java.util.List r6 = (java.util.List) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x00f4:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x0108
            java.lang.Object r3 = r6.next()
            java.util.Map r3 = (java.util.Map) r3
            com.google.firebase.firestore.s r3 = a(r3)
            r1.add(r3)
            goto L_0x00f4
        L_0x0108:
            java.lang.String r6 = "OR"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x011d
            com.google.firebase.firestore.s[] r6 = new com.google.firebase.firestore.s[r4]
            java.lang.Object[] r6 = r1.toArray(r6)
            com.google.firebase.firestore.s[] r6 = (com.google.firebase.firestore.s[]) r6
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.l(r6)
            return r6
        L_0x011d:
            java.lang.String r6 = "AND"
            boolean r6 = r0.equals(r6)
            if (r6 == 0) goto L_0x0132
            com.google.firebase.firestore.s[] r6 = new com.google.firebase.firestore.s[r4]
            java.lang.Object[] r6 = r1.toArray(r6)
            com.google.firebase.firestore.s[] r6 = (com.google.firebase.firestore.s[]) r6
            com.google.firebase.firestore.s r6 = com.google.firebase.firestore.s.a(r6)
            return r6
        L_0x0132:
            java.lang.Error r6 = new java.lang.Error
            r6.<init>(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.b.a(java.util.Map):com.google.firebase.firestore.s");
    }

    public static e b(y.c cVar) {
        if (a.f38113d[cVar.ordinal()] == 1) {
            return e.SERVER;
        }
        throw new IllegalArgumentException("Unknown AggregateSource value: " + cVar);
    }

    public static List<q> c(List<List<String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (List<String> array : list) {
            arrayList.add(q.d((String[]) array.toArray(new String[0])));
        }
        return arrayList;
    }

    public static n.a d(y.w wVar) {
        if (wVar == null) {
            return n.a.NONE;
        }
        int i10 = a.f38111b[wVar.ordinal()];
        if (i10 == 1) {
            return n.a.NONE;
        }
        if (i10 == 2) {
            return n.a.ESTIMATE;
        }
        if (i10 == 3) {
            return n.a.PREVIOUS;
        }
        throw new IllegalArgumentException("Unknown server timestamp behavior: " + wVar);
    }

    public static b1 e(y.x xVar) {
        int i10 = a.f38110a[xVar.ordinal()];
        if (i10 == 1) {
            return b1.CACHE;
        }
        if (i10 == 2) {
            return b1.DEFAULT;
        }
        if (i10 == 3) {
            return b1.SERVER;
        }
        throw new IllegalArgumentException("Unknown source: " + xVar);
    }

    public static v0 f(FirebaseFirestore firebaseFirestore, String str, boolean z10, y.p pVar) {
        v0 v0Var;
        if (z10) {
            try {
                v0Var = firebaseFirestore.m(str);
            } catch (Exception e10) {
                Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e10);
                return null;
            }
        } else {
            v0Var = firebaseFirestore.l(str);
        }
        if (pVar == null) {
            return v0Var;
        }
        if (pVar.d() != null) {
            v0Var = v0Var.H(a(pVar.d()));
        }
        List<List<Object>> j10 = pVar.j();
        Objects.requireNonNull(j10);
        for (List list : j10) {
            q qVar = (q) list.get(0);
            String str2 = (String) list.get(1);
            Object obj = list.get(2);
            if ("==".equals(str2)) {
                v0Var = v0Var.K(qVar, obj);
            } else if ("!=".equals(str2)) {
                v0Var = v0Var.Q(qVar, obj);
            } else if ("<".equals(str2)) {
                v0Var = v0Var.O(qVar, obj);
            } else if ("<=".equals(str2)) {
                v0Var = v0Var.P(qVar, obj);
            } else if (">".equals(str2)) {
                v0Var = v0Var.L(qVar, obj);
            } else if (">=".equals(str2)) {
                v0Var = v0Var.M(qVar, obj);
            } else if ("array-contains".equals(str2)) {
                v0Var = v0Var.I(qVar, obj);
            } else if ("array-contains-any".equals(str2)) {
                v0Var = v0Var.J(qVar, (List) obj);
            } else if (ScarConstants.IN_SIGNAL_KEY.equals(str2)) {
                v0Var = v0Var.N(qVar, (List) obj);
            } else if ("not-in".equals(str2)) {
                v0Var = v0Var.R(qVar, (List) obj);
            } else {
                Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
            }
        }
        Long e11 = pVar.e();
        if (e11 != null) {
            v0Var = v0Var.t(e11.longValue());
        }
        Long f10 = pVar.f();
        if (f10 != null) {
            v0Var = v0Var.u(f10.longValue());
        }
        List<List<Object>> g10 = pVar.g();
        if (g10 == null) {
            return v0Var;
        }
        for (List next : g10) {
            v0Var = v0Var.v((q) next.get(0), ((Boolean) next.get(1)).booleanValue() ? v0.c.DESCENDING : v0.c.ASCENDING);
        }
        List<Object> i10 = pVar.i();
        if (i10 != null) {
            Object[] array = i10.toArray();
            Objects.requireNonNull(array);
            v0Var = v0Var.C(array);
        }
        List<Object> h10 = pVar.h();
        if (h10 != null) {
            Object[] array2 = h10.toArray();
            Objects.requireNonNull(array2);
            v0Var = v0Var.B(array2);
        }
        List<Object> b10 = pVar.b();
        if (b10 != null) {
            Object[] array3 = b10.toArray();
            Objects.requireNonNull(array3);
            v0Var = v0Var.j(array3);
        }
        List<Object> c10 = pVar.c();
        if (c10 == null) {
            return v0Var;
        }
        Object[] array4 = c10.toArray();
        Objects.requireNonNull(array4);
        return v0Var.k(array4);
    }

    public static y.k g(h hVar, n.a aVar) {
        y.k.a aVar2 = new y.k.a();
        aVar2.e(h(hVar.e()));
        aVar2.d(Long.valueOf((long) hVar.d()));
        aVar2.c(Long.valueOf((long) hVar.c()));
        aVar2.b(j(hVar.b(), aVar));
        return aVar2.a();
    }

    public static y.e h(h.b bVar) {
        int i10 = a.f38112c[bVar.ordinal()];
        if (i10 == 1) {
            return y.e.ADDED;
        }
        if (i10 == 2) {
            return y.e.MODIFIED;
        }
        if (i10 == 3) {
            return y.e.REMOVED;
        }
        throw new IllegalArgumentException("Unknown change type: " + bVar);
    }

    public static List<y.k> i(List<h> list, n.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (h g10 : list) {
            arrayList.add(g(g10, aVar));
        }
        return arrayList;
    }

    public static y.m j(n nVar, n.a aVar) {
        y.m.a aVar2 = new y.m.a();
        aVar2.c(m(nVar.f()));
        aVar2.b(nVar.e(aVar));
        aVar2.d(nVar.g().m());
        return aVar2.a();
    }

    public static List<y.m> k(List<n> list, n.a aVar) {
        ArrayList arrayList = new ArrayList(list.size());
        for (n j10 : list) {
            arrayList.add(j(j10, aVar));
        }
        return arrayList;
    }

    public static y.q l(x0 x0Var, n.a aVar) {
        y.q.a aVar2 = new y.q.a();
        aVar2.d(m(x0Var.h()));
        aVar2.b(i(x0Var.e(), aVar));
        aVar2.c(k(x0Var.g(), aVar));
        return aVar2.a();
    }

    public static y.r m(a1 a1Var) {
        y.r.a aVar = new y.r.a();
        aVar.b(Boolean.valueOf(a1Var.a()));
        aVar.c(Boolean.valueOf(a1Var.b()));
        return aVar.a();
    }
}
