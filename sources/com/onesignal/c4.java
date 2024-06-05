package com.onesignal;

import android.content.Context;
import com.onesignal.a4;
import com.onesignal.k3;
import java.io.IOException;

/* compiled from: PushRegistratorAbstractGoogle */
abstract class c4 implements a4 {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static int f27583d = 5;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static int f27584e = 10000;

    /* renamed from: a  reason: collision with root package name */
    private a4.a f27585a;

    /* renamed from: b  reason: collision with root package name */
    private Thread f27586b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f27587c;

    /* compiled from: PushRegistratorAbstractGoogle */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f27588a;

        a(String str) {
            this.f27588a = str;
        }

        public void run() {
            int i10 = 0;
            while (i10 < c4.f27583d && !c4.this.e(this.f27588a, i10)) {
                i10++;
                OSUtils.W(c4.f27584e * i10);
            }
        }
    }

    c4() {
    }

    /* access modifiers changed from: private */
    public boolean e(String str, int i10) {
        try {
            String g10 = g(str);
            k3.r0 r0Var = k3.r0.INFO;
            k3.a(r0Var, "Device registered, push token = " + g10);
            this.f27585a.a(g10, 1);
            return true;
        } catch (IOException e10) {
            int j10 = j(e10);
            String l10 = OSUtils.l(e10);
            if ("SERVICE_NOT_AVAILABLE".equals(l10) || "AUTHENTICATION_FAILED".equals(l10)) {
                Exception exc = new Exception(e10);
                if (i10 >= f27583d - 1) {
                    k3.r0 r0Var2 = k3.r0.ERROR;
                    k3.b(r0Var2, "Retry count of " + f27583d + " exceed! Could not get a " + f() + " Token.", exc);
                } else {
                    k3.r0 r0Var3 = k3.r0.INFO;
                    k3.b(r0Var3, "'Google Play services' returned " + l10 + " error. Current retry count: " + i10, exc);
                    if (i10 == 2) {
                        this.f27585a.a((String) null, j10);
                        this.f27587c = true;
                        return true;
                    }
                }
                return false;
            }
            Exception exc2 = new Exception(e10);
            k3.r0 r0Var4 = k3.r0.ERROR;
            k3.b(r0Var4, "Error Getting " + f() + " Token", exc2);
            if (!this.f27587c) {
                this.f27585a.a((String) null, j10);
            }
            return true;
        } catch (Throwable th) {
            Exception exc3 = new Exception(th);
            int j11 = j(th);
            k3.r0 r0Var5 = k3.r0.ERROR;
            k3.b(r0Var5, "Unknown error getting " + f() + " Token", exc3);
            this.f27585a.a((String) null, j11);
            return true;
        }
    }

    private void h(String str) {
        try {
            if (OSUtils.D()) {
                k(str);
                return;
            }
            a0.d();
            k3.a(k3.r0.ERROR, "'Google Play services' app not installed or disabled on the device.");
            this.f27585a.a((String) null, -7);
        } catch (Throwable th) {
            k3.r0 r0Var = k3.r0.ERROR;
            k3.b(r0Var, "Could not register with " + f() + " due to an issue with your AndroidManifest.xml or with 'Google Play services'.", th);
            this.f27585a.a((String) null, -8);
        }
    }

    private boolean i(String str, a4.a aVar) {
        boolean z10;
        try {
            Float.parseFloat(str);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        k3.a(k3.r0.ERROR, "Missing Google Project number!\nPlease enter a Google Project number / Sender ID on under App Settings > Android > Configuration on the OneSignal dashboard.");
        aVar.a((String) null, -6);
        return false;
    }

    private static int j(Throwable th) {
        String l10 = OSUtils.l(th);
        if (!(th instanceof IOException)) {
            return -12;
        }
        if ("SERVICE_NOT_AVAILABLE".equals(l10)) {
            return -9;
        }
        return "AUTHENTICATION_FAILED".equals(l10) ? -29 : -11;
    }

    private synchronized void k(String str) {
        Thread thread = this.f27586b;
        if (thread == null || !thread.isAlive()) {
            Thread thread2 = new Thread(new a(str));
            this.f27586b = thread2;
            thread2.start();
        }
    }

    public void a(Context context, String str, a4.a aVar) {
        this.f27585a = aVar;
        if (i(str, aVar)) {
            h(str);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract String f();

    /* access modifiers changed from: package-private */
    public abstract String g(String str) throws Throwable;
}
