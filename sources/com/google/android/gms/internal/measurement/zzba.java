package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzba extends zzay {
    public zzba() {
        this.zza.add(zzbv.EQUALS);
        this.zza.add(zzbv.GREATER_THAN);
        this.zza.add(zzbv.GREATER_THAN_EQUALS);
        this.zza.add(zzbv.IDENTITY_EQUALS);
        this.zza.add(zzbv.IDENTITY_NOT_EQUALS);
        this.zza.add(zzbv.LESS_THAN);
        this.zza.add(zzbv.LESS_THAN_EQUALS);
        this.zza.add(zzbv.NOT_EQUALS);
    }

    private static boolean zzb(zzaq zzaq, zzaq zzaq2) {
        if (zzaq instanceof zzak) {
            zzaq = new zzas(zzaq.zzf());
        }
        if (zzaq2 instanceof zzak) {
            zzaq2 = new zzas(zzaq2.zzf());
        }
        if ((zzaq instanceof zzas) && (zzaq2 instanceof zzas)) {
            return zzaq.zzf().compareTo(zzaq2.zzf()) < 0;
        }
        double doubleValue = zzaq.zze().doubleValue();
        double doubleValue2 = zzaq2.zze().doubleValue();
        return !Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && !(doubleValue == 0.0d && doubleValue2 == -0.0d) && (!(doubleValue == -0.0d && doubleValue2 == 0.0d) && Double.compare(doubleValue, doubleValue2) < 0);
    }

    private static boolean zzc(zzaq zzaq, zzaq zzaq2) {
        if (zzaq instanceof zzak) {
            zzaq = new zzas(zzaq.zzf());
        }
        if (zzaq2 instanceof zzak) {
            zzaq2 = new zzas(zzaq2.zzf());
        }
        if (((!(zzaq instanceof zzas) || !(zzaq2 instanceof zzas)) && (Double.isNaN(zzaq.zze().doubleValue()) || Double.isNaN(zzaq2.zze().doubleValue()))) || zzb(zzaq2, zzaq)) {
            return false;
        }
        return true;
    }

    public final zzaq zza(String str, zzh zzh, List<zzaq> list) {
        boolean z10;
        boolean z11;
        zzg.zza(zzg.zza(str), 2, list);
        zzaq zza = zzh.zza(list.get(0));
        zzaq zza2 = zzh.zza(list.get(1));
        switch (zzbd.zza[zzg.zza(str).ordinal()]) {
            case 1:
                z10 = zza(zza, zza2);
                break;
            case 2:
                z10 = zzb(zza2, zza);
                break;
            case 3:
                z10 = zzc(zza2, zza);
                break;
            case 4:
                z10 = zzg.zza(zza, zza2);
                break;
            case 5:
                z11 = zzg.zza(zza, zza2);
                break;
            case 6:
                z10 = zzb(zza, zza2);
                break;
            case 7:
                z10 = zzc(zza, zza2);
                break;
            case 8:
                z11 = zza(zza, zza2);
                break;
            default:
                return super.zza(str);
        }
        z10 = !z11;
        return z10 ? zzaq.zzh : zzaq.zzi;
    }

    private static boolean zza(zzaq zzaq, zzaq zzaq2) {
        zzaq zzaq3;
        zzaq zzas;
        while (!zzaq.getClass().equals(zzaq2.getClass())) {
            if (((zzaq instanceof zzax) || (zzaq instanceof zzao)) && ((zzaq2 instanceof zzax) || (zzaq2 instanceof zzao))) {
                return true;
            }
            boolean z10 = zzaq instanceof zzai;
            if (!z10 || !(zzaq2 instanceof zzas)) {
                boolean z11 = zzaq instanceof zzas;
                if (z11 && (zzaq2 instanceof zzai)) {
                    zzaq3 = new zzai(zzaq.zze());
                } else if (zzaq instanceof zzag) {
                    zzaq3 = new zzai(zzaq.zze());
                } else if (zzaq2 instanceof zzag) {
                    zzas = new zzai(zzaq2.zze());
                } else if ((z11 || z10) && (zzaq2 instanceof zzak)) {
                    zzas = new zzas(zzaq2.zzf());
                } else if (!(zzaq instanceof zzak) || (!(zzaq2 instanceof zzas) && !(zzaq2 instanceof zzai))) {
                    return false;
                } else {
                    zzaq3 = new zzas(zzaq.zzf());
                }
                zzaq = zzaq3;
            } else {
                zzas = new zzai(zzaq2.zze());
            }
            zzaq2 = zzas;
        }
        if ((zzaq instanceof zzax) || (zzaq instanceof zzao)) {
            return true;
        }
        if (zzaq instanceof zzai) {
            return !Double.isNaN(zzaq.zze().doubleValue()) && !Double.isNaN(zzaq2.zze().doubleValue()) && zzaq.zze().doubleValue() == zzaq2.zze().doubleValue();
        }
        if (zzaq instanceof zzas) {
            return zzaq.zzf().equals(zzaq2.zzf());
        }
        if (zzaq instanceof zzag) {
            return zzaq.zzd().equals(zzaq2.zzd());
        }
        return zzaq == zzaq2;
    }
}
