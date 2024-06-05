package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zaq;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
final class u0 extends zaq {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ w0 f15263a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u0(w0 w0Var, Looper looper) {
        super(looper);
        this.f15263a = w0Var;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            w0.p(this.f15263a);
        } else if (i10 != 2) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Unknown message id: ");
            sb2.append(i10);
            Log.w("GoogleApiClientImpl", sb2.toString());
        } else {
            w0.o(this.f15263a);
        }
    }
}
