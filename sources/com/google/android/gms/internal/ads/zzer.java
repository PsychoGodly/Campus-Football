package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzer implements zzdu {
    private Message zza;
    private zzes zzb;

    private zzer() {
    }

    /* synthetic */ zzer(zzeq zzeq) {
    }

    private final void zzd() {
        this.zza = null;
        this.zzb = null;
        zzes.zzl(this);
    }

    public final void zza() {
        Message message = this.zza;
        Objects.requireNonNull(message);
        message.sendToTarget();
        zzd();
    }

    public final zzer zzb(Message message, zzes zzes) {
        this.zza = message;
        this.zzb = zzes;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        Objects.requireNonNull(message);
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        zzd();
        return sendMessageAtFrontOfQueue;
    }
}
