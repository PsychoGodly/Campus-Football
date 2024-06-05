package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzcd implements zzby {
    public static final zzcd zza = new zzcd();

    private zzcd() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        Class<?> cls;
        if (objArr.length >= 2) {
            Class<?> cls2 = objArr[0];
            if (true != (cls2 instanceof Object)) {
                cls2 = null;
            }
            if (cls2 != null) {
                if (cls2 instanceof Class) {
                    cls = cls2;
                } else {
                    cls = cls2.getClass();
                }
                String str = objArr[1];
                if (true != (str instanceof String)) {
                    str = null;
                }
                String str2 = str;
                if (str2 != null) {
                    String zza2 = zzbx.zza(this, str2, zzbl.zza());
                    if (!m.a(zza2, "forName")) {
                        List<Object> j10 = m.j(objArr, 2);
                        ArrayList arrayList = new ArrayList(r.j(j10, 10));
                        for (Object zza3 : j10) {
                            arrayList.add(zzbk.zza(zza3));
                        }
                        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
                        try {
                            zzbl.zzc().zzf(i10, cls.getMethod(zza2, (Class[]) Arrays.copyOf(clsArr, clsArr.length)));
                        } catch (Exception e10) {
                            throw new zzt(6, 13, e10);
                        }
                    } else {
                        throw new zzt(6, 48, (Throwable) null);
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
