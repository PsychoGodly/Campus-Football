package qc;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.a0;
import com.google.firebase.firestore.a1;
import com.google.firebase.firestore.d0;
import com.google.firebase.firestore.h;
import com.google.firebase.firestore.i0;
import com.google.firebase.firestore.m;
import com.google.firebase.firestore.n;
import com.google.firebase.firestore.q;
import com.google.firebase.firestore.v0;
import com.google.firebase.firestore.x0;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import lc.r;
import y6.f;

/* compiled from: FlutterFirebaseFirestoreMessageCodec */
class c extends r {

    /* renamed from: d  reason: collision with root package name */
    public static final c f37490d = new c();

    /* compiled from: FlutterFirebaseFirestoreMessageCodec */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37491a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f37492b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.firebase.firestore.i0$a[] r0 = com.google.firebase.firestore.i0.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37492b = r0
                r1 = 1
                com.google.firebase.firestore.i0$a r2 = com.google.firebase.firestore.i0.a.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f37492b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.firestore.i0$a r3 = com.google.firebase.firestore.i0.a.SUCCESS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f37492b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.firestore.i0$a r4 = com.google.firebase.firestore.i0.a.ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.firestore.h$b[] r3 = com.google.firebase.firestore.h.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f37491a = r3
                com.google.firebase.firestore.h$b r4 = com.google.firebase.firestore.h.b.ADDED     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f37491a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.firestore.h$b r3 = com.google.firebase.firestore.h.b.MODIFIED     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f37491a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.firebase.firestore.h$b r1 = com.google.firebase.firestore.h.b.REMOVED     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qc.c.a.<clinit>():void");
        }
    }

    c() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0099, code lost:
        if (r1.equals("not-in") == false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.firebase.firestore.s q(java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            java.lang.String r0 = "fieldPath"
            boolean r1 = r7.containsKey(r0)
            java.lang.String r2 = "Invalid operator"
            java.lang.String r3 = "op"
            r4 = 0
            if (r1 == 0) goto L_0x00dd
            java.lang.Object r1 = r7.get(r3)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r7.get(r0)
            com.google.firebase.firestore.q r0 = (com.google.firebase.firestore.q) r0
            java.lang.String r3 = "value"
            java.lang.Object r7 = r7.get(r3)
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
            java.lang.Error r7 = new java.lang.Error
            r7.<init>(r2)
            throw r7
        L_0x00a5:
            java.util.List r7 = (java.util.List) r7
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.c(r0, r7)
            return r7
        L_0x00ac:
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.b(r0, r7)
            return r7
        L_0x00b1:
            java.util.List r7 = (java.util.List) r7
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.g(r0, r7)
            return r7
        L_0x00b8:
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.f(r0, r7)
            return r7
        L_0x00bd:
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.d(r0, r7)
            return r7
        L_0x00c2:
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.i(r0, r7)
            return r7
        L_0x00c7:
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.j(r0, r7)
            return r7
        L_0x00cc:
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.e(r0, r7)
            return r7
        L_0x00d1:
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.h(r0, r7)
            return r7
        L_0x00d6:
            java.util.List r7 = (java.util.List) r7
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.k(r0, r7)
            return r7
        L_0x00dd:
            java.lang.Object r0 = r7.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "queries"
            java.lang.Object r7 = r7.get(r1)
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00f4:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0108
            java.lang.Object r3 = r7.next()
            java.util.Map r3 = (java.util.Map) r3
            com.google.firebase.firestore.s r3 = r6.q(r3)
            r1.add(r3)
            goto L_0x00f4
        L_0x0108:
            java.lang.String r7 = "OR"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x011d
            com.google.firebase.firestore.s[] r7 = new com.google.firebase.firestore.s[r4]
            java.lang.Object[] r7 = r1.toArray(r7)
            com.google.firebase.firestore.s[] r7 = (com.google.firebase.firestore.s[]) r7
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.l(r7)
            return r7
        L_0x011d:
            java.lang.String r7 = "AND"
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0132
            com.google.firebase.firestore.s[] r7 = new com.google.firebase.firestore.s[r4]
            java.lang.Object[] r7 = r1.toArray(r7)
            com.google.firebase.firestore.s[] r7 = (com.google.firebase.firestore.s[]) r7
            com.google.firebase.firestore.s r7 = com.google.firebase.firestore.s.a(r7)
            return r7
        L_0x0132:
            java.lang.Error r7 = new java.lang.Error
            r7.<init>(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.c.q(java.util.Map):com.google.firebase.firestore.s");
    }

    private FirebaseFirestore r(ByteBuffer byteBuffer) {
        String str = (String) f(byteBuffer);
        String str2 = (String) f(byteBuffer);
        a0 a0Var = (a0) f(byteBuffer);
        synchronized (w.f37610i) {
            if (w.U(str, str2) != null) {
                FirebaseFirestore U = w.U(str, str2);
                return U;
            }
            FirebaseFirestore u10 = FirebaseFirestore.u(f.p(str), str2);
            u10.J(a0Var);
            w.t0(u10, str2);
            return u10;
        }
    }

    private v0 s(ByteBuffer byteBuffer) {
        v0 v0Var;
        try {
            Map map = (Map) f(byteBuffer);
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Object obj2 = map.get("path");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
            Map map2 = (Map) map.get("parameters");
            if (booleanValue) {
                v0Var = firebaseFirestore.m(str);
            } else {
                v0Var = firebaseFirestore.l(str);
            }
            if (map2 == null) {
                return v0Var;
            }
            if (map2.containsKey("filters")) {
                v0Var = v0Var.H(q((Map) map2.get("filters")));
            }
            Object obj3 = map2.get("where");
            Objects.requireNonNull(obj3);
            for (List list : (List) obj3) {
                q qVar = (q) list.get(0);
                String str2 = (String) list.get(1);
                Object obj4 = list.get(2);
                if ("==".equals(str2)) {
                    v0Var = v0Var.K(qVar, obj4);
                } else if ("!=".equals(str2)) {
                    v0Var = v0Var.Q(qVar, obj4);
                } else if ("<".equals(str2)) {
                    v0Var = v0Var.O(qVar, obj4);
                } else if ("<=".equals(str2)) {
                    v0Var = v0Var.P(qVar, obj4);
                } else if (">".equals(str2)) {
                    v0Var = v0Var.L(qVar, obj4);
                } else if (">=".equals(str2)) {
                    v0Var = v0Var.M(qVar, obj4);
                } else if ("array-contains".equals(str2)) {
                    v0Var = v0Var.I(qVar, obj4);
                } else if ("array-contains-any".equals(str2)) {
                    v0Var = v0Var.J(qVar, (List) obj4);
                } else if (ScarConstants.IN_SIGNAL_KEY.equals(str2)) {
                    v0Var = v0Var.N(qVar, (List) obj4);
                } else if ("not-in".equals(str2)) {
                    v0Var = v0Var.R(qVar, (List) obj4);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Number number = (Number) map2.get("limit");
            if (number != null) {
                v0Var = v0Var.t(number.longValue());
            }
            Number number2 = (Number) map2.get("limitToLast");
            if (number2 != null) {
                v0Var = v0Var.u(number2.longValue());
            }
            List<List> list2 = (List) map2.get("orderBy");
            if (list2 == null) {
                return v0Var;
            }
            for (List list3 : list2) {
                v0Var = v0Var.v((q) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? v0.c.DESCENDING : v0.c.ASCENDING);
            }
            List list4 = (List) map2.get("startAt");
            if (list4 != null) {
                Object[] array = list4.toArray();
                Objects.requireNonNull(array);
                v0Var = v0Var.C(array);
            }
            List list5 = (List) map2.get("startAfter");
            if (list5 != null) {
                Object[] array2 = list5.toArray();
                Objects.requireNonNull(array2);
                v0Var = v0Var.B(array2);
            }
            List list6 = (List) map2.get("endAt");
            if (list6 != null) {
                Object[] array3 = list6.toArray();
                Objects.requireNonNull(array3);
                v0Var = v0Var.j(array3);
            }
            List list7 = (List) map2.get("endBefore");
            if (list7 == null) {
                return v0Var;
            }
            Object[] array4 = list7.toArray();
            Objects.requireNonNull(array4);
            return v0Var.k(array4);
        } catch (Exception e10) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e10);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Long} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.firebase.firestore.a0 t(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            java.lang.Object r9 = r8.f(r9)
            java.util.Map r9 = (java.util.Map) r9
            com.google.firebase.firestore.a0$b r0 = new com.google.firebase.firestore.a0$b
            r0.<init>()
            java.lang.String r1 = "persistenceEnabled"
            java.lang.Object r2 = r9.get(r1)
            if (r2 == 0) goto L_0x0077
            java.lang.Object r1 = r9.get(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x006c
            com.google.firebase.firestore.q0$b r1 = com.google.firebase.firestore.q0.b()
            java.lang.String r2 = "cacheSizeBytes"
            java.lang.Object r3 = r9.get(r2)
            if (r3 == 0) goto L_0x0064
            r3 = 104857600(0x6400000, double:5.1806538E-316)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r2 = r9.get(r2)
            boolean r4 = r2 instanceof java.lang.Long
            if (r4 == 0) goto L_0x0040
            r3 = r2
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x004f
        L_0x0040:
            boolean r4 = r2 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x004f
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            long r2 = (long) r2
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
        L_0x004f:
            long r4 = r3.longValue()
            r6 = -1
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x005d
            r1.b(r6)
            goto L_0x0064
        L_0x005d:
            long r2 = r3.longValue()
            r1.b(r2)
        L_0x0064:
            com.google.firebase.firestore.q0 r1 = r1.a()
            r0.h(r1)
            goto L_0x0077
        L_0x006c:
            com.google.firebase.firestore.k0$b r1 = com.google.firebase.firestore.k0.b()
            com.google.firebase.firestore.k0 r1 = r1.a()
            r0.h(r1)
        L_0x0077:
            java.lang.String r1 = "host"
            java.lang.Object r2 = r9.get(r1)
            if (r2 == 0) goto L_0x00a3
            java.lang.Object r1 = r9.get(r1)
            java.util.Objects.requireNonNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.g(r1)
            java.lang.String r1 = "sslEnabled"
            java.lang.Object r2 = r9.get(r1)
            if (r2 == 0) goto L_0x00a3
            java.lang.Object r9 = r9.get(r1)
            java.util.Objects.requireNonNull(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r0.i(r9)
        L_0x00a3:
            com.google.firebase.firestore.a0 r9 = r0.f()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.c.t(java.nio.ByteBuffer):com.google.firebase.firestore.a0");
    }

    private Object[] u(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", new Object[]{obj.getClass().getCanonicalName()}));
    }

    private void v(ByteArrayOutputStream byteArrayOutputStream, h hVar) {
        HashMap hashMap = new HashMap();
        int i10 = a.f37491a[hVar.e().ordinal()];
        hashMap.put("type", i10 != 1 ? i10 != 2 ? i10 != 3 ? null : "DocumentChangeType.removed" : "DocumentChangeType.modified" : "DocumentChangeType.added");
        hashMap.put(JsonStorageKeyNames.DATA_KEY, hVar.b().d());
        hashMap.put("path", hVar.b().g().m());
        hashMap.put("oldIndex", Integer.valueOf(hVar.d()));
        hashMap.put("newIndex", Integer.valueOf(hVar.c()));
        hashMap.put("metadata", hVar.b().f());
        p(byteArrayOutputStream, hashMap);
    }

    private void w(ByteArrayOutputStream byteArrayOutputStream, n nVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", nVar.g().m());
        if (nVar.a()) {
            n.a aVar = w.f37611j.get(Integer.valueOf(nVar.hashCode()));
            if (aVar != null) {
                hashMap.put(JsonStorageKeyNames.DATA_KEY, nVar.e(aVar));
            } else {
                hashMap.put(JsonStorageKeyNames.DATA_KEY, nVar.d());
            }
        } else {
            hashMap.put(JsonStorageKeyNames.DATA_KEY, (Object) null);
        }
        hashMap.put("metadata", nVar.f());
        w.f37611j.remove(Integer.valueOf(nVar.hashCode()));
        p(byteArrayOutputStream, hashMap);
    }

    private void x(ByteArrayOutputStream byteArrayOutputStream, i0 i0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("bytesLoaded", Long.valueOf(i0Var.c()));
        hashMap.put("documentsLoaded", Integer.valueOf(i0Var.d()));
        hashMap.put("totalBytes", Long.valueOf(i0Var.f()));
        hashMap.put("totalDocuments", Integer.valueOf(i0Var.g()));
        int i10 = a.f37492b[i0Var.e().ordinal()];
        String str = "running";
        if (i10 != 1) {
            if (i10 == 2) {
                str = "success";
            } else if (i10 == 3) {
                str = "error";
            }
        }
        hashMap.put("taskState", str);
        p(byteArrayOutputStream, hashMap);
    }

    private void y(ByteArrayOutputStream byteArrayOutputStream, x0 x0Var) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        n.a aVar = w.f37611j.get(Integer.valueOf(x0Var.hashCode()));
        for (n next : x0Var.g()) {
            arrayList.add(next.g().m());
            if (aVar != null) {
                arrayList2.add(next.e(aVar));
            } else {
                arrayList2.add(next.d());
            }
            arrayList3.add(next.f());
        }
        hashMap.put("paths", arrayList);
        hashMap.put("documents", arrayList2);
        hashMap.put("metadatas", arrayList3);
        hashMap.put("documentChanges", x0Var.e());
        hashMap.put("metadata", x0Var.h());
        w.f37611j.remove(Integer.valueOf(x0Var.hashCode()));
        p(byteArrayOutputStream, hashMap);
    }

    private void z(ByteArrayOutputStream byteArrayOutputStream, a1 a1Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("hasPendingWrites", Boolean.valueOf(a1Var.a()));
        hashMap.put("isFromCache", Boolean.valueOf(a1Var.b()));
        p(byteArrayOutputStream, hashMap);
    }

    /* access modifiers changed from: protected */
    public Object g(byte b10, ByteBuffer byteBuffer) {
        switch (b10) {
            case -76:
                return new Date(byteBuffer.getLong());
            case -75:
                r.c(byteBuffer, 8);
                return new d0(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -74:
                return ((FirebaseFirestore) f(byteBuffer)).o((String) f(byteBuffer));
            case -73:
                return com.google.firebase.firestore.f.d(r.d(byteBuffer));
            case -72:
                return com.google.firebase.firestore.r.b(u(f(byteBuffer)));
            case -71:
                return com.google.firebase.firestore.r.a(u(f(byteBuffer)));
            case -70:
                return com.google.firebase.firestore.r.c();
            case -69:
                return com.google.firebase.firestore.r.g();
            case -68:
                return new y6.q(byteBuffer.getLong(), byteBuffer.getInt());
            case -67:
                return com.google.firebase.firestore.r.e(((Number) f(byteBuffer)).doubleValue());
            case -66:
                return com.google.firebase.firestore.r.f((long) ((Number) f(byteBuffer)).intValue());
            case -65:
                return q.a();
            case -64:
                int e10 = r.e(byteBuffer);
                ArrayList arrayList = new ArrayList(e10);
                for (int i10 = 0; i10 < e10; i10++) {
                    arrayList.add(f(byteBuffer));
                }
                return q.d((String[]) arrayList.toArray(new String[0]));
            case -63:
                return Double.valueOf(Double.NaN);
            case -62:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -61:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -60:
                return r(byteBuffer);
            case -59:
                return s(byteBuffer);
            case -58:
                return t(byteBuffer);
            default:
                return super.g(b10, byteBuffer);
        }
    }

    /* access modifiers changed from: protected */
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        String a10;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-76);
            r.n(byteArrayOutputStream, ((Date) obj).getTime());
        } else if (obj instanceof y6.q) {
            byteArrayOutputStream.write(-68);
            y6.q qVar = (y6.q) obj;
            r.n(byteArrayOutputStream, qVar.d());
            r.m(byteArrayOutputStream, qVar.c());
        } else if (obj instanceof d0) {
            byteArrayOutputStream.write(-75);
            r.h(byteArrayOutputStream, 8);
            d0 d0Var = (d0) obj;
            r.k(byteArrayOutputStream, d0Var.c());
            r.k(byteArrayOutputStream, d0Var.d());
        } else if (obj instanceof m) {
            byteArrayOutputStream.write(-74);
            m mVar = (m) obj;
            FirebaseFirestore k10 = mVar.k();
            p(byteArrayOutputStream, k10.r().q());
            p(byteArrayOutputStream, mVar.m());
            synchronized (w.f37610i) {
                a10 = w.S(k10).a();
            }
            p(byteArrayOutputStream, a10);
        } else if (obj instanceof n) {
            w(byteArrayOutputStream, (n) obj);
        } else if (obj instanceof x0) {
            y(byteArrayOutputStream, (x0) obj);
        } else if (obj instanceof h) {
            v(byteArrayOutputStream, (h) obj);
        } else if (obj instanceof i0) {
            x(byteArrayOutputStream, (i0) obj);
        } else if (obj instanceof a1) {
            z(byteArrayOutputStream, (a1) obj);
        } else if (obj instanceof com.google.firebase.firestore.f) {
            byteArrayOutputStream.write(-73);
            r.i(byteArrayOutputStream, ((com.google.firebase.firestore.f) obj).f());
        } else if (obj instanceof Double) {
            Double d10 = (Double) obj;
            if (Double.isNaN(d10.doubleValue())) {
                byteArrayOutputStream.write(-63);
            } else if (d10.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                byteArrayOutputStream.write(-61);
            } else if (d10.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                byteArrayOutputStream.write(-62);
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        } else {
            super.p(byteArrayOutputStream, obj);
        }
    }
}
