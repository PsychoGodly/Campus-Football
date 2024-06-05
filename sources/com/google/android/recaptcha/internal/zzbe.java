package com.google.android.recaptcha.internal;

import fe.p;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzbe extends zzbd implements zzbi {
    private final p zza;
    private final String zzb;

    public zzbe(p pVar, String str, Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (!m.a(method.getName(), this.zzb)) {
            return false;
        }
        zzmk zzf = zzmn.zzf();
        if (objArr != null) {
            list = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzml zzf2 = zzmm.zzf();
                zzf2.zzv(obj2.toString());
                list.add((zzmm) zzf2.zzj());
            }
        } else {
            list = q.d();
        }
        zzf.zzd(list);
        p pVar = this.zza;
        byte[] zzd = ((zzmn) zzf.zzj()).zzd();
        pVar.invoke(objArr, zzeb.zzh().zzi(zzd, 0, zzd.length));
        return true;
    }
}
