package h5;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.l;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.o1;
import com.google.android.gms.common.api.internal.p1;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.base.zal;
import f5.b;
import m5.i;
import m5.m;
import o5.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public class e extends f {

    /* renamed from: d  reason: collision with root package name */
    public static final int f18826d = f.f18834a;

    /* renamed from: e  reason: collision with root package name */
    private static final Object f18827e = new Object();

    /* renamed from: f  reason: collision with root package name */
    private static final e f18828f = new e();

    /* renamed from: c  reason: collision with root package name */
    private String f18829c;

    public static e q() {
        return f18828f;
    }

    public final boolean A(Context context, b bVar, int i10) {
        PendingIntent p10;
        if (a.a(context) || (p10 = p(context, bVar)) == null) {
            return false;
        }
        x(context, bVar.v(), (String) null, zal.zaa(context, 0, GoogleApiActivity.a(context, p10, i10, true), zal.zaa | 134217728));
        return true;
    }

    public Intent d(Context context, int i10, String str) {
        return super.d(context, i10, str);
    }

    public PendingIntent e(Context context, int i10, int i11) {
        return super.e(context, i10, i11);
    }

    public final String g(int i10) {
        return super.g(i10);
    }

    public int i(Context context) {
        return super.i(context);
    }

    public int j(Context context, int i10) {
        return super.j(context, i10);
    }

    public final boolean m(int i10) {
        return super.m(i10);
    }

    public Dialog o(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return t(activity, i10, f0.b(activity, d(activity, i10, "d"), i11), onCancelListener);
    }

    public PendingIntent p(Context context, b bVar) {
        if (bVar.y()) {
            return bVar.x();
        }
        return e(context, bVar.v(), 0);
    }

    public boolean r(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog o10 = o(activity, i10, i11, onCancelListener);
        if (o10 == null) {
            return false;
        }
        w(activity, o10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void s(Context context, int i10) {
        x(context, i10, (String) null, f(context, i10, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    public final Dialog t(Context context, int i10, f0 f0Var, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(c0.d(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c10 = c0.c(context, i10);
        if (c10 != null) {
            builder.setPositiveButton(c10, f0Var);
        }
        String g10 = c0.g(context, i10);
        if (g10 != null) {
            builder.setTitle(g10);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", new Object[]{Integer.valueOf(i10)}), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(c0.d(activity, 18));
        builder.setPositiveButton(MaxReward.DEFAULT_LABEL, (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        w(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final p1 v(Context context, o1 o1Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        p1 p1Var = new p1(o1Var);
        context.registerReceiver(p1Var, intentFilter);
        p1Var.a(context);
        if (l(context, "com.google.android.gms")) {
            return p1Var;
        }
        o1Var.a();
        p1Var.b();
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.e) {
                m.U1(dialog, onCancelListener).T1(((androidx.fragment.app.e) activity).getSupportFragmentManager(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    /* access modifiers changed from: package-private */
    public final void x(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i10), null}), new IllegalArgumentException());
        if (i10 == 18) {
            y(context);
        } else if (pendingIntent != null) {
            String f10 = c0.f(context, i10);
            String e10 = c0.e(context, i10);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) q.k(context.getSystemService("notification"));
            l.e I = new l.e(context).z(true).k(true).q(f10).I(new l.c().m(e10));
            if (i.f(context)) {
                q.n(m.e());
                I.G(context.getApplicationInfo().icon).D(2);
                if (i.g(context)) {
                    I.a(f5.a.f18072a, resources.getString(b.f18087o), pendingIntent);
                } else {
                    I.o(pendingIntent);
                }
            } else {
                I.G(17301642).K(resources.getString(b.f18080h)).N(System.currentTimeMillis()).o(pendingIntent).p(e10);
            }
            if (m.i()) {
                q.n(m.i());
                synchronized (f18827e) {
                    str2 = this.f18829c;
                }
                if (str2 == null) {
                    str2 = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                    String b10 = c0.b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, b10, 4));
                    } else if (!b10.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b10);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                I.l(str2);
            }
            Notification c10 = I.c();
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                j.f18844b.set(false);
                i11 = 10436;
            } else {
                i11 = 39789;
            }
            notificationManager.notify(i11, c10);
        } else if (i10 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void y(Context context) {
        new o(this, context).sendEmptyMessageDelayed(1, 120000);
    }

    public final boolean z(Activity activity, com.google.android.gms.common.api.internal.i iVar, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog t10 = t(activity, i10, f0.c(iVar, d(activity, i10, "d"), 2), onCancelListener);
        if (t10 == null) {
            return false;
        }
        w(activity, t10, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }
}
