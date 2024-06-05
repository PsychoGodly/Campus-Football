package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.l0;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.n;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.Objects;

public abstract class d5 {

    class a implements OnSuccessListener {
        a() {
        }

        /* renamed from: a */
        public void onSuccess(AppSetIdInfo appSetIdInfo) {
            Objects.requireNonNull(appSetIdInfo, "info is marked non-null but is null");
            n.a(new n.c(appSetIdInfo.getId(), appSetIdInfo.getScope()));
            l.a(new l.b(appSetIdInfo.getId(), appSetIdInfo.getScope()));
        }
    }

    public static void a(Context context) {
        new Thread(new bw(context)).start();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(Context context) {
        l0.a b10 = l0.b(context);
        n.a(b10);
        l.a(b10);
        if (zp.a("com.google.android.gms.appset.AppSet")) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new a());
            } catch (Throwable unused) {
            }
        }
    }
}
