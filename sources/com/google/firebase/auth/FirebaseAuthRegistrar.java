package com.google.firebase.auth;

import a7.a;
import a7.d;
import androidx.annotation.Keep;
import c7.b;
import com.google.firebase.components.ComponentRegistrar;
import d7.a2;
import e7.c;
import e7.e;
import e7.f0;
import e7.r;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import y6.f;
import z7.h;
import z7.i;

@Keep
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class FirebaseAuthRegistrar implements ComponentRegistrar {
    static /* synthetic */ FirebaseAuth lambda$getComponents$0(f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, e eVar) {
        return new a2((f) eVar.a(f.class), eVar.c(b.class), eVar.c(i.class), (Executor) eVar.f(f0Var), (Executor) eVar.f(f0Var2), (Executor) eVar.f(f0Var3), (ScheduledExecutorService) eVar.f(f0Var4), (Executor) eVar.f(f0Var5));
    }

    @Keep
    public List<c<?>> getComponents() {
        f0<Executor> a10 = f0.a(a.class, Executor.class);
        f0<Executor> a11 = f0.a(a7.b.class, Executor.class);
        f0<Executor> a12 = f0.a(a7.c.class, Executor.class);
        f0<ScheduledExecutorService> a13 = f0.a(a7.c.class, ScheduledExecutorService.class);
        f0<Executor> a14 = f0.a(d.class, Executor.class);
        return Arrays.asList(new c[]{c.f(FirebaseAuth.class, d7.b.class).b(r.k(f.class)).b(r.l(i.class)).b(r.j(a10)).b(r.j(a11)).b(r.j(a12)).b(r.j(a13)).b(r.j(a14)).b(r.i(b.class)).f(new j1(a10, a11, a12, a13, a14)).d(), h.a(), l8.h.b("fire-auth", "22.3.0")});
    }
}
