package com.google.firebase.firestore;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import d7.b;
import e7.c;
import e7.e;
import e7.r;
import java.util.Arrays;
import java.util.List;
import l8.h;
import l8.i;
import x7.s;
import y6.f;
import y6.n;
import z7.j;

@Keep
public class FirestoreRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fst";

    /* access modifiers changed from: private */
    public static /* synthetic */ b0 lambda$getComponents$0(e eVar) {
        return new b0((Context) eVar.a(Context.class), (f) eVar.a(f.class), eVar.i(b.class), eVar.i(c7.b.class), new s(eVar.c(i.class), eVar.c(j.class), (n) eVar.a(n.class)));
    }

    @Keep
    public List<c<?>> getComponents() {
        return Arrays.asList(new c[]{c.e(b0.class).h(LIBRARY_NAME).b(r.k(f.class)).b(r.k(Context.class)).b(r.i(j.class)).b(r.i(i.class)).b(r.a(b.class)).b(r.a(c7.b.class)).b(r.h(n.class)).f(c0.f26445a).d(), h.b(LIBRARY_NAME, "24.9.1")});
    }
}
