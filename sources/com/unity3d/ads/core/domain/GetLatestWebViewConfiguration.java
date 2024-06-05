package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import java.util.List;
import kotlin.jvm.internal.m;
import xd.d;

/* compiled from: GetLatestWebViewConfiguration.kt */
public final class GetLatestWebViewConfiguration {
    private final WebviewConfigurationDataSource webviewConfigurationDataSource;

    public GetLatestWebViewConfiguration(WebviewConfigurationDataSource webviewConfigurationDataSource2) {
        m.e(webviewConfigurationDataSource2, "webviewConfigurationDataSource");
        this.webviewConfigurationDataSource = webviewConfigurationDataSource2;
    }

    public static /* synthetic */ Object invoke$default(GetLatestWebViewConfiguration getLatestWebViewConfiguration, String str, Integer num, List list, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            list = null;
        }
        return getLatestWebViewConfiguration.invoke(str, num, list, dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.List<java.lang.String>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: java.lang.Integer} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.String r9, java.lang.Integer r10, java.util.List<java.lang.String> r11, xd.d<? super com.unity3d.ads.core.data.model.WebViewConfiguration> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1 r0 = (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1 r0 = new com.unity3d.ads.core.domain.GetLatestWebViewConfiguration$invoke$1
            r0.<init>(r8, r12)
        L_0x0018:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.data.model.WebViewConfiguration r9 = (com.unity3d.ads.core.data.model.WebViewConfiguration) r9
            sd.p.b(r12)
            goto L_0x00e5
        L_0x0031:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0039:
            java.lang.Object r9 = r0.L$3
            r11 = r9
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r9 = r0.L$2
            r10 = r9
            java.lang.Integer r10 = (java.lang.Integer) r10
            java.lang.Object r9 = r0.L$1
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.GetLatestWebViewConfiguration r2 = (com.unity3d.ads.core.domain.GetLatestWebViewConfiguration) r2
            sd.p.b(r12)
            goto L_0x0066
        L_0x004f:
            sd.p.b(r12)
            com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource r12 = r8.webviewConfigurationDataSource
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.label = r4
            java.lang.Object r12 = r12.get(r0)
            if (r12 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r2 = r8
        L_0x0066:
            g r12 = (defpackage.g) r12
            com.unity3d.ads.core.data.model.WebViewConfiguration r4 = new com.unity3d.ads.core.data.model.WebViewConfiguration
            int r5 = r12.n0()
            java.lang.String r6 = r12.m0()
            java.lang.String r7 = "it.entryPoint"
            kotlin.jvm.internal.m.d(r6, r7)
            java.util.List r12 = r12.k0()
            java.lang.String r7 = "it.additionalFilesList"
            kotlin.jvm.internal.m.d(r12, r7)
            r4.<init>(r5, r6, r12)
            if (r9 != 0) goto L_0x008a
            if (r10 != 0) goto L_0x008a
            if (r11 != 0) goto L_0x008a
            return r4
        L_0x008a:
            com.unity3d.ads.core.data.model.WebViewConfiguration r12 = new com.unity3d.ads.core.data.model.WebViewConfiguration
            if (r10 == 0) goto L_0x0093
            int r10 = r10.intValue()
            goto L_0x0097
        L_0x0093:
            int r10 = r4.getVersion()
        L_0x0097:
            if (r9 != 0) goto L_0x009d
            java.lang.String r9 = r4.getEntryPoint()
        L_0x009d:
            if (r11 != 0) goto L_0x00a3
            java.util.List r11 = r4.getAdditionalFiles()
        L_0x00a3:
            r12.<init>(r10, r9, r11)
            boolean r9 = kotlin.jvm.internal.m.a(r12, r4)
            if (r9 != 0) goto L_0x00e6
            com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource r9 = r2.webviewConfigurationDataSource
            g$a r10 = defpackage.g.o0()
            int r11 = r12.getVersion()
            r10.H(r11)
            java.lang.String r11 = r12.getEntryPoint()
            r10.G(r11)
            java.util.List r11 = r12.getAdditionalFiles()
            r10.F(r11)
            com.google.protobuf.z r10 = r10.build()
            java.lang.String r11 = "newBuilder().apply {\n   …                }.build()"
            kotlin.jvm.internal.m.d(r10, r11)
            g r10 = (defpackage.g) r10
            r0.L$0 = r12
            r11 = 0
            r0.L$1 = r11
            r0.L$2 = r11
            r0.L$3 = r11
            r0.label = r3
            java.lang.Object r9 = r9.set(r10, r0)
            if (r9 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            r9 = r12
        L_0x00e5:
            r12 = r9
        L_0x00e6:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetLatestWebViewConfiguration.invoke(java.lang.String, java.lang.Integer, java.util.List, xd.d):java.lang.Object");
    }
}
