package com.google.firebase.messaging;

import a8.a;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import e7.e;
import e7.r;
import java.util.Arrays;
import java.util.List;
import l8.h;
import l8.i;
import o7.d;
import y6.f;
import z1.g;
import z7.j;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(e eVar) {
        return new FirebaseMessaging((f) eVar.a(f.class), (a) eVar.a(a.class), eVar.c(i.class), eVar.c(j.class), (c8.e) eVar.a(c8.e.class), (g) eVar.a(g.class), (d) eVar.a(d.class));
    }

    @Keep
    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.e(FirebaseMessaging.class).h(LIBRARY_NAME).b(r.k(f.class)).b(r.h(a.class)).b(r.i(i.class)).b(r.i(j.class)).b(r.h(g.class)).b(r.k(c8.e.class)).b(r.k(d.class)).f(c0.f26765a).c().d(), h.b(LIBRARY_NAME, "23.3.1")});
    }
}
