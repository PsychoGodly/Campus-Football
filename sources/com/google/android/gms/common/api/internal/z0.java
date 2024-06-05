package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class z0 extends zaq {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a1 f15337a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    z0(a1 a1Var, Looper looper) {
        super(looper);
        this.f15337a = a1Var;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ((y0) message.obj).b(this.f15337a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GACStateManager", sb2.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
