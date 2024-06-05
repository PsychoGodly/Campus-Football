package y4;

import android.util.Pair;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzdpn f24019a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ zzdpd f24020b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f24021c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Pair[] f24022d;

    public /* synthetic */ z(zzdpn zzdpn, zzdpd zzdpd, String str, Pair[] pairArr) {
        this.f24019a = zzdpn;
        this.f24020b = zzdpd;
        this.f24021c = str;
        this.f24022d = pairArr;
    }

    public final void run() {
        a0.d(this.f24019a, this.f24020b, this.f24021c, this.f24022d);
    }
}
