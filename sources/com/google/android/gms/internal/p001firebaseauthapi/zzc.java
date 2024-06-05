package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.a;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzc extends a {
    @Deprecated
    public static Intent zza(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (!zza.zza()) {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, zza.zza() ? 2 : 0);
    }
}
