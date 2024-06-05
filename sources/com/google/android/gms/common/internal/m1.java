package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class m1 implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n1 f15438a;

    /* synthetic */ m1(n1 n1Var, l1 l1Var) {
        this.f15438a = n1Var;
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f15438a.f15442f) {
                j1 j1Var = (j1) message.obj;
                k1 k1Var = (k1) this.f15438a.f15442f.get(j1Var);
                if (k1Var != null && k1Var.i()) {
                    if (k1Var.j()) {
                        k1Var.g("GmsClientSupervisor");
                    }
                    this.f15438a.f15442f.remove(j1Var);
                }
            }
            return true;
        } else if (i10 != 1) {
            return false;
        } else {
            synchronized (this.f15438a.f15442f) {
                j1 j1Var2 = (j1) message.obj;
                k1 k1Var2 = (k1) this.f15438a.f15442f.get(j1Var2);
                if (k1Var2 != null && k1Var2.a() == 3) {
                    String valueOf = String.valueOf(j1Var2);
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                    ComponentName b10 = k1Var2.b();
                    if (b10 == null) {
                        b10 = j1Var2.b();
                    }
                    if (b10 == null) {
                        String d10 = j1Var2.d();
                        q.k(d10);
                        b10 = new ComponentName(d10, "unknown");
                    }
                    k1Var2.onServiceDisconnected(b10);
                }
            }
            return true;
        }
    }
}
