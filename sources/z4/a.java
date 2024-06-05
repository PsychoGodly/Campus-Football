package z4;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.p3;
import com.google.android.gms.ads.internal.client.z2;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbrt;
import com.google.android.gms.internal.ads.zzbyp;
import n4.b;
import n4.g;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final p3 f24235a;

    public a(p3 p3Var) {
        this.f24235a = p3Var;
    }

    public static void a(Context context, b bVar, g gVar, b bVar2) {
        z2 z2Var;
        zzbar.zzc(context);
        if (((Boolean) zzbci.zzk.zze()).booleanValue()) {
            if (((Boolean) a0.c().zzb(zzbar.zzjw)).booleanValue()) {
                zzbyp.zzb.execute(new e(context, bVar, gVar, bVar2));
                return;
            }
        }
        if (gVar == null) {
            z2Var = null;
        } else {
            z2Var = gVar.a();
        }
        new zzbrt(context, bVar, z2Var).zzb(bVar2);
    }

    public String b() {
        return this.f24235a.a();
    }
}
