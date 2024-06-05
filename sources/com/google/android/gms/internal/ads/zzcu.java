package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.a;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzcu {
    private static final String zzD = zzew.zzP(1);
    private static final String zzE = zzew.zzP(2);
    private static final String zzF = zzew.zzP(3);
    private static final String zzG = zzew.zzP(4);
    private static final String zzH = zzew.zzP(5);
    private static final String zzI = zzew.zzP(6);
    private static final String zzJ = zzew.zzP(7);
    private static final String zzK = zzew.zzP(8);
    private static final String zzL = zzew.zzP(9);
    private static final String zzM = zzew.zzP(10);
    private static final String zzN = zzew.zzP(11);
    private static final String zzO = zzew.zzP(12);
    private static final String zzP = zzew.zzP(13);
    private static final String zzQ = zzew.zzP(14);
    private static final String zzR = zzew.zzP(15);
    private static final String zzS = zzew.zzP(16);
    private static final String zzT = zzew.zzP(17);
    private static final String zzU = zzew.zzP(18);
    private static final String zzV = zzew.zzP(19);
    private static final String zzW = zzew.zzP(20);
    private static final String zzX = zzew.zzP(21);
    private static final String zzY = zzew.zzP(22);
    private static final String zzZ = zzew.zzP(23);
    public static final zzcu zza;
    private static final String zzaa = zzew.zzP(24);
    private static final String zzab = zzew.zzP(25);
    private static final String zzac = zzew.zzP(26);
    @Deprecated
    public static final zzcu zzb;
    @Deprecated
    public static final zzn zzc = zzcs.zza;
    public final boolean zzA;
    public final zzfqn zzB;
    public final zzfqp zzC;
    public final int zzd = a.e.API_PRIORITY_OTHER;
    public final int zze = a.e.API_PRIORITY_OTHER;
    public final int zzf = a.e.API_PRIORITY_OTHER;
    public final int zzg = a.e.API_PRIORITY_OTHER;
    public final int zzh = 0;
    public final int zzi = 0;
    public final int zzj = 0;
    public final int zzk = 0;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzfqk zzo;
    public final int zzp;
    public final zzfqk zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzfqk zzu;
    public final zzfqk zzv;
    public final int zzw;
    public final int zzx;
    public final boolean zzy;
    public final boolean zzz;

    static {
        zzcu zzcu = new zzcu(new zzct());
        zza = zzcu;
        zzb = zzcu;
    }

    protected zzcu(zzct zzct) {
        this.zzl = zzct.zze;
        this.zzm = zzct.zzf;
        this.zzn = zzct.zzg;
        this.zzo = zzct.zzh;
        this.zzp = 0;
        this.zzq = zzct.zzi;
        this.zzr = 0;
        this.zzs = a.e.API_PRIORITY_OTHER;
        this.zzt = a.e.API_PRIORITY_OTHER;
        this.zzu = zzct.zzl;
        this.zzv = zzct.zzm;
        this.zzw = zzct.zzn;
        this.zzx = 0;
        this.zzy = false;
        this.zzz = false;
        this.zzA = false;
        this.zzB = zzfqn.zzc(zzct.zzo);
        this.zzC = zzfqp.zzl(zzct.zzp);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcu zzcu = (zzcu) obj;
            return this.zzn == zzcu.zzn && this.zzl == zzcu.zzl && this.zzm == zzcu.zzm && this.zzo.equals(zzcu.zzo) && this.zzq.equals(zzcu.zzq) && this.zzu.equals(zzcu.zzu) && this.zzv.equals(zzcu.zzv) && this.zzw == zzcu.zzw && this.zzB.equals(zzcu.zzB) && this.zzC.equals(zzcu.zzC);
        }
    }

    public int hashCode() {
        int hashCode = (((((((((this.zzn ? 1 : 0) - true) * 31) + this.zzl) * 31) + this.zzm) * 31) + this.zzo.hashCode()) * 961) + this.zzq.hashCode();
        return (((((((((((((hashCode * 961) + a.e.API_PRIORITY_OTHER) * 31) + a.e.API_PRIORITY_OTHER) * 31) + this.zzu.hashCode()) * 31) + this.zzv.hashCode()) * 31) + this.zzw) * 28629151) + this.zzB.hashCode()) * 31) + this.zzC.hashCode();
    }
}
