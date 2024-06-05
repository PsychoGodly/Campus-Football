package com.unity3d.ads.core.data.datasource;

import android.database.ContentObserver;
import android.os.Handler;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import re.j;
import re.r;

/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
public final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 extends ContentObserver {
    final /* synthetic */ r<VolumeSettingsChange> $$this$callbackFlow;
    final /* synthetic */ x $currentRingerMode;
    final /* synthetic */ w $currentVolume;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, w wVar, r<? super VolumeSettingsChange> rVar, x xVar) {
        super((Handler) null);
        this.this$0 = androidDynamicDeviceInfoDataSource;
        this.$currentVolume = wVar;
        this.$$this$callbackFlow = rVar;
        this.$currentRingerMode = xVar;
    }

    public void onChange(boolean z10) {
        super.onChange(z10);
        double access$getStreamVolume = this.this$0.getStreamVolume(3);
        w wVar = this.$currentVolume;
        boolean z11 = true;
        if (!(access$getStreamVolume == wVar.f36052a)) {
            wVar.f36052a = access$getStreamVolume;
            j.b(this.$$this$callbackFlow, new VolumeSettingsChange.VolumeChange(access$getStreamVolume));
        }
        int ringerMode = this.this$0.getRingerMode();
        x xVar = this.$currentRingerMode;
        if (ringerMode != xVar.f36053a) {
            xVar.f36053a = ringerMode;
            r<VolumeSettingsChange> rVar = this.$$this$callbackFlow;
            if (ringerMode != 0) {
                z11 = false;
            }
            j.b(rVar, new VolumeSettingsChange.MuteChange(z11));
        }
    }
}
