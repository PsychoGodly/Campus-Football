package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzari extends zzasm {
    private final Activity zzi;
    private final View zzj;

    public zzari(zzaqx zzaqx, String str, String str2, zzamv zzamv, int i10, int i11, View view, Activity activity) {
        super(zzaqx, "igtIy1RPdtSwwFM0MzyB8nIIZ5v2CDGgVI3q8yVZqtR6IDXyW0WRS0Qe3gwz+vAY", "frdByYsbmru5qm4CvqXIK0tqT/G3yjsT+PIiwI69Mdg=", zzamv, i10, 62);
        this.zzj = view;
        this.zzi = activity;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzj != null) {
            boolean booleanValue = ((Boolean) a0.c().zzb(zzbar.zzci)).booleanValue();
            Object[] objArr = (Object[]) this.zzf.invoke((Object) null, new Object[]{this.zzj, this.zzi, Boolean.valueOf(booleanValue)});
            synchronized (this.zze) {
                this.zze.zzc(((Long) objArr[0]).longValue());
                this.zze.zze(((Long) objArr[1]).longValue());
                if (booleanValue) {
                    this.zze.zzd((String) objArr[2]);
                }
            }
        }
    }
}
