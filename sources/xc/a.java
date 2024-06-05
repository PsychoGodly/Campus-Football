package xc;

import com.applovin.sdk.AppLovinEventTypes;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;

/* compiled from: MethodCallHandler */
class a implements k.c {

    /* renamed from: a  reason: collision with root package name */
    private b f39334a;

    a(b bVar) {
        this.f39334a = bVar;
    }

    private void a(j jVar) throws IllegalArgumentException {
        if (!(jVar.f36117b instanceof Map)) {
            throw new IllegalArgumentException("Map argument expected");
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        String str = jVar.f36116a;
        str.hashCode();
        if (str.equals("shareFiles")) {
            a(jVar);
            try {
                this.f39334a.l((List) jVar.a("paths"), (List) jVar.a("mimeTypes"), (String) jVar.a("text"), (String) jVar.a("subject"));
                dVar.success((Object) null);
            } catch (IOException e10) {
                dVar.error(e10.getMessage(), (String) null, (Object) null);
            }
        } else if (!str.equals(AppLovinEventTypes.USER_SHARED_LINK)) {
            dVar.notImplemented();
        } else {
            a(jVar);
            this.f39334a.k((String) jVar.a("text"), (String) jVar.a("subject"));
            dVar.success((Object) null);
        }
    }
}
