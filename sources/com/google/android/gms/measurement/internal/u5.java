package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class u5<V> extends FutureTask<V> implements Comparable<u5<V>> {

    /* renamed from: a  reason: collision with root package name */
    private final long f25093a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f25094b;

    /* renamed from: c  reason: collision with root package name */
    private final String f25095c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ q5 f25096d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u5(q5 q5Var, Runnable runnable, boolean z10, String str) {
        super(zzcl.zza().zza(runnable), (Object) null);
        this.f25096d = q5Var;
        q.k(str);
        long andIncrement = q5.f24963l.getAndIncrement();
        this.f25093a = andIncrement;
        this.f25095c = str;
        this.f25094b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            q5Var.zzj().B().a("Tasks index overflow");
        }
    }

    public final /* synthetic */ int compareTo(Object obj) {
        u5 u5Var = (u5) obj;
        boolean z10 = this.f25094b;
        if (z10 != u5Var.f25094b) {
            return z10 ? -1 : 1;
        }
        long j10 = this.f25093a;
        long j11 = u5Var.f25093a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f25096d.zzj().D().b("Two tasks share the same index. index", Long.valueOf(this.f25093a));
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void setException(Throwable th) {
        this.f25096d.zzj().B().b(this.f25095c, th);
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u5(q5 q5Var, Callable<V> callable, boolean z10, String str) {
        super(zzcl.zza().zza(callable));
        this.f25096d = q5Var;
        q.k(str);
        long andIncrement = q5.f24963l.getAndIncrement();
        this.f25093a = andIncrement;
        this.f25095c = str;
        this.f25094b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            q5Var.zzj().B().a("Tasks index overflow");
        }
    }
}
