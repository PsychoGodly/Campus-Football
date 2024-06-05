package y4;

import android.net.Uri;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbrr;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfuf;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class u0 implements zzfuf {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzbrr f24003a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f24004b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f24005c;

    u0(e eVar, zzbrr zzbrr, boolean z10) {
        this.f24005c = eVar;
        this.f24003a = zzbrr;
        this.f24004b = z10;
    }

    public final void zza(Throwable th) {
        try {
            zzbrr zzbrr = this.f24003a;
            String message = th.getMessage();
            zzbrr.zze("Internal error: " + message);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<Uri> list = (List) obj;
        try {
            e.E1(this.f24005c, list);
            this.f24003a.zzf(list);
            if (this.f24005c.f23926q || this.f24004b) {
                for (Uri uri : list) {
                    if (this.f24005c.N1(uri)) {
                        e eVar = this.f24005c;
                        this.f24005c.f23924o.zzc(e.W1(uri, eVar.f23934y, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).toString(), (zzfen) null);
                    } else {
                        if (((Boolean) a0.c().zzb(zzbar.zzgZ)).booleanValue()) {
                            this.f24005c.f23924o.zzc(uri.toString(), (zzfen) null);
                        }
                    }
                }
            }
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }
}
