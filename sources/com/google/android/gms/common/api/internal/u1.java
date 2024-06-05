package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.UnityAdsConstants;
import m5.b;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class u1<T> implements OnCompleteListener<T> {

    /* renamed from: a  reason: collision with root package name */
    private final f f15264a;

    /* renamed from: b  reason: collision with root package name */
    private final int f15265b;

    /* renamed from: c  reason: collision with root package name */
    private final b<?> f15266c;

    /* renamed from: d  reason: collision with root package name */
    private final long f15267d;

    /* renamed from: e  reason: collision with root package name */
    private final long f15268e;

    u1(f fVar, int i10, b<?> bVar, long j10, long j11, String str, String str2) {
        this.f15264a = fVar;
        this.f15265b = i10;
        this.f15266c = bVar;
        this.f15267d = j10;
        this.f15268e = j11;
    }

    static <T> u1<T> a(f fVar, int i10, b<?> bVar) {
        boolean z10;
        if (!fVar.f()) {
            return null;
        }
        s a10 = r.b().a();
        if (a10 == null) {
            z10 = true;
        } else if (!a10.x()) {
            return null;
        } else {
            z10 = a10.y();
            i1 w10 = fVar.w(bVar);
            if (w10 != null) {
                if (!(w10.s() instanceof c)) {
                    return null;
                }
                c cVar = (c) w10.s();
                if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                    e b10 = b(w10, cVar, i10);
                    if (b10 == null) {
                        return null;
                    }
                    w10.D();
                    z10 = b10.z();
                }
            }
        }
        return new u1(fVar, i10, bVar, z10 ? System.currentTimeMillis() : 0, z10 ? SystemClock.elapsedRealtime() : 0, (String) null, (String) null);
    }

    private static e b(i1<?> i1Var, c<?> cVar, int i10) {
        int[] w10;
        int[] x10;
        e telemetryConfiguration = cVar.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.y() || ((w10 = telemetryConfiguration.w()) != null ? !b.a(w10, i10) : !((x10 = telemetryConfiguration.x()) == null || !b.a(x10, i10))) || i1Var.p() >= telemetryConfiguration.v()) {
            return null;
        }
        return telemetryConfiguration;
    }

    public final void onComplete(Task<T> task) {
        i1 w10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        int i16;
        if (this.f15264a.f()) {
            s a10 = r.b().a();
            if ((a10 == null || a10.x()) && (w10 = this.f15264a.w(this.f15266c)) != null && (w10.s() instanceof c)) {
                c cVar = (c) w10.s();
                boolean z10 = true;
                boolean z11 = this.f15267d > 0;
                int gCoreServiceId = cVar.getGCoreServiceId();
                if (a10 != null) {
                    boolean y10 = z11 & a10.y();
                    int v10 = a10.v();
                    int w11 = a10.w();
                    i12 = a10.z();
                    if (cVar.hasConnectionInfo() && !cVar.isConnecting()) {
                        e b10 = b(w10, cVar, this.f15265b);
                        if (b10 != null) {
                            if (!b10.z() || this.f15267d <= 0) {
                                z10 = false;
                            }
                            w11 = b10.v();
                            y10 = z10;
                        } else {
                            return;
                        }
                    }
                    i11 = v10;
                    i10 = w11;
                } else {
                    i12 = 0;
                    i11 = UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS;
                    i10 = 100;
                }
                f fVar = this.f15264a;
                if (task.isSuccessful()) {
                    i14 = 0;
                    i13 = 0;
                } else {
                    if (task.isCanceled()) {
                        i14 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.b) {
                            Status status = ((com.google.android.gms.common.api.b) exception).getStatus();
                            int w12 = status.w();
                            h5.b v11 = status.v();
                            if (v11 == null) {
                                i16 = -1;
                            } else {
                                i16 = v11.v();
                            }
                            i13 = i16;
                            i14 = w12;
                        } else {
                            i14 = 101;
                        }
                    }
                    i13 = -1;
                }
                if (z11) {
                    long j12 = this.f15267d;
                    j10 = System.currentTimeMillis();
                    j11 = j12;
                    i15 = (int) (SystemClock.elapsedRealtime() - this.f15268e);
                } else {
                    j11 = 0;
                    j10 = 0;
                    i15 = -1;
                }
                fVar.H(new o(this.f15265b, i14, i13, j11, j10, (String) null, (String) null, gCoreServiceId, i15), i12, (long) i11, i10);
            }
        }
    }
}
