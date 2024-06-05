package k4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: NetworkTypeObserver */
public final class y {

    /* renamed from: e  reason: collision with root package name */
    private static y f19814e;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f19815a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f19816b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Object f19817c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f19818d = 0;

    /* compiled from: NetworkTypeObserver */
    private static final class b {

        /* compiled from: NetworkTypeObserver */
        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a  reason: collision with root package name */
            private final y f19819a;

            public a(y yVar) {
                this.f19819a = yVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                int i10 = 5;
                boolean z10 = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
                y yVar = this.f19819a;
                if (z10) {
                    i10 = 10;
                }
                yVar.k(i10);
            }
        }

        public static void a(Context context, y yVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(yVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                yVar.k(5);
            }
        }
    }

    /* compiled from: NetworkTypeObserver */
    public interface c {
        void a(int i10);
    }

    /* compiled from: NetworkTypeObserver */
    private final class d extends BroadcastReceiver {
        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            int b10 = y.g(context);
            if (n0.f19738a < 31 || b10 != 5) {
                y.this.k(b10);
            } else {
                b.a(context, y.this);
            }
        }
    }

    private y(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized y d(Context context) {
        y yVar;
        synchronized (y.class) {
            if (f19814e == null) {
                f19814e = new y(context);
            }
            yVar = f19814e;
        }
        return yVar;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return n0.f19738a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator<WeakReference<c>> it = this.f19816b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f19816b.remove(next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r0.hasNext() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0018, code lost:
        r1 = r0.next();
        r2 = (k4.y.c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        if (r2 == null) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r3.f19816b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000c, code lost:
        r0 = r3.f19816b.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f19817c
            monitor-enter(r0)
            int r1 = r3.f19818d     // Catch:{ all -> 0x0031 }
            if (r1 != r4) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            return
        L_0x0009:
            r3.f19818d = r4     // Catch:{ all -> 0x0031 }
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<k4.y$c>> r0 = r3.f19816b
            java.util.Iterator r0 = r0.iterator()
        L_0x0012:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0030
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            k4.y$c r2 = (k4.y.c) r2
            if (r2 == 0) goto L_0x002a
            r2.a(r4)
            goto L_0x0012
        L_0x002a:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<k4.y$c>> r2 = r3.f19816b
            r2.remove(r1)
            goto L_0x0012
        L_0x0030:
            return
        L_0x0031:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.y.k(int):void");
    }

    public int f() {
        int i10;
        synchronized (this.f19817c) {
            i10 = this.f19818d;
        }
        return i10;
    }

    public void i(c cVar) {
        j();
        this.f19816b.add(new WeakReference(cVar));
        this.f19815a.post(new x(this, cVar));
    }
}
