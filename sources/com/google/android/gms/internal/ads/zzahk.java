package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzahk implements zzaiy {
    private final List zza;

    public zzahk() {
        this(0);
    }

    public zzahk(int i10, List list) {
        this.zza = list;
    }

    private final zzaio zzb(zzaix zzaix) {
        return new zzaio(zzd(zzaix));
    }

    private final zzajc zzc(zzaix zzaix) {
        return new zzajc(zzd(zzaix));
    }

    private final List zzd(zzaix zzaix) {
        String str;
        int i10;
        List list;
        zzen zzen = new zzen(zzaix.zzd);
        List list2 = this.zza;
        while (zzen.zza() > 0) {
            int zzk = zzen.zzk();
            int zzc = zzen.zzc() + zzen.zzk();
            if (zzk == 134) {
                list2 = new ArrayList();
                int zzk2 = zzen.zzk() & 31;
                for (int i11 = 0; i11 < zzk2; i11++) {
                    String zzx = zzen.zzx(3, zzfnh.zzc);
                    int zzk3 = zzen.zzk();
                    boolean z10 = (zzk3 & 128) != 0;
                    if (z10) {
                        i10 = zzk3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i10 = 1;
                    }
                    byte zzk4 = (byte) zzen.zzk();
                    zzen.zzG(1);
                    if (z10) {
                        byte b10 = zzk4 & 64;
                        int i12 = zzdn.zza;
                        list = Collections.singletonList(b10 != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    zzad zzad = new zzad();
                    zzad.zzS(str);
                    zzad.zzK(zzx);
                    zzad.zzu(i10);
                    zzad.zzI(list);
                    list2.add(zzad.zzY());
                }
            }
            zzen.zzF(zzc);
        }
        return list2;
    }

    public final zzaja zza(int i10, zzaix zzaix) {
        if (i10 != 2) {
            if (i10 == 3 || i10 == 4) {
                return new zzaie(new zzaib(zzaix.zzb));
            }
            if (i10 == 21) {
                return new zzaie(new zzahz());
            }
            if (i10 == 27) {
                return new zzaie(new zzahw(zzb(zzaix), false, false));
            }
            if (i10 == 36) {
                return new zzaie(new zzahy(zzb(zzaix)));
            }
            if (i10 == 89) {
                return new zzaie(new zzahm(zzaix.zzc));
            }
            if (i10 == 138) {
                return new zzaie(new zzahl(zzaix.zzb));
            }
            if (i10 == 172) {
                return new zzaie(new zzahg(zzaix.zzb));
            }
            if (i10 == 257) {
                return new zzain(new zzaid("application/vnd.dvb.ait"));
            }
            if (i10 != 128) {
                if (i10 != 129) {
                    if (i10 == 134) {
                        return new zzain(new zzaid("application/x-scte35"));
                    }
                    if (i10 != 135) {
                        switch (i10) {
                            case 15:
                                return new zzaie(new zzahj(false, zzaix.zzb));
                            case 16:
                                return new zzaie(new zzahs(zzc(zzaix)));
                            case 17:
                                return new zzaie(new zzaia(zzaix.zzb));
                            default:
                                return null;
                        }
                    }
                }
                return new zzaie(new zzahd(zzaix.zzb));
            }
        }
        return new zzaie(new zzahp(zzc(zzaix)));
    }

    public zzahk(int i10) {
        this.zza = zzfqk.zzo();
    }
}
