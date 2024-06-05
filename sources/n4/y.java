package n4;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.d5;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzbza;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final p2 f20969a;

    /* renamed from: b  reason: collision with root package name */
    private final List f20970b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private k f20971c;

    private y(p2 p2Var) {
        this.f20969a = p2Var;
        if (p2Var != null) {
            try {
                List<d5> zzj = p2Var.zzj();
                if (zzj != null) {
                    for (d5 i10 : zzj) {
                        k i11 = k.i(i10);
                        if (i11 != null) {
                            this.f20970b.add(i11);
                        }
                    }
                }
            } catch (RemoteException e10) {
                zzbza.zzh("Could not forward getAdapterResponseInfo to ResponseInfo.", e10);
            }
        }
        p2 p2Var2 = this.f20969a;
        if (p2Var2 != null) {
            try {
                d5 zzf = p2Var2.zzf();
                if (zzf != null) {
                    this.f20971c = k.i(zzf);
                }
            } catch (RemoteException e11) {
                zzbza.zzh("Could not forward getLoadedAdapterResponse to ResponseInfo.", e11);
            }
        }
    }

    public static y f(p2 p2Var) {
        if (p2Var != null) {
            return new y(p2Var);
        }
        return null;
    }

    public static y g(p2 p2Var) {
        return new y(p2Var);
    }

    public List<k> a() {
        return this.f20970b;
    }

    public k b() {
        return this.f20971c;
    }

    public String c() {
        try {
            p2 p2Var = this.f20969a;
            if (p2Var != null) {
                return p2Var.zzg();
            }
            return null;
        } catch (RemoteException e10) {
            zzbza.zzh("Could not forward getMediationAdapterClassName to ResponseInfo.", e10);
            return null;
        }
    }

    public Bundle d() {
        try {
            p2 p2Var = this.f20969a;
            if (p2Var != null) {
                return p2Var.zze();
            }
        } catch (RemoteException e10) {
            zzbza.zzh("Could not forward getResponseExtras to ResponseInfo.", e10);
        }
        return new Bundle();
    }

    public String e() {
        try {
            p2 p2Var = this.f20969a;
            if (p2Var != null) {
                return p2Var.zzi();
            }
            return null;
        } catch (RemoteException e10) {
            zzbza.zzh("Could not forward getResponseId to ResponseInfo.", e10);
            return null;
        }
    }

    public final p2 h() {
        return this.f20969a;
    }

    public final JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String e10 = e();
        if (e10 == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", e10);
        }
        String c10 = c();
        if (c10 == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", c10);
        }
        JSONArray jSONArray = new JSONArray();
        for (k j10 : this.f20970b) {
            jSONArray.put(j10.j());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        k kVar = this.f20971c;
        if (kVar != null) {
            jSONObject.put("Loaded Adapter Response", kVar.j());
        }
        Bundle d10 = d();
        if (d10 != null) {
            jSONObject.put("Response Extras", x.b().zzi(d10));
        }
        return jSONObject;
    }

    public String toString() {
        try {
            return i().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
