package com.google.android.gms.internal.common;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.jspecify.nullness.NullMarked;

@NullMarked
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class zzx {
    /* access modifiers changed from: private */
    public final zzo zza;
    /* access modifiers changed from: private */
    public final boolean zzb;
    private final zzu zzc;

    private zzx(zzu zzu, boolean z10, zzo zzo, int i10, byte[] bArr) {
        this.zzc = zzu;
        this.zzb = z10;
        this.zza = zzo;
    }

    public static zzx zzc(zzo zzo) {
        return new zzx(new zzu(zzo), false, zzn.zza, a.e.API_PRIORITY_OTHER, (byte[]) null);
    }

    /* access modifiers changed from: private */
    public final Iterator zzh(CharSequence charSequence) {
        return new zzt(this.zzc, this, charSequence);
    }

    public final zzx zzb() {
        return new zzx(this.zzc, true, this.zza, a.e.API_PRIORITY_OTHER, (byte[]) null);
    }

    public final Iterable zzd(CharSequence charSequence) {
        return new zzv(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        Iterator zzh = zzh(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzh.hasNext()) {
            arrayList.add((String) zzh.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
