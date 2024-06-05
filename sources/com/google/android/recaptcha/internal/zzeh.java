package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzeh;
import com.google.android.recaptcha.internal.zzei;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public abstract class zzeh<MessageType extends zzei<MessageType, BuilderType>, BuilderType extends zzeh<MessageType, BuilderType>> implements zzhx {
    /* renamed from: zza */
    public abstract zzeh clone();

    /* access modifiers changed from: protected */
    public abstract zzeh zzb(zzei zzei);

    public final /* bridge */ /* synthetic */ zzhx zzc(zzhy zzhy) {
        if (zzX().getClass().isInstance(zzhy)) {
            return zzb((zzei) zzhy);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
