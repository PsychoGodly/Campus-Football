package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class zzv extends LifecycleCallback {
    private final List zza = new ArrayList();

    private zzv(i iVar) {
        super(iVar);
        this.mLifecycleFragment.a("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        i fragment = LifecycleCallback.getFragment(activity);
        zzv zzv = (zzv) fragment.b("TaskOnStopCallback", zzv.class);
        return zzv == null ? new zzv(fragment) : zzv;
    }

    public final void onStop() {
        synchronized (this.zza) {
            for (WeakReference weakReference : this.zza) {
                zzq zzq = (zzq) weakReference.get();
                if (zzq != null) {
                    zzq.zzc();
                }
            }
            this.zza.clear();
        }
    }

    public final void zzb(zzq zzq) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzq));
        }
    }
}
