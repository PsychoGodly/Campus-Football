package com.unity3d.services.banners;

import android.content.Context;
import com.unity3d.services.core.misc.ViewUtilities;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: UnityBannerSize.kt */
public final class UnityBannerSize {
    public static final Companion Companion = new Companion((h) null);
    /* access modifiers changed from: private */
    public static final UnityBannerSize iabStandard = new UnityBannerSize(468, 60);
    /* access modifiers changed from: private */
    public static final UnityBannerSize leaderboard = new UnityBannerSize(728, 90);
    /* access modifiers changed from: private */
    public static final UnityBannerSize standard = new UnityBannerSize(320, 50);
    private final int height;
    private final int width;

    /* compiled from: UnityBannerSize.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final UnityBannerSize getDynamicSize(Context context) {
            m.e(context, "context");
            int b10 = c.b(ViewUtilities.dpFromPx(context, (float) context.getResources().getDisplayMetrics().widthPixels));
            if (b10 >= getLeaderboard().getWidth()) {
                return getLeaderboard();
            }
            if (b10 >= getIabStandard().getWidth()) {
                return getIabStandard();
            }
            return getStandard();
        }

        public final UnityBannerSize getIabStandard() {
            return UnityBannerSize.iabStandard;
        }

        public final UnityBannerSize getLeaderboard() {
            return UnityBannerSize.leaderboard;
        }

        public final UnityBannerSize getStandard() {
            return UnityBannerSize.standard;
        }
    }

    public UnityBannerSize(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static final UnityBannerSize getDynamicSize(Context context) {
        return Companion.getDynamicSize(context);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
