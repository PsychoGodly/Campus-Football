package t4;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class a {
    public static final boolean a(Context context, Intent intent, e0 e0Var, c0 c0Var, boolean z10) {
        if (z10) {
            return c(context, intent.getData(), e0Var, c0Var);
        }
        try {
            String uri = intent.toURI();
            n1.a("Launching an intent: " + uri);
            t.r();
            b2.q(context, intent);
            if (e0Var != null) {
                e0Var.zzg();
            }
            if (c0Var != null) {
                c0Var.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            zzbza.zzj(e10.getMessage());
            if (c0Var != null) {
                c0Var.zza(false);
            }
            return false;
        }
    }

    public static final boolean b(Context context, i iVar, e0 e0Var, c0 c0Var) {
        int i10 = 0;
        if (iVar == null) {
            zzbza.zzj("No intent data for launcher overlay.");
            return false;
        }
        zzbar.zzc(context);
        Intent intent = iVar.f22696i;
        if (intent != null) {
            return a(context, intent, e0Var, c0Var, iVar.f22698k);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(iVar.f22690b)) {
            zzbza.zzj("Open GMSG did not contain a URL.");
            return false;
        }
        if (!TextUtils.isEmpty(iVar.f22691c)) {
            intent2.setDataAndType(Uri.parse(iVar.f22690b), iVar.f22691c);
        } else {
            intent2.setData(Uri.parse(iVar.f22690b));
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(iVar.f22692d)) {
            intent2.setPackage(iVar.f22692d);
        }
        if (!TextUtils.isEmpty(iVar.f22693f)) {
            String[] split = iVar.f22693f.split(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH, 2);
            if (split.length < 2) {
                zzbza.zzj("Could not parse component name from open GMSG: ".concat(String.valueOf(iVar.f22693f)));
                return false;
            }
            intent2.setClassName(split[0], split[1]);
        }
        String str = iVar.f22694g;
        if (!TextUtils.isEmpty(str)) {
            try {
                i10 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                zzbza.zzj("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) a0.c().zzb(zzbar.zzec)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) a0.c().zzb(zzbar.zzeb)).booleanValue()) {
                t.r();
                b2.L(context, intent2);
            }
        }
        return a(context, intent2, e0Var, c0Var, iVar.f22698k);
    }

    private static final boolean c(Context context, Uri uri, e0 e0Var, c0 c0Var) {
        int i10;
        try {
            i10 = t.r().J(context, uri);
            if (e0Var != null) {
                e0Var.zzg();
            }
        } catch (ActivityNotFoundException e10) {
            zzbza.zzj(e10.getMessage());
            i10 = 6;
        }
        if (c0Var != null) {
            c0Var.zzb(i10);
        }
        return i10 == 5;
    }
}
