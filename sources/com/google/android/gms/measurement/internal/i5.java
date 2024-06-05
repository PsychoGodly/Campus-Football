package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.collection.a;
import androidx.collection.e;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.measurement.zzb;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.internal.measurement.zzix;
import com.google.android.gms.internal.measurement.zzji;
import com.google.android.gms.internal.measurement.zzv;
import com.google.android.gms.measurement.internal.y6;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import r5.o;
import r5.r;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
public final class i5 extends ua implements h {
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, Map<String, String>> f24667d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Set<String>> f24668e = new a();

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f24669f = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f24670g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, zzfc.zzd> f24671h = new a();

    /* renamed from: i  reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f24672i = new a();

    /* renamed from: j  reason: collision with root package name */
    final e<String, zzb> f24673j = new n5(this, 20);

    /* renamed from: k  reason: collision with root package name */
    final zzv f24674k = new m5(this);

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f24675l = new a();

    /* renamed from: m  reason: collision with root package name */
    private final Map<String, String> f24676m = new a();

    /* renamed from: n  reason: collision with root package name */
    private final Map<String, String> f24677n = new a();

    i5(va vaVar) {
        super(vaVar);
    }

    private final void A(String str, zzfc.zzd.zza zza) {
        HashSet hashSet = new HashSet();
        a aVar = new a();
        a aVar2 = new a();
        a aVar3 = new a();
        if (zza != null) {
            for (zzfc.zzb zzb : zza.zze()) {
                hashSet.add(zzb.zzb());
            }
            for (int i10 = 0; i10 < zza.zza(); i10++) {
                zzfc.zzc.zza zza2 = (zzfc.zzc.zza) zza.zza(i10).zzby();
                if (zza2.zzb().isEmpty()) {
                    zzj().G().a("EventConfig contained null event name");
                } else {
                    String zzb2 = zza2.zzb();
                    String b10 = r.b(zza2.zzb());
                    if (!TextUtils.isEmpty(b10)) {
                        zza2 = zza2.zza(b10);
                        zza.zza(i10, zza2);
                    }
                    if (zza2.zze() && zza2.zzc()) {
                        aVar.put(zzb2, Boolean.TRUE);
                    }
                    if (zza2.zzf() && zza2.zzd()) {
                        aVar2.put(zza2.zzb(), Boolean.TRUE);
                    }
                    if (zza2.zzg()) {
                        if (zza2.zza() < 2 || zza2.zza() > 65535) {
                            zzj().G().c("Invalid sampling rate. Event name, sample rate", zza2.zzb(), Integer.valueOf(zza2.zza()));
                        } else {
                            aVar3.put(zza2.zzb(), Integer.valueOf(zza2.zza()));
                        }
                    }
                }
            }
        }
        this.f24668e.put(str, hashSet);
        this.f24669f.put(str, aVar);
        this.f24670g.put(str, aVar2);
        this.f24672i.put(str, aVar3);
    }

    private final void B(String str, zzfc.zzd zzd) {
        if (zzd.zza() == 0) {
            this.f24673j.remove(str);
            return;
        }
        zzj().F().b("EES programs found", Integer.valueOf(zzd.zza()));
        zzfp.zzc zzc = zzd.zzn().get(0);
        try {
            zzb zzb = new zzb();
            zzb.zza("internal.remoteConfig", new j5(this, str));
            zzb.zza("internal.appMetadata", new o(this, str));
            zzb.zza("internal.logger", new l5(this));
            zzb.zza(zzc);
            this.f24673j.put(str, zzb);
            zzj().F().c("EES program loaded for appId, activities", str, Integer.valueOf(zzc.zza().zza()));
            for (zzfp.zzb zzb2 : zzc.zza().zzd()) {
                zzj().F().b("EES program activity", zzb2.zzb());
            }
        } catch (zzc unused) {
            zzj().B().b("Failed to load EES program. appId", str);
        }
    }

    private final void b0(String str) {
        p();
        i();
        q.g(str);
        if (this.f24671h.get(str) == null) {
            o z02 = l().z0(str);
            if (z02 == null) {
                this.f24667d.put(str, (Object) null);
                this.f24669f.put(str, (Object) null);
                this.f24668e.put(str, (Object) null);
                this.f24670g.put(str, (Object) null);
                this.f24671h.put(str, (Object) null);
                this.f24675l.put(str, (Object) null);
                this.f24676m.put(str, (Object) null);
                this.f24677n.put(str, (Object) null);
                this.f24672i.put(str, (Object) null);
                return;
            }
            zzfc.zzd.zza zza = (zzfc.zzd.zza) v(str, z02.f24874a).zzby();
            A(str, zza);
            this.f24667d.put(str, y((zzfc.zzd) ((zzix) zza.zzab())));
            this.f24671h.put(str, (zzfc.zzd) ((zzix) zza.zzab()));
            B(str, (zzfc.zzd) ((zzix) zza.zzab()));
            this.f24675l.put(str, zza.zzc());
            this.f24676m.put(str, z02.f24875b);
            this.f24677n.put(str, z02.f24876c);
        }
    }

