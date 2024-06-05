package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.i;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import xd.d;

/* compiled from: OpenMeasurementRepository.kt */
public interface OpenMeasurementRepository {
    Object activateOM(Context context, d<? super OMResult> dVar);

    Object finishSession(i iVar, d<? super OMResult> dVar);

    OMData getOmData();

    boolean hasSessionFinished(i iVar);

    Object impressionOccurred(i iVar, boolean z10, d<? super OMResult> dVar);

    boolean isOMActive();

    void setOMActive(boolean z10);

    Object startSession(i iVar, WebView webView, OmidOptions omidOptions, d<? super OMResult> dVar);
}
