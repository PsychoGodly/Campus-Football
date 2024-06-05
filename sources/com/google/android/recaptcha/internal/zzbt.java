package com.google.android.recaptcha.internal;

import fe.l;
import java.util.Collection;
import ne.c;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbt implements zzby {
    public static final zzbt zza = new zzbt();

    private zzbt() {
    }

    public final void zza(int i10, zzbl zzbl, Object... objArr) throws zzt {
        String str;
        String str2;
        Object[] objArr2 = objArr;
        if (objArr2.length == 1) {
            Object obj = objArr2[0];
            if (true != (obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                if (obj instanceof int[]) {
                    str = m.F((int[]) obj, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
                } else {
                    if (obj instanceof byte[]) {
                        str2 = new String((byte[]) obj, c.f36512b);
                    } else if (obj instanceof long[]) {
                        str = m.G((long[]) obj, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
                    } else if (obj instanceof short[]) {
                        str = m.I((short[]) obj, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
                    } else if (obj instanceof float[]) {
                        str = m.E((float[]) obj, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
                    } else if (obj instanceof double[]) {
                        str = m.D((double[]) obj, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
                    } else if (obj instanceof char[]) {
                        str2 = new String((char[]) obj);
                    } else if (obj instanceof Object[]) {
                        str = m.H((Object[]) obj, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
                    } else if (obj instanceof Collection) {
                        str = y.y((Iterable) obj, ",", "[", "]", 0, (CharSequence) null, (l) null, 56, (Object) null);
                    } else {
                        throw new zzt(4, 5, (Throwable) null);
                    }
                    str = str2;
                }
                int i11 = i10;
                zzbl.zzc().zzf(i10, str);
                return;
            }
            throw new zzt(4, 5, (Throwable) null);
        }
        throw new zzt(4, 3, (Throwable) null);
    }
}
