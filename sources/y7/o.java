package y7;

import android.net.Uri;
import com.applovin.mediation.MaxReward;
import com.google.firebase.firestore.d0;
import com.google.firebase.firestore.f;
import com.google.firebase.firestore.i;
import com.google.firebase.firestore.m;
import com.google.firebase.firestore.p;
import com.google.firebase.firestore.r;
import com.google.firebase.firestore.r0;
import com.google.firebase.firestore.y0;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import y6.q;

/* compiled from: CustomClassMapper */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, a<?>> f31384a = new ConcurrentHashMap();

    /* compiled from: CustomClassMapper */
    private static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f31385a;

        /* renamed from: b  reason: collision with root package name */
        private final Constructor<T> f31386b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f31387c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f31388d;

        /* renamed from: e  reason: collision with root package name */
        private final Map<String, String> f31389e = new HashMap();

        /* renamed from: f  reason: collision with root package name */
        private final Map<String, Method> f31390f = new HashMap();

        /* renamed from: g  reason: collision with root package name */
        private final Map<String, Method> f31391g = new HashMap();

        /* renamed from: h  reason: collision with root package name */
        private final Map<String, Field> f31392h = new HashMap();

        /* renamed from: i  reason: collision with root package name */
        private final HashSet<String> f31393i = new HashSet<>();

        /* renamed from: j  reason: collision with root package name */
        private final HashSet<String> f31394j = new HashSet<>();

        /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x01a1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        a(java.lang.Class<T> r11) {
            /*
                r10 = this;
                r10.<init>()
                r10.f31385a = r11
                java.lang.Class<com.google.firebase.firestore.c1> r0 = com.google.firebase.firestore.c1.class
                boolean r0 = r11.isAnnotationPresent(r0)
                r10.f31387c = r0
                java.lang.Class<com.google.firebase.firestore.e0> r0 = com.google.firebase.firestore.e0.class
                boolean r0 = r11.isAnnotationPresent(r0)
                r1 = 1
                r0 = r0 ^ r1
                r10.f31388d = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f31389e = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f31391g = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f31390f = r0
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r10.f31392h = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r10.f31393i = r0
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r10.f31394j = r0
                r0 = 0
                java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ NoSuchMethodException -> 0x004c }
                java.lang.reflect.Constructor r2 = r11.getDeclaredConstructor(r2)     // Catch:{ NoSuchMethodException -> 0x004c }
                r2.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x004c }
                goto L_0x004d
            L_0x004c:
                r2 = 0
            L_0x004d:
                r10.f31386b = r2
                java.lang.reflect.Method[] r2 = r11.getMethods()
                int r3 = r2.length
                r4 = 0
            L_0x0055:
                if (r4 >= r3) goto L_0x00a4
                r5 = r2[r4]
                boolean r6 = n(r5)
                if (r6 == 0) goto L_0x00a1
                java.lang.String r6 = j(r5)
                r10.b(r6)
                r5.setAccessible(r1)
                java.util.Map<java.lang.String, java.lang.reflect.Method> r7 = r10.f31390f
                boolean r7 = r7.containsKey(r6)
                if (r7 != 0) goto L_0x007a
                java.util.Map<java.lang.String, java.lang.reflect.Method> r7 = r10.f31390f
                r7.put(r6, r5)
                r10.e(r5)
                goto L_0x00a1
            L_0x007a:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Found conflicting getters for name "
                r1.append(r2)
                java.lang.String r2 = r5.getName()
                r1.append(r2)
                java.lang.String r2 = " on class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L_0x00a1:
                int r4 = r4 + 1
                goto L_0x0055
            L_0x00a4:
                java.lang.reflect.Field[] r2 = r11.getFields()
                int r3 = r2.length
                r4 = 0
            L_0x00aa:
                if (r4 >= r3) goto L_0x00c1
                r5 = r2[r4]
                boolean r6 = m(r5)
                if (r6 == 0) goto L_0x00be
                java.lang.String r6 = i(r5)
                r10.b(r6)
                r10.d(r5)
            L_0x00be:
                int r4 = r4 + 1
                goto L_0x00aa
            L_0x00c1:
                r2 = r11
            L_0x00c2:
                java.lang.reflect.Method[] r3 = r2.getDeclaredMethods()
                int r4 = r3.length
                r5 = 0
            L_0x00c8:
                if (r5 >= r4) goto L_0x0199
                r6 = r3[r5]
                boolean r7 = o(r6)
                if (r7 == 0) goto L_0x0195
                java.lang.String r7 = j(r6)
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.f31389e
                java.util.Locale r9 = java.util.Locale.US
                java.lang.String r9 = r7.toLowerCase(r9)
                java.lang.Object r8 = r8.get(r9)
                java.lang.String r8 = (java.lang.String) r8
                if (r8 == 0) goto L_0x0195
                boolean r8 = r8.equals(r7)
                if (r8 == 0) goto L_0x016e
                java.util.Map<java.lang.String, java.lang.reflect.Method> r8 = r10.f31391g
                java.lang.Object r8 = r8.get(r7)
                java.lang.reflect.Method r8 = (java.lang.reflect.Method) r8
                if (r8 != 0) goto L_0x0103
                r6.setAccessible(r1)
                java.util.Map<java.lang.String, java.lang.reflect.Method> r8 = r10.f31391g
                r8.put(r7, r6)
                r10.f(r6)
                goto L_0x0195
            L_0x0103:
                boolean r7 = h(r6, r8)
                if (r7 != 0) goto L_0x0195
                if (r2 != r11) goto L_0x0132
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = " has multiple setter overloads with name "
                r1.append(r11)
                java.lang.String r11 = r6.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            L_0x0132:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found conflicting setters with name: "
                r0.append(r1)
                java.lang.String r1 = r6.getName()
                r0.append(r1)
                java.lang.String r1 = " (conflicts with "
                r0.append(r1)
                java.lang.String r1 = r8.getName()
                r0.append(r1)
                java.lang.String r1 = " defined on "
                r0.append(r1)
                java.lang.Class r1 = r8.getDeclaringClass()
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L_0x016e:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Found setter on "
                r0.append(r1)
                java.lang.String r1 = r2.getName()
                r0.append(r1)
                java.lang.String r1 = " with invalid case-sensitive name: "
                r0.append(r1)
                java.lang.String r1 = r6.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r11.<init>(r0)
                throw r11
            L_0x0195:
                int r5 = r5 + 1
                goto L_0x00c8
            L_0x0199:
                java.lang.reflect.Field[] r3 = r2.getDeclaredFields()
                int r4 = r3.length
                r5 = 0
            L_0x019f:
                if (r5 >= r4) goto L_0x01cb
                r6 = r3[r5]
                java.lang.String r7 = i(r6)
                java.util.Map<java.lang.String, java.lang.String> r8 = r10.f31389e
                java.util.Locale r9 = java.util.Locale.US
                java.lang.String r9 = r7.toLowerCase(r9)
                boolean r8 = r8.containsKey(r9)
                if (r8 == 0) goto L_0x01c8
                java.util.Map<java.lang.String, java.lang.reflect.Field> r8 = r10.f31392h
                boolean r8 = r8.containsKey(r7)
                if (r8 != 0) goto L_0x01c8
                r6.setAccessible(r1)
                java.util.Map<java.lang.String, java.lang.reflect.Field> r8 = r10.f31392h
                r8.put(r7, r6)
                r10.d(r6)
            L_0x01c8:
                int r5 = r5 + 1
                goto L_0x019f
            L_0x01cb:
                java.lang.Class r2 = r2.getSuperclass()
                if (r2 == 0) goto L_0x01d9
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                boolean r3 = r2.equals(r3)
                if (r3 == 0) goto L_0x00c2
            L_0x01d9:
                java.util.Map<java.lang.String, java.lang.String> r0 = r10.f31389e
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L_0x022d
                java.util.HashSet<java.lang.String> r0 = r10.f31394j
                java.util.Iterator r0 = r0.iterator()
            L_0x01e7:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x022c
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.Map<java.lang.String, java.lang.reflect.Method> r2 = r10.f31391g
                boolean r2 = r2.containsKey(r1)
                if (r2 != 0) goto L_0x01e7
                java.util.Map<java.lang.String, java.lang.reflect.Field> r2 = r10.f31392h
                boolean r2 = r2.containsKey(r1)
                if (r2 == 0) goto L_0x0204
                goto L_0x01e7
            L_0x0204:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "@DocumentId is annotated on property "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " of class "
                r2.append(r1)
                java.lang.String r11 = r11.getName()
                r2.append(r11)
                java.lang.String r11 = " but no field or public setter was found"
                r2.append(r11)
                java.lang.String r11 = r2.toString()
                r0.<init>(r11)
                throw r0
            L_0x022c:
                return
            L_0x022d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "No properties to serialize found on class "
                r1.append(r2)
                java.lang.String r11 = r11.getName()
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: y7.o.a.<init>(java.lang.Class):void");
        }

        private void b(String str) {
            Map<String, String> map = this.f31389e;
            Locale locale = Locale.US;
            String put = map.put(str.toLowerCase(locale), str);
            if (put != null && !str.equals(put)) {
                throw new RuntimeException("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
            }
        }

        private static String c(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(r0.class)) {
                return ((r0) accessibleObject.getAnnotation(r0.class)).value();
            }
            return null;
        }

        private void d(Field field) {
            if (field.isAnnotationPresent(y0.class)) {
                Class<?> type = field.getType();
                if (type == Date.class || type == q.class) {
                    this.f31393i.add(i(field));
                } else {
                    throw new IllegalArgumentException("Field " + field.getName() + " is annotated with @ServerTimestamp but is " + type + " instead of Date or Timestamp.");
                }
            }
            if (field.isAnnotationPresent(i.class)) {
                g("Field", "is", field.getType());
                this.f31394j.add(i(field));
            }
        }

        private void e(Method method) {
            if (method.isAnnotationPresent(y0.class)) {
                Class<?> returnType = method.getReturnType();
                if (returnType == Date.class || returnType == q.class) {
                    this.f31393i.add(j(method));
                } else {
                    throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but returns " + returnType + " instead of Date or Timestamp.");
                }
            }
            if (method.isAnnotationPresent(i.class)) {
                g("Method", "returns", method.getReturnType());
                this.f31394j.add(j(method));
            }
        }

        private void f(Method method) {
            if (method.isAnnotationPresent(y0.class)) {
                throw new IllegalArgumentException("Method " + method.getName() + " is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
            } else if (method.isAnnotationPresent(i.class)) {
                g("Method", "accepts", method.getParameterTypes()[0]);
                this.f31394j.add(j(method));
            }
        }

        private void g(String str, String str2, Type type) {
            if (type != String.class && type != m.class) {
                throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + type + " instead of String or DocumentReference.");
            }
        }

        private static boolean h(Method method, Method method2) {
            o.d(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            o.d(method.getReturnType().equals(Void.TYPE), "Expected void return type");
            o.d(method2.getReturnType().equals(Void.TYPE), "Expected void return type");
            Class[] parameterTypes = method.getParameterTypes();
            Class[] parameterTypes2 = method2.getParameterTypes();
            o.d(parameterTypes.length == 1, "Expected exactly one parameter");
            o.d(parameterTypes2.length == 1, "Expected exactly one parameter");
            if (!method.getName().equals(method2.getName()) || !parameterTypes[0].equals(parameterTypes2[0])) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: private */
        public static String i(Field field) {
            String c10 = c(field);
            return c10 != null ? c10 : field.getName();
        }

        private static String j(Method method) {
            String c10 = c(method);
            return c10 != null ? c10 : l(method.getName());
        }

        private static String l(String str) {
            String[] strArr = {"get", "set", "is"};
            int i10 = 0;
            String str2 = null;
            for (int i11 = 0; i11 < 3; i11++) {
                String str3 = strArr[i11];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 != null) {
                char[] charArray = str.substring(str2.length()).toCharArray();
                while (i10 < charArray.length && Character.isUpperCase(charArray[i10])) {
                    charArray[i10] = Character.toLowerCase(charArray[i10]);
                    i10++;
                }
                return new String(charArray);
            }
            throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
        }

        private static boolean m(Field field) {
            if (!field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(p.class)) {
                return true;
            }
            return false;
        }

        private static boolean n(Method method) {
            if ((method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isAnnotationPresent(p.class)) {
                return true;
            }
            return false;
        }

        private static boolean o(Method method) {
            if (method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(p.class)) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public Map<String, Object> k(T t10, b bVar) {
            Object obj;
            Object obj2;
            if (this.f31385a.isAssignableFrom(t10.getClass())) {
                HashMap hashMap = new HashMap();
                for (String next : this.f31389e.values()) {
                    if (!this.f31394j.contains(next)) {
                        if (this.f31390f.containsKey(next)) {
                            obj = a.a(this.f31390f.get(next), t10, new Object[0]);
                        } else {
                            Field field = this.f31392h.get(next);
                            if (field != null) {
                                try {
                                    obj = field.get(t10);
                                } catch (IllegalAccessException e10) {
                                    throw new RuntimeException(e10);
                                }
                            } else {
                                throw new IllegalStateException("Bean property without field or getter: " + next);
                            }
                        }
                        if (!this.f31393i.contains(next) || obj != null) {
                            obj2 = o.g(obj, bVar.a(next));
                        } else {
                            obj2 = r.g();
                        }
                        hashMap.put(next, obj2);
                    }
                }
                return hashMap;
            }
            throw new IllegalArgumentException("Can't serialize object of class " + t10.getClass() + " with BeanMapper for class " + this.f31385a);
        }
    }

    /* compiled from: CustomClassMapper */
    static class b {

        /* renamed from: d  reason: collision with root package name */
        static final b f31395d = new b((b) null, (String) null, 0);

        /* renamed from: a  reason: collision with root package name */
        private final int f31396a;

        /* renamed from: b  reason: collision with root package name */
        private final b f31397b;

        /* renamed from: c  reason: collision with root package name */
        private final String f31398c;

        b(b bVar, String str, int i10) {
            this.f31397b = bVar;
            this.f31398c = str;
            this.f31396a = i10;
        }

        /* access modifiers changed from: package-private */
        public b a(String str) {
            return new b(this, str, this.f31396a + 1);
        }

        /* access modifiers changed from: package-private */
        public int b() {
            return this.f31396a;
        }

        public String toString() {
            int i10 = this.f31396a;
            if (i10 == 0) {
                return MaxReward.DEFAULT_LABEL;
            }
            if (i10 == 1) {
                return this.f31398c;
            }
            return this.f31397b.toString() + "." + this.f31398c;
        }
    }

    public static Object c(Object obj) {
        return f(obj);
    }

    /* access modifiers changed from: private */
    public static void d(boolean z10, String str) {
        if (!z10) {
            throw new RuntimeException("Hard assert failed: " + str);
        }
    }

    private static <T> a<T> e(Class<T> cls) {
        ConcurrentMap<Class<?>, a<?>> concurrentMap = f31384a;
        a<T> aVar = (a) concurrentMap.get(cls);
        if (aVar != null) {
            return aVar;
        }
        a<T> aVar2 = new a<>(cls);
        concurrentMap.put(cls, aVar2);
        return aVar2;
    }

    private static <T> Object f(T t10) {
        return g(t10, b.f31395d);
    }

    /* access modifiers changed from: private */
    public static <T> Object g(T t10, b bVar) {
        if (bVar.b() > 500) {
            throw h(bVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        } else if (t10 == null) {
            return null;
        } else {
            if (t10 instanceof Number) {
                if ((t10 instanceof Long) || (t10 instanceof Integer) || (t10 instanceof Double) || (t10 instanceof Float)) {
                    return t10;
                }
                throw h(bVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", new Object[]{t10.getClass().getSimpleName()}));
            } else if ((t10 instanceof String) || (t10 instanceof Boolean)) {
                return t10;
            } else {
                if (t10 instanceof Character) {
                    throw h(bVar, "Characters are not supported, please use Strings");
                } else if (t10 instanceof Map) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : ((Map) t10).entrySet()) {
                        Object key = entry.getKey();
                        if (key instanceof String) {
                            String str = (String) key;
                            hashMap.put(str, g(entry.getValue(), bVar.a(str)));
                        } else {
                            throw h(bVar, "Maps with non-string keys are not supported");
                        }
                    }
                    return hashMap;
                } else if (t10 instanceof Collection) {
                    if (t10 instanceof List) {
                        List list = (List) t10;
                        ArrayList arrayList = new ArrayList(list.size());
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            Object obj = list.get(i10);
                            arrayList.add(g(obj, bVar.a("[" + i10 + "]")));
                        }
                        return arrayList;
                    }
                    throw h(bVar, "Serializing Collections is not supported, please use Lists instead");
                } else if (t10.getClass().isArray()) {
                    throw h(bVar, "Serializing Arrays is not supported, please use Lists instead");
                } else if (t10 instanceof Enum) {
                    String name = ((Enum) t10).name();
                    try {
                        return a.i(t10.getClass().getField(name));
                    } catch (NoSuchFieldException unused) {
                        return name;
                    }
                } else if ((t10 instanceof Date) || (t10 instanceof q) || (t10 instanceof d0) || (t10 instanceof f) || (t10 instanceof m) || (t10 instanceof r)) {
                    return t10;
                } else {
                    if ((t10 instanceof Uri) || (t10 instanceof URI) || (t10 instanceof URL)) {
                        return t10.toString();
                    }
                    return e(t10.getClass()).k(t10, bVar);
                }
            }
        }
    }

    private static IllegalArgumentException h(b bVar, String str) {
        String str2 = "Could not serialize object. " + str;
        if (bVar.b() > 0) {
            str2 = str2 + " (found in field '" + bVar.toString() + "')";
        }
        return new IllegalArgumentException(str2);
    }
}
