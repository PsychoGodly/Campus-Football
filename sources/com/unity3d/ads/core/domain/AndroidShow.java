package com.unity3d.ads.core.domain;

import android.content.Context;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import kotlin.jvm.internal.m;
import sd.w;
import se.e;
import se.g;
import xd.d;

/* compiled from: AndroidShow.kt */
public final class AndroidShow implements Show {
    /* access modifiers changed from: private */
    public final AdRepository adRepository;
    /* access modifiers changed from: private */
    public final GameServerIdReader gameServerIdReader;
    /* access modifiers changed from: private */
    public final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidShow(AdRepository adRepository2, GameServerIdReader gameServerIdReader2, SendDiagnosticEvent sendDiagnosticEvent2) {
        m.e(adRepository2, "adRepository");
        m.e(gameServerIdReader2, "gameServerIdReader");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        this.adRepository = adRepository2;
        this.gameServerIdReader = gameServerIdReader2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
    }

    public e<ShowEvent> invoke(Context context, AdObject adObject, UnityAdsShowOptions unityAdsShowOptions) {
        m.e(context, "context");
        m.e(adObject, "adObject");
        m.e(unityAdsShowOptions, "showOptions");
        return g.r(new AndroidShow$invoke$1(adObject, this, context, unityAdsShowOptions, (d<? super AndroidShow$invoke$1>) null));
    }

    public Object terminate(AdObject adObject, d<? super w> dVar) {
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null) {
            return w.f38141a;
        }
        Object destroy = adPlayer.destroy(dVar);
        return destroy == d.c() ? destroy : w.f38141a;
    }
}
