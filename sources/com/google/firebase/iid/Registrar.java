package com.google.firebase.iid;

import a8.a;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.components.ComponentRegistrar;
import e7.c;
import e7.e;
import e7.r;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import l8.h;
import l8.i;
import y6.f;
import z7.j;

@Keep
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
public final class Registrar implements ComponentRegistrar {

    /* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
    private static class a implements a8.a {

        /* renamed from: a  reason: collision with root package name */
        final FirebaseInstanceId f26605a;

        public a(FirebaseInstanceId firebaseInstanceId) {
            this.f26605a = firebaseInstanceId;
        }

        public void a(String str, String str2) throws IOException {
            this.f26605a.f(str, str2);
        }

        public void b(a.C0255a aVar) {
            this.f26605a.a(aVar);
        }

        public Task<String> c() {
            String n10 = this.f26605a.n();
            if (n10 != null) {
                return Tasks.forResult(n10);
            }
            return this.f26605a.j().continueWith(q.f26641a);
        }

        public String getToken() {
            return this.f26605a.n();
        }
    }

    static final /* synthetic */ FirebaseInstanceId lambda$getComponents$0$Registrar(e eVar) {
        return new FirebaseInstanceId((f) eVar.a(f.class), eVar.c(i.class), eVar.c(j.class), (c8.e) eVar.a(c8.e.class));
    }

    static final /* synthetic */ a8.a lambda$getComponents$1$Registrar(e eVar) {
        return new a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }

    @Keep
    public List<c<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        return Arrays.asList(new c[]{c.e(cls).b(r.k(f.class)).b(r.i(i.class)).b(r.i(j.class)).b(r.k(c8.e.class)).f(o.f26639a).c().d(), c.e(a8.a.class).b(r.k(cls)).f(p.f26640a).d(), h.b("fire-iid", "21.1.0")});
    }
}
