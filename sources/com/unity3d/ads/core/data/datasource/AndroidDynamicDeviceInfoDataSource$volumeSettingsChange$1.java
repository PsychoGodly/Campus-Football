package com.unity3d.ads.core.data.datasource;

import android.provider.Settings;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import fe.a;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.x;
import re.j;
import re.r;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1", f = "AndroidDynamicDeviceInfoDataSource.kt", l = {604}, m = "invokeSuspend")
/* compiled from: AndroidDynamicDeviceInfoDataSource.kt */
final class AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 extends l implements p<r<? super VolumeSettingsChange>, d<? super w>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AndroidDynamicDeviceInfoDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource, d<? super AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1> dVar) {
        super(2, dVar);
        this.this$0 = androidDynamicDeviceInfoDataSource;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1(this.this$0, dVar);
        androidDynamicDeviceInfoDataSource$volumeSettingsChange$1.L$0 = obj;
        return androidDynamicDeviceInfoDataSource$volumeSettingsChange$1;
    }

    public final Object invoke(r<? super VolumeSettingsChange> rVar, d<? super w> dVar) {
        return ((AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1) create(rVar, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            r rVar = (r) this.L$0;
            kotlin.jvm.internal.w wVar = new kotlin.jvm.internal.w();
            double access$getStreamVolume = this.this$0.getStreamVolume(3);
            wVar.f36052a = access$getStreamVolume;
            j.b(rVar, new VolumeSettingsChange.VolumeChange(access$getStreamVolume));
            x xVar = new x();
            int ringerMode = this.this$0.getRingerMode();
            xVar.f36053a = ringerMode;
            j.b(rVar, new VolumeSettingsChange.MuteChange(ringerMode == 0));
            final AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1 = new AndroidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1(this.this$0, wVar, rVar, xVar);
            this.this$0.getContext().getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
            final AndroidDynamicDeviceInfoDataSource androidDynamicDeviceInfoDataSource = this.this$0;
            AnonymousClass1 r12 = new a<w>() {
                public final void invoke() {
                    androidDynamicDeviceInfoDataSource.getContext().getContentResolver().unregisterContentObserver(androidDynamicDeviceInfoDataSource$volumeSettingsChange$1$contentObserver$1);
                }
            };
            this.label = 1;
            if (re.p.a(rVar, r12, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
