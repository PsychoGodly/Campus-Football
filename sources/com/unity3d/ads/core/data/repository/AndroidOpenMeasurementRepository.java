package com.unity3d.ads.core.data.repository;

import android.content.Context;
import android.webkit.WebView;
import com.google.protobuf.i;
import com.unity3d.ads.core.data.manager.OmidManager;
import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.model.OmidOptions;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.m;
import sd.s;
import se.k0;
import se.v;
import x9.b;
import x9.l;
import xd.d;

/* compiled from: AndroidOpenMeasurementRepository.kt */
public final class AndroidOpenMeasurementRepository implements OpenMeasurementRepository {
    private final v<Boolean> _isOMActive = k0.a(Boolean.FALSE);
    /* access modifiers changed from: private */
    public final v<Map<String, b>> activeSessions = k0.a(k0.g());
    private final v<Set<String>> finishedSessions = k0.a(q0.b());
    private final pe.k0 mainDispatcher;
    /* access modifiers changed from: private */
    public final OmidManager omidManager;
    /* access modifiers changed from: private */
    public final l partner = l.a(UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, "4.12.0");

    public AndroidOpenMeasurementRepository(pe.k0 k0Var, OmidManager omidManager2) {
        m.e(k0Var, "mainDispatcher");
        m.e(omidManager2, "omidManager");
        this.mainDispatcher = k0Var;
        this.omidManager = omidManager2;
    }

    /* access modifiers changed from: private */
    public final void addSession(i iVar, b bVar) {
        Map<String, b> value;
        v<Map<String, b>> vVar = this.activeSessions;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, k0.o(value, s.a(ProtobufExtensionsKt.toISO8859String(iVar), bVar))));
    }

    private final OMData buildOmData() {
        return new OMData(this.omidManager.getVersion(), UnityAdsConstants.OpenMeasurement.OM_PARTNER_NAME, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION);
    }

    /* access modifiers changed from: private */
    public final b getSession(i iVar) {
        return (b) this.activeSessions.getValue().get(ProtobufExtensionsKt.toISO8859String(iVar));
    }

    private final void removeSession(i iVar) {
        Map<String, b> value;
        v<Map<String, b>> vVar = this.activeSessions;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, k0.k(value, ProtobufExtensionsKt.toISO8859String(iVar))));
    }

    /* access modifiers changed from: private */
    public final void sessionFinished(i iVar) {
        Set<String> value;
        v<Set<String>> vVar = this.finishedSessions;
        do {
            value = vVar.getValue();
        } while (!vVar.a(value, r0.e(value, ProtobufExtensionsKt.toISO8859String(iVar))));
        removeSession(iVar);
    }

    public Object activateOM(Context context, d<? super OMResult> dVar) {
        return pe.i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$activateOM$2(this, context, (d<? super AndroidOpenMeasurementRepository$activateOM$2>) null), dVar);
    }

    public Object finishSession(i iVar, d<? super OMResult> dVar) {
        return pe.i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$finishSession$2(this, iVar, (d<? super AndroidOpenMeasurementRepository$finishSession$2>) null), dVar);
    }

    public OMData getOmData() {
        return buildOmData();
    }

    public boolean hasSessionFinished(i iVar) {
        m.e(iVar, "opportunityId");
        return this.finishedSessions.getValue().contains(ProtobufExtensionsKt.toISO8859String(iVar));
    }

    public Object impressionOccurred(i iVar, boolean z10, d<? super OMResult> dVar) {
        return pe.i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$impressionOccurred$2(this, iVar, z10, (d<? super AndroidOpenMeasurementRepository$impressionOccurred$2>) null), dVar);
    }

    public boolean isOMActive() {
        return this._isOMActive.getValue().booleanValue();
    }

    public void setOMActive(boolean z10) {
        Boolean value;
        v<Boolean> vVar = this._isOMActive;
        do {
            value = vVar.getValue();
            value.booleanValue();
        } while (!vVar.a(value, Boolean.valueOf(z10)));
    }

    public Object startSession(i iVar, WebView webView, OmidOptions omidOptions, d<? super OMResult> dVar) {
        return pe.i.g(this.mainDispatcher, new AndroidOpenMeasurementRepository$startSession$2(this, iVar, omidOptions, webView, (d<? super AndroidOpenMeasurementRepository$startSession$2>) null), dVar);
    }
}
