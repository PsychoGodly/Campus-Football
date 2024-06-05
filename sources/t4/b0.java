package t4;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.n1;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfln;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzflq;
import com.google.android.gms.internal.ads.zzflz;
import com.google.android.gms.internal.ads.zzfmb;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfme;
import com.google.android.gms.internal.ads.zzfmy;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private String f22679a = null;

    /* renamed from: b  reason: collision with root package name */
    private String f22680b = null;

    /* renamed from: c  reason: collision with root package name */
    private zzcei f22681c = null;

    /* renamed from: d  reason: collision with root package name */
    private zzflp f22682d = null;

    /* renamed from: e  reason: collision with root package name */
    private boolean f22683e = false;

    /* renamed from: f  reason: collision with root package name */
    private zzfmc f22684f;

    private final zzfme l() {
        zzfmd zzc = zzfme.zzc();
        if (!((Boolean) a0.c().zzb(zzbar.zzjD)).booleanValue() || TextUtils.isEmpty(this.f22680b)) {
            String str = this.f22679a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.f22680b);
        }
        return zzc.zzc();
    }

    private final void m() {
        if (this.f22684f == null) {
            this.f22684f = new a0(this);
        }
    }

    public final synchronized void a(zzcei zzcei, Context context) {
        this.f22681c = zzcei;
        if (!k(context)) {
            f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        e("on_play_store_bind", hashMap);
    }

    public final void b() {
        zzflp zzflp;
        if (!this.f22683e || (zzflp = this.f22682d) == null) {
            n1.a("LastMileDelivery not connected");
            return;
        }
        zzflp.zza(l(), this.f22684f);
        d("onLMDOverlayCollapse");
    }

    public final void c() {
        zzflp zzflp;
        if (!this.f22683e || (zzflp = this.f22682d) == null) {
            n1.a("LastMileDelivery not connected");
            return;
        }
        zzfln zzc = zzflo.zzc();
        if (!((Boolean) a0.c().zzb(zzbar.zzjD)).booleanValue() || TextUtils.isEmpty(this.f22680b)) {
            String str = this.f22679a;
            if (str != null) {
                zzc.zzb(str);
            } else {
                f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            zzc.zza(this.f22680b);
        }
        zzflp.zzb(zzc.zzc(), this.f22684f);
    }

    /* access modifiers changed from: package-private */
    public final void d(String str) {
        e(str, new HashMap());
    }

    /* access modifiers changed from: package-private */
    public final void e(String str, Map map) {
        zzbzn.zze.execute(new z(this, str, map));
    }

    /* access modifiers changed from: package-private */
    public final void f(String str, String str2) {
        n1.a(str);
        if (this.f22681c != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            e("onError", hashMap);
        }
    }

    public final void g() {
        zzflp zzflp;
        if (!this.f22683e || (zzflp = this.f22682d) == null) {
            n1.a("LastMileDelivery not connected");
            return;
        }
        zzflp.zzc(l(), this.f22684f);
        d("onLMDOverlayExpand");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void h(String str, Map map) {
        zzcei zzcei = this.f22681c;
        if (zzcei != null) {
            zzcei.zzd(str, map);
        }
    }

    /* access modifiers changed from: package-private */
    public final void i(zzfmb zzfmb) {
        if (!TextUtils.isEmpty(zzfmb.zzb())) {
            if (!((Boolean) a0.c().zzb(zzbar.zzjD)).booleanValue()) {
                this.f22679a = zzfmb.zzb();
            }
        }
        switch (zzfmb.zza()) {
            case 8152:
                d("onLMDOverlayOpened");
                return;
            case 8153:
                d("onLMDOverlayClicked");
                return;
            case 8155:
                d("onLMDOverlayClose");
                return;
            case 8157:
                this.f22679a = null;
                this.f22680b = null;
                this.f22683e = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzfmb.zza()));
                e("onLMDOverlayFailedToOpen", hashMap);
                return;
            default:
                return;
        }
    }

    public final void j(zzcei zzcei, zzflz zzflz) {
        if (zzcei == null) {
            f("adWebview missing", "onLMDShow");
            return;
        }
        this.f22681c = zzcei;
        if (this.f22683e || k(zzcei.getContext())) {
            if (((Boolean) a0.c().zzb(zzbar.zzjD)).booleanValue()) {
                this.f22680b = zzflz.zzg();
            }
            m();
            zzflp zzflp = this.f22682d;
            if (zzflp != null) {
                zzflp.zzd(zzflz, this.f22684f);
                return;
            }
            return;
        }
        f("LMDOverlay not bound", "on_play_store_bind");
    }

    public final synchronized boolean k(Context context) {
        if (!zzfmy.zza(context)) {
            return false;
        }
        try {
            this.f22682d = zzflq.zza(context);
        } catch (NullPointerException e10) {
            n1.a("Error connecting LMD Overlay service");
            t.q().zzu(e10, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f22682d == null) {
            this.f22683e = false;
            return false;
        }
        m();
        this.f22683e = true;
        return true;
    }
}
