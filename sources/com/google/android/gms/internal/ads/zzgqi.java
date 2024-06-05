package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqm;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzgqi<MessageType extends zzgqm<MessageType, BuilderType>, BuilderType extends zzgqi<MessageType, BuilderType>> extends zzgom<MessageType, BuilderType> {
    protected zzgqm zza;
    private final zzgqm zzb;

    protected zzgqi(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaX()) {
            this.zza = messagetype.zzaD();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzgse.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    /* renamed from: zzai */
    public final zzgqi zzah() {
        zzgqi zzgqi = (zzgqi) this.zzb.zzb(5, (Object) null, (Object) null);
        zzgqi.zza = zzan();
        return zzgqi;
    }

    public final zzgqi zzaj(zzgqm zzgqm) {
        if (!this.zzb.equals(zzgqm)) {
            if (!this.zza.zzaX()) {
                zzaq();
            }
            zza(this.zza, zzgqm);
        }
        return this;
    }

    public final zzgqi zzak(byte[] bArr, int i10, int i11, zzgpy zzgpy) throws zzgqy {
        if (!this.zza.zzaX()) {
            zzaq();
        }
        try {
            zzgse.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i11, new zzgoq(zzgpy));
            return this;
        } catch (zzgqy e10) {
            throw e10;
        } catch (IndexOutOfBoundsException unused) {
            throw zzgqy.zzj();
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        }
    }

    public final MessageType zzal() {
        MessageType zzam = zzan();
        if (zzam.zzaW()) {
            return zzam;
        }
        throw new zzgtf(zzam);
    }

    /* renamed from: zzam */
    public MessageType zzan() {
        if (!this.zza.zzaX()) {
            return this.zza;
        }
        this.zza.zzaR();
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzap() {
        if (!this.zza.zzaX()) {
            zzaq();
        }
    }

    /* access modifiers changed from: protected */
    public void zzaq() {
        zzgqm zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    public final /* synthetic */ zzgrw zzbf() {
        throw null;
    }
}
