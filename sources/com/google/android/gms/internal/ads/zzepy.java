package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzepy implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzepy(zzfuu zzfuu, Context context) {
        this.zza = zzfuu;
        this.zzb = context;
    }

    public final int zza() {
        return 39;
    }

    public final zzfut zzb() {
        return this.zza.zzb(new zzepx(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepw zzc() throws Exception {
        int i10;
        boolean z10;
        int i11;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        t.r();
        int i12 = -1;
        if (b2.V(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i11 = type;
                i12 = ordinal;
            } else {
                i11 = -1;
            }
            z10 = connectivityManager.isActiveNetworkMetered();
            i10 = i12;
        } else {
            i11 = -2;
            z10 = false;
            i10 = -1;
        }
        return new zzepw(networkOperator, i11, t.s().k(this.zzb), phoneType, z10, i10);
    }
}
