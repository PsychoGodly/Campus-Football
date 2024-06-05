package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.a0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeje implements zzepn {
    private final zzfuu zza;
    private final zzfuu zzb;
    private final Context zzc;
    private final zzeyx zzd;
    private final View zze;

    public zzeje(zzfuu zzfuu, zzfuu zzfuu2, Context context, zzeyx zzeyx, ViewGroup viewGroup) {
        this.zza = zzfuu;
        this.zzb = zzfuu2;
        this.zzc = context;
        this.zzd = zzeyx;
        this.zze = viewGroup;
    }

    private final List zze() {
        ArrayList arrayList = new ArrayList();
        View view = this.zze;
        while (view != null) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return arrayList;
    }

    public final int zza() {
        return 3;
    }

    public final zzfut zzb() {
        zzbar.zzc(this.zzc);
        if (((Boolean) a0.c().zzb(zzbar.zzjq)).booleanValue()) {
            return this.zzb.zzb(new zzejc(this));
        }
        return this.zza.zzb(new zzejd(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzejf zzc() throws Exception {
        return new zzejf(this.zzc, this.zzd.zze, zze());
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzejf zzd() throws Exception {
        return new zzejf(this.zzc, this.zzd.zze, zze());
    }
}
