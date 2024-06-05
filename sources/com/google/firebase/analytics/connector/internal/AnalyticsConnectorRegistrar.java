package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import e7.r;
import java.util.Arrays;
import java.util.List;
import l8.h;
import o7.d;
import y6.f;
import z6.a;

@Keep
/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.0 */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    @Keep
    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.e(a.class).b(r.k(f.class)).b(r.k(Context.class)).b(r.k(d.class)).f(b.f26145a).e().d(), h.b("fire-analytics", "21.5.0")});
    }
}
