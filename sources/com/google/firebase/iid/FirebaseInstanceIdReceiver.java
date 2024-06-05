package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.i0;
import com.google.firebase.messaging.m;
import com.unity3d.services.UnityAdsConstants;
import g5.a;
import g5.b;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends b {
    private static Intent g(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    public int b(Context context, a aVar) {
        try {
            return ((Integer) Tasks.await(new m(context).k(aVar.v()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        }
    }

    /* access modifiers changed from: protected */
    public void c(Context context, Bundle bundle) {
        Intent g10 = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (i0.B(g10)) {
            i0.s(g10);
        }
    }
}
