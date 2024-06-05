package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import ne.c;
import td.e0;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcg implements zzby {
    public static final zzcg zza = new zzcg();

    private zzcg() {
    }

    private final Object zzb(Object obj, Object obj2) throws zzt, ArithmeticException {
        boolean z10 = obj instanceof Byte;
        if (z10 && (obj2 instanceof Byte)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z11 = obj instanceof Short;
        if (z11 && (obj2 instanceof Short)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z12 = obj instanceof Integer;
        if (z12 && (obj2 instanceof Integer)) {
            return Integer.valueOf(((Number) obj).intValue() % ((Number) obj2).intValue());
        }
        boolean z13 = obj instanceof Long;
        if (z13 && (obj2 instanceof Long)) {
            return Long.valueOf(((Number) obj).longValue() % ((Number) obj2).longValue());
        }
        boolean z14 = obj instanceof Float;
        if (z14 && (obj2 instanceof Float)) {
            return Float.valueOf(((Number) obj).floatValue() % ((Number) obj2).floatValue());
        }
        boolean z15 = obj instanceof Double;
        if (z15 && (obj2 instanceof Double)) {
            return Double.valueOf(((Number) obj).doubleValue() % ((Number) obj2).doubleValue());
        }
        int i10 = 0;
        if (obj instanceof String) {
            if (obj2 instanceof Byte) {
                byte[] bytes = ((String) obj).getBytes(c.f36512b);
                int length = bytes.length;
                ArrayList arrayList = new ArrayList(length);
                while (i10 < length) {
                    arrayList.add(Byte.valueOf((byte) (bytes[i10] % ((Number) obj2).intValue())));
                    i10++;
                }
                return new String(y.I(arrayList), c.f36512b);
            } else if (obj2 instanceof Integer) {
                char[] charArray = ((String) obj).toCharArray();
                int length2 = charArray.length;
                ArrayList arrayList2 = new ArrayList(length2);
                while (i10 < length2) {
                    arrayList2.add(Integer.valueOf(charArray[i10] % ((Number) obj2).intValue()));
                    i10++;
                }
                return (Serializable) y.K(arrayList2);
            }
        }
        if (z10 && (obj2 instanceof byte[])) {
            ArrayList arrayList3 = new ArrayList(r0);
            for (byte intValue : (byte[]) obj2) {
                arrayList3.add(Integer.valueOf(intValue % ((Number) obj).intValue()));
            }
            return (Serializable) arrayList3.toArray(new Integer[0]);
        } else if (z11 && (obj2 instanceof short[])) {
            ArrayList arrayList4 = new ArrayList(r0);
            for (short intValue2 : (short[]) obj2) {
                arrayList4.add(Integer.valueOf(intValue2 % ((Number) obj).intValue()));
            }
            return (Serializable) arrayList4.toArray(new Integer[0]);
        } else if (z12 && (obj2 instanceof int[])) {
            ArrayList arrayList5 = new ArrayList(r0);
            for (int intValue3 : (int[]) obj2) {
                arrayList5.add(Integer.valueOf(intValue3 % ((Number) obj).intValue()));
            }
            return (Serializable) arrayList5.toArray(new Integer[0]);
        } else if (z13 && (obj2 instanceof long[])) {
            ArrayList arrayList6 = new ArrayList(r0);
            for (long longValue : (long[]) obj2) {
                arrayList6.add(Long.valueOf(longValue % ((Number) obj).longValue()));
            }
            return (Serializable) arrayList6.toArray(new Long[0]);
        } else if (z14 && (obj2 instanceof float[])) {
            ArrayList arrayList7 = new ArrayList(r0);
            for (float floatValue : (float[]) obj2) {
                arrayList7.add(Float.valueOf(floatValue % ((Number) obj).floatValue()));
            }
            return (Serializable) arrayList7.toArray(new Float[0]);
        } else if (!z15 || !(obj2 instanceof double[])) {
            boolean z16 = obj instanceof byte[];
            if (!z16 || !(obj2 instanceof Byte)) {
                boolean z17 = obj instanceof short[];
                if (!z17 || !(obj2 instanceof Short)) {
                    boolean z18 = obj instanceof int[];
                    if (!z18 || !(obj2 instanceof Integer)) {
                        boolean z19 = obj instanceof long[];
                        if (!z19 || !(obj2 instanceof Long)) {
                            boolean z20 = obj instanceof float[];
                            if (!z20 || !(obj2 instanceof Float)) {
                                boolean z21 = obj instanceof double[];
                                if (z21 && (obj2 instanceof Double)) {
                                    ArrayList arrayList8 = new ArrayList(r0);
                                    for (double doubleValue : (double[]) obj) {
                                        arrayList8.add(Double.valueOf(doubleValue % ((Number) obj2).doubleValue()));
                                    }
                                    return (Serializable) arrayList8.toArray(new Double[0]);
                                } else if (z16 && (obj2 instanceof byte[])) {
                                    byte[] bArr = (byte[]) obj;
                                    int length3 = bArr.length;
                                    byte[] bArr2 = (byte[]) obj2;
                                    zzbx.zzb(this, length3, bArr2.length);
                                    ke.c i11 = i.i(0, length3);
                                    ArrayList arrayList9 = new ArrayList(r.j(i11, 10));
                                    Iterator it = i11.iterator();
                                    while (it.hasNext()) {
                                        int a10 = ((e0) it).a();
                                        arrayList9.add(Integer.valueOf(bArr[a10] % bArr2[a10]));
                                    }
                                    return (Serializable) arrayList9.toArray(new Integer[0]);
                                } else if (z17 && (obj2 instanceof short[])) {
                                    short[] sArr = (short[]) obj;
                                    int length4 = sArr.length;
                                    short[] sArr2 = (short[]) obj2;
                                    zzbx.zzb(this, length4, sArr2.length);
                                    ke.c i12 = i.i(0, length4);
                                    ArrayList arrayList10 = new ArrayList(r.j(i12, 10));
                                    Iterator it2 = i12.iterator();
                                    while (it2.hasNext()) {
                                        int a11 = ((e0) it2).a();
                                        arrayList10.add(Integer.valueOf(sArr[a11] % sArr2[a11]));
                                    }
                                    return (Serializable) arrayList10.toArray(new Integer[0]);
                                } else if (z18 && (obj2 instanceof int[])) {
                                    int[] iArr = (int[]) obj;
                                    int length5 = iArr.length;
                                    int[] iArr2 = (int[]) obj2;
                                    zzbx.zzb(this, length5, iArr2.length);
                                    ke.c i13 = i.i(0, length5);
                                    ArrayList arrayList11 = new ArrayList(r.j(i13, 10));
                                    Iterator it3 = i13.iterator();
                                    while (it3.hasNext()) {
                                        int a12 = ((e0) it3).a();
                                        arrayList11.add(Integer.valueOf(iArr[a12] % iArr2[a12]));
                                    }
                                    return (Serializable) arrayList11.toArray(new Integer[0]);
                                } else if (z19 && (obj2 instanceof long[])) {
                                    long[] jArr = (long[]) obj;
                                    int length6 = jArr.length;
                                    long[] jArr2 = (long[]) obj2;
                                    zzbx.zzb(this, length6, jArr2.length);
                                    ke.c i14 = i.i(0, length6);
                                    ArrayList arrayList12 = new ArrayList(r.j(i14, 10));
                                    Iterator it4 = i14.iterator();
                                    while (it4.hasNext()) {
                                        int a13 = ((e0) it4).a();
                                        arrayList12.add(Long.valueOf(jArr[a13] % jArr2[a13]));
                                    }
                                    return (Serializable) arrayList12.toArray(new Long[0]);
                                } else if (z20 && (obj2 instanceof float[])) {
                                    float[] fArr = (float[]) obj;
                                    int length7 = fArr.length;
                                    float[] fArr2 = (float[]) obj2;
                                    zzbx.zzb(this, length7, fArr2.length);
                                    ke.c i15 = i.i(0, length7);
                                    ArrayList arrayList13 = new ArrayList(r.j(i15, 10));
                                    Iterator it5 = i15.iterator();
                                    while (it5.hasNext()) {
                                        int a14 = ((e0) it5).a();
                                        arrayList13.add(Float.valueOf(fArr[a14] % fArr2[a14]));
                                    }
                                    return (Serializable) arrayList13.toArray(new Float[0]);
                                } else if (!z21 || !(obj2 instanceof double[])) {
                                    throw new zzt(4, 5, (Throwable) null);
                                } else {
                                    double[] dArr = (double[]) obj;
                                    int length8 = dArr.length;
                                    double[] dArr2 = (double[]) obj2;
                                    zzbx.zzb(this, length8, dArr2.length);
                                    ke.c i16 = i.i(0, length8);
                                    ArrayList arrayList14 = new ArrayList(r.j(i16, 10));
                                    Iterator it6 = i16.iterator();
                                    while (it6.hasNext()) {
                                        int a15 = ((e0) it6).a();
                                        arrayList14.add(Double.valueOf(dArr[a15] % dArr2[a15]));
                                    }
                                    return (Serializable) arrayList14.toArray(new Double[0]);
                                }
                            } else {
                                ArrayList arrayList15 = new ArrayList(r0);
                                for (float floatValue2 : (float[]) obj) {
                                    arrayList15.add(Float.valueOf(floatValue2 % ((Number) obj2).floatValue()));
                                }
                                return (Serializable) arrayList15.toArray(new Float[0]);
                            }
                        } else {
                            ArrayList arrayList16 = new ArrayList(r0);
                            for (long longValue2 : (long[]) obj) {
                                arrayList16.add(Long.valueOf(longValue2 % ((Number) obj2).longValue()));
                            }
                            return (Serializable) arrayList16.toArray(new Long[0]);
                        }
                    } else {
                        int[] iArr3 = (int[]) obj;
                        int length9 = iArr3.length;
                        ArrayList arrayList17 = new ArrayList(length9);
                        while (i10 < length9) {
                            arrayList17.add(Integer.valueOf(iArr3[i10] % ((Number) obj2).intValue()));
                            i10++;
                        }
                        return (Serializable) y.K(arrayList17);
                    }
                } else {
                    ArrayList arrayList18 = new ArrayList(r0);
                    for (short intValue4 : (short[]) obj) {
                        arrayList18.add(Integer.valueOf(intValue4 % ((Number) obj2).intValue()));
                    }
                    return (Serializable) arrayList18.toArray(new Integer[0]);
                }
            } else {
                ArrayList arrayList19 = new ArrayList(r0);
                for (byte intValue5 : (byte[]) obj) {
                    arrayList19.add(Integer.valueOf(intValue5 % ((Number) obj2).intValue()));
                }
                return (Serializable) arrayList19.toArray(new Integer[0]);
            }
        } else {
            ArrayList arrayList20 = new ArrayList(r0);
            for (double doubleValue2 : (double[]) obj2) {
                arrayList20.add(Double.valueOf(doubleValue2 % ((Number) obj).doubleValue()));
            }
            return (Serializable) arrayList20.toArray(new Double[0]);
        }
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        if (objArr.length == 2) {
            Object obj = objArr[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                Object obj2 = objArr[1];
                if (true != (obj2 instanceof Object)) {
                    obj2 = null;
                }
                if (obj2 != null) {
                    try {
                        zzbl.zzc().zzf(i10, zzb(obj, obj2));
                    } catch (ArithmeticException e10) {
                        throw new zzt(4, 6, e10);
                    }
                } else {
                    throw new zzt(4, 5, (Throwable) null);
                }
            } else {
                throw new zzt(4, 5, (Throwable) null);
            }
        } else {
            throw new zzt(4, 3, (Throwable) null);
        }
    }
}
