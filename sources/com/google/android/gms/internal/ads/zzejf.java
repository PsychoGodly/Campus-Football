package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.t;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzejf implements zzepm {
    public final Context zza;
    public final z4 zzb;
    public final List zzc;

    public zzejf(Context context, z4 z4Var, List list) {
        this.zza = context;
        this.zzb = z4Var;
        this.zzc = list;
    }

    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzbcp.zza.zze()).booleanValue()) {
            Bundle bundle2 = new Bundle();
            t.r();
            String str = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null) {
                    List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                    if (!(runningTasks == null || runningTasks.isEmpty() || (runningTaskInfo = runningTasks.get(0)) == null || (componentName = runningTaskInfo.topActivity) == null)) {
                        str = componentName.getClassName();
                    }
                }
            } catch (Exception unused) {
            }
            bundle2.putString("activity", str);
            Bundle bundle3 = new Bundle();
            bundle3.putInt("width", this.zzb.f14650f);
            bundle3.putInt("height", this.zzb.f14647b);
            bundle2.putBundle("size", bundle3);
            if (!this.zzc.isEmpty()) {
                List list = this.zzc;
                bundle2.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle.putBundle("view_hierarchy", bundle2);
        }
    }
}
