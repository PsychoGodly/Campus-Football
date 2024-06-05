package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public class zzacq {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzacq";

    private zzacq() {
    }

    public static Object zza(String str, Type type) throws zzaaf {
        if (type == String.class) {
            try {
                zzael zzael = (zzael) new zzael().zza(str);
                if (zzael.zzb()) {
                    return zzael.zza();
                }
                throw new zzaaf("No error message: " + str);
            } catch (Exception e10) {
                String message = e10.getMessage();
                throw new zzaaf("Json conversion failed! " + message, e10);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                try {
                    return ((zzacs) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0])).zza(str);
                } catch (Exception e11) {
                    String message2 = e11.getMessage();
                    throw new zzaaf("Json conversion failed! " + message2, e11);
                }
            } catch (Exception e12) {
                String valueOf = String.valueOf(type);
                throw new zzaaf("Instantiation of JsonResponse failed! " + valueOf, e12);
            }
        }
    }
}
