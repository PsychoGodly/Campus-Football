package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

/* compiled from: EmbeddableAdPlayer.kt */
public interface EmbeddableAdPlayer extends AdPlayer {

    /* compiled from: EmbeddableAdPlayer.kt */
    public static final class DefaultImpls {
        public static Object destroy(EmbeddableAdPlayer embeddableAdPlayer, d<? super w> dVar) {
            Object destroy = AdPlayer.DefaultImpls.destroy(embeddableAdPlayer, dVar);
            return destroy == d.c() ? destroy : w.f38141a;
        }

        public static void show(EmbeddableAdPlayer embeddableAdPlayer, ShowOptions showOptions) {
            m.e(showOptions, "showOptions");
            AdPlayer.DefaultImpls.show(embeddableAdPlayer, showOptions);
        }
    }
}
