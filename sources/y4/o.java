package y4;

import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzdue;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class o implements zzftq {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f23973a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdue f23974b;

    public o(Executor executor, zzdue zzdue) {
        this.f23973a = executor;
        this.f23974b = zzdue;
    }

    public final /* bridge */ /* synthetic */ zzfut zza(Object obj) throws Exception {
        zzbtn zzbtn = (zzbtn) obj;
        return zzfuj.zzm(this.f23974b.zzb(zzbtn), new n(zzbtn), this.f23973a);
    }
}
