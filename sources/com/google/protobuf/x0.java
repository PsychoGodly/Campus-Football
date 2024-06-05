package com.google.protobuf;

import com.applovin.mediation.MaxReward;
import com.google.protobuf.z;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: MessageLiteToString */
final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f27272a;

    static {
        char[] cArr = new char[80];
        f27272a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            char[] cArr = f27272a;
            int length = i10 > cArr.length ? cArr.length : i10;
            sb2.append(cArr, 0, length);
            i10 -= length;
        }
    }

    private static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            if (((Integer) obj).intValue() == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Float) {
            if (Float.floatToRawIntBits(((Float) obj).floatValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof Double) {
            if (Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0) {
                return true;
            }
            return false;
        } else if (obj instanceof String) {
            return obj.equals(MaxReward.DEFAULT_LABEL);
        } else {
            if (obj instanceof i) {
                return obj.equals(i.f27039b);
            }
            if (obj instanceof v0) {
                if (obj == ((v0) obj).a()) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Enum) || ((Enum) obj).ordinal() != 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    private static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Character.toLowerCase(str.charAt(0)));
        for (int i10 = 1; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(charAt));
        }
        return sb2.toString();
    }

    static void d(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object d10 : (List) obj) {
                d(sb2, i10, str, d10);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry d11 : ((Map) obj).entrySet()) {
                d(sb2, i10, str, d11);
            }
        } else {
            sb2.append(10);
            a(i10, sb2);
            sb2.append(c(str));
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(s1.c((String) obj));
                sb2.append('\"');
            } else if (obj instanceof i) {
                sb2.append(": \"");
                sb2.append(s1.a((i) obj));
                sb2.append('\"');
            } else if (obj instanceof z) {
                sb2.append(" {");
                e((z) obj, sb2, i10 + 2);
                sb2.append("\n");
                a(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i11 = i10 + 2;
                d(sb2, i11, "key", entry.getKey());
                d(sb2, i11, "value", entry.getValue());
                sb2.append("\n");
                a(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void e(v0 v0Var, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        v0 v0Var2 = v0Var;
        StringBuilder sb3 = sb2;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = v0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method3 = declaredMethods[i13];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i11);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                d(sb3, i12, substring.substring(0, substring.length() - 4), z.K(method2, v0Var2, new Object[0]));
            } else if (!substring.endsWith("Map") || substring.equals("Map") || (method = (Method) entry.getValue()) == null || !method.getReturnType().equals(Map.class) || method.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method.getModifiers())) {
                if (hashSet.contains("set" + substring)) {
                    if (substring.endsWith("Bytes")) {
                        if (treeMap.containsKey("get" + substring.substring(0, substring.length() - 5))) {
                        }
                    }
                    Method method4 = (Method) entry.getValue();
                    Method method5 = (Method) hashMap.get("has" + substring);
                    if (method4 != null) {
                        Object K = z.K(method4, v0Var2, new Object[0]);
                        if (method5 == null) {
                            z10 = !b(K);
                        } else {
                            z10 = ((Boolean) z.K(method5, v0Var2, new Object[0])).booleanValue();
                        }
                        if (z10) {
                            d(sb3, i12, substring, K);
                        }
                    }
                }
            } else {
                d(sb3, i12, substring.substring(0, substring.length() - 3), z.K(method, v0Var2, new Object[0]));
            }
            i11 = 3;
        }
        if (v0Var2 instanceof z.c) {
            Iterator<Map.Entry<z.d, Object>> t10 = ((z.c) v0Var2).extensions.t();
            while (t10.hasNext()) {
                Map.Entry next = t10.next();
                d(sb3, i12, "[" + ((z.d) next.getKey()).I() + "]", next.getValue());
            }
        }
        w1 w1Var = ((z) v0Var2).unknownFields;
        if (w1Var != null) {
            w1Var.m(sb3, i12);
        }
    }

    static String f(v0 v0Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        e(v0Var, sb2, 0);
        return sb2.toString();
    }
}
