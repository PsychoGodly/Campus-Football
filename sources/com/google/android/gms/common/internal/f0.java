package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public abstract class f0 implements DialogInterface.OnClickListener {
    public static f0 b(Activity activity, Intent intent, int i10) {
        return new d0(intent, activity, i10);
    }

    public static f0 c(i iVar, Intent intent, int i10) {
        return new e0(intent, iVar, 2);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            a();
        } catch (ActivityNotFoundException e10) {
            String str = "Failed to start resolution intent.";
            if (true == Build.FINGERPRINT.contains("generic")) {
                str = "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.";
            }
            Log.e("DialogRedirect", str, e10);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
