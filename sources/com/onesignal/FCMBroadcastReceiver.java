package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.onesignal.k0;
import com.onesignal.k3;

public class FCMBroadcastReceiver extends n0.a {

    class a implements k0.e {
        a() {
        }

        public void a(k0.f fVar) {
            if (fVar == null) {
                FCMBroadcastReceiver.this.j();
            } else if (fVar.a() || fVar.b()) {
                FCMBroadcastReceiver.this.h();
            } else {
                FCMBroadcastReceiver.this.j();
            }
        }
    }

    class b implements k0.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k0.e f27482a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f27483b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f27484c;

        b(k0.e eVar, Context context, Bundle bundle) {
            this.f27482a = eVar;
            this.f27483b = context;
            this.f27484c = bundle;
        }

        public void a(k0.f fVar) {
            if (fVar == null || !fVar.c()) {
                FCMBroadcastReceiver.k(this.f27483b, this.f27484c);
                this.f27482a.a(fVar);
                return;
            }
            this.f27482a.a(fVar);
        }
    }

    private static boolean f(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return false;
        }
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null || "gcm".equals(stringExtra)) {
            return true;
        }
        return false;
    }

    private static void g(Context context, Intent intent, Bundle bundle, k0.e eVar) {
        if (!f(intent)) {
            eVar.a((k0.f) null);
        }
        k0.h(context, bundle, new b(eVar, context, bundle));
    }

    /* access modifiers changed from: private */
    public void h() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    private static m i(Bundle bundle, m mVar) {
        mVar.putString("json_payload", k0.a(bundle).toString());
        mVar.a("timestamp", Long.valueOf(k3.N0().b() / 1000));
        return mVar;
    }

    /* access modifiers changed from: private */
    public void j() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    static void k(Context context, Bundle bundle) {
        k3.r0 r0Var = k3.r0.DEBUG;
        k3.a(r0Var, "startFCMService from: " + context + " and bundle: " + bundle);
        if (!k0.c(bundle)) {
            k3.a(r0Var, "startFCMService with no remote resources, no need for services");
            k0.j(context, i(bundle, o.a()));
            return;
        }
        if ((Integer.parseInt(bundle.getString("pri", "0")) > 9) || Build.VERSION.SDK_INT < 26) {
            try {
                m(context, bundle);
            } catch (IllegalStateException e10) {
                if (Build.VERSION.SDK_INT >= 21) {
                    l(context, bundle);
                    return;
                }
                throw e10;
            }
        } else {
            l(context, bundle);
        }
    }

    private static void l(Context context, Bundle bundle) {
        m i10 = i(bundle, o.a());
        Intent intent = new Intent(context, FCMIntentJobService.class);
        intent.putExtra("Bundle:Parcelable:Extras", (Parcelable) i10.c());
        FCMIntentJobService.j(context, intent);
    }

    private static void m(Context context, Bundle bundle) {
        n0.a.c(context, new Intent().replaceExtras((Bundle) i(bundle, new n()).c()).setComponent(new ComponentName(context.getPackageName(), FCMIntentService.class.getName())));
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && !"google.com/iid".equals(extras.getString("from"))) {
            k3.e1(context);
            g(context, intent, extras, new a());
        }
    }
}
