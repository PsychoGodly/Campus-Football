package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzffo extends zzffk {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzffm zzb;
    private final zzffl zzc;
    private final List zzd = new ArrayList();
    private zzfhi zze;
    private zzfgl zzf;
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi;

    zzffo(zzffl zzffl, zzffm zzffm) {
        this.zzc = zzffl;
        this.zzb = zzffm;
        this.zzi = UUID.randomUUID().toString();
        zzk((View) null);
        if (zzffm.zzd() == zzffn.HTML || zzffm.zzd() == zzffn.JAVASCRIPT) {
            this.zzf = new zzfgm(zzffm.zza());
        } else {
            this.zzf = new zzfgo(zzffm.zzi(), (String) null);
        }
        this.zzf.zzj();
        zzffz.zza().zzd(this);
        zzfge.zza().zzd(this.zzf.zza(), zzffl.zzb());
    }

    private final void zzk(View view) {
        this.zze = new zzfhi(view);
    }

    public final void zzb(View view, zzffq zzffq, String str) {
        zzfgb zzfgb;
        if (this.zzh) {
            return;
        }
        if (zza.matcher("Ad overlay").matches()) {
            Iterator it = this.zzd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    zzfgb = null;
                    break;
                }
                zzfgb = (zzfgb) it.next();
                if (zzfgb.zzb().get() == view) {
                    break;
                }
            }
            if (zzfgb == null) {
                this.zzd.add(new zzfgb(view, zzffq, "Ad overlay"));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
    }

    public final void zzc() {
        if (!this.zzh) {
            this.zze.clear();
            if (!this.zzh) {
                this.zzd.clear();
            }
            this.zzh = true;
            zzfge.zza().zzc(this.zzf.zza());
            zzffz.zza().zze(this);
            this.zzf.zzc();
            this.zzf = null;
        }
    }

    public final void zzd(View view) {
        if (!this.zzh && zzf() != view) {
            zzk(view);
            this.zzf.zzb();
            Collection<zzffo> zzc2 = zzffz.zza().zzc();
            if (zzc2 != null && !zzc2.isEmpty()) {
                for (zzffo zzffo : zzc2) {
                    if (zzffo != this && zzffo.zzf() == view) {
                        zzffo.zze.clear();
                    }
                }
            }
        }
    }

    public final void zze() {
        if (!this.zzg) {
            this.zzg = true;
            zzffz.zza().zzf(this);
            this.zzf.zzh(zzfgf.zzb().zza());
            this.zzf.zzf(this, this.zzb);
        }
    }

    public final View zzf() {
        return (View) this.zze.get();
    }

    public final zzfgl zzg() {
        return this.zzf;
    }

    public final String zzh() {
        return this.zzi;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final boolean zzj() {
        return this.zzg && !this.zzh;
    }
}