    static /* synthetic */ zzb u(i5 i5Var, String str) {
        i5Var.p();
        q.g(str);
        if (!i5Var.R(str)) {
            return null;
        }
        if (!i5Var.f24671h.containsKey(str) || i5Var.f24671h.get(str) == null) {
            i5Var.b0(str);
        } else {
            i5Var.B(str, i5Var.f24671h.get(str));
        }
        return i5Var.f24673j.snapshot().get(str);
    }

    private final zzfc.zzd v(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzd.zzg();
        }
        try {
            zzfc.zzd zzd = (zzfc.zzd) ((zzix) ((zzfc.zzd.zza) db.A(zzfc.zzd.zze(), bArr)).zzab());
            p4 F = zzj().F();
            String str2 = null;
            Long valueOf = zzd.zzs() ? Long.valueOf(zzd.zzc()) : null;
            if (zzd.zzr()) {
                str2 = zzd.zzh();
            }
            F.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return zzd;
        } catch (zzji e10) {
            zzj().G().c("Unable to merge remote config. appId", n4.q(str), e10);
            return zzfc.zzd.zzg();
        } catch (RuntimeException e11) {
            zzj().G().c("Unable to merge remote config. appId", n4.q(str), e11);
            return zzfc.zzd.zzg();
        }
    }

    private static y6.a w(zzfc.zza.zze zze) {
        int i10 = o5.f24882b[zze.ordinal()];
        if (i10 == 1) {
            return y6.a.AD_STORAGE;
        }
        if (i10 == 2) {
            return y6.a.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return y6.a.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return y6.a.AD_PERSONALIZATION;
    }

    private static Map<String, String> y(zzfc.zzd zzd) {
        a aVar = new a();
        if (zzd != null) {
            for (zzfc.zzg next : zzd.zzo()) {
                aVar.put(next.zzb(), next.zzc());
            }
        }
        return aVar;
    }

    /* access modifiers changed from: protected */
    public final boolean C(String str, byte[] bArr, String str2, String str3) {
        p();
        i();
        q.g(str);
        zzfc.zzd.zza zza = (zzfc.zzd.zza) v(str, bArr).zzby();
        if (zza == null) {
            return false;
        }
        A(str, zza);
        B(str, (zzfc.zzd) ((zzix) zza.zzab()));
        this.f24671h.put(str, (zzfc.zzd) ((zzix) zza.zzab()));
        this.f24675l.put(str, zza.zzc());
        this.f24676m.put(str, str2);
        this.f24677n.put(str, str3);
        this.f24667d.put(str, y((zzfc.zzd) ((zzix) zza.zzab())));
        l().U(str, new ArrayList(zza.zzd()));
        try {
            zza.zzb();
            bArr = ((zzfc.zzd) ((zzix) zza.zzab())).zzbv();
        } catch (RuntimeException e10) {
            zzj().G().c("Unable to serialize reduced-size config. Storing full config instead. appId", n4.q(str), e10);
        }
        m l10 = l();
        q.g(str);
        l10.i();
        l10.p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (((long) l10.w().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                l10.zzj().B().b("Failed to update remote config (got 0). appId", n4.q(str));
            }
        } catch (SQLiteException e11) {
            l10.zzj().B().c("Error storing remote config. appId", n4.q(str), e11);
        }
        this.f24671h.put(str, (zzfc.zzd) ((zzix) zza.zzab()));
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int D(String str, String str2) {
        Integer num;
        i();
        b0(str);
        Map map = this.f24672i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final zzfc.zza E(String str) {
        i();
        b0(str);
        zzfc.zzd G = G(str);
        if (G == null || !G.zzq()) {
            return null;
        }
        return G.zzd();
    }

    /* access modifiers changed from: package-private */
    public final boolean F(String str, y6.a aVar) {
        i();
        b0(str);
        zzfc.zza E = E(str);
        if (E == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = E.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (aVar == w(next.zzc())) {
                if (next.zzb() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final zzfc.zzd G(String str) {
        p();
        i();
        q.g(str);
        b0(str);
        return this.f24671h.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean H(String str, String str2) {
        Boolean bool;
        i();
        b0(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = this.f24670g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String I(String str) {
        i();
        return this.f24677n.get(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean J(String str, String str2) {
        Boolean bool;
        i();
        b0(str);
        if (S(str) && ib.C0(str2)) {
            return true;
        }
        if (U(str) && ib.E0(str2)) {
            return true;
        }
        Map map = this.f24669f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final String K(String str) {
        i();
        return this.f24676m.get(str);
    }

    /* access modifiers changed from: package-private */
    public final String L(String str) {
        i();
        b0(str);
        return this.f24675l.get(str);
    }

    /* access modifiers changed from: package-private */
    public final Set<String> M(String str) {
        i();
        b0(str);
        return this.f24668e.get(str);
    }

    /* access modifiers changed from: package-private */
    public final SortedSet<String> N(String str) {
        i();
        b0(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza E = E(str);
        if (E == null) {
            return treeSet;
        }
        for (zzfc.zza.zzf zzb : E.zzc()) {
            treeSet.add(zzb.zzb());
        }
        return treeSet;
    }

    /* access modifiers changed from: protected */
    public final void O(String str) {
        i();
        this.f24676m.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final void P(String str) {
        i();
        this.f24671h.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean Q(String str) {
        i();
        zzfc.zzd G = G(str);
        if (G == null) {
            return false;
        }
        return G.zzp();
    }

    public final boolean R(String str) {
        zzfc.zzd zzd;
        if (TextUtils.isEmpty(str) || (zzd = this.f24671h.get(str)) == null || zzd.zza() == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean S(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(b(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean T(String str) {
        i();
        b0(str);
        zzfc.zza E = E(str);
        if (E != null && E.zzg() && !E.zzf()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean U(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(b(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: package-private */
    public final boolean V(String str) {
        i();
        b0(str);
        return this.f24668e.get(str) != null && this.f24668e.get(str).contains("app_instance_id");
    }

    /* access modifiers changed from: package-private */
    public final boolean W(String str) {
        i();
        b0(str);
        if (this.f24668e.get(str) != null) {
            return this.f24668e.get(str).contains("device_model") || this.f24668e.get(str).contains("device_info");
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean X(String str) {
        i();
        b0(str);
        return this.f24668e.get(str) != null && this.f24668e.get(str).contains("enhanced_user_id");
    }

    /* access modifiers changed from: package-private */
    public final boolean Y(String str) {
        i();
        b0(str);
        return this.f24668e.get(str) != null && this.f24668e.get(str).contains("google_signals");
    }

    /* access modifiers changed from: package-private */
    public final boolean Z(String str) {
        i();
        b0(str);
        if (this.f24668e.get(str) != null) {
            return this.f24668e.get(str).contains("os_version") || this.f24668e.get(str).contains("device_info");
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ f a() {
        return super.a();
    }

    /* access modifiers changed from: package-private */
    public final boolean a0(String str) {
        i();
        b0(str);
        return this.f24668e.get(str) != null && this.f24668e.get(str).contains("user_id");
    }

    public final String b(String str, String str2) {
        i();
        b0(str);
        Map map = this.f24667d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ y c() {
        return super.c();
    }

    public final /* bridge */ /* synthetic */ m4 d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ y4 e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ ib f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ void g() {
        super.g();
    }

    public final /* bridge */ /* synthetic */ void h() {
        super.h();
    }

    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    public final /* bridge */ /* synthetic */ db j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ pb k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ m l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ i5 m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ y9 n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ta o() {
        return super.o();
    }

    /* access modifiers changed from: protected */
    public final boolean s() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public final long t(String str) {
        String b10 = b(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(b10)) {
            return 0;
        }
        try {
            return Long.parseLong(b10);
        } catch (NumberFormatException e10) {
            zzj().G().c("Unable to parse timezone offset. appId", n4.q(str), e10);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final y6.a x(String str, y6.a aVar) {
        i();
        b0(str);
        zzfc.zza E = E(str);
        if (E == null) {
            return null;
        }
        for (zzfc.zza.zzc next : E.zze()) {
            if (aVar == w(next.zzc())) {
                return w(next.zzb());
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public final /* bridge */ /* synthetic */ m5.e zzb() {
        return super.zzb();
    }

    public final /* bridge */ /* synthetic */ e zzd() {
        return super.zzd();
    }

    public final /* bridge */ /* synthetic */ n4 zzj() {
        return super.zzj();
    }

    public final /* bridge */ /* synthetic */ q5 zzl() {
        return super.zzl();
    }
}
