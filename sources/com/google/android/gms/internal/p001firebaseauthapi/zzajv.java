package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzajv extends zzajs {
    private static final Class<?> zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzajv() {
        super();
    }

    private static <E> List<E> zzc(Object obj, long j10) {
        return (List) zzamk.zze(obj, j10);
    }

    /* access modifiers changed from: package-private */
    public final <L> List<L> zza(Object obj, long j10) {
        return zza(obj, j10, 10);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j10) {
        Object obj2;
        List list = (List) zzamk.zze(obj, j10);
        if (list instanceof zzajt) {
            obj2 = ((zzajt) list).zzd();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzakz) || !(list instanceof zzajj)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzajj zzajj = (zzajj) list;
                if (zzajj.zzc()) {
                    zzajj.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzamk.zza(obj, j10, obj2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.firebase-auth-api.zzajq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.firebase-auth-api.zzajq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.firebase-auth-api.zzajq} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> zza(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = zzc(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzajt
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.firebase-auth-api.zzajq r0 = new com.google.android.gms.internal.firebase-auth-api.zzajq
            r0.<init>((int) r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzakz
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzajj
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.firebase-auth-api.zzajj r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzajj) r0
            com.google.android.gms.internal.firebase-auth-api.zzajj r6 = r0.zza(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = zza
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzamf
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.firebase-auth-api.zzajq r1 = new com.google.android.gms.internal.firebase-auth-api.zzajq
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.firebase-auth-api.zzamf r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzamf) r0
            r1.addAll(r0)
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzakz
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.p001firebaseauthapi.zzajj
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.firebase-auth-api.zzajj r1 = (com.google.android.gms.internal.p001firebaseauthapi.zzajj) r1
            boolean r2 = r1.zzc()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.firebase-auth-api.zzajj r0 = r1.zza(r0)
            com.google.android.gms.internal.p001firebaseauthapi.zzamk.zza((java.lang.Object) r3, (long) r4, (java.lang.Object) r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzajv.zza(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    public final <E> void zza(Object obj, Object obj2, long j10) {
        List zzc = zzc(obj2, j10);
        List zza2 = zza(obj, j10, zzc.size());
        int size = zza2.size();
        int size2 = zzc.size();
        if (size > 0 && size2 > 0) {
            zza2.addAll(zzc);
        }
        if (size > 0) {
            zzc = zza2;
        }
        zzamk.zza(obj, j10, (Object) zzc);
    }
}
