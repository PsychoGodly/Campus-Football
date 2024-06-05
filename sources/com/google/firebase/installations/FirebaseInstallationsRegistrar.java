package com.google.firebase.installations;

import a7.a;
import a7.b;
import androidx.annotation.Keep;
import c8.e;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import e7.f0;
import e7.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import y6.f;
import z7.h;
import z7.i;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(e7.e eVar) {
        return new c((f) eVar.a(f.class), eVar.c(i.class), (ExecutorService) eVar.f(f0.a(a.class, ExecutorService.class)), f7.i.a((Executor) eVar.f(f0.a(b.class, Executor.class))));
    }

    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.e(e.class).h(LIBRARY_NAME).b(r.k(f.class)).b(r.i(i.class)).b(r.j(f0.a(a.class, ExecutorService.class))).b(r.j(f0.a(b.class, Executor.class))).f(c8.f.f5991a).d(), h.a(), l8.h.b(LIBRARY_NAME, "17.2.0")});
    }
}
