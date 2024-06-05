package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.DialogInterface;
import h5.e;

/* compiled from: GooglePlayServicesUpgradePrompt */
class a0 {

    /* compiled from: GooglePlayServicesUpgradePrompt */
    class a implements Runnable {

        /* renamed from: com.onesignal.a0$a$a  reason: collision with other inner class name */
        /* compiled from: GooglePlayServicesUpgradePrompt */
        class C0290a implements DialogInterface.OnClickListener {
            C0290a() {
            }

            public void onClick(DialogInterface dialogInterface, int i10) {
                t3.j(t3.f28204a, "GT_DO_NOT_SHOW_MISSING_GPS", true);
            }
        }

        /* compiled from: GooglePlayServicesUpgradePrompt */
        class b implements DialogInterface.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Activity f27549a;

            b(Activity activity) {
                this.f27549a = activity;
            }

            public void onClick(DialogInterface dialogInterface, int i10) {
                a0.a(this.f27549a);
            }
        }

        a() {
        }

        public void run() {
            Activity Z = k3.Z();
            if (Z != null) {
                String k10 = OSUtils.k(Z, "onesignal_gms_missing_alert_text", "To receive push notifications please press 'Update' to enable 'Google Play services'.");
                String k11 = OSUtils.k(Z, "onesignal_gms_missing_alert_button_update", "Update");
                String k12 = OSUtils.k(Z, "onesignal_gms_missing_alert_button_skip", "Skip");
                new AlertDialog.Builder(Z).setMessage(k10).setPositiveButton(k11, new b(Z)).setNegativeButton(k12, new C0290a()).setNeutralButton(OSUtils.k(Z, "onesignal_gms_missing_alert_button_close", "Close"), (DialogInterface.OnClickListener) null).create().show();
            }
        }
    }

    /* access modifiers changed from: private */
    public static void a(Activity activity) {
        try {
            e q10 = e.q();
            PendingIntent e10 = q10.e(activity, q10.i(k3.f27912f), 9000);
            if (e10 != null) {
                e10.send();
            }
        } catch (PendingIntent.CanceledException e11) {
            e11.printStackTrace();
        }
    }

    private static boolean c() {
        y a10 = z3.f28487a.a(k3.f27912f, "com.google.android.gms", 128);
        if (!a10.b() || a10.a() == null) {
            return false;
        }
        return !((String) a10.a().applicationInfo.loadLabel(k3.f27912f.getPackageManager())).equals("Market");
    }

    static void d() {
        if (OSUtils.B() && c() && !k3.h0() && !t3.b(t3.f28204a, "GT_DO_NOT_SHOW_MISSING_GPS", false)) {
            OSUtils.T(new a());
        }
    }
}
