package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzbt;
import com.google.android.gms.internal.p001firebaseauthapi.zzov;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzmx<KeyT extends zzbt, SerializationT extends zzov> {
    private final Class<KeyT> zza;
    private final Class<SerializationT> zzb;

    private zzmx(Class<KeyT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <KeyT extends zzbt, SerializationT extends zzov> zzmx<KeyT, SerializationT> zza(zzmz<KeyT, SerializationT> zzmz, Class<KeyT> cls, Class<SerializationT> cls2) {
        return new zzna(cls, cls2, zzmz);
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }
}
