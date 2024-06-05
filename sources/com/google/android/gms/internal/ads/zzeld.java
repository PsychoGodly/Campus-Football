package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeld implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    zzeld(zzfuu zzfuu, Context context) {
        this.zza = zzfuu;
        this.zzb = context;
    }

    public final int zza() {
        return 14;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzelc(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzele zzc() throws Exception {
        Intent intent;
        double d10;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) a0.c().zzb(zzbar.zzjn)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            intent = this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter);
        } else {
            intent = this.zzb.registerReceiver((BroadcastReceiver) null, intentFilter, 4);
        }
        boolean z10 = false;
        if (intent != null) {
            int intExtra = intent.getIntExtra("status", -1);
            double intExtra2 = (double) intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
            double intExtra3 = (double) intent.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z10 = true;
            }
            d10 = intExtra2 / intExtra3;
        } else {
            d10 = -1.0d;
        }
        return new zzele(d10, z10);
    }
}
