package y4;

import android.webkit.ValueCallback;
import com.google.android.gms.internal.ads.zzbza;
import org.json.JSONException;
import org.json.JSONObject;
import z4.a;
import z4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class v extends b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f24006a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f24007b;

    v(a aVar, String str) {
        this.f24007b = aVar;
        this.f24006a = str;
    }

    public final void a(String str) {
        zzbza.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.f24007b.f23895b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", new Object[]{this.f24006a, str}), (ValueCallback) null);
    }

    public final void b(a aVar) {
        String str;
        String b10 = aVar.b();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", this.f24006a);
            jSONObject.put("signal", b10);
            str = String.format("window.postMessage(%1$s, '*');", new Object[]{jSONObject});
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", new Object[]{this.f24006a, aVar.b()});
        }
        this.f24007b.f23895b.evaluateJavascript(str, (ValueCallback) null);
    }
}
