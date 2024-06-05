package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class a2 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b2 f14769a;

    /* synthetic */ a2(b2 b2Var, z1 z1Var) {
        this.f14769a = b2Var;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            this.f14769a.f14776c = true;
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.f14769a.f14776c = false;
        }
    }
}
