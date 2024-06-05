package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.ISDKDispatchers;
import kotlin.jvm.internal.m;

/* compiled from: InitializeStateCreate.kt */
public final class InitializeStateCreate extends MetricTask<Params, Configuration> {
    private final ISDKDispatchers dispatchers;

    /* compiled from: InitializeStateCreate.kt */
    public static final class Params implements BaseParams {
        private final Configuration config;
        private final String webViewData;

        public Params(Configuration configuration, String str) {
            m.e(configuration, "config");
            m.e(str, "webViewData");
            this.config = configuration;
            this.webViewData = str;
        }

        public static /* synthetic */ Params copy$default(Params params, Configuration configuration, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                configuration = params.config;
            }
            if ((i10 & 2) != 0) {
                str = params.webViewData;
            }
            return params.copy(configuration, str);
        }

        public final Configuration component1() {
            return this.config;
        }

        public final String component2() {
            return this.webViewData;
        }

        public final Params copy(Configuration configuration, String str) {
            m.e(configuration, "config");
            m.e(str, "webViewData");
            return new Params(configuration, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Params)) {
                return false;
            }
            Params params = (Params) obj;
            return m.a(this.config, params.config) && m.a(this.webViewData, params.webViewData);
        }

        public final Configuration getConfig() {
            return this.config;
        }

        public final String getWebViewData() {
            return this.webViewData;
        }

        public int hashCode() {
            return (this.config.hashCode() * 31) + this.webViewData.hashCode();
        }

        public String toString() {
            return "Params(config=" + this.config + ", webViewData=" + this.webViewData + ')';
        }
    }

    public InitializeStateCreate(ISDKDispatchers iSDKDispatchers) {
        m.e(iSDKDispatchers, "dispatchers");
        this.dispatchers = iSDKDispatchers;
    }

    public String getMetricName() {
        return getMetricNameForInitializeTask("create_web_view");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: doWork-gIAlu-s  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object m51doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateCreate.Params r6, xd.d<? super sd.o<? extends com.unity3d.services.core.configuration.Configuration>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1 r0 = (com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1 r0 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$1
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
            com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2 r2 = new com.unity3d.services.core.domain.task.InitializeStateCreate$doWork$2
            r4 = 0
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = pe.i.g(r7, r2, r0)
            if (r7 != r1) goto L_0x0049
            return r1
        L_0x0049:
            sd.o r7 = (sd.o) r7
            java.lang.Object r6 = r7.i()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateCreate.m51doWorkgIAlus(com.unity3d.services.core.domain.task.InitializeStateCreate$Params, xd.d):java.lang.Object");
    }
}
