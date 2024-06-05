package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import b2.o;
import b2.t;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import i2.b;
import m2.a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        t.f(context);
        o.a d10 = o.a().b(queryParameter).d(a.b(intValue));
        if (queryParameter2 != null) {
            d10.c(Base64.decode(queryParameter2, 0));
        }
        t.c().e().v(d10.a(), i10, b.f33242a);
    }
}
