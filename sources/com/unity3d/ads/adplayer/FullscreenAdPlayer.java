package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: FullscreenAdPlayer.kt */
public interface FullscreenAdPlayer extends AdPlayer {

    /* compiled from: FullscreenAdPlayer.kt */
    public static final class DefaultImpls {
        public static Object destroy(FullscreenAdPlayer fullscreenAdPlayer, d<? super w> dVar) {
            Object destroy = AdPlayer.DefaultImpls.destroy(fullscreenAdPlayer, dVar);
            return destroy == d.c() ? destroy : w.f38141a;
        }

        public static void show(FullscreenAdPlayer fullscreenAdPlayer, ShowOptions showOptions) {
            m.e(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(fullscreenAdPlayer, showOptions);
        }
    }
}
