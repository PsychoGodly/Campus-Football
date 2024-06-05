package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.e;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgxn extends e {
    private final WeakReference zza;

    public zzgxn(zzbbs zzbbs, byte[] bArr) {
        this.zza = new WeakReference(zzbbs);
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
        zzbbs zzbbs = (zzbbs) this.zza.get();
        if (zzbbs != null) {
            zzbbs.zzc(cVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        zzbbs zzbbs = (zzbbs) this.zza.get();
        if (zzbbs != null) {
            zzbbs.zzd();
        }
    }
}
