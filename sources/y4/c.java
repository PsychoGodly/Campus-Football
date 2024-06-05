package y4;

import android.util.Pair;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzfuf;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class c implements zzfuf {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f23906a;

    c(e eVar) {
        this.f23906a = eVar;
    }

    public final void zza(Throwable th) {
        t.q().zzu(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        e eVar = this.f23906a;
        a0.c(eVar.f23923n, eVar.f23915f, "sgf", new Pair("sgf_reason", th.getMessage()));
        zzbza.zzh("Failed to initialize webview for loading SDKCore. ", th);
    }

    public final /* synthetic */ void zzb(Object obj) {
        q qVar = (q) obj;
        zzbza.zze("Initialized webview successfully for SDKCore.");
    }
}
