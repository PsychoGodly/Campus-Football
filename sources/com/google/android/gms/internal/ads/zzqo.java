package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzqo extends zzgr {
    private long zzf;
    private int zzg;
    private int zzh = 32;

    public zzqo() {
        super(2, 0);
    }

    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzl() {
        return this.zzg;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final void zzn(int i10) {
        this.zzh = i10;
    }

    public final boolean zzo(zzgr zzgr) {
        ByteBuffer byteBuffer;
        zzdl.zzd(!zzgr.zzd(1073741824));
        zzdl.zzd(!zzgr.zzd(268435456));
        zzdl.zzd(!zzgr.zzd(4));
        if (zzp()) {
            if (this.zzg >= this.zzh || zzgr.zzd(RecyclerView.UNDEFINED_DURATION) != zzd(RecyclerView.UNDEFINED_DURATION)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgr.zzb;
            if (!(byteBuffer2 == null || (byteBuffer = this.zzb) == null || byteBuffer.position() + byteBuffer2.remaining() <= 3072000)) {
                return false;
            }
        }
        int i10 = this.zzg;
        this.zzg = i10 + 1;
        if (i10 == 0) {
            this.zzd = zzgr.zzd;
            if (zzgr.zzd(1)) {
                zzc(1);
            }
        }
        if (zzgr.zzd(RecyclerView.UNDEFINED_DURATION)) {
            zzc(RecyclerView.UNDEFINED_DURATION);
        }
        ByteBuffer byteBuffer3 = zzgr.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzgr.zzd;
        return true;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }
}
