package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzahe;
import com.google.android.gms.internal.p001firebaseauthapi.zzahf;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzahf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzahf<MessageType extends zzahf<MessageType, BuilderType>, BuilderType extends zzahe<MessageType, BuilderType>> implements zzakn {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    public int a_() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    public int zza(zzalf zzalf) {
        int a_ = a_();
        if (a_ != -1) {
            return a_;
        }
        int zza2 = zzalf.zza(this);
        zzb(zza2);
        return zza2;
    }

    /* access modifiers changed from: package-private */
    public void zzb(int i10) {
        throw new UnsupportedOperationException();
    }

    public final zzahp zzi() {
        try {
            zzahu zzc = zzahp.zzc(zzl());
            zza(zzc.zzb());
            return zzc.zza();
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "ByteString" + " threw an IOException (should never happen).", e10);
        }
    }

    public final byte[] zzj() {
        try {
            byte[] bArr = new byte[zzl()];
            zzaik zzb = zzaik.zzb(bArr);
            zza(zzb);
            zzb.zzb();
            return bArr;
        } catch (IOException e10) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "byte array" + " threw an IOException (should never happen).", e10);
        }
    }

    public final void zza(OutputStream outputStream) throws IOException {
        zzaik zza2 = zzaik.zza(outputStream, zzaik.zzf(zzl()));
        zza(zza2);
        zza2.zzc();
    }
}
