package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.ByteStringDataSource;
import com.unity3d.services.core.configuration.ExperimentsBase;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import pe.c2;
import pe.k0;
import pe.q0;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: AndroidBoldExperimentHandler.kt */
public final class AndroidBoldExperimentHandler implements BoldExperimentHandler {
    public static final String BOLD_VERSION = "version";
    public static final Companion Companion = new Companion((h) null);
    public static final String EXPO_NODE_NAME = "expo";
    /* access modifiers changed from: private */
    public final ByteStringDataSource gatewayCacheDataSource;
    private final k0 ioDispatcher;

    /* compiled from: AndroidBoldExperimentHandler.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public AndroidBoldExperimentHandler(ByteStringDataSource byteStringDataSource, k0 k0Var) {
        m.e(byteStringDataSource, "gatewayCacheDataSource");
        m.e(k0Var, "ioDispatcher");
        this.gatewayCacheDataSource = byteStringDataSource;
        this.ioDispatcher = k0Var;
    }

    public void invoke(String str) {
        m.e(str, "configData");
        Object opt = new JSONObject(str).opt(EXPO_NODE_NAME);
        JSONObject jSONObject = opt instanceof JSONObject ? (JSONObject) opt : null;
        Object opt2 = jSONObject != null ? jSONObject.opt(ExperimentsBase.EXP_TAG_IS_BOLD_NEXT_SESSION) : null;
        JSONObject jSONObject2 = opt2 instanceof JSONObject ? (JSONObject) opt2 : null;
        Object opt3 = jSONObject2 != null ? jSONObject2.opt("version") : null;
        String str2 = opt3 instanceof String ? (String) opt3 : null;
        if (str2 != null) {
            c2 unused = k.d(q0.a(this.ioDispatcher), (g) null, (r0) null, new AndroidBoldExperimentHandler$invoke$1$1(this, str2, (d<? super AndroidBoldExperimentHandler$invoke$1$1>) null), 3, (Object) null);
        }
    }
}
