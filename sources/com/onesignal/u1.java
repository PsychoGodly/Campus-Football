package com.onesignal;

import com.onesignal.k3;

/* compiled from: OSLogWrapper */
class u1 implements v1 {
    u1() {
    }

    public void a(String str) {
        k3.a(k3.r0.ERROR, str);
    }

    public void b(String str) {
        k3.a(k3.r0.VERBOSE, str);
    }

    public void c(String str, Throwable th) {
        k3.b(k3.r0.ERROR, str, th);
    }

    public void d(String str) {
        k3.a(k3.r0.DEBUG, str);
    }

    public void e(String str) {
        k3.a(k3.r0.WARN, str);
    }

    public void f(String str) {
        k3.a(k3.r0.INFO, str);
    }
}
