package androidx.work;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import r1.p;

/* compiled from: WorkRequest */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    private UUID f5110a;

    /* renamed from: b  reason: collision with root package name */
    private p f5111b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f5112c;

    /* compiled from: WorkRequest */
    public static abstract class a<B extends a<?, ?>, W extends a0> {

        /* renamed from: a  reason: collision with root package name */
        boolean f5113a = false;

        /* renamed from: b  reason: collision with root package name */
        UUID f5114b = UUID.randomUUID();

        /* renamed from: c  reason: collision with root package name */
        p f5115c;

        /* renamed from: d  reason: collision with root package name */
        Set<String> f5116d = new HashSet();

        /* renamed from: e  reason: collision with root package name */
        Class<? extends ListenableWorker> f5117e;

        a(Class<? extends ListenableWorker> cls) {
            this.f5117e = cls;
            this.f5115c = new p(this.f5114b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f5116d.add(str);
            return d();
        }

        public final W b() {
            W c10 = c();
            c cVar = this.f5115c.f21935j;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = (i10 >= 24 && cVar.e()) || cVar.f() || cVar.g() || (i10 >= 23 && cVar.h());
            p pVar = this.f5115c;
            if (pVar.f21942q) {
                if (z10) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                } else if (pVar.f21932g > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f5114b = UUID.randomUUID();
            p pVar2 = new p(this.f5115c);
            this.f5115c = pVar2;
            pVar2.f21926a = this.f5114b.toString();
            return c10;
        }

        /* access modifiers changed from: package-private */
        public abstract W c();

        /* access modifiers changed from: package-private */
        public abstract B d();

        public final B e(a aVar, long j10, TimeUnit timeUnit) {
            this.f5113a = true;
            p pVar = this.f5115c;
            pVar.f21937l = aVar;
            pVar.e(timeUnit.toMillis(j10));
            return d();
        }

        public final B f(c cVar) {
            this.f5115c.f21935j = cVar;
            return d();
        }

        public B g(long j10, TimeUnit timeUnit) {
            this.f5115c.f21932g = timeUnit.toMillis(j10);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f5115c.f21932g) {
                return d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        public final B h(e eVar) {
            this.f5115c.f21930e = eVar;
            return d();
        }
    }

    protected a0(UUID uuid, p pVar, Set<String> set) {
        this.f5110a = uuid;
        this.f5111b = pVar;
        this.f5112c = set;
    }

    public UUID a() {
        return this.f5110a;
    }

    public String b() {
        return this.f5110a.toString();
    }

    public Set<String> c() {
        return this.f5112c;
    }

    public p d() {
        return this.f5111b;
    }
}
