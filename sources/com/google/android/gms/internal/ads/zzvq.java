package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.AdError;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzvq extends zzcu {
    public static final zzvq zzD;
    @Deprecated
    public static final zzvq zzE;
    public static final zzn zzF = zzvm.zza;
    private static final String zzT = zzew.zzP(1000);
    private static final String zzU = zzew.zzP(AdError.NO_FILL_ERROR_CODE);
    private static final String zzV = zzew.zzP(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);
    private static final String zzW = zzew.zzP(1003);
    private static final String zzX = zzew.zzP(1004);
    private static final String zzY = zzew.zzP(1005);
    private static final String zzZ = zzew.zzP(1006);
    private static final String zzaa = zzew.zzP(1007);
    private static final String zzab = zzew.zzP(1008);
    private static final String zzac = zzew.zzP(1009);
    private static final String zzad = zzew.zzP(1010);
    private static final String zzae = zzew.zzP(1011);
    private static final String zzaf = zzew.zzP(1012);
    private static final String zzag = zzew.zzP(1013);
    private static final String zzah = zzew.zzP(1014);
    private static final String zzai = zzew.zzP(1015);
    private static final String zzaj = zzew.zzP(1016);
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    /* access modifiers changed from: private */
    public final SparseArray zzak;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzal;

    static {
        zzvq zzvq = new zzvq(new zzvo());
        zzD = zzvq;
        zzE = zzvq;
    }

    private zzvq(zzvo zzvo) {
        super(zzvo);
        this.zzG = zzvo.zza;
        this.zzH = false;
        this.zzI = zzvo.zzb;
        this.zzJ = false;
        this.zzK = zzvo.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzvo.zzd;
        this.zzQ = zzvo.zze;
        this.zzR = false;
        this.zzS = zzvo.zzf;
        this.zzak = zzvo.zzg;
        this.zzal = zzvo.zzh;
    }

    public static zzvq zzd(Context context) {
        return new zzvq(new zzvo(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzvq.class == obj.getClass()) {
            zzvq zzvq = (zzvq) obj;
            if (super.equals(zzvq) && this.zzG == zzvq.zzG && this.zzI == zzvq.zzI && this.zzK == zzvq.zzK && this.zzP == zzvq.zzP && this.zzQ == zzvq.zzQ && this.zzS == zzvq.zzS) {
                SparseBooleanArray sparseBooleanArray = this.zzal;
                SparseBooleanArray sparseBooleanArray2 = zzvq.zzal;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            SparseArray sparseArray = this.zzak;
                            SparseArray sparseArray2 = zzvq.zzak;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i11 = 0;
                                while (i11 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i11);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzur zzur = (zzur) entry.getKey();
                                                if (map2.containsKey(zzur)) {
                                                    if (!zzew.zzU(entry.getValue(), map2.get(zzur))) {
                                                    }
                                                }
                                            }
                                            i11++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 31) + (this.zzQ ? 1 : 0)) * 961) + (this.zzS ? 1 : 0);
    }

    public final zzvo zzc() {
        return new zzvo(this, (zzvn) null);
    }

    @Deprecated
    public final zzvs zze(int i10, zzur zzur) {
        Map map = (Map) this.zzak.get(i10);
        if (map != null) {
            return (zzvs) map.get(zzur);
        }
        return null;
    }

    public final boolean zzf(int i10) {
        return this.zzal.get(i10);
    }

    @Deprecated
    public final boolean zzg(int i10, zzur zzur) {
        Map map = (Map) this.zzak.get(i10);
        return map != null && map.containsKey(zzur);
    }
}
