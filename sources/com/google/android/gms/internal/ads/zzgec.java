package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgec {
    /* access modifiers changed from: private */
    public final Map zza;
    /* access modifiers changed from: private */
    public final Map zzb;
    /* access modifiers changed from: private */
    public final Map zzc;
    /* access modifiers changed from: private */
    public final Map zzd;

    public zzgec() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzgec zza(zzgcn zzgcn) throws GeneralSecurityException {
        zzgee zzgee = new zzgee(zzgcn.zzd(), zzgcn.zzc(), (zzged) null);
        if (this.zzb.containsKey(zzgee)) {
            zzgcn zzgcn2 = (zzgcn) this.zzb.get(zzgee);
            if (!zzgcn2.equals(zzgcn) || !zzgcn.equals(zzgcn2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgee.toString()));
            }
        } else {
            this.zzb.put(zzgee, zzgcn);
        }
        return this;
    }

    public final zzgec zzb(zzgcr zzgcr) throws GeneralSecurityException {
        zzgeg zzgeg = new zzgeg(zzgcr.zzb(), zzgcr.zzc(), (zzgef) null);
        if (this.zza.containsKey(zzgeg)) {
            zzgcr zzgcr2 = (zzgcr) this.zza.get(zzgeg);
            if (!zzgcr2.equals(zzgcr) || !zzgcr.equals(zzgcr2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgeg.toString()));
            }
        } else {
            this.zza.put(zzgeg, zzgcr);
        }
        return this;
    }

    public final zzgec zzc(zzgdj zzgdj) throws GeneralSecurityException {
        zzgee zzgee = new zzgee(zzgdj.zzc(), zzgdj.zzb(), (zzged) null);
        if (this.zzd.containsKey(zzgee)) {
            zzgdj zzgdj2 = (zzgdj) this.zzd.get(zzgee);
            if (!zzgdj2.equals(zzgdj) || !zzgdj.equals(zzgdj2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgee.toString()));
            }
        } else {
            this.zzd.put(zzgee, zzgdj);
        }
        return this;
    }

    public final zzgec zzd(zzgdn zzgdn) throws GeneralSecurityException {
        zzgeg zzgeg = new zzgeg(zzgdn.zzb(), zzgdn.zzc(), (zzgef) null);
        if (this.zzc.containsKey(zzgeg)) {
            zzgdn zzgdn2 = (zzgdn) this.zzc.get(zzgeg);
            if (!zzgdn2.equals(zzgdn) || !zzgdn.equals(zzgdn2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgeg.toString()));
            }
        } else {
            this.zzc.put(zzgeg, zzgdn);
        }
        return this;
    }

    public zzgec(zzgei zzgei) {
        this.zza = new HashMap(zzgei.zza);
        this.zzb = new HashMap(zzgei.zzb);
        this.zzc = new HashMap(zzgei.zzc);
        this.zzd = new HashMap(zzgei.zzd);
    }
}
