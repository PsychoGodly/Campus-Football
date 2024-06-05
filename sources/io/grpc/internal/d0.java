package io.grpc.internal;

import com.unity3d.services.UnityAdsConstants;
import dd.a1;
import dd.b1;
import dd.n0;
import java.net.URI;
import r6.o;
import r6.t;

/* compiled from: DnsNameResolverProvider */
public final class d0 extends b1 {
    public String a() {
        return "dns";
    }

    /* access modifiers changed from: protected */
    public boolean d() {
        return true;
    }

    public int e() {
        return 5;
    }

    /* renamed from: f */
    public c0 b(URI uri, a1.b bVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) o.p(uri.getPath(), "targetPath");
        o.l(str.startsWith(UnityAdsConstants.DefaultUrls.AD_ASSET_PATH), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new c0(uri.getAuthority(), str.substring(1), bVar, r0.f35320u, t.c(), n0.a(d0.class.getClassLoader()));
    }
}
