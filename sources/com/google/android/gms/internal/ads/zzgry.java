package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgry {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    static String zza(zzgrw zzgrw, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzgrw, sb2, 0);
        return sb2.toString();
    }

    static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            for (Object zzb : (List) obj) {
                zzb(sb2, i10, str, zzb);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry zzb2 : ((Map) obj).entrySet()) {
                zzb(sb2, i10, str, zzb2);
            }
        } else {
            sb2.append(10);
            zzc(i10, sb2);
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(Character.toLowerCase(str.charAt(0)));
                for (int i11 = 1; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (Character.isUpperCase(charAt)) {
                        sb3.append("_");
                    }
                    sb3.append(Character.toLowerCase(charAt));
                }
                str = sb3.toString();
            }
            sb2.append(str);
            if (obj instanceof String) {
                sb2.append(": \"");
                sb2.append(zzgte.zza(zzgpe.zzx((String) obj)));
                sb2.append('\"');
            } else if (obj instanceof zzgpe) {
                sb2.append(": \"");
                sb2.append(zzgte.zza((zzgpe) obj));
                sb2.append('\"');
            } else if (obj instanceof zzgqm) {
                sb2.append(" {");
                zzd((zzgqm) obj, sb2, i10 + 2);
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else if (obj instanceof Map.Entry) {
                sb2.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i12 = i10 + 2;
                zzb(sb2, i12, "key", entry.getKey());
                zzb(sb2, i12, "value", entry.getValue());
                sb2.append("\n");
                zzc(i10, sb2);
                sb2.append("}");
            } else {
                sb2.append(": ");
                sb2.append(obj);
            }
        }
    }

    private static void zzc(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }

    private static void zzd(zzgrw zzgrw, StringBuilder sb2, int i10) {
        int i11;
        boolean z10;
        Method method;
        Method method2;
        zzgrw zzgrw2 = zzgrw;
        StringBuilder sb3 = sb2;
        int i12 = i10;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzgrw.getClass().getDeclaredMethods();
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
                zzb(sb3, i12, substring.substring(0, substring.length() - 4), zzgqm.zzaP(method2, zzgrw2, new Object[0]));
            } else if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i12, substring.substring(0, substring.length() - 3), zzgqm.zzaP(method, zzgrw2, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object zzaP = zzgqm.zzaP(method4, zzgrw2, new Object[0]);
                    if (method5 == null) {
                        if (zzaP instanceof Boolean) {
                            if (!((Boolean) zzaP).booleanValue()) {
                            }
                        } else if (zzaP instanceof Integer) {
                            if (((Integer) zzaP).intValue() == 0) {
                            }
                        } else if (zzaP instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) zzaP).floatValue()) == 0) {
                            }
                        } else if (!(zzaP instanceof Double)) {
                            if (zzaP instanceof String) {
                                z10 = zzaP.equals(MaxReward.DEFAULT_LABEL);
                            } else if (zzaP instanceof zzgpe) {
                                z10 = zzaP.equals(zzgpe.zzb);
                            } else if (zzaP instanceof zzgrw) {
                                if (zzaP == ((zzgrw) zzaP).zzbf()) {
                                }
                            } else if ((zzaP instanceof Enum) && ((Enum) zzaP).ordinal() == 0) {
                            }
                            if (z10) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) zzaP).doubleValue()) == 0) {
                        }
                    } else if (!((Boolean) zzgqm.zzaP(method5, zzgrw2, new Object[0])).booleanValue()) {
                    }
                    zzb(sb3, i12, substring, zzaP);
                }
            }
            i11 = 3;
        }
        if (!(zzgrw2 instanceof zzgqj)) {
            zzgth zzgth = ((zzgqm) zzgrw2).zzc;
            if (zzgth != null) {
                zzgth.zzi(sb3, i12);
                return;
            }
            return;
        }
        zzgqj zzgqj = (zzgqj) zzgrw2;
        throw null;
    }
}
