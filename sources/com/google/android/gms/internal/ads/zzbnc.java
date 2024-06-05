package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import v4.a;
import v4.f;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbnc extends zzbne {
    private static final zzbpg zza = new zzbpg();

    public final zzbni zzb(String str) throws RemoteException {
        try {
            Class<?> cls = Class.forName(str, false, zzbnc.class.getClassLoader());
            if (f.class.isAssignableFrom(cls)) {
                return new zzbof((f) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            if (a.class.isAssignableFrom(cls)) {
                return new zzbof((a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            zzbza.zzj("Could not instantiate mediation adapter: " + str + " (not a valid adapter).");
            throw new RemoteException();
        } catch (Throwable th) {
            zzbza.zzk("Could not instantiate mediation adapter: " + str + ". ", th);
        }
        throw new RemoteException();
    }

    public final zzbpc zzc(String str) throws RemoteException {
        try {
            return new zzbpo((RtbAdapter) Class.forName(str, false, zzbpg.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable unused) {
            throw new RemoteException();
        }
    }

    public final boolean zzd(String str) throws RemoteException {
        try {
            return a.class.isAssignableFrom(Class.forName(str, false, zzbnc.class.getClassLoader()));
        } catch (Throwable unused) {
            zzbza.zzj("Could not load custom event implementation class as Adapter: " + str + ", assuming old custom event implementation.");
            return false;
        }
    }

    public final boolean zze(String str) throws RemoteException {
        try {
            return w4.a.class.isAssignableFrom(Class.forName(str, false, zzbnc.class.getClassLoader()));
        } catch (Throwable unused) {
            zzbza.zzj("Could not load custom event implementation class: " + str + ", trying Adapter implementation class.");
            return false;
        }
    }
}
