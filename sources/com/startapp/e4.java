package com.startapp;

import com.startapp.common.parser.JSONStreamException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Sta */
public class e4 {

    /* renamed from: a  reason: collision with root package name */
    public static Map<String, Class> f15778a;

    static {
        HashMap hashMap = new HashMap();
        f15778a = hashMap;
        hashMap.put("int[]", Integer.class);
        f15778a.put("long[]", Long.class);
        f15778a.put("double[]", Double.class);
        f15778a.put("float[]", Float.class);
        f15778a.put("bool[]", Boolean.class);
        f15778a.put("char[]", Character.class);
        f15778a.put("byte[]", Byte.class);
        f15778a.put("void[]", Void.class);
        f15778a.put("short[]", Short.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0285, code lost:
        throw new com.startapp.common.parser.JSONStreamException("Unknown error occurred ", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x027d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0134 A[Catch:{ Exception -> 0x0286, all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0173 A[Catch:{ Exception -> 0x0286, all -> 0x027d }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027d A[ExcHandler: all (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:45:0x00de] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T a(java.lang.Class<T> r19, org.json.JSONObject r20) throws com.startapp.common.parser.JSONStreamException {
        /*
            r0 = r19
            r1 = r20
            java.lang.String r2 = "Problem instantiating object class "
            java.lang.Class<com.startapp.e9> r3 = com.startapp.e9.class
            java.lang.Class<com.startapp.c9> r4 = com.startapp.c9.class
            java.lang.annotation.Annotation r4 = r0.getAnnotation(r4)     // Catch:{ Exception -> 0x028e }
            com.startapp.c9 r4 = (com.startapp.c9) r4     // Catch:{ Exception -> 0x028e }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x028e }
            r6 = 9
            java.lang.String r7 = "."
            r8 = 1
            r10 = 0
            if (r5 < r6) goto L_0x003b
            java.lang.Class<java.net.HttpCookie> r5 = java.net.HttpCookie.class
            boolean r5 = r0.equals(r5)     // Catch:{ Exception -> 0x028e }
            if (r5 == 0) goto L_0x003b
            java.lang.reflect.Constructor[] r2 = r19.getDeclaredConstructors()     // Catch:{ Exception -> 0x028e }
            r2 = r2[r10]     // Catch:{ Exception -> 0x028e }
            r2.setAccessible(r8)     // Catch:{ Exception -> 0x028e }
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x028e }
            java.lang.String r6 = "name"
            r5[r10] = r6     // Catch:{ Exception -> 0x028e }
            java.lang.String r6 = "value"
            r5[r8] = r6     // Catch:{ Exception -> 0x028e }
            java.lang.Object r2 = r2.newInstance(r5)     // Catch:{ Exception -> 0x028e }
            goto L_0x00a1
        L_0x003b:
            boolean r5 = r19.isPrimitive()     // Catch:{ Exception -> 0x028e }
            if (r5 == 0) goto L_0x0046
            java.lang.Object r0 = r19.newInstance()     // Catch:{ Exception -> 0x028e }
            return r0
        L_0x0046:
            java.lang.Class<com.startapp.c9> r5 = com.startapp.c9.class
            java.lang.annotation.Annotation r5 = r0.getAnnotation(r5)     // Catch:{ Exception -> 0x028e }
            if (r5 == 0) goto L_0x0092
            boolean r5 = r4.extendsClass()     // Catch:{ Exception -> 0x028e }
            if (r5 == 0) goto L_0x0055
            goto L_0x0092
        L_0x0055:
            boolean r5 = r4.extendsClass()     // Catch:{ Exception -> 0x028e }
            if (r5 != 0) goto L_0x0090
            java.lang.String r0 = r4.decider()     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            java.lang.String r3 = r4.packageName()     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            r4.<init>()     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            r4.append(r3)     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            r4.append(r7)     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            r4.append(r0)     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            java.lang.String r0 = r4.toString()     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            java.lang.Object r0 = a(r0, (org.json.JSONObject) r1)     // Catch:{ ClassNotFoundException -> 0x0089, JSONException -> 0x0082 }
            return r0
        L_0x0082:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException     // Catch:{ Exception -> 0x028e }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x028e }
            throw r1     // Catch:{ Exception -> 0x028e }
        L_0x0089:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException     // Catch:{ Exception -> 0x028e }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x028e }
            throw r1     // Catch:{ Exception -> 0x028e }
        L_0x0090:
            r2 = 0
            goto L_0x00a1
        L_0x0092:
            java.lang.Class[] r2 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x028e }
            java.lang.reflect.Constructor r2 = r0.getDeclaredConstructor(r2)     // Catch:{ Exception -> 0x028e }
            r2.setAccessible(r8)     // Catch:{ Exception -> 0x028e }
            java.lang.Object[] r5 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x028e }
            java.lang.Object r2 = r2.newInstance(r5)     // Catch:{ Exception -> 0x028e }
        L_0x00a1:
            java.lang.reflect.Field[] r5 = r19.getDeclaredFields()
            if (r4 == 0) goto L_0x00c2
            boolean r4 = r4.extendsClass()
            if (r4 == 0) goto L_0x00c2
            int r4 = r5.length
            java.lang.Class r0 = r19.getSuperclass()
            java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
            int r6 = r0.length
            int r11 = r4 + r6
            java.lang.reflect.Field[] r11 = new java.lang.reflect.Field[r11]
            java.lang.System.arraycopy(r5, r10, r11, r10, r4)
            java.lang.System.arraycopy(r0, r10, r11, r4, r6)
            r5 = r11
        L_0x00c2:
            int r0 = r5.length
            r4 = 0
        L_0x00c4:
            if (r4 >= r0) goto L_0x028d
            r6 = r5[r4]
            int r11 = r6.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r11)
            if (r12 != 0) goto L_0x0286
            boolean r11 = java.lang.reflect.Modifier.isTransient(r11)
            if (r11 == 0) goto L_0x00da
            goto L_0x0286
        L_0x00da:
            java.lang.String r11 = com.startapp.h4.a(r6)
            boolean r12 = r1.has(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r12 == 0) goto L_0x0286
            r6.setAccessible(r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.annotation.Annotation[] r12 = r6.getDeclaredAnnotations()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            int r12 = r12.length     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r12 <= 0) goto L_0x011f
            java.lang.annotation.Annotation[] r12 = r6.getDeclaredAnnotations()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r12 = r12[r10]     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r13 = r12.annotationType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class<com.startapp.d9> r14 = com.startapp.d9.class
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r13 == 0) goto L_0x011f
            com.startapp.d9 r12 = (com.startapp.d9) r12     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r13 = r12.type()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r14 = r12.key()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r15 = r12.value()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            boolean r16 = r12.complex()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r17 = r12.innerValue()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r12 = r12.parser()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r8 = r17
            r18 = 1
            goto L_0x0128
        L_0x011f:
            r12 = r3
            r8 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
        L_0x0128:
            java.lang.Class r10 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class<com.startapp.c9> r9 = com.startapp.c9.class
            java.lang.annotation.Annotation r9 = r10.getAnnotation(r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r9 == 0) goto L_0x0173
            java.lang.Class r8 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class<com.startapp.c9> r9 = com.startapp.c9.class
            java.lang.annotation.Annotation r8 = r8.getAnnotation(r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            com.startapp.c9 r8 = (com.startapp.c9) r8     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            org.json.JSONObject r9 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.String r10 = r8.decider()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.String r9 = r9.getString(r10)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.String r8 = r8.packageName()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r10.<init>()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r10.append(r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r10.append(r7)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r10.append(r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.String r8 = r10.toString()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            org.json.JSONObject r9 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Object r8 = a(r8, (org.json.JSONObject) r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x0173:
            if (r12 == r3) goto L_0x018c
            java.lang.Object r8 = r12.newInstance()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            com.startapp.e9 r8 = (com.startapp.e9) r8     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r9 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Object r10 = r1.opt(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Object r8 = r8.parse(r9, r10)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x018c:
            if (r16 == 0) goto L_0x019f
            java.lang.Class r8 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            org.json.JSONObject r9 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Object r8 = a(r8, (org.json.JSONObject) r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x019f:
            if (r18 == 0) goto L_0x021e
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r9 = r9.isAssignableFrom(r13)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r9 != 0) goto L_0x01b1
            java.lang.Class<java.util.Collection> r9 = java.util.Collection.class
            boolean r9 = r9.isAssignableFrom(r13)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r9 == 0) goto L_0x021e
        L_0x01b1:
            java.lang.Class<java.util.HashMap> r9 = java.util.HashMap.class
            boolean r9 = r13.equals(r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r9 == 0) goto L_0x01ca
            org.json.JSONObject r9 = r1.getJSONObject(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.util.Iterator r10 = r9.keys()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.util.Map r8 = a(r14, r15, r8, r9, r10)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x01ca:
            java.lang.Class<java.util.ArrayList> r8 = java.util.ArrayList.class
            boolean r8 = r13.equals(r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r8 == 0) goto L_0x01df
            org.json.JSONArray r8 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.util.List r8 = a((java.lang.Class) r15, (org.json.JSONArray) r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x01df:
            java.lang.Class<java.util.HashSet> r8 = java.util.HashSet.class
            boolean r8 = r13.equals(r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r8 == 0) goto L_0x01f4
            org.json.JSONArray r8 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.util.Set r8 = b(r15, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x01f4:
            java.lang.Class<java.util.EnumSet> r8 = java.util.EnumSet.class
            boolean r8 = r13.equals(r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r8 == 0) goto L_0x0286
            org.json.JSONArray r8 = r1.getJSONArray(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r9.<init>()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r10 = 0
        L_0x0206:
            int r11 = r8.length()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r10 >= r11) goto L_0x021a
            java.lang.String r11 = r8.getString(r10)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Enum r11 = java.lang.Enum.valueOf(r15, r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r9.add(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            int r10 = r10 + 1
            goto L_0x0206
        L_0x021a:
            r6.set(r2, r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x021e:
            java.lang.Class r8 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            boolean r8 = r8.isEnum()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r8 == 0) goto L_0x0236
            java.lang.Object r8 = r1.get(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Enum r8 = java.lang.Enum.valueOf(r13, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x0236:
            java.lang.Class r8 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            boolean r8 = r8.isPrimitive()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r8 == 0) goto L_0x0250
            java.lang.Object r8 = r1.get(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r9 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Object r8 = a(r1, r6, r8, r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x0250:
            java.lang.Class r8 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            boolean r8 = r8.isArray()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            if (r8 == 0) goto L_0x0262
            java.lang.Object r8 = a(r1, r13, r6)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            goto L_0x0286
        L_0x0262:
            java.lang.Object r8 = r1.get(r11)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Class r9 = r6.getType()     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            java.lang.Object r8 = a((java.lang.Object) r8, (java.lang.Class<?>) r9)     // Catch:{ Exception -> 0x0286, all -> 0x027d }
            r9 = 0
            boolean r10 = r8.equals(r9)     // Catch:{ Exception -> 0x0287, all -> 0x027d }
            if (r10 == 0) goto L_0x0279
            r6.set(r2, r9)     // Catch:{ Exception -> 0x0287, all -> 0x027d }
            goto L_0x0287
        L_0x0279:
            r6.set(r2, r8)     // Catch:{ Exception -> 0x0287, all -> 0x027d }
            goto L_0x0287
        L_0x027d:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException
            java.lang.String r2 = "Unknown error occurred "
            r1.<init>(r2, r0)
            throw r1
        L_0x0286:
            r9 = 0
        L_0x0287:
            int r4 = r4 + 1
            r8 = 1
            r10 = 0
            goto L_0x00c4
        L_0x028d:
            return r2
        L_0x028e:
            r0 = move-exception
            com.startapp.common.parser.JSONStreamException r1 = new com.startapp.common.parser.JSONStreamException
            java.lang.String r2 = "Can't deserialize the object. Failed to instantiate object."
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.e4.a(java.lang.Class, org.json.JSONObject):java.lang.Object");
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) throws JSONException, JSONStreamException {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                hashSet.add(jSONArray.get(i10));
            } else {
                hashSet.add(a(cls, optJSONObject));
            }
        }
        return hashSet;
    }

    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) throws JSONStreamException, JSONException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException, IllegalArgumentException, NoSuchFieldException {
        Object obj;
        Class<Character> cls2 = Character.class;
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(h4.a(field));
            int length = jSONArray.length();
            Object newInstance = Array.newInstance(cls, length);
            for (int i10 = 0; i10 < length; i10++) {
                Array.set(newInstance, i10, a(cls, jSONArray.getJSONObject(i10)));
            }
            return (Object[]) newInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(h4.a(field));
        int length2 = jSONArray2.length();
        Class<?> type = field.getType();
        Class cls3 = (Class) ((HashMap) f15778a).get(type.getSimpleName());
        Object newInstance2 = Array.newInstance((Class) cls3.getField("TYPE").get((Object) null), length2);
        for (int i11 = 0; i11 < length2; i11++) {
            String string = jSONArray2.getString(i11);
            Class<String> cls4 = String.class;
            if (cls3.equals(cls2)) {
                cls4 = Character.TYPE;
            }
            Constructor constructor = cls3.getConstructor(new Class[]{cls4});
            if (cls3.equals(cls2)) {
                obj = constructor.newInstance(new Object[]{Character.valueOf(string.charAt(0))});
            } else {
                obj = constructor.newInstance(new Object[]{string});
            }
            Array.set(newInstance2, i11, obj);
        }
        return newInstance2;
    }

    public static <K, V> Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) throws JSONException, JSONStreamException {
        HashMap hashMap = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object cast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                cast = Enum.valueOf(cls, cast.toString());
            }
            String str = (String) next;
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject == null) {
                JSONArray optJSONArray = jSONObject.optJSONArray(str);
                if (optJSONArray != null) {
                    hashMap.put(cast, b(cls3, optJSONArray));
                } else if (cls2.isEnum()) {
                    hashMap.put(cast, Enum.valueOf(cls2, (String) jSONObject.get(str)));
                } else {
                    hashMap.put(cast, jSONObject.get(str));
                }
            } else {
                hashMap.put(cast, a(cls2, optJSONObject));
            }
        }
        return hashMap;
    }

    public static <V> List a(Class cls, JSONArray jSONArray) throws JSONException, JSONStreamException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i10);
            if (optJSONObject == null) {
                arrayList.add(jSONArray.get(i10));
            } else {
                arrayList.add(a(cls, optJSONObject));
            }
        }
        return arrayList;
    }

    public static Object a(Object obj, Class<?> cls) {
        Class<Long> cls2 = Long.class;
        Class<Integer> cls3 = Integer.class;
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (!cls.equals(cls3)) {
            return (!cls.equals(cls2) || !obj.getClass().equals(cls3)) ? obj : Long.valueOf(((Integer) obj).longValue());
        }
        if (obj.getClass().equals(Double.class)) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (obj.getClass().equals(cls2)) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        return obj;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) throws JSONException {
        if (obj.getClass().equals(cls)) {
            return obj;
        }
        if (obj.getClass().equals(String.class)) {
            if (cls.equals(Integer.TYPE)) {
                return Integer.valueOf(jSONObject.getInt(h4.a(field)));
            }
            return obj;
        } else if (cls.equals(Integer.TYPE)) {
            return Integer.valueOf(((Number) obj).intValue());
        } else {
            if (cls.equals(Float.TYPE)) {
                return Float.valueOf(((Number) obj).floatValue());
            }
            if (cls.equals(Long.TYPE)) {
                return Long.valueOf(((Number) obj).longValue());
            }
            return cls.equals(Double.TYPE) ? Double.valueOf(((Number) obj).doubleValue()) : obj;
        }
    }
}
