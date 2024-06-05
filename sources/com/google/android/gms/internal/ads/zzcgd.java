package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.m1;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import y4.b0;
import y4.e;
import y4.x;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzcgd implements zzclp {
    private static zzcgd zza;

    private static synchronized zzcgd zzC(Context context, zzbnf zzbnf, int i10, boolean z10, int i11, zzchg zzchg) {
        synchronized (zzcgd.class) {
            zzcgd zzcgd = zza;
            if (zzcgd != null) {
                return zzcgd;
            }
            zzbar.zzc(context);
            zzezq zzd = zzezq.zzd(context);
            zzbzg zzc = zzd.zzc(ModuleDescriptor.MODULE_VERSION, false, i11);
            zzd.zze(zzbnf);
            zzciu zzciu = new zzciu((zzcit) null);
            zzcge zzcge = new zzcge();
            zzcge.zzd(zzc);
            zzcge.zzc(context);
            zzciu.zzb(new zzcgg(zzcge, (zzcgf) null));
            zzciu.zzc(new zzckh(zzchg, (byte[]) null));
            zzcgd zza2 = zzciu.zza();
            t.q().zzs(context, zzc);
            t.e().zzi(context);
            t.r().I(context);
            t.r().H(context);
            m1.a(context);
            t.d().zzd(context);
            t.x().b(context);
            zzbxg.zzd(context);
            if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue()) {
                if (!((Boolean) a0.c().zzb(zzbar.zzas)).booleanValue()) {
                    zzawe zzawe = new zzawe(new zzawk(context));
                    zzdzb zzdzb = new zzdzb(new zzdyx(context), zza2.zzz());
                    t.r();
                    new zzdzx(context, zzc, zzawe, zzdzb, UUID.randomUUID().toString(), zza2.zzx()).zzb(t.q().zzh().zzP());
                }
            }
            zza = zza2;
            return zza2;
        }
    }

    public static zzcgd zza(Context context, zzbnf zzbnf, int i10) {
        return zzC(context, zzbnf, ModuleDescriptor.MODULE_VERSION, false, i10, new zzchg());
    }

    public abstract Executor zzA();

    public abstract ScheduledExecutorService zzB();

    public abstract zzcks zzb();

    public abstract zzcnx zzc();

    public abstract zzcpg zzd();

    public abstract zzcxd zze();

    public abstract zzddv zzf();

    public abstract zzder zzg();

    public abstract zzdly zzh();

    public abstract zzdqq zzi();

    public abstract zzdsf zzj();

    public abstract zzdsz zzk();

    public abstract zzean zzl();

    public abstract x zzm();

    public abstract b0 zzn();

    public abstract e zzo();

    public final zzeqf zzp(zzbtn zzbtn, int i10) {
        return zzq(new zzesh(zzbtn, i10));
    }

    /* access modifiers changed from: protected */
    public abstract zzeqf zzq(zzesh zzesh);

    public abstract zzetc zzr();

    public abstract zzeuq zzs();

    public abstract zzewh zzt();

    public abstract zzexv zzu();

    public abstract zzezj zzv();

    public abstract zzezt zzw();

    public abstract zzfdk zzx();

    public abstract zzfep zzy();

    public abstract zzfuu zzz();
}
