package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzakb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzakb implements zzale {
    private static final zzakk zza = new zzaka();
    private final zzakk zzb;

    public zzakb() {
        this(new zzakc(zzaja.zza(), zza()));
    }

    private static zzakk zza() {
        try {
            return (zzakk) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return zza;
        }
    }

    private zzakb(zzakk zzakk) {
        this.zzb = (zzakk) zzajf.zza(zzakk, "messageInfoFactory");
    }

    public final <T> zzalf<T> zza(Class<T> cls) {
        Class<zzajc> cls2 = zzajc.class;
        zzalh.zza((Class<?>) cls);
        zzakl zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            if (cls2.isAssignableFrom(cls)) {
                return zzakt.zza(zzalh.zzb(), zzais.zzb(), zza2.zza());
            }
            return zzakt.zza(zzalh.zza(), zzais.zza(), zza2.zza());
        } else if (cls2.isAssignableFrom(cls)) {
            if (zza(zza2)) {
                return zzakr.zza(cls, zza2, zzakx.zzb(), zzajs.zzb(), zzalh.zzb(), zzais.zzb(), zzaki.zzb());
            }
            return zzakr.zza(cls, zza2, zzakx.zzb(), zzajs.zzb(), zzalh.zzb(), (zzaiq<?>) null, zzaki.zzb());
        } else if (zza(zza2)) {
            return zzakr.zza(cls, zza2, zzakx.zza(), zzajs.zza(), zzalh.zza(), zzais.zza(), zzaki.zza());
        } else {
            return zzakr.zza(cls, zza2, zzakx.zza(), zzajs.zza(), zzalh.zza(), (zzaiq<?>) null, zzaki.zza());
        }
    }

    private static boolean zza(zzakl zzakl) {
        return zzakd.zza[zzakl.zzb().ordinal()] != 1;
    }
}
