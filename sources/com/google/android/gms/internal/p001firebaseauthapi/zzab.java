package com.google.android.gms.internal.p001firebaseauthapi;

import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzab  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzab {
    /* access modifiers changed from: private */
    public final zzj zza;
    private final boolean zzb;
    private final zzah zzc;
    /* access modifiers changed from: private */
    public final int zzd;

    private zzab(zzah zzah) {
        this(zzah, false, zzn.zza, a.e.API_PRIORITY_OTHER);
    }

    public static zzab zza(char c10) {
        zzl zzl = new zzl(c10);
        zzy.zza(zzl);
        return new zzab(new zzaa(zzl));
    }

    private zzab(zzah zzah, boolean z10, zzj zzj, int i10) {
        this.zzc = zzah;
        this.zzb = false;
        this.zza = zzj;
        this.zzd = a.e.API_PRIORITY_OTHER;
    }

    public static zzab zza(String str) {
        zzs zza2 = zzx.zza(str);
        if (!zza2.zza(MaxReward.DEFAULT_LABEL).zzc()) {
            return new zzab(new zzac(zza2));
        }
        throw new IllegalArgumentException(zzag.zza("The pattern may not match the empty string: %s", zza2));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzy.zza(charSequence);
        Iterator<String> zza2 = this.zzc.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza2.hasNext()) {
            arrayList.add(zza2.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
