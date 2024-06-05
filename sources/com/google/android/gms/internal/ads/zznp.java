package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zznp {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i10, int i11) {
        for (int i12 = 8; i12 > 0; i12--) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(zzew.zzj(i12)).build(), zza)) {
                return i12;
            }
        }
        return 0;
    }

    public static int[] zzb() {
        zzfqh zzi = zzfqk.zzi();
        zzfsj zze = zznq.zzc.keySet().iterator();
        while (zze.hasNext()) {
            int intValue = ((Integer) zze.next()).intValue();
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zza)) {
                zzi.zzf(Integer.valueOf(intValue));
            }
        }
        zzi.zzf(2);
        Object[] array = zzi.zzi().toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = array[i10];
            Objects.requireNonNull(obj);
            iArr[i10] = ((Number) obj).intValue();
        }
        return iArr;
    }
}
