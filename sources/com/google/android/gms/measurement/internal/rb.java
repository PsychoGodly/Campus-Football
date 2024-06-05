package com.google.android.gms.measurement.internal;

import androidx.collection.a;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzob;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class rb {

    /* renamed from: a  reason: collision with root package name */
    private String f25030a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f25031b;

    /* renamed from: c  reason: collision with root package name */
    private zzfi.zzl f25032c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public BitSet f25033d;

    /* renamed from: e  reason: collision with root package name */
    private BitSet f25034e;

    /* renamed from: f  reason: collision with root package name */
    private Map<Integer, Long> f25035f;

    /* renamed from: g  reason: collision with root package name */
    private Map<Integer, List<Long>> f25036g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ pb f25037h;

    private rb(pb pbVar, String str) {
        this.f25037h = pbVar;
        this.f25030a = str;
        this.f25031b = true;
        this.f25033d = new BitSet();
        this.f25034e = new BitSet();
        this.f25035f = new a();
        this.f25036g = new a();
    }

    /* access modifiers changed from: package-private */
    public final zzfi.zzc a(int i10) {
        ArrayList arrayList;
        List list;
        zzfi.zzc.zza zzb = zzfi.zzc.zzb();
        zzb.zza(i10);
        zzb.zza(this.f25031b);
        zzfi.zzl zzl = this.f25032c;
        if (zzl != null) {
            zzb.zza(zzl);
        }
        zzfi.zzl.zza zzd = zzfi.zzl.zze().zzb(db.H(this.f25033d)).zzd(db.H(this.f25034e));
        if (this.f25035f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f25035f.size());
            for (Integer intValue : this.f25035f.keySet()) {
                int intValue2 = intValue.intValue();
                Long l10 = this.f25035f.get(Integer.valueOf(intValue2));
                if (l10 != null) {
                    arrayList.add((zzfi.zzd) ((zzix) zzfi.zzd.zzc().zza(intValue2).zza(l10.longValue()).zzab()));
                }
            }
        }
        if (arrayList != null) {
            zzd.zza(arrayList);
        }
        if (this.f25036g == null) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f25036g.size());
            for (Integer next : this.f25036g.keySet()) {
                zzfi.zzm.zza zza = zzfi.zzm.zzc().zza(next.intValue());
                List list2 = this.f25036g.get(next);
                if (list2 != null) {
                    Collections.sort(list2);
                    zza.zza((Iterable<? extends Long>) list2);
                }
                arrayList2.add((zzfi.zzm) ((zzix) zza.zzab()));
            }
            list = arrayList2;
        }
        zzd.zzc(list);
        zzb.zza(zzd);
        return (zzfi.zzc) ((zzix) zzb.zzab());
    }

    /* access modifiers changed from: package-private */
    public final void c(c cVar) {
        int a10 = cVar.a();
        Boolean bool = cVar.f24417c;
        if (bool != null) {
            this.f25034e.set(a10, bool.booleanValue());
        }
        Boolean bool2 = cVar.f24418d;
        if (bool2 != null) {
            this.f25033d.set(a10, bool2.booleanValue());
        }
        if (cVar.f24419e != null) {
            Long l10 = this.f25035f.get(Integer.valueOf(a10));
            long longValue = cVar.f24419e.longValue() / 1000;
            if (l10 == null || longValue > l10.longValue()) {
                this.f25035f.put(Integer.valueOf(a10), Long.valueOf(longValue));
            }
        }
        if (cVar.f24420f != null) {
            List list = this.f25036g.get(Integer.valueOf(a10));
            if (list == null) {
                list = new ArrayList();
                this.f25036g.put(Integer.valueOf(a10), list);
            }
            if (cVar.j()) {
                list.clear();
            }
            if (zzob.zza() && this.f25037h.a().y(this.f25030a, e0.f24511j0) && cVar.i()) {
                list.clear();
            }
            if (!zzob.zza() || !this.f25037h.a().y(this.f25030a, e0.f24511j0)) {
                list.add(Long.valueOf(cVar.f24420f.longValue() / 1000));
                return;
            }
            long longValue2 = cVar.f24420f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }

    private rb(pb pbVar, String str, zzfi.zzl zzl, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f25037h = pbVar;
        this.f25030a = str;
        this.f25033d = bitSet;
        this.f25034e = bitSet2;
        this.f25035f = map;
        this.f25036g = new a();
        if (map2 != null) {
            for (Integer next : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(map2.get(next));
                this.f25036g.put(next, arrayList);
            }
        }
        this.f25031b = false;
        this.f25032c = zzl;
    }
}
