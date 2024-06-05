package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzgi;
import com.google.android.recaptcha.internal.zzgo;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public class zzgi<MessageType extends zzgo<MessageType, BuilderType>, BuilderType extends zzgi<MessageType, BuilderType>> extends zzeh<MessageType, BuilderType> {
    protected zzgo zza;
    private final zzgo zzb;

    protected zzgi(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzF()) {
            this.zza = messagetype.zzs();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zzd(Object obj, Object obj2) {
        zzih.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    public final /* synthetic */ zzhy zzX() {
        return this.zzb;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ zzeh zzb(zzei zzei) {
        zzg((zzgo) zzei);
        return this;
    }

    /* renamed from: zzf */
    public final zzgi zza() {
        zzgi zzgi = (zzgi) this.zzb.zzh(5, (Object) null, (Object) null);
        zzgi.zza = zzk();
        return zzgi;
    }

    public final zzgi zzg(zzgo zzgo) {
        if (!this.zzb.equals(zzgo)) {
            if (!this.zza.zzF()) {
                zzn();
            }
            zzd(this.zza, zzgo);
        }
        return this;
    }

    /* renamed from: zzh */
    public final MessageType zzj() {
        MessageType zzi = zzk();
        if (zzi.zzo()) {
            return zzi;
        }
        throw new zzje(zzi);
    }

    /* renamed from: zzi */
    public MessageType zzk() {
        if (!this.zza.zzF()) {
            return this.zza;
        }
        this.zza.zzA();
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        if (!this.zza.zzF()) {
            zzn();
        }
    }

    /* access modifiers changed from: protected */
    public void zzn() {
        zzgo zzs = this.zzb.zzs();
        zzd(zzs, this.zza);
        this.zza = zzs;
    }

    public final boolean zzo() {
        return zzgo.zzE(this.zza, false);
    }
}
