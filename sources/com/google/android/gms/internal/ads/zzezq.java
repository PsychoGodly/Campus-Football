package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.l1;
import com.google.android.gms.ads.internal.client.m1;
import com.google.android.gms.ads.internal.client.q3;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzezq {
    private static zzezq zza;
    private final Context zzb;
    private final m1 zzc;
    private final AtomicReference zzd = new AtomicReference();

    zzezq(Context context, m1 m1Var) {
        this.zzb = context;
        this.zzc = m1Var;
    }

    static m1 zza(Context context) {
        try {
            return l1.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context}));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            zzbza.zzh("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    public static zzezq zzd(Context context) {
        synchronized (zzezq.class) {
            zzezq zzezq = zza;
            if (zzezq != null) {
                return zzezq;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbcn.zzb.zze()).longValue();
            m1 m1Var = null;
            if (longValue > 0 && longValue <= 230500000) {
                m1Var = zza(applicationContext);
            }
            zzezq zzezq2 = new zzezq(applicationContext, m1Var);
            zza = zzezq2;
            return zzezq2;
        }
    }

    public final zzbnf zzb() {
        return (zzbnf) this.zzd.get();
    }

    public final zzbzg zzc(int i10, boolean z10, int i11) {
        t.r();
        boolean a10 = b2.a(this.zzb);
        zzbzg zzbzg = new zzbzg(ModuleDescriptor.MODULE_VERSION, i11, true, a10);
        if (!((Boolean) zzbcn.zzc.zze()).booleanValue()) {
            return zzbzg;
        }
        m1 m1Var = this.zzc;
        q3 q3Var = null;
        if (m1Var != null) {
            try {
                q3Var = m1Var.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        if (q3Var == null) {
            return zzbzg;
        }
        return new zzbzg(ModuleDescriptor.MODULE_VERSION, q3Var.zza(), true, a10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zze(com.google.android.gms.internal.ads.zzbnf r4) {
        /*
            r3 = this;
            com.google.android.gms.internal.ads.zzbbw r0 = com.google.android.gms.internal.ads.zzbcn.zza
            java.lang.Object r0 = r0.zze()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0022
            com.google.android.gms.ads.internal.client.m1 r0 = r3.zzc
            if (r0 != 0) goto L_0x0015
        L_0x0013:
            r0 = r1
            goto L_0x0019
        L_0x0015:
            com.google.android.gms.internal.ads.zzbnf r0 = r0.getAdapterCreator()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0019:
            java.util.concurrent.atomic.AtomicReference r2 = r3.zzd
            if (r0 == 0) goto L_0x001e
            r4 = r0
        L_0x001e:
            com.google.android.gms.internal.ads.zzezp.zza(r2, r1, r4)
            return
        L_0x0022:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            com.google.android.gms.internal.ads.zzezp.zza(r0, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzezq.zze(com.google.android.gms.internal.ads.zzbnf):void");
    }
}
