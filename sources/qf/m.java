package qf;

import android.media.SoundPool;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import pf.a;
import rf.b;
import rf.c;
import sd.d;
import sd.w;

/* compiled from: SoundPoolPlayer.kt */
public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final o f37751a;

    /* renamed from: b  reason: collision with root package name */
    private final l f37752b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f37753c;

    /* renamed from: d  reason: collision with root package name */
    private Integer f37754d;

    /* renamed from: e  reason: collision with root package name */
    private a f37755e;

    /* renamed from: f  reason: collision with root package name */
    private n f37756f;

    /* renamed from: g  reason: collision with root package name */
    private c f37757g;

    public m(o oVar, l lVar) {
        kotlin.jvm.internal.m.e(oVar, "wrappedPlayer");
        kotlin.jvm.internal.m.e(lVar, "soundPoolManager");
        this.f37751a = oVar;
        this.f37752b = lVar;
        a h10 = oVar.h();
        this.f37755e = h10;
        lVar.b(32, h10);
        n e10 = lVar.e(this.f37755e);
        if (e10 != null) {
            this.f37756f = e10;
            return;
        }
        throw new IllegalStateException(kotlin.jvm.internal.m.m("Could not create SoundPool ", this.f37755e).toString());
    }

    private final SoundPool l() {
        return this.f37756f.c();
    }

    private final int o(boolean z10) {
        return z10 ? -1 : 0;
    }

    private final void p(a aVar) {
        if (Build.VERSION.SDK_INT >= 21 && !kotlin.jvm.internal.m.a(this.f37755e.a(), aVar.a())) {
            release();
            this.f37752b.b(32, aVar);
            n e10 = this.f37752b.e(aVar);
            if (e10 != null) {
                this.f37756f = e10;
            } else {
                throw new IllegalStateException(kotlin.jvm.internal.m.m("Could not create SoundPool ", aVar).toString());
            }
        }
        this.f37755e = aVar;
    }

    private final Void s(String str) {
        throw new UnsupportedOperationException(kotlin.jvm.internal.m.m("LOW_LATENCY mode does not support: ", str));
    }

    public void a() {
    }

    public void b(boolean z10) {
        Integer num = this.f37754d;
        if (num != null) {
            l().setLoop(num.intValue(), o(z10));
        }
    }

    public boolean c() {
        return false;
    }

    public void d(float f10, float f11) {
        Integer num = this.f37754d;
        if (num != null) {
            l().setVolume(num.intValue(), f10, f11);
        }
    }

    public void e(a aVar) {
        kotlin.jvm.internal.m.e(aVar, "context");
        p(aVar);
    }

    public void f(b bVar) {
        kotlin.jvm.internal.m.e(bVar, "source");
        bVar.b(this);
    }

    public boolean g() {
        return false;
    }

    public /* bridge */ /* synthetic */ Integer getCurrentPosition() {
        return (Integer) i();
    }

    public /* bridge */ /* synthetic */ Integer getDuration() {
        return (Integer) j();
    }

    public void h(float f10) {
        Integer num = this.f37754d;
        if (num != null) {
            l().setRate(num.intValue(), f10);
        }
    }

    public Void i() {
        return null;
    }

    public Void j() {
        return null;
    }

    public final Integer k() {
        return this.f37753c;
    }

    public final c m() {
        return this.f37757g;
    }

    public final o n() {
        return this.f37751a;
    }

    public void pause() {
        Integer num = this.f37754d;
        if (num != null) {
            l().pause(num.intValue());
        }
    }

    public final void q(Integer num) {
        this.f37753c = num;
    }

    public final void r(c cVar) {
        if (cVar != null) {
            synchronized (this.f37756f.d()) {
                Map<c, List<m>> d10 = this.f37756f.d();
                List<m> list = d10.get(cVar);
                if (list == null) {
                    list = new ArrayList<>();
                    d10.put(cVar, list);
                }
                List list2 = list;
                m mVar = (m) y.u(list2);
                if (mVar != null) {
                    boolean n10 = mVar.n().n();
                    n().I(n10);
                    q(mVar.k());
                    o n11 = n();
                    n11.s("Reusing soundId " + k() + " for " + cVar + " is prepared=" + n10 + ' ' + this);
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    n().I(false);
                    n().s(kotlin.jvm.internal.m.m("Fetching actual URL for ", cVar));
                    String d11 = cVar.d();
                    n().s(kotlin.jvm.internal.m.m("Now loading ", d11));
                    int load = l().load(d11, 1);
                    this.f37756f.b().put(Integer.valueOf(load), this);
                    q(Integer.valueOf(load));
                    o n12 = n();
                    n12.s("time to call load() for " + cVar + ": " + (System.currentTimeMillis() - currentTimeMillis) + " player=" + this);
                }
                list2.add(this);
            }
        }
        this.f37757g = cVar;
    }

    public void release() {
        stop();
        Integer num = this.f37753c;
        if (num != null) {
            int intValue = num.intValue();
            c cVar = this.f37757g;
            if (cVar != null) {
                synchronized (this.f37756f.d()) {
                    List list = this.f37756f.d().get(cVar);
                    if (list != null) {
                        if (y.G(list) == this) {
                            this.f37756f.d().remove(cVar);
                            l().unload(intValue);
                            this.f37756f.b().remove(Integer.valueOf(intValue));
                            n().s(kotlin.jvm.internal.m.m("unloaded soundId ", Integer.valueOf(intValue)));
                        } else {
                            list.remove(this);
                        }
                        q((Integer) null);
                        r((c) null);
                        w wVar = w.f38141a;
                    }
                }
            }
        }
    }

    public void reset() {
    }

    public void seekTo(int i10) {
        if (i10 == 0) {
            Integer num = this.f37754d;
            if (num != null) {
                int intValue = num.intValue();
                stop();
                if (n().m()) {
                    l().resume(intValue);
                    return;
                }
                return;
            }
            return;
        }
        s("seek");
        throw new d();
    }

    public void start() {
        Integer num = this.f37754d;
        Integer num2 = this.f37753c;
        if (num != null) {
            l().resume(num.intValue());
        } else if (num2 != null) {
            this.f37754d = Integer.valueOf(l().play(num2.intValue(), this.f37751a.q(), this.f37751a.q(), 0, o(this.f37751a.v()), this.f37751a.o()));
        }
    }

    public void stop() {
        Integer num = this.f37754d;
        if (num != null) {
            l().stop(num.intValue());
            this.f37754d = null;
        }
    }
}
