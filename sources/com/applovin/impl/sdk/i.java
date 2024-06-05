package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.c4;
import com.applovin.impl.ho;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class i implements AppLovinBroadcastManager.Receiver {

    /* renamed from: c  reason: collision with root package name */
    private static AlertDialog f11632c;

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f11633d = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    private final j f11634a;

    /* renamed from: b  reason: collision with root package name */
    private ho f11635b;

    public interface a {
        void a();

        void b();
    }

    i(j jVar, k kVar) {
        this.f11634a = jVar;
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(k kVar, a aVar) {
        if (this.f11634a.f()) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("ConsentAlertManager", "Consent dialog already showing, skip showing of consent alert");
                return;
            }
            return;
        }
        Activity b10 = kVar.e().b();
        if (b10 == null || !c4.a(k.k())) {
            if (b10 == null) {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("ConsentAlertManager", "No parent Activity found - rescheduling consent alert...");
                }
            } else {
                kVar.L();
                if (t.a()) {
                    kVar.L().b("ConsentAlertManager", "No internet available - rescheduling consent alert...");
                }
            }
            f11633d.set(false);
            a(((Long) kVar.a(oj.f10408t0)).longValue(), kVar, aVar);
            return;
        }
        AppLovinSdkUtils.runOnUiThread(new m0(this, kVar, aVar));
    }

    public void a(long j10, k kVar, a aVar) {
        if (j10 > 0) {
            AlertDialog alertDialog = f11632c;
            if (alertDialog == null || !alertDialog.isShowing()) {
                if (f11633d.getAndSet(true)) {
                    if (j10 < this.f11635b.c()) {
                        kVar.L();
                        if (t.a()) {
                            t L = kVar.L();
                            L.a("ConsentAlertManager", "Scheduling consent alert earlier (" + j10 + "ms) than remaining scheduled time (" + this.f11635b.c() + "ms)");
                        }
                        this.f11635b.a();
                    } else {
                        kVar.L();
                        if (t.a()) {
                            t L2 = kVar.L();
                            L2.k("ConsentAlertManager", "Skip scheduling consent alert - one scheduled already with remaining time of " + this.f11635b.c() + " milliseconds");
                            return;
                        }
                        return;
                    }
                }
                kVar.L();
                if (t.a()) {
                    t L3 = kVar.L();
                    L3.a("ConsentAlertManager", "Scheduling consent alert for " + j10 + " milliseconds");
                }
                this.f11635b = ho.a(j10, kVar, new n0(this, kVar, aVar));
            }
        }
    }

    public void onReceive(Intent intent, Map map) {
        if (this.f11635b != null) {
            String action = intent.getAction();
            if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
                this.f11635b.d();
            } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
                this.f11635b.e();
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(k kVar, a aVar) {
        AlertDialog create = new AlertDialog.Builder(kVar.e().b()).setTitle((CharSequence) kVar.a(oj.f10416u0)).setMessage((CharSequence) kVar.a(oj.f10424v0)).setCancelable(false).setPositiveButton((CharSequence) kVar.a(oj.f10432w0), new k0(aVar)).setNegativeButton((CharSequence) kVar.a(oj.f10440x0), new l0(this, aVar, kVar)).create();
        f11632c = create;
        create.show();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i10) {
        aVar.b();
        dialogInterface.dismiss();
        f11633d.set(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, k kVar, DialogInterface dialogInterface, int i10) {
        aVar.a();
        dialogInterface.dismiss();
        f11633d.set(false);
        a(((Long) kVar.a(oj.f10400s0)).longValue(), kVar, aVar);
    }
}
