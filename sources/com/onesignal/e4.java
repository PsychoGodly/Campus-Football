package com.onesignal;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import com.onesignal.a4;
import com.onesignal.k3;

/* compiled from: PushRegistratorHMS */
class e4 implements a4 {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f27672a;

    /* renamed from: b  reason: collision with root package name */
    private static a4.a f27673b;

    /* compiled from: PushRegistratorHMS */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f27674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a4.a f27675b;

        a(Context context, a4.a aVar) {
            this.f27674a = context;
            this.f27675b = aVar;
        }

        public void run() {
            try {
                e4.this.d(this.f27674a, this.f27675b);
            } catch (ApiException e10) {
                k3.b(k3.r0.ERROR, "HMS ApiException getting Huawei push token!", e10);
                this.f27675b.a((String) null, e10.getStatusCode() == 907135000 ? -26 : -27);
            }
        }
    }

    e4() {
    }

    private static void c() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void d(android.content.Context r4, com.onesignal.a4.a r5) throws com.huawei.hms.common.ApiException {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.onesignal.OSUtils.p()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x000f
            r4 = 0
            r0 = -28
            r5.a(r4, r0)     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)
            return
        L_0x000f:
            com.huawei.agconnect.config.AGConnectServicesConfig r0 = com.huawei.agconnect.config.AGConnectServicesConfig.fromContext(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "client/app_id"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x0049 }
            com.huawei.hms.aaid.HmsInstanceId r4 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "HCM"
            java.lang.String r4 = r4.getToken(r0, r1)     // Catch:{ all -> 0x0049 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            com.onesignal.k3$r0 r0 = com.onesignal.k3.r0.INFO     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "Device registered for HMS, push token = "
            r1.append(r2)     // Catch:{ all -> 0x0049 }
            r1.append(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0049 }
            com.onesignal.k3.a(r0, r1)     // Catch:{ all -> 0x0049 }
            r0 = 1
            r5.a(r4, r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0044:
            r3.e(r5)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r3)
            return
        L_0x0049:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.e4.d(android.content.Context, com.onesignal.a4$a):void");
    }

    private void e(a4.a aVar) {
        c();
        if (!f27672a) {
            k3.a(k3.r0.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
            aVar.a((String) null, -25);
        }
    }

    public void a(Context context, String str, a4.a aVar) {
        f27673b = aVar;
        new Thread(new a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }
}
