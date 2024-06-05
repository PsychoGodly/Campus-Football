package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
final class zzgb extends zzga {
    zzgb() {
    }

    /* access modifiers changed from: package-private */
    public final int zza(Map.Entry entry) {
        return ((zzgl) entry.getKey()).zza;
    }

    /* access modifiers changed from: package-private */
    public final zzge zzb(Object obj) {
        return ((zzgk) obj).zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzge zzc(Object obj) {
        return ((zzgk) obj).zzi();
    }

    /* access modifiers changed from: package-private */
    public final Object zzd(zzfz zzfz, zzhy zzhy, int i10) {
        return zzfz.zza(zzhy, i10);
    }

    /* access modifiers changed from: package-private */
    public final Object zze(Object obj, zzik zzik, Object obj2, zzfz zzfz, zzge zzge, Object obj3, zzjf zzjf) throws IOException {
        Object zze;
        zzgm zzgm = (zzgm) obj2;
        zzjv zzjv = zzgm.zzb.zzb;
        Object obj4 = null;
        if (zzjv != zzjv.ENUM) {
            switch (zzjv.ordinal()) {
                case 0:
                    obj4 = Double.valueOf(zzik.zza());
                    break;
                case 1:
                    obj4 = Float.valueOf(zzik.zzb());
                    break;
                case 2:
                    obj4 = Long.valueOf(zzik.zzl());
                    break;
                case 3:
                    obj4 = Long.valueOf(zzik.zzo());
                    break;
                case 4:
                    obj4 = Integer.valueOf(zzik.zzg());
                    break;
                case 5:
                    obj4 = Long.valueOf(zzik.zzk());
                    break;
                case 6:
                    obj4 = Integer.valueOf(zzik.zzf());
                    break;
                case 7:
                    obj4 = Boolean.valueOf(zzik.zzN());
                    break;
                case 8:
                    obj4 = zzik.zzr();
                    break;
                case 9:
                    Object zze2 = zzge.zze(zzgm.zzb);
                    if (zze2 instanceof zzgo) {
                        zzil zzb = zzih.zza().zzb(zze2.getClass());
                        if (!((zzgo) zze2).zzF()) {
                            Object zze3 = zzb.zze();
                            zzb.zzg(zze3, zze2);
                            zzge.zzi(zzgm.zzb, zze3);
                            zze2 = zze3;
                        }
                        zzik.zzt(zze2, zzb, zzfz);
                        return obj3;
                    }
                    throw null;
                case 10:
                    Object zze4 = zzge.zze(zzgm.zzb);
                    if (zze4 instanceof zzgo) {
                        zzil zzb2 = zzih.zza().zzb(zze4.getClass());
                        if (!((zzgo) zze4).zzF()) {
                            Object zze5 = zzb2.zze();
                            zzb2.zzg(zze5, zze4);
                            zzge.zzi(zzgm.zzb, zze5);
                            zze4 = zze5;
                        }
                        zzik.zzu(zze4, zzb2, zzfz);
                        return obj3;
                    }
                    throw null;
                case 11:
                    obj4 = zzik.zzp();
                    break;
                case 12:
                    obj4 = Integer.valueOf(zzik.zzj());
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 14:
                    obj4 = Integer.valueOf(zzik.zzh());
                    break;
                case 15:
                    obj4 = Long.valueOf(zzik.zzm());
                    break;
                case 16:
                    obj4 = Integer.valueOf(zzik.zzi());
                    break;
                case 17:
                    obj4 = Long.valueOf(zzik.zzn());
                    break;
            }
            int ordinal = zzgm.zzb.zzb.ordinal();
            if ((ordinal == 9 || ordinal == 10) && (zze = zzge.zze(zzgm.zzb)) != null) {
                byte[] bArr = zzgw.zzd;
                obj4 = ((zzhy) zze).zzW().zzc((zzhy) obj4).zzk();
            }
            zzge.zzi(zzgm.zzb, obj4);
            return obj3;
        }
        zzik.zzg();
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzf(Object obj) {
        ((zzgk) obj).zzb.zzg();
    }

    /* access modifiers changed from: package-private */
    public final void zzg(zzik zzik, Object obj, zzfz zzfz, zzge zzge) throws IOException {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzez zzez, Object obj, zzfz zzfz, zzge zzge) throws IOException {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzjx zzjx, Map.Entry entry) throws IOException {
        zzgl zzgl = (zzgl) entry.getKey();
        zzjv zzjv = zzjv.DOUBLE;
        switch (zzgl.zzb.ordinal()) {
            case 0:
                zzjx.zzf(zzgl.zza, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                zzjx.zzo(zzgl.zza, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                zzjx.zzt(zzgl.zza, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                zzjx.zzK(zzgl.zza, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                zzjx.zzr(zzgl.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                zzjx.zzm(zzgl.zza, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                zzjx.zzk(zzgl.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                zzjx.zzb(zzgl.zza, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                zzjx.zzG(zzgl.zza, (String) entry.getValue());
                return;
            case 9:
                zzjx.zzq(zzgl.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 10:
                zzjx.zzv(zzgl.zza, entry.getValue(), zzih.zza().zzb(entry.getValue().getClass()));
                return;
            case 11:
                zzjx.zzd(zzgl.zza, (zzez) entry.getValue());
                return;
            case 12:
                zzjx.zzI(zzgl.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                zzjx.zzr(zzgl.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                zzjx.zzx(zzgl.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                zzjx.zzz(zzgl.zza, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                zzjx.zzB(zzgl.zza, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                zzjx.zzD(zzgl.zza, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzj(zzhy zzhy) {
        return zzhy instanceof zzgk;
    }
}
