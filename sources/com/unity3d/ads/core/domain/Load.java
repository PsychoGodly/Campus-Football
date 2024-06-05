package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.i;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import vb.p;
import wb.b;
import xd.d;

/* compiled from: Load.kt */
public interface Load {

    /* compiled from: Load.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(Load load, Context context, String str, i iVar, b bVar, p pVar, UnityAdsLoadOptions unityAdsLoadOptions, d dVar, int i10, Object obj) {
            if (obj == null) {
                return load.invoke(context, str, iVar, bVar, (i10 & 16) != 0 ? null : pVar, unityAdsLoadOptions, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    Object invoke(Context context, String str, i iVar, b bVar, p pVar, UnityAdsLoadOptions unityAdsLoadOptions, d<? super LoadResult> dVar);
}
