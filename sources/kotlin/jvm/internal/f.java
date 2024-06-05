package kotlin.jvm.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import fe.b;
import fe.d;
import fe.e;
import fe.g;
import fe.h;
import fe.i;
import fe.j;
import fe.k;
import fe.l;
import fe.m;
import fe.n;
import fe.o;
import fe.p;
import fe.q;
import fe.r;
import fe.s;
import fe.t;
import fe.u;
import fe.v;
import fe.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import le.c;

/* compiled from: ClassReference.kt */
public final class f implements c<Object>, e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f36041b = new a((h) null);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<? extends sd.c<?>>, Integer> f36042c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f36043d;

    /* renamed from: f  reason: collision with root package name */
    private static final HashMap<String, String> f36044f;

    /* renamed from: g  reason: collision with root package name */
    private static final HashMap<String, String> f36045g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final Map<String, String> f36046h;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f36047a;

    /* compiled from: ClassReference.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            m.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        m.d(simpleName, MediationMetaData.KEY_NAME);
                        String o02 = p.o0(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
                        if (o02 != null) {
                            return o02;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    if (enclosingConstructor != null) {
                        m.d(simpleName, MediationMetaData.KEY_NAME);
                        return p.o0(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
                    }
                    m.d(simpleName, MediationMetaData.KEY_NAME);
                    return p.n0(simpleName, '$', (String) null, 2, (Object) null);
                } else if (cls.isArray()) {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) f.f36046h.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                } else {
                    String str3 = (String) f.f36046h.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
            }
            return str2;
        }
    }

    static {
        int i10 = 0;
        List f10 = q.f(fe.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, b.class, fe.c.class, d.class, e.class, fe.f.class, g.class, h.class, i.class, j.class, k.class, m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(r.j(f10, 10));
        for (Object next : f10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                q.i();
            }
            arrayList.add(sd.s.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f36042c = k0.r(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f36043d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f36044f = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        m.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            m.d(str, "kotlinName");
            sb2.append(p.r0(str, '.', (String) null, 2, (Object) null));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            sd.n a10 = sd.s.a(sb3, str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry next2 : f36042c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f36045g = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(j0.d(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            linkedHashMap.put(entry.getKey(), p.r0((String) entry.getValue(), '.', (String) null, 2, (Object) null));
        }
        f36046h = linkedHashMap;
    }

    public f(Class<?> cls) {
        m.e(cls, "jClass");
        this.f36047a = cls;
    }

    public String a() {
        return f36041b.a(b());
    }

    public Class<?> b() {
        return this.f36047a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && m.a(ee.a.b(this), ee.a.b((c) obj));
    }

    public int hashCode() {
        return ee.a.b(this).hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
