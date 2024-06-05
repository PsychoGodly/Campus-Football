package t4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.internal.ads.zzdcc;
import m5.m;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class s {
    public static final void a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        if (adOverlayInfoParcel.f14707l == 4 && adOverlayInfoParcel.f14699c == null) {
            a aVar = adOverlayInfoParcel.f14698b;
            if (aVar != null) {
                aVar.onAdClicked();
            }
            zzdcc zzdcc = adOverlayInfoParcel.f14721z;
            if (zzdcc != null) {
                zzdcc.zzr();
            }
            Activity zzi = adOverlayInfoParcel.f14700d.zzi();
            i iVar = adOverlayInfoParcel.f14697a;
            if (!(iVar == null || !iVar.f22698k || zzi == null)) {
                context = zzi;
            }
            t.j();
            i iVar2 = adOverlayInfoParcel.f14697a;
            a.b(context, iVar2, adOverlayInfoParcel.f14705j, iVar2 != null ? iVar2.f22697j : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f14709n.zzd);
        intent.putExtra("shouldCallOnOverlayOpened", z10);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!m.f()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        t.r();
        b2.q(context, intent);
    }
}
