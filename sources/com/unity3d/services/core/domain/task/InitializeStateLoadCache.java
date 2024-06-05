package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.properties.SdkProperties;
import java.io.File;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: InitializeStateLoadCache.kt */
public final class InitializeStateLoadCache extends MetricTask<Params, LoadCacheResult> {
    private final ISDKDispatchers dispatchers;

    /* compiled from: InitializeStateLoadCache.kt */
    public static final class LoadCacheResult {
        private final boolean hasHashMismatch;
        private final String webViewData;

        public LoadCacheResult(boolean z10, String str) {
            this.hasHashMismatch = z10;
            this.webViewData = str;
        }

        public static /* synthetic */ LoadCacheResult copy$default(LoadCacheResult loadCacheResult, boolean z10, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = loadCacheResult.hasHashMismatch;
            }
            if ((i10 & 2) != 0) {
                str = loadCacheResult.webViewData;
            }
            return loadCacheResult.copy(z10, str);
        }

        public final boolean component1() {
            return this.hasHashMismatch;
        }

        public final String component2() {
            return this.webViewData;
        }

        public final LoadCacheResult copy(boolean z10, String str) {
            return new LoadCacheResult(z10, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadCacheResult)) {
                return false;
            }
            LoadCacheResult loadCacheResult = (LoadCacheResult) obj;
            return this.hasHashMismatch == loadCacheResult.hasHashMismatch && m.a(this.webViewData, loadCacheResult.webViewData);
        }

        public final boolean getHasHashMismatch() {
            return this.hasHashMismatch;
        }

        public final String getWebViewData() {
            return this.webViewData;
        }

        public int hashCode() {
            boolean z10 = this.hasHashMismatch;
            if (z10) {
                z10 = true;
            }
            int i10 = (z10 ? 1 : 0) * true;
            String str = this.webViewData;
            return i10 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoadCacheResult(hasHashMismatch=" + this.hasHashMismatch + ", webViewData=" + this.webViewData + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LoadCacheResult(boolean z10, String str, int i10, h hVar) {
            this(z10, (i10 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: InitializeStateLoadCache.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;

        public Params(Configuration configuration) {
            m.e(configuration, "config");
            this.config = configuration;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            return params.copy(configuration);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final Params copy(Configuration configuration) {
            m.e(configuration, "config");
            return new Params(configuration);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && m.a(this.config, ((Params) obj).config);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public int hashCode() {
            return this.config.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ')';
        }
    }

    public InitializeStateLoadCache(ISDKDispatchers iSDKDispatchers) {
        m.e(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    /* access modifiers changed from: private */
    public final byte[] getWebViewData() {
        try {
            return Utilities.readFileBytes(new File(SdkProperties.getLocalWebViewFile()));
        } catch (Exception e10) {
            DeviceLog.debug("Unity Ads init: webapp not found in local cache: " + e10.getMessage());
            return null;
        }
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("read_local_webview");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m55doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadCache.Params r6, xd.d<? super sd.o<com.unity3d.services.core.domain.task.InitializeStateLoadCache.LoadCacheResult>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r7)
            goto L_0x0049
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sd.p.b(r7)
            com.unity3d.services.core.domain.ISDKDispatchers r7 = r5.dispatchers
            pe.k0 r7 = r7.getDefault()
            com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateLoadCache$doWork$2
            r4 = 0
            r2.<init>(r5, r6, r4)
            r0.label = r3
            java.lang.Object r7 = pe.i.g(r7, r2, r0)
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            sd.o r7 = (sd.o) r7
            java.lang.Object r6 = r7.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadCache.m55doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateLoadCache$Params, xd.d):java.lang.Object");
    }
}
