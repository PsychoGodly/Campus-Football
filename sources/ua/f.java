package ua;

import android.content.Context;
import dc.a;
import io.flutter.embedding.engine.a;
import lc.c;
import lc.k;

/* compiled from: JustAudioPlugin */
public class f implements dc.a {

    /* renamed from: a  reason: collision with root package name */
    private k f23021a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public g f23022b;

    /* compiled from: JustAudioPlugin */
    class a implements a.b {
        a() {
        }

        public void a() {
        }

        public void b() {
            f.this.f23022b.a();
        }
    }

    public void onAttachedToEngine(a.b bVar) {
        Context a10 = bVar.a();
        c b10 = bVar.b();
        this.f23022b = new g(a10, b10);
        k kVar = new k(b10, "com.ryanheise.just_audio.methods");
        this.f23021a = kVar;
        kVar.e(this.f23022b);
        bVar.d().e(new a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        this.f23022b.a();
        this.f23022b = null;
        this.f23021a.e((k.c) null);
    }
}
