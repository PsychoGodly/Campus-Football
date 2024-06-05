package com.startapp;

import android.os.Build;

/* compiled from: Sta */
public abstract class t3 implements Runnable, Comparable<t3> {

    /* renamed from: a  reason: collision with root package name */
    public final i3 f17286a;

    /* renamed from: b  reason: collision with root package name */
    public final k3 f17287b;

    /* renamed from: c  reason: collision with root package name */
    public final n3 f17288c;

    /* renamed from: d  reason: collision with root package name */
    public final Exception f17289d = new Exception();

    public t3(i3 i3Var, k3 k3Var, n3 n3Var) {
        this.f17286a = i3Var;
        this.f17287b = k3Var;
        this.f17288c = n3Var;
    }

    public abstract int a() throws Exception;

    public Throwable a(Throwable th) {
        if (Build.VERSION.SDK_INT >= 19) {
            th.addSuppressed(this.f17289d);
        }
        return th;
    }

    public int compareTo(Object obj) {
        return ((t3) obj).f17287b.f16021c - this.f17287b.f16021c;
    }

    public final void run() {
        n3 n3Var;
        int i10 = 0;
        try {
            i10 = a();
            n3Var = this.f17288c;
            if (n3Var == null) {
                return;
            }
        } catch (OutOfMemoryError unused) {
            if (this.f17288c != null) {
                this.f17288c.a(this.f17286a, 0);
                return;
            }
            return;
        } catch (Throwable th) {
            n3 n3Var2 = this.f17288c;
            if (n3Var2 != null) {
                n3Var2.a(this.f17286a, 0);
            }
            throw th;
        }
        n3Var.a(this.f17286a, i10);
    }
}
