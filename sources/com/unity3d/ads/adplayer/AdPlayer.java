package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.p0;
import pe.q0;
import re.a;
import sd.n;
import sd.w;
import se.b0;
import se.e;
import se.u;
import xd.d;

/* compiled from: AdPlayer.kt */
public interface AdPlayer {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: AdPlayer.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final u<String> broadcastEventChannel = b0.b(0, 0, (a) null, 7, (Object) null);

        private Companion() {
        }

        public final u<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: AdPlayer.kt */
    public static final class DefaultImpls {
        public static Object destroy(AdPlayer adPlayer, d<? super w> dVar) {
            q0.d(adPlayer.getScope(), (CancellationException) null, 1, (Object) null);
            return w.f38141a;
        }

        public static void show(AdPlayer adPlayer, ShowOptions showOptions) {
            m.e(showOptions, "showOptions");
            throw new sd.m((String) null, 1, (h) null);
        }
    }

    Object destroy(d<? super w> dVar);

    void dispatchShowCompleted();

    e<LoadEvent> getOnLoadEvent();

    e<ShowEvent> getOnShowEvent();

    p0 getScope();

    e<n<byte[], Integer>> getUpdateCampaignState();

    WebViewContainer getWebViewContainer();

    Object onAllowedPiiChange(byte[] bArr, d<? super w> dVar);

    Object onBroadcastEvent(String str, d<? super w> dVar);

    Object requestShow(Map<String, ? extends Object> map, d<? super w> dVar);

    Object sendFocusChange(boolean z10, d<? super w> dVar);

    Object sendMuteChange(boolean z10, d<? super w> dVar);

    Object sendPrivacyFsmChange(byte[] bArr, d<? super w> dVar);

    Object sendUserConsentChange(byte[] bArr, d<? super w> dVar);

    Object sendVisibilityChange(boolean z10, d<? super w> dVar);

    Object sendVolumeChange(double d10, d<? super w> dVar);

    void show(ShowOptions showOptions);
}
