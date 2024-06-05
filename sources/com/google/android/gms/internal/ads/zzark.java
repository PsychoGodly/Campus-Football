package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzark extends zzasm {
    public zzark(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11) {
        super(zzaqx, "/ZAb7KorQmWKePlIS1me8K7MD7h0ktYv6a7eQSuPpVWqAkHhSCd1Ee0//urPm/Fl", "19q79G2Hoay9HG8W07mTTjUi2VQ2m7mmzg4dFY+yKc8=", zzamv, i10, 49);
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzaa(3);
        try {
            int i10 = 1;
            boolean booleanValue = ((Boolean) this.zzf.invoke((Object) null, new Object[]{this.zzb.zzb()})).booleanValue();
            zzamv zzamv = this.zze;
            if (true == booleanValue) {
                i10 = 2;
            }
            zzamv.zzaa(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
