package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.d;
import androidx.savedstate.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import sd.s;
import se.v;

/* compiled from: SavedStateHandle.kt */
public final class d0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f3900f = new a((h) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Class<? extends Object>[] f3901g;

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f3902a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, a.c> f3903b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, Object> f3904c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, v<Object>> f3905d;

    /* renamed from: e  reason: collision with root package name */
    private final a.c f3906e;

    /* compiled from: SavedStateHandle.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final d0 a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj = parcelableArrayList.get(i10);
                        m.c(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i10));
                    }
                    return new d0(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new d0();
            } else {
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    m.d(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new d0(hashMap);
            }
        }

        public final boolean b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : d0.f3901g) {
                m.b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Class<? extends java.lang.Object>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            androidx.lifecycle.d0$a r0 = new androidx.lifecycle.d0$a
            r1 = 0
            r0.<init>(r1)
            f3900f = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r2 = 5
            java.lang.Class<int[]> r3 = int[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 6
            r0[r3] = r2
            r2 = 7
            java.lang.Class<long[]> r3 = long[].class
            r0[r2] = r3
            r2 = 8
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            r2 = 9
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r0[r2] = r3
            r2 = 10
            java.lang.Class<android.os.Binder> r3 = android.os.Binder.class
            r0[r2] = r3
            r2 = 11
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Byte.TYPE
            r3 = 12
            r0[r3] = r2
            r2 = 13
            java.lang.Class<byte[]> r3 = byte[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Character.TYPE
            r3 = 14
            r0[r3] = r2
            r2 = 15
            java.lang.Class<char[]> r3 = char[].class
            r0[r2] = r3
            r2 = 16
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r0[r2] = r3
            r2 = 17
            java.lang.Class<java.lang.CharSequence[]> r3 = java.lang.CharSequence[].class
            r0[r2] = r3
            r2 = 18
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 19
            r0[r3] = r2
            r2 = 20
            java.lang.Class<float[]> r3 = float[].class
            r0[r2] = r3
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r3 = 21
            r0[r3] = r2
            r2 = 22
            java.lang.Class<android.os.Parcelable[]> r4 = android.os.Parcelable[].class
            r0[r2] = r4
            r2 = 23
            java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
            r0[r2] = r4
            java.lang.Class r2 = java.lang.Short.TYPE
            r4 = 24
            r0[r4] = r2
            r2 = 25
            java.lang.Class<short[]> r4 = short[].class
            r0[r2] = r4
            r2 = 26
            java.lang.Class<android.util.SparseArray> r4 = android.util.SparseArray.class
            r0[r2] = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x00ad
            java.lang.Class<android.util.Size> r4 = android.util.Size.class
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            r5 = 27
            r0[r5] = r4
            r4 = 28
            if (r2 < r3) goto L_0x00b8
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
        L_0x00b8:
            r0[r4] = r1
            f3901g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.d0.<clinit>():void");
    }

    public d0(Map<String, ? extends Object> map) {
        m.e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3902a = linkedHashMap;
        this.f3903b = new LinkedHashMap();
        this.f3904c = new LinkedHashMap();
        this.f3905d = new LinkedHashMap();
        this.f3906e = new c0(this);
        linkedHashMap.putAll(map);
    }

    /* access modifiers changed from: private */
    public static final Bundle d(d0 d0Var) {
        m.e(d0Var, "this$0");
        for (Map.Entry entry : k0.t(d0Var.f3903b).entrySet()) {
            d0Var.e((String) entry.getKey(), ((a.c) entry.getValue()).a());
        }
        Set<String> keySet = d0Var.f3902a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(d0Var.f3902a.get(next));
        }
        return d.a(s.a("keys", arrayList), s.a("values", arrayList2));
    }

    public final a.c c() {
        return this.f3906e;
    }

    public final <T> void e(String str, T t10) {
        m.e(str, "key");
        if (f3900f.b(t10)) {
            Object obj = this.f3904c.get(str);
            w wVar = obj instanceof w ? (w) obj : null;
            if (wVar != null) {
                wVar.j(t10);
            } else {
                this.f3902a.put(str, t10);
            }
            v vVar = this.f3905d.get(str);
            if (vVar != null) {
                vVar.setValue(t10);
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Can't put value with type ");
        m.b(t10);
        sb2.append(t10.getClass());
        sb2.append(" into saved state");
        throw new IllegalArgumentException(sb2.toString());
    }

    public d0() {
        this.f3902a = new LinkedHashMap();
        this.f3903b = new LinkedHashMap();
        this.f3904c = new LinkedHashMap();
        this.f3905d = new LinkedHashMap();
        this.f3906e = new c0(this);
    }
}
