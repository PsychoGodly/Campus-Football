package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.e1;
import com.google.android.gms.ads.internal.client.l2;
import com.google.android.gms.ads.internal.client.p1;
import com.google.android.gms.ads.internal.client.q0;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.ads.internal.client.z3;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbar;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbeh;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzbzg;
import com.google.android.gms.internal.ads.zzcgd;
import com.google.android.gms.internal.ads.zzdhc;
import com.google.android.gms.internal.ads.zzdhe;
import com.google.android.gms.internal.ads.zzdqq;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzetc;
import com.google.android.gms.internal.ads.zzetd;
import com.google.android.gms.internal.ads.zzeuq;
import com.google.android.gms.internal.ads.zzewh;
import com.google.android.gms.internal.ads.zzexv;
import java.util.HashMap;
import t4.d;
import t4.d0;
import t4.f;
import t4.g;
import t4.x;
import t4.y;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class ClientApi extends e1 {
    public final zzbqv D0(a aVar, zzbnf zzbnf, int i10) {
        return zzcgd.zza((Context) b.A1(aVar), zzbnf, i10).zzl();
    }

    public final zzbeb I0(a aVar, a aVar2) {
        return new zzdhe((FrameLayout) b.A1(aVar), (FrameLayout) b.A1(aVar2), ModuleDescriptor.MODULE_VERSION);
    }

    public final zzbeh K0(a aVar, a aVar2, a aVar3) {
        return new zzdhc((View) b.A1(aVar), (HashMap) b.A1(aVar2), (HashMap) b.A1(aVar3));
    }

    public final u0 S(a aVar, z4 z4Var, String str, zzbnf zzbnf, int i10) {
        Context context = (Context) b.A1(aVar);
        zzewh zzt = zzcgd.zza(context, zzbnf, i10).zzt();
        zzt.zzc(context);
        zzt.zza(z4Var);
        zzt.zzb(str);
        return zzt.zzd().zza();
    }

    public final zzbip T(a aVar, zzbnf zzbnf, int i10, zzbim zzbim) {
        Context context = (Context) b.A1(aVar);
        zzdqq zzi = zzcgd.zza(context, zzbnf, i10).zzi();
        zzi.zzb(context);
        zzi.zza(zzbim);
        return zzi.zzc().zzd();
    }

    public final zzbug f0(a aVar, zzbnf zzbnf, int i10) {
        Context context = (Context) b.A1(aVar);
        zzexv zzu = zzcgd.zza(context, zzbnf, i10).zzu();
        zzu.zzb(context);
        return zzu.zzc().zzb();
    }

    public final q0 n1(a aVar, String str, zzbnf zzbnf, int i10) {
        Context context = (Context) b.A1(aVar);
        return new zzehe(zzcgd.zza(context, zzbnf, i10), context, str);
    }

    public final l2 o(a aVar, zzbnf zzbnf, int i10) {
        return zzcgd.zza((Context) b.A1(aVar), zzbnf, i10).zzk();
    }

    public final zzbuw s0(a aVar, String str, zzbnf zzbnf, int i10) {
        Context context = (Context) b.A1(aVar);
        zzexv zzu = zzcgd.zza(context, zzbnf, i10).zzu();
        zzu.zzb(context);
        zzu.zza(str);
        return zzu.zzc().zza();
    }

    public final u0 t0(a aVar, z4 z4Var, String str, zzbnf zzbnf, int i10) {
        Context context = (Context) b.A1(aVar);
        zzetc zzr = zzcgd.zza(context, zzbnf, i10).zzr();
        zzr.zza(str);
        zzr.zzb(context);
        zzetd zzc = zzr.zzc();
        if (i10 >= ((Integer) a0.c().zzb(zzbar.zzeN)).intValue()) {
            return zzc.zza();
        }
        return new z3();
    }

    public final zzbxr u(a aVar, zzbnf zzbnf, int i10) {
        return zzcgd.zza((Context) b.A1(aVar), zzbnf, i10).zzo();
    }

    public final u0 y(a aVar, z4 z4Var, String str, zzbnf zzbnf, int i10) {
        Context context = (Context) b.A1(aVar);
        zzeuq zzs = zzcgd.zza(context, zzbnf, i10).zzs();
        zzs.zzc(context);
        zzs.zza(z4Var);
        zzs.zzb(str);
        return zzs.zzd().zza();
    }

    public final u0 z0(a aVar, z4 z4Var, String str, int i10) {
        return new s((Context) b.A1(aVar), z4Var, str, new zzbzg(ModuleDescriptor.MODULE_VERSION, i10, true, false));
    }

    public final p1 zzg(a aVar, int i10) {
        return zzcgd.zza((Context) b.A1(aVar), (zzbnf) null, i10).zzb();
    }

    public final zzbrc zzm(a aVar) {
        Activity activity = (Activity) b.A1(aVar);
        AdOverlayInfoParcel b10 = AdOverlayInfoParcel.b(activity.getIntent());
        if (b10 == null) {
            return new y(activity);
        }
        int i10 = b10.f14707l;
        if (i10 == 1) {
            return new x(activity);
        }
        if (i10 == 2) {
            return new f(activity);
        }
        if (i10 == 3) {
            return new g(activity);
        }
        if (i10 == 4) {
            return new d0(activity, b10);
        }
        if (i10 != 5) {
            return new y(activity);
        }
        return new d(activity);
    }
}
