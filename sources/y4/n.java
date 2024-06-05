package y4;

import android.util.JsonReader;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzftq;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfut;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final /* synthetic */ class n implements zzftq {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zzbtn f23969a;

    public /* synthetic */ n(zzbtn zzbtn) {
        this.f23969a = zzbtn;
    }

    public final zzfut zza(Object obj) {
        zzbtn zzbtn = this.f23969a;
        q qVar = new q(new JsonReader(new InputStreamReader((InputStream) obj)));
        try {
            qVar.f23982b = x.b().zzi(zzbtn.zza).toString();
        } catch (JSONException unused) {
            qVar.f23982b = JsonUtils.EMPTY_JSON;
        }
        return zzfuj.zzh(qVar);
    }
}
