package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: InstanceManager */
public class d4 {

    /* renamed from: a  reason: collision with root package name */
    private final WeakHashMap<Object, Long> f34212a = new WeakHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<Long, WeakReference<Object>> f34213b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Long, Object> f34214c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private final ReferenceQueue<Object> f34215d = new ReferenceQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<WeakReference<Object>, Long> f34216e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    private final Handler f34217f;

    /* renamed from: g  reason: collision with root package name */
    private final a f34218g;

    /* renamed from: h  reason: collision with root package name */
    private long f34219h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f34220i;

    /* compiled from: InstanceManager */
    public interface a {
        void a(long j10);
    }

    private d4(a aVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f34217f = handler;
        this.f34219h = 65536;
        this.f34220i = false;
        this.f34218g = aVar;
        handler.postDelayed(new c4(this), 3000);
    }

    private void d(Object obj, long j10) {
        if (j10 < 0) {
            throw new IllegalArgumentException(String.format("Identifier must be >= 0: %d", new Object[]{Long.valueOf(j10)}));
        } else if (!this.f34213b.containsKey(Long.valueOf(j10))) {
            WeakReference weakReference = new WeakReference(obj, this.f34215d);
            this.f34212a.put(obj, Long.valueOf(j10));
            this.f34213b.put(Long.valueOf(j10), weakReference);
            this.f34216e.put(weakReference, Long.valueOf(j10));
            this.f34214c.put(Long.valueOf(j10), obj);
        } else {
            throw new IllegalArgumentException(String.format("Identifier has already been added: %d", new Object[]{Long.valueOf(j10)}));
        }
    }

    public static d4 g(a aVar) {
        return new d4(aVar);
    }

    private void k() {
        if (j()) {
            Log.w("InstanceManager", "The manager was used after calls to the FinalizationListener have been stopped.");
        }
    }

    /* access modifiers changed from: private */
    public void l() {
        if (!j()) {
            while (true) {
                WeakReference weakReference = (WeakReference) this.f34215d.poll();
                if (weakReference != null) {
                    Long remove = this.f34216e.remove(weakReference);
                    if (remove != null) {
                        this.f34213b.remove(remove);
                        this.f34214c.remove(remove);
                        this.f34218g.a(remove.longValue());
                    }
                } else {
                    this.f34217f.postDelayed(new c4(this), 3000);
                    return;
                }
            }
        }
    }

    public void b(Object obj, long j10) {
        k();
        d(obj, j10);
    }

    public long c(Object obj) {
        k();
        if (!f(obj)) {
            long j10 = this.f34219h;
            this.f34219h = 1 + j10;
            d(obj, j10);
            return j10;
        }
        throw new IllegalArgumentException("Instance of " + obj.getClass() + " has already been added.");
    }

    public void e() {
        this.f34212a.clear();
        this.f34213b.clear();
        this.f34214c.clear();
        this.f34216e.clear();
    }

    public boolean f(Object obj) {
        k();
        return this.f34212a.containsKey(obj);
    }

    public Long h(Object obj) {
        k();
        Long l10 = this.f34212a.get(obj);
        if (l10 != null) {
            this.f34214c.put(l10, obj);
        }
        return l10;
    }

    public <T> T i(long j10) {
        k();
        WeakReference weakReference = this.f34213b.get(Long.valueOf(j10));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public boolean j() {
        return this.f34220i;
    }

    public <T> T m(long j10) {
        k();
        return this.f34214c.remove(Long.valueOf(j10));
    }

    public void n() {
        this.f34217f.removeCallbacks(new c4(this));
        this.f34220i = true;
    }
}
