package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaea  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzaea {
    public static String zza(String str) {
        Class<String> cls = String.class;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{cls}).invoke((Object) null, new Object[]{str});
            if (invoke != null && cls.isAssignableFrom(invoke.getClass())) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
