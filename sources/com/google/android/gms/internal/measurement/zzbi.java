package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class zzbi extends zzay {
    protected zzbi() {
        this.zza.add(zzbv.FOR_IN);
        this.zza.add(zzbv.FOR_IN_CONST);
        this.zza.add(zzbv.FOR_IN_LET);
        this.zza.add(zzbv.FOR_LET);
        this.zza.add(zzbv.FOR_OF);
        this.zza.add(zzbv.FOR_OF_CONST);
        this.zza.add(zzbv.FOR_OF_LET);
        this.zza.add(zzbv.WHILE);
    }

    private static zzaq zzb(zzbm zzbm, zzaq zzaq, zzaq zzaq2) {
        if (zzaq instanceof Iterable) {
            return zza(zzbm, (Iterator<zzaq>) ((Iterable) zzaq).iterator(), zzaq2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final zzaq zza(String str, zzh zzh, List<zzaq> list) {
        switch (zzbl.zza[zzg.zza(str).ordinal()]) {
            case 1:
                zzg.zza(zzbv.FOR_IN, 3, list);
                if (list.get(0) instanceof zzas) {
                    String zzf = list.get(0).zzf();
                    return zza((zzbm) new zzbp(zzh, zzf), zzh.zza(list.get(1)), zzh.zza(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                zzg.zza(zzbv.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof zzas) {
                    String zzf2 = list.get(0).zzf();
                    return zza((zzbm) new zzbk(zzh, zzf2), zzh.zza(list.get(1)), zzh.zza(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                zzg.zza(zzbv.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof zzas) {
                    String zzf3 = list.get(0).zzf();
                    return zza((zzbm) new zzbn(zzh, zzf3), zzh.zza(list.get(1)), zzh.zza(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                zzg.zza(zzbv.FOR_LET, 4, list);
                zzaq zza = zzh.zza(list.get(0));
                if (zza instanceof zzaf) {
                    zzaf zzaf = (zzaf) zza;
                    zzaq zzaq = list.get(1);
                    zzaq zzaq2 = list.get(2);
                    zzaq zza2 = zzh.zza(list.get(3));
                    zzh zza3 = zzh.zza();
                    for (int i10 = 0; i10 < zzaf.zzb(); i10++) {
                        String zzf4 = zzaf.zza(i10).zzf();
                        zza3.zzc(zzf4, zzh.zza(zzf4));
                    }
                    while (zzh.zza(zzaq).zzd().booleanValue()) {
                        zzaq zza4 = zzh.zza((zzaf) zza2);
                        if (zza4 instanceof zzaj) {
                            zzaj zzaj = (zzaj) zza4;
                            if ("break".equals(zzaj.zzb())) {
                                return zzaq.zzc;
                            }
                            if ("return".equals(zzaj.zzb())) {
                                return zzaj;
                            }
                        }
                        zzh zza5 = zzh.zza();
                        for (int i11 = 0; i11 < zzaf.zzb(); i11++) {
                            String zzf5 = zzaf.zza(i11).zzf();
                            zza5.zzc(zzf5, zza3.zza(zzf5));
                        }
                        zza5.zza(zzaq2);
                        zza3 = zza5;
                    }
                    return zzaq.zzc;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                zzg.zza(zzbv.FOR_OF, 3, list);
                if (list.get(0) instanceof zzas) {
                    String zzf6 = list.get(0).zzf();
                    return zzb(new zzbp(zzh, zzf6), zzh.zza(list.get(1)), zzh.zza(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                zzg.zza(zzbv.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof zzas) {
                    String zzf7 = list.get(0).zzf();
                    return zzb(new zzbk(zzh, zzf7), zzh.zza(list.get(1)), zzh.zza(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                zzg.zza(zzbv.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof zzas) {
                    String zzf8 = list.get(0).zzf();
                    return zzb(new zzbn(zzh, zzf8), zzh.zza(list.get(1)), zzh.zza(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                zzg.zza(zzbv.WHILE, 4, list);
                zzaq zzaq3 = list.get(0);
                zzaq zzaq4 = list.get(1);
                zzaq zza6 = zzh.zza(list.get(3));
                if (zzh.zza(list.get(2)).zzd().booleanValue()) {
                    zzaq zza7 = zzh.zza((zzaf) zza6);
                    if (zza7 instanceof zzaj) {
                        zzaj zzaj2 = (zzaj) zza7;
                        if (!"break".equals(zzaj2.zzb())) {
                            if ("return".equals(zzaj2.zzb())) {
                                return zzaj2;
                            }
                        }
                        return zzaq.zzc;
                    }
                }
                while (zzh.zza(zzaq3).zzd().booleanValue()) {
                    zzaq zza8 = zzh.zza((zzaf) zza6);
                    if (zza8 instanceof zzaj) {
                        zzaj zzaj3 = (zzaj) zza8;
                        if ("break".equals(zzaj3.zzb())) {
                            return zzaq.zzc;
                        }
                        if ("return".equals(zzaj3.zzb())) {
                            return zzaj3;
                        }
                    }
                    zzh.zza(zzaq4);
                }
                return zzaq.zzc;
            default:
                return super.zza(str);
        }
    }

    private static zzaq zza(zzbm zzbm, Iterator<zzaq> it, zzaq zzaq) {
        if (it != null) {
            while (it.hasNext()) {
                zzaq zza = zzbm.zza(it.next()).zza((zzaf) zzaq);
                if (zza instanceof zzaj) {
                    zzaj zzaj = (zzaj) zza;
                    if ("break".equals(zzaj.zzb())) {
                        return zzaq.zzc;
                    }
                    if ("return".equals(zzaj.zzb())) {
                        return zzaj;
                    }
                }
            }
        }
        return zzaq.zzc;
    }

    private static zzaq zza(zzbm zzbm, zzaq zzaq, zzaq zzaq2) {
        return zza(zzbm, zzaq.zzh(), zzaq2);
    }
}
