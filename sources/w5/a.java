package w5;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.stats.zzb;
import com.google.android.gms.internal.stats.zzc;
import com.google.android.gms.internal.stats.zzh;
import com.google.android.gms.internal.stats.zzi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import m5.e;
import m5.h;
import m5.s;

/* compiled from: com.google.android.gms:play-services-stats@@17.0.1 */
public class a {

    /* renamed from: r  reason: collision with root package name */
    private static final long f30796r = TimeUnit.DAYS.toMillis(366);

    /* renamed from: s  reason: collision with root package name */
    private static volatile ScheduledExecutorService f30797s = null;

    /* renamed from: t  reason: collision with root package name */
    private static final Object f30798t = new Object();

    /* renamed from: u  reason: collision with root package name */
    private static volatile e f30799u = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f30800a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f30801b;

    /* renamed from: c  reason: collision with root package name */
    private int f30802c = 0;

    /* renamed from: d  reason: collision with root package name */
    private Future<?> f30803d;

    /* renamed from: e  reason: collision with root package name */
    private long f30804e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<f> f30805f = new HashSet();

    /* renamed from: g  reason: collision with root package name */
    private boolean f30806g = true;

    /* renamed from: h  reason: collision with root package name */
    private int f30807h;

    /* renamed from: i  reason: collision with root package name */
    zzb f30808i;

    /* renamed from: j  reason: collision with root package name */
    private e f30809j = h.d();

    /* renamed from: k  reason: collision with root package name */
    private WorkSource f30810k;

    /* renamed from: l  reason: collision with root package name */
    private final String f30811l;

    /* renamed from: m  reason: collision with root package name */
    private final String f30812m;

    /* renamed from: n  reason: collision with root package name */
    private final Context f30813n;

    /* renamed from: o  reason: collision with root package name */
    private final Map<String, d> f30814o = new HashMap();

    /* renamed from: p  reason: collision with root package name */
    private AtomicInteger f30815p = new AtomicInteger(0);

    /* renamed from: q  reason: collision with root package name */
    private final ScheduledExecutorService f30816q;

    public a(Context context, int i10, String str) {
        String str2;
        String packageName = context.getPackageName();
        q.l(context, "WakeLock: context must not be null");
        q.h(str, "WakeLock: wakeLockName must not be empty");
        this.f30813n = context.getApplicationContext();
        this.f30812m = str;
        this.f30808i = null;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "*gcore*:".concat(valueOf);
            } else {
                str2 = new String("*gcore*:");
            }
            this.f30811l = str2;
        } else {
            this.f30811l = str;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager != null) {
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(i10, str);
            this.f30801b = newWakeLock;
            if (s.c(context)) {
                WorkSource b10 = s.b(context, m5.q.b(packageName) ? context.getPackageName() : packageName);
                this.f30810k = b10;
                if (b10 != null) {
                    i(newWakeLock, b10);
                }
            }
            ScheduledExecutorService scheduledExecutorService = f30797s;
            if (scheduledExecutorService == null) {
                synchronized (f30798t) {
                    scheduledExecutorService = f30797s;
                    if (scheduledExecutorService == null) {
                        zzh.zza();
                        scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                        f30797s = scheduledExecutorService;
                    }
                }
            }
            this.f30816q = scheduledExecutorService;
            return;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("expected a non-null reference", 0, 29);
        throw new zzi(sb2.toString());
    }

    public static /* synthetic */ void e(a aVar) {
        synchronized (aVar.f30800a) {
            if (aVar.b()) {
                Log.e("WakeLock", String.valueOf(aVar.f30811l).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.g();
                if (aVar.b()) {
                    aVar.f30802c = 1;
                    aVar.h(0);
                }
            }
        }
    }

    private final String f(String str) {
        if (this.f30806g) {
            TextUtils.isEmpty((CharSequence) null);
        }
        return null;
    }

    private final void g() {
        if (!this.f30805f.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f30805f);
            this.f30805f.clear();
            if (arrayList.size() > 0) {
                f fVar = (f) arrayList.get(0);
                throw null;
            }
        }
    }

    private final void h(int i10) {
        synchronized (this.f30800a) {
            if (b()) {
                if (this.f30806g) {
                    int i11 = this.f30802c - 1;
                    this.f30802c = i11;
                    if (i11 > 0) {
                        return;
                    }
                } else {
                    this.f30802c = 0;
                }
                g();
                for (d dVar : this.f30814o.values()) {
                    dVar.f30818a = 0;
                }
                this.f30814o.clear();
                Future<?> future = this.f30803d;
                if (future != null) {
                    future.cancel(false);
                    this.f30803d = null;
                    this.f30804e = 0;
                }
                this.f30807h = 0;
                if (this.f30801b.isHeld()) {
                    try {
                        this.f30801b.release();
                        if (this.f30808i != null) {
                            this.f30808i = null;
                        }
                    } catch (RuntimeException e10) {
                        if (e10.getClass().equals(RuntimeException.class)) {
                            Log.e("WakeLock", String.valueOf(this.f30811l).concat(" failed to release!"), e10);
                            if (this.f30808i != null) {
                                this.f30808i = null;
                            }
                            return;
                        }
                        throw e10;
                    } catch (Throwable th) {
                        if (this.f30808i != null) {
                            this.f30808i = null;
                        }
                        throw th;
                    }
                } else {
                    Log.e("WakeLock", String.valueOf(this.f30811l).concat(" should be held!"));
                }
            }
        }
    }

    private static void i(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e10) {
            Log.wtf("WakeLock", e10.toString());
        }
    }

    public void a(long j10) {
        this.f30815p.incrementAndGet();
        long j11 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, f30796r), 1);
        if (j10 > 0) {
            max = Math.min(j10, max);
        }
        synchronized (this.f30800a) {
            if (!b()) {
                this.f30808i = zzb.zza(false, (zzc) null);
                this.f30801b.acquire();
                this.f30809j.b();
            }
            this.f30802c++;
            this.f30807h++;
            f((String) null);
            d dVar = this.f30814o.get((Object) null);
            if (dVar == null) {
                dVar = new d((c) null);
                this.f30814o.put((Object) null, dVar);
            }
            dVar.f30818a++;
            long b10 = this.f30809j.b();
            if (Long.MAX_VALUE - b10 > max) {
                j11 = b10 + max;
            }
            if (j11 > this.f30804e) {
                this.f30804e = j11;
                Future<?> future = this.f30803d;
                if (future != null) {
                    future.cancel(false);
                }
                this.f30803d = this.f30816q.schedule(new b(this), max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f30800a) {
            z10 = this.f30802c > 0;
        }
        return z10;
    }

    public void c() {
        if (this.f30815p.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f30811l).concat(" release without a matched acquire!"));
        }
        synchronized (this.f30800a) {
            f((String) null);
            if (this.f30814o.containsKey((Object) null)) {
                d dVar = this.f30814o.get((Object) null);
                if (dVar != null) {
                    int i10 = dVar.f30818a - 1;
                    dVar.f30818a = i10;
                    if (i10 == 0) {
                        this.f30814o.remove((Object) null);
                    }
                }
            } else {
                Log.w("WakeLock", String.valueOf(this.f30811l).concat(" counter does not exist"));
            }
            h(0);
        }
    }

    public void d(boolean z10) {
        synchronized (this.f30800a) {
            this.f30806g = z10;
        }
    }
}
