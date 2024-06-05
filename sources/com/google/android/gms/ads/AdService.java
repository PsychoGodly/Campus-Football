package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzbnc;
import com.google.android.gms.internal.ads.zzbza;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        try {
            x.a().k(this, new zzbnc()).zze(intent);
        } catch (RemoteException e10) {
            zzbza.zzg("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }
}
