package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.e;
import androidx.work.p;
import java.util.Collections;
import java.util.List;
import k1.b;
import n1.c;
import s1.j;
import s1.n;

/* compiled from: DelayMetCommandHandler */
public class d implements c, b, n.b {

    /* renamed from: k  reason: collision with root package name */
    private static final String f5218k = p.f("DelayMetCommandHandler");

    /* renamed from: a  reason: collision with root package name */
    private final Context f5219a;

    /* renamed from: b  reason: collision with root package name */
    private final int f5220b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5221c;

    /* renamed from: d  reason: collision with root package name */
    private final e f5222d;

    /* renamed from: f  reason: collision with root package name */
    private final n1.d f5223f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f5224g = new Object();

    /* renamed from: h  reason: collision with root package name */
    private int f5225h = 0;

    /* renamed from: i  reason: collision with root package name */
    private PowerManager.WakeLock f5226i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f5227j = false;

    d(Context context, int i10, String str, e eVar) {
        this.f5219a = context;
        this.f5220b = i10;
        this.f5222d = eVar;
        this.f5221c = str;
        this.f5223f = new n1.d(context, eVar.f(), this);
    }

    private void c() {
        synchronized (this.f5224g) {
            this.f5223f.e();
            this.f5222d.h().c(this.f5221c);
            PowerManager.WakeLock wakeLock = this.f5226i;
            if (wakeLock != null && wakeLock.isHeld()) {
                p.c().a(f5218k, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f5226i, this.f5221c}), new Throwable[0]);
                this.f5226i.release();
            }
        }
    }

    private void g() {
        synchronized (this.f5224g) {
            if (this.f5225h < 2) {
                this.f5225h = 2;
                p c10 = p.c();
                String str = f5218k;
                c10.a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f5221c}), new Throwable[0]);
                Intent g10 = b.g(this.f5219a, this.f5221c);
                e eVar = this.f5222d;
                eVar.k(new e.b(eVar, g10, this.f5220b));
                if (this.f5222d.e().g(this.f5221c)) {
                    p.c().a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f5221c}), new Throwable[0]);
                    Intent f10 = b.f(this.f5219a, this.f5221c);
                    e eVar2 = this.f5222d;
                    eVar2.k(new e.b(eVar2, f10, this.f5220b));
                } else {
                    p.c().a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f5221c}), new Throwable[0]);
                }
            } else {
                p.c().a(f5218k, String.format("Already stopped work for %s", new Object[]{this.f5221c}), new Throwable[0]);
            }
        }
    }

    public void a(String str) {
        p.c().a(f5218k, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        g();
    }

    public void b(List<String> list) {
        g();
    }

    public void d(String str, boolean z10) {
        p.c().a(f5218k, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z10)}), new Throwable[0]);
        c();
        if (z10) {
            Intent f10 = b.f(this.f5219a, this.f5221c);
            e eVar = this.f5222d;
            eVar.k(new e.b(eVar, f10, this.f5220b));
        }
        if (this.f5227j) {
            Intent a10 = b.a(this.f5219a);
            e eVar2 = this.f5222d;
            eVar2.k(new e.b(eVar2, a10, this.f5220b));
        }
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f5226i = j.b(this.f5219a, String.format("%s (%s)", new Object[]{this.f5221c, Integer.valueOf(this.f5220b)}));
        p c10 = p.c();
        String str = f5218k;
        c10.a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f5226i, this.f5221c}), new Throwable[0]);
        this.f5226i.acquire();
        r1.p m10 = this.f5222d.g().q().B().m(this.f5221c);
        if (m10 == null) {
            g();
            return;
        }
        boolean b10 = m10.b();
        this.f5227j = b10;
        if (!b10) {
            p.c().a(str, String.format("No constraints for %s", new Object[]{this.f5221c}), new Throwable[0]);
            f(Collections.singletonList(this.f5221c));
            return;
        }
        this.f5223f.d(Collections.singletonList(m10));
    }

    public void f(List<String> list) {
        if (list.contains(this.f5221c)) {
            synchronized (this.f5224g) {
                if (this.f5225h == 0) {
                    this.f5225h = 1;
                    p.c().a(f5218k, String.format("onAllConstraintsMet for %s", new Object[]{this.f5221c}), new Throwable[0]);
                    if (this.f5222d.e().j(this.f5221c)) {
                        this.f5222d.h().b(this.f5221c, 600000, this);
                    } else {
                        c();
                    }
                } else {
                    p.c().a(f5218k, String.format("Already started work for %s", new Object[]{this.f5221c}), new Throwable[0]);
                }
            }
        }
    }
}
