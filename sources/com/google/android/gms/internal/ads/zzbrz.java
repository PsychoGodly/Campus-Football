package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.dynamic.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import z4.c;
import z4.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbrz {
    private final View zza;
    private final Map zzb;
    private final zzbxr zzc;

    public zzbrz(zzbry zzbry) {
        View zza2 = zzbry.zza;
        this.zza = zza2;
        Map zzd = zzbry.zzb;
        this.zzb = zzd;
        zzbxr zza3 = zzbrt.zza(zzbry.zza.getContext());
        this.zzc = zza3;
        if (zza3 != null && !zzd.isEmpty()) {
            try {
                zza3.zzf(new zzbsa(b.B1(zza2).asBinder(), b.B1(zzd).asBinder()));
            } catch (RemoteException unused) {
                zzbza.zzg("Failed to call remote method.");
            }
        }
    }

    public final void zza(List list) {
        if (list == null || list.isEmpty()) {
            zzbza.zzj("No click urls were passed to recordClick");
            return;
        }
        if (this.zzc == null) {
            zzbza.zzj("Failed to get internal reporting info generator in recordClick.");
        }
        try {
            this.zzc.zzg(list, b.B1(this.zza), new zzbrx(this, list));
        } catch (RemoteException e10) {
            zzbza.zzg("RemoteException recording click: ".concat(e10.toString()));
        }
    }

    public final void zzb(List list) {
        if (list == null || list.isEmpty()) {
            zzbza.zzj("No impression urls were passed to recordImpression");
            return;
        }
        zzbxr zzbxr = this.zzc;
        if (zzbxr != null) {
            try {
                zzbxr.zzh(list, b.B1(this.zza), new zzbrw(this, list));
            } catch (RemoteException e10) {
                zzbza.zzg("RemoteException recording impression urls: ".concat(e10.toString()));
            }
        } else {
            zzbza.zzj("Failed to get internal reporting info generator from recordImpression.");
        }
    }

    public final void zzc(MotionEvent motionEvent) {
        zzbxr zzbxr = this.zzc;
        if (zzbxr != null) {
            try {
                zzbxr.zzj(b.B1(motionEvent));
            } catch (RemoteException unused) {
                zzbza.zzg("Failed to call remote method.");
            }
        } else {
            zzbza.zze("Failed to get internal reporting info generator.");
        }
    }

    public final void zzd(Uri uri, c cVar) {
        zzbxr zzbxr = this.zzc;
        Objects.requireNonNull(zzbxr);
        try {
            zzbxr.zzk(new ArrayList(Arrays.asList(new Uri[]{uri})), b.B1(this.zza), new zzbrv(this, cVar));
        } catch (RemoteException e10) {
            "Internal error: ".concat(e10.toString());
            throw null;
        }
    }

    public final void zze(List list, d dVar) {
        zzbxr zzbxr = this.zzc;
        Objects.requireNonNull(zzbxr);
        try {
            zzbxr.zzl(list, b.B1(this.zza), new zzbru(this, dVar));
        } catch (RemoteException e10) {
            "Internal error: ".concat(e10.toString());
            throw null;
        }
    }
}
