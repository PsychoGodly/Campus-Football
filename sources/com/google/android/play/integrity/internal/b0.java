package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static final n f26072a = new n("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || (r0 = signatureArr.length) == 0) {
                    f26072a.e("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                } else {
                    for (Signature byteArray : signatureArr) {
                        String a10 = a0.a(byteArray.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a10)) {
                            return true;
                        }
                        if ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a10)) {
                            return true;
                        }
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }
}
