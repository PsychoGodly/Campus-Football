package y4;

import android.text.TextUtils;
import android.util.Pair;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbzn;
import com.google.android.gms.internal.ads.zzdpd;
import com.google.android.gms.internal.ads.zzdpn;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class x {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final int f24009a;

    /* renamed from: b  reason: collision with root package name */
    private final long f24010b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24011c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f24012d;

    /* renamed from: e  reason: collision with root package name */
    private final Map f24013e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque f24014f = new ArrayDeque();

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque f24015g = new ArrayDeque();

    /* renamed from: h  reason: collision with root package name */
    private final zzdpn f24016h;

    /* renamed from: i  reason: collision with root package name */
    private Map f24017i;

    public x(zzdpn zzdpn) {
        this.f24016h = zzdpn;
        this.f24009a = ((Integer) a0.c().zzb(zzbar.zzgA)).intValue();
        this.f24010b = ((Long) a0.c().zzb(zzbar.zzgB)).longValue();
        this.f24011c = ((Boolean) a0.c().zzb(zzbar.zzgG)).booleanValue();
        this.f24012d = ((Boolean) a0.c().zzb(zzbar.zzgE)).booleanValue();
        this.f24013e = Collections.synchronizedMap(new w(this));
    }

    private final synchronized void g(zzdpd zzdpd) {
        if (this.f24011c) {
            ArrayDeque clone = this.f24015g.clone();
            this.f24015g.clear();
            ArrayDeque clone2 = this.f24014f.clone();
            this.f24014f.clear();
            zzbzn.zza.execute(new b(this, zzdpd, clone, clone2));
        }
    }

    private final void h(zzdpd zzdpd, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdpd.zza());
            this.f24017i = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.f24017i.put("e_r", str);
            this.f24017i.put("e_id", (String) pair2.first);
            if (this.f24012d) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(a0.a(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair(MaxReward.DEFAULT_LABEL, MaxReward.DEFAULT_LABEL);
                }
                j(this.f24017i, "e_type", (String) pair.first);
                j(this.f24017i, "e_agent", (String) pair.second);
            }
            this.f24016h.zze(this.f24017i);
        }
    }

    private final synchronized void i() {
        long a10 = t.b().a();
        try {
            Iterator it = this.f24013e.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (a10 - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.f24010b) {
                    break;
                }
                this.f24015g.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e10) {
            t.q().zzu(e10, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void j(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final synchronized String b(String str, zzdpd zzdpd) {
        Pair pair = (Pair) this.f24013e.get(str);
        zzdpd.zza().put("rid", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.f24013e.remove(str);
            zzdpd.zza().put("mhit", "true");
            return str2;
        }
        zzdpd.zza().put("mhit", "false");
        return null;
    }

    public final synchronized void d(String str, String str2, zzdpd zzdpd) {
        this.f24013e.put(str, new Pair(Long.valueOf(t.b().a()), str2));
        i();
        g(zzdpd);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(zzdpd zzdpd, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        h(zzdpd, arrayDeque, "to");
        h(zzdpd, arrayDeque2, "of");
    }

    public final synchronized void f(String str) {
        this.f24013e.remove(str);
    }
}
