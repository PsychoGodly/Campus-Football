package qf;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.c0;
import pf.a;
import pf.m;
import rf.c;
import sd.w;

/* compiled from: SoundPoolPlayer.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    private final m f37748a;

    /* renamed from: b  reason: collision with root package name */
    private n f37749b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<AudioAttributes, n> f37750c = new HashMap<>();

    public l(m mVar) {
        kotlin.jvm.internal.m.e(mVar, "ref");
        this.f37748a = mVar;
    }

    /* access modifiers changed from: private */
    public static final void c(l lVar, n nVar, SoundPool soundPool, int i10, int i11) {
        c cVar;
        kotlin.jvm.internal.m.e(lVar, "this$0");
        kotlin.jvm.internal.m.e(nVar, "$soundPoolWrapper");
        lVar.f37748a.A(kotlin.jvm.internal.m.m("Loaded ", Integer.valueOf(i10)));
        m mVar = nVar.b().get(Integer.valueOf(i10));
        if (mVar == null) {
            cVar = null;
        } else {
            cVar = mVar.m();
        }
        if (cVar != null) {
            Map<Integer, m> b10 = nVar.b();
            c0.a(b10).remove(mVar.k());
            synchronized (nVar.d()) {
                List<m> list = nVar.d().get(cVar);
                if (list == null) {
                    list = q.d();
                }
                for (m mVar2 : list) {
                    o n10 = mVar2.n();
                    n10.s("Marking " + mVar2 + " as loaded");
                    mVar2.n().I(true);
                    if (mVar2.n().m()) {
                        mVar2.n().s(kotlin.jvm.internal.m.m("Delayed start of ", mVar2));
                        mVar2.start();
                    }
                }
                w wVar = w.f38141a;
            }
        }
    }

    public final void b(int i10, a aVar) {
        kotlin.jvm.internal.m.e(aVar, "audioContext");
        if (Build.VERSION.SDK_INT >= 21) {
            AudioAttributes a10 = aVar.a();
            if (!this.f37750c.containsKey(a10)) {
                SoundPool build = new SoundPool.Builder().setAudioAttributes(a10).setMaxStreams(i10).build();
                this.f37748a.A(kotlin.jvm.internal.m.m("Create SoundPool with ", a10));
                kotlin.jvm.internal.m.d(build, "soundPool");
                n nVar = new n(build);
                nVar.c().setOnLoadCompleteListener(new k(this, nVar));
                this.f37750c.put(a10, nVar);
            }
        } else if (this.f37749b == null) {
            SoundPool soundPool = new SoundPool(i10, 3, 0);
            this.f37748a.A("Create legacy SoundPool");
            this.f37749b = new n(soundPool);
        }
    }

    public final void d() {
        for (Map.Entry<AudioAttributes, n> value : this.f37750c.entrySet()) {
            ((n) value.getValue()).a();
        }
        this.f37750c.clear();
    }

    public final n e(a aVar) {
        kotlin.jvm.internal.m.e(aVar, "audioContext");
        if (Build.VERSION.SDK_INT < 21) {
            return this.f37749b;
        }
        return this.f37750c.get(aVar.a());
    }
}
