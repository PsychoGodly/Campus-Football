package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzady  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzady extends BroadcastReceiver {
    private final String zza;
    private final /* synthetic */ zzadu zzb;

    public zzady(zzadu zzadu, String str) {
        this.zzb = zzadu;
        this.zza = str;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).w() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                zzaeb zzaeb = (zzaeb) this.zzb.zzd.get(this.zza);
                if (zzaeb == null) {
                    zzadu.zza.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String zza2 = zzadu.zza(str);
                    zzaeb.zze = zza2;
                    if (zza2 == null) {
                        zzadu.zza.c("Unable to extract verification code.", new Object[0]);
                    } else if (!zzag.zzc(zzaeb.zzd)) {
                        zzadu.zza(this.zzb, this.zza);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
