package com.unity3d.ads.core.extensions;

import com.unity3d.ads.UnityAds;
import com.unity3d.ads.adplayer.model.ShowStatus;
import kotlin.jvm.internal.m;

/* compiled from: ShowStatusExtensions.kt */
public final class ShowStatusExtensionsKt {

    /* compiled from: ShowStatusExtensions.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.unity3d.ads.adplayer.model.ShowStatus[] r0 = com.unity3d.ads.adplayer.model.ShowStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.unity3d.ads.adplayer.model.ShowStatus r1 = com.unity3d.ads.adplayer.model.ShowStatus.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.unity3d.ads.adplayer.model.ShowStatus r1 = com.unity3d.ads.adplayer.model.ShowStatus.SKIPPED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.ShowStatusExtensionsKt.WhenMappings.<clinit>():void");
        }
    }

    public static final UnityAds.UnityAdsShowCompletionState toUnityAdsShowCompletionState(ShowStatus showStatus) {
        m.e(showStatus, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[showStatus.ordinal()];
        if (i10 == 1) {
            return UnityAds.UnityAdsShowCompletionState.COMPLETED;
        }
        if (i10 == 2) {
            return UnityAds.UnityAdsShowCompletionState.SKIPPED;
        }
        throw new IllegalStateException("Unexpected show status: " + showStatus);
    }
}
