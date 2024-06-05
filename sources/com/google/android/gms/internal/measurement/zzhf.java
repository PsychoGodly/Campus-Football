package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhd;
import com.google.android.gms.internal.measurement.zzhf;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public abstract class zzhf<MessageType extends zzhd<MessageType, BuilderType>, BuilderType extends zzhf<MessageType, BuilderType>> implements zzkm {
    /* renamed from: zza */
    public abstract BuilderType zzb(zzib zzib, zzik zzik) throws IOException;

    public BuilderType zza(byte[] bArr, int i10, int i11) throws zzji {
        try {
            zzib zza = zzib.zza(bArr, 0, i11, false);
            zzb(zza, zzik.zza);
            zza.zzb(0);
            return this;
        } catch (zzji e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    /* renamed from: zzy */
    public abstract BuilderType clone();

    public BuilderType zza(byte[] bArr, int i10, int i11, zzik zzik) throws zzji {
        try {
            zzib zza = zzib.zza(bArr, 0, i11, false);
            zzb(zza, zzik);
            zza.zzb(0);
            return this;
        } catch (zzji e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException(zza("byte array"), e11);
        }
    }

    public final /* synthetic */ zzkm zza(byte[] bArr) throws zzji {
        return zza(bArr, 0, bArr.length);
    }

    public final /* synthetic */ zzkm zza(byte[] bArr, zzik zzik) throws zzji {
        return zza(bArr, 0, bArr.length, zzik);
    }

    private final String zza(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }
}
