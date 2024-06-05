package y4;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.applovin.mediation.MaxReward;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzapw;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import com.google.android.gms.internal.ads.zzfen;
import com.google.android.gms.internal.ads.zzfff;
import com.google.android.gms.internal.ads.zzfuu;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n4.g;
import org.json.JSONException;
import org.json.JSONObject;
import z4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f23894a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final WebView f23895b;

    /* renamed from: c  reason: collision with root package name */
    private final zzapw f23896c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23897d;

    /* renamed from: e  reason: collision with root package name */
    private final zzdpn f23898e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f23899f;

    /* renamed from: g  reason: collision with root package name */
    private final zzfuu f23900g = zzbzn.zze;

    /* renamed from: h  reason: collision with root package name */
    private final zzfff f23901h;

    a(WebView webView, zzapw zzapw, zzdpn zzdpn, zzfff zzfff) {
        this.f23895b = webView;
        Context context = webView.getContext();
        this.f23894a = context;
        this.f23896c = zzapw;
        this.f23898e = zzdpn;
        zzbar.zzc(context);
        this.f23897d = ((Integer) a0.c().zzb(zzbar.zziG)).intValue();
        this.f23899f = ((Boolean) a0.c().zzb(zzbar.zziH)).booleanValue();
        this.f23901h = zzfff;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void b(Bundle bundle, b bVar) {
        CookieManager b10 = t.s().b(this.f23894a);
        bundle.putBoolean("accept_3p_cookie", b10 != null ? b10.acceptThirdPartyCookies(this.f23895b) : false);
        Context context = this.f23894a;
        n4.b bVar2 = n4.b.f20900a;
        g.a aVar = new g.a();
        aVar.b(AdMobAdapter.class, bundle);
        z4.a.a(context, bVar2, aVar.c(), bVar);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void c(String str) {
        Uri parse = Uri.parse(str);
        try {
            parse = this.f23896c.zza(parse, this.f23894a, this.f23895b, (Activity) null);
        } catch (zzapx e10) {
            zzbza.zzf("Failed to append the click signal to URL: ", e10);
            t.q().zzu(e10, "TaggingLibraryJsInterface.recordClick");
        }
        this.f23901h.zzc(parse.toString(), (zzfen) null);
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        try {
            long a10 = t.b().a();
            String zze = this.f23896c.zzc().zze(this.f23894a, str, this.f23895b);
            if (this.f23899f) {
                long a11 = t.b().a() - a10;
                a0.c(this.f23898e, (zzdpd) null, "csg", new Pair("clat", String.valueOf(a11)));
            }
            return zze;
        } catch (RuntimeException e10) {
            zzbza.zzh("Exception getting click signals. ", e10);
            t.q().zzu(e10, "TaggingLibraryJsInterface.getClickSignals");
            return MaxReward.DEFAULT_LABEL;
        }
    }

    @JavascriptInterface
    public String getClickSignalsWithTimeout(String str, int i10) {
        if (i10 <= 0) {
            zzbza.zzg("Invalid timeout for getting click signals. Timeout=" + i10);
            return MaxReward.DEFAULT_LABEL;
        }
        int min = Math.min(i10, this.f23897d);
        try {
            return (String) zzbzn.zza.zzb(new u(this, str)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzbza.zzh("Exception getting click signals with timeout. ", e10);
            t.q().zzu(e10, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (e10 instanceof TimeoutException) {
                return "17";
            }
            return MaxReward.DEFAULT_LABEL;
        }
    }

    @JavascriptInterface
    public String getQueryInfo() {
        t.r();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        v vVar = new v(this, uuid);
        if (((Boolean) a0.c().zzb(zzbar.zziJ)).booleanValue()) {
            this.f23900g.execute(new s(this, bundle, vVar));
        } else {
            Context context = this.f23894a;
            n4.b bVar = n4.b.f20900a;
            g.a aVar = new g.a();
            aVar.b(AdMobAdapter.class, bundle);
            z4.a.a(context, bVar, aVar.c(), vVar);
        }
        return uuid;
    }

    @JavascriptInterface
    public String getViewSignals() {
        try {
            long a10 = t.b().a();
            String zzh = this.f23896c.zzc().zzh(this.f23894a, this.f23895b, (Activity) null);
            if (this.f23899f) {
                long a11 = t.b().a() - a10;
                a0.c(this.f23898e, (zzdpd) null, "vsg", new Pair("vlat", String.valueOf(a11)));
            }
            return zzh;
        } catch (RuntimeException e10) {
            zzbza.zzh("Exception getting view signals. ", e10);
            t.q().zzu(e10, "TaggingLibraryJsInterface.getViewSignals");
            return MaxReward.DEFAULT_LABEL;
        }
    }

    @JavascriptInterface
    public String getViewSignalsWithTimeout(int i10) {
        if (i10 <= 0) {
            zzbza.zzg("Invalid timeout for getting view signals. Timeout=" + i10);
            return MaxReward.DEFAULT_LABEL;
        }
        int min = Math.min(i10, this.f23897d);
        try {
            return (String) zzbzn.zza.zzb(new t(this)).get((long) min, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzbza.zzh("Exception getting view signals with timeout. ", e10);
            t.q().zzu(e10, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (e10 instanceof TimeoutException) {
                return "17";
            }
            return MaxReward.DEFAULT_LABEL;
        }
    }

    @JavascriptInterface
    public void recordClick(String str) {
        if (((Boolean) a0.c().zzb(zzbar.zziN)).booleanValue() && !TextUtils.isEmpty(str)) {
            zzbzn.zza.execute(new r(this, str));
        }
    }

    @JavascriptInterface
    public void reportTouchEvent(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int i10 = jSONObject.getInt("x");
            int i11 = jSONObject.getInt("y");
            int i12 = jSONObject.getInt("duration_ms");
            float f10 = (float) jSONObject.getDouble("force");
            int i13 = jSONObject.getInt("type");
            try {
                this.f23896c.zzd(MotionEvent.obtain(0, (long) i12, i13 != 0 ? i13 != 1 ? i13 != 2 ? i13 != 3 ? -1 : 3 : 2 : 1 : 0, (float) i10, (float) i11, f10, 1.0f, 0, 1.0f, 1.0f, 0, 0));
            } catch (RuntimeException | JSONException e10) {
                e = e10;
                zzbza.zzh("Failed to parse the touch string. ", e);
                t.q().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
            }
        } catch (RuntimeException | JSONException e11) {
            e = e11;
            zzbza.zzh("Failed to parse the touch string. ", e);
            t.q().zzu(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
