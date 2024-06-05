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
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class t0 implements zzfuf {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ zzbrr f23998a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f23999b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ e f24000c;

    t0(e eVar, zzbrr zzbrr, boolean z10) {
        this.f24000c = eVar;
        this.f23998a = zzbrr;
        this.f23999b = z10;
    }

    public final void zza(Throwable th) {
        try {
            zzbrr zzbrr = this.f23998a;
            String message = th.getMessage();
            zzbrr.zze("Internal error: " + message);
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        try {
            this.f23998a.zzf(arrayList);
            if (this.f24000c.f23925p || this.f23999b) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri uri = (Uri) it.next();
                    if (this.f24000c.O1(uri)) {
                        e eVar = this.f24000c;
                        this.f24000c.f23924o.zzc(e.W1(uri, eVar.f23934y, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION).toString(), (zzfen) null);
                    } else {
                        if (((Boolean) a0.c().zzb(zzbar.zzgZ)).booleanValue()) {
                            this.f24000c.f23924o.zzc(uri.toString(), (zzfen) null);
                        }
                    }
                }
            }
        } catch (RemoteException e10) {
            zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
        }
    }
}
