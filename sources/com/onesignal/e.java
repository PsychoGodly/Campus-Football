package com.onesignal;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import java.util.Arrays;
import kotlin.jvm.internal.m;

/* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f27655a = new e();

    /* compiled from: AlertDialogPrepromptForAndroidSettings.kt */
    public interface a {
        void a();

        void b();
    }

    private e() {
    }

    /* access modifiers changed from: private */
    public static final void d(a aVar, DialogInterface dialogInterface, int i10) {
        m.e(aVar, "$callback");
        aVar.a();
    }

    /* access modifiers changed from: private */
    public static final void e(a aVar, DialogInterface dialogInterface, int i10) {
        m.e(aVar, "$callback");
        aVar.b();
    }

    public final void c(Activity activity, String str, String str2, a aVar) {
        m.e(activity, "activity");
        m.e(str, "titlePrefix");
        m.e(str2, "previouslyDeniedPostfix");
        m.e(aVar, "callback");
        String string = activity.getString(i4.permission_not_available_title);
        m.d(string, "activity.getString(R.str…sion_not_available_title)");
        String format = String.format(string, Arrays.copyOf(new Object[]{str}, 1));
        m.d(format, "java.lang.String.format(this, *args)");
        String string2 = activity.getString(i4.permission_not_available_message);
        m.d(string2, "activity.getString(R.str…on_not_available_message)");
        String format2 = String.format(string2, Arrays.copyOf(new Object[]{str2}, 1));
        m.d(format2, "java.lang.String.format(this, *args)");
        new AlertDialog.Builder(activity).setTitle(format).setMessage(format2).setPositiveButton(i4.permission_not_available_open_settings_option, new d(aVar)).setNegativeButton(17039369, new c(aVar)).show();
    }
}
