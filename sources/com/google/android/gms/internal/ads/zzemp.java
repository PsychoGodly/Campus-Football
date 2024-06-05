package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.gms.ads.internal.client.a0;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzemp implements zzepn {
    private final zzfuu zza;
    private final ViewGroup zzb;
    private final Context zzc;
    private final Set zzd;

    public zzemp(zzfuu zzfuu, ViewGroup viewGroup, Context context, Set set) {
        this.zza = zzfuu;
        this.zzd = set;
        this.zzb = viewGroup;
        this.zzc = context;
    }

    public final int zza() {
        return 22;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzemo(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzemq zzc() throws Exception {
        if (((Boolean) a0.c().zzb(zzbar.zzfv)).booleanValue() && this.zzb != null && this.zzd.contains("banner")) {
            return new zzemq(Boolean.valueOf(this.zzb.isHardwareAccelerated()));
        }
        Boolean bool = null;
        if (((Boolean) a0.c().zzb(zzbar.zzfw)).booleanValue() && this.zzd.contains("native")) {
            Context context = this.zzc;
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                Window window = activity.getWindow();
                if (window == null || (window.getAttributes().flags & 16777216) == 0) {
                    try {
                        boolean z10 = false;
                        if ((activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).flags & 512) != 0) {
                            z10 = true;
                        }
                        bool = Boolean.valueOf(z10);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                } else {
                    bool = Boolean.TRUE;
                }
                return new zzemq(bool);
            }
        }
        return new zzemq((Boolean) null);
    }
}
