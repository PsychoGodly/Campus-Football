package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.applovin.mediation.MaxReward;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfla {
    public static final int zza = (Build.VERSION.SDK_INT > 22 ? 67108864 : 0);
    public static final ClipData zzb = ClipData.newIntent(MaxReward.DEFAULT_LABEL, new Intent());

    public static PendingIntent zza(Context context, int i10, Intent intent, int i11, int i12) {
        boolean z10 = true;
        zzfnu.zzf((i11 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfnu.zzf((i11 & 1) == 0 || zzb(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzfnu.zzf((i11 & 2) == 0 || zzb(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzfnu.zzf((i11 & 4) == 0 || zzb(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzfnu.zzf((i11 & 128) == 0 || zzb(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzfnu.zzf(intent.getComponent() != null, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zzfnu.zzf(!zzb(i11, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !zzb(i11, 67108864)) {
                z10 = false;
            }
            zzfnu.zzf(z10, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !zzb(i11, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction(MaxReward.DEFAULT_LABEL);
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory(MaxReward.DEFAULT_LABEL);
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i11);
    }

    private static boolean zzb(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}
