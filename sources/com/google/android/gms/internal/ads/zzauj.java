package com.google.android.gms.internal.ads;

import com.applovin.mediation.MaxReward;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzauj {
    private final int zza;
    private final zzaug zzb = new zzaul();

    public zzauj(int i10) {
        this.zza = i10;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(((String) arrayList.get(i10)).toLowerCase(Locale.US));
            sb2.append(10);
        }
        String[] split = sb2.toString().split("\n");
        if (split.length == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        zzaui zzaui = new zzaui();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzauh(this));
        for (String zzb2 : split) {
            String[] zzb3 = zzauk.zzb(zzb2, false);
            if (zzb3.length != 0) {
                zzauo.zzc(zzb3, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzaui.zzb.write(this.zzb.zzb(((zzaun) it.next()).zzb));
            } catch (IOException e10) {
                zzbza.zzh("Error while writing hash to byteStream", e10);
            }
        }
        return zzaui.toString();
    }
}
