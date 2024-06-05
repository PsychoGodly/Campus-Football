package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.datasource.DynamicDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.PrivacyDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import java.util.List;
import kotlin.jvm.internal.m;
import se.e;
import se.k0;
import se.v;
import vb.a1;
import vb.b3;
import vb.m2;
import xd.d;

/* compiled from: AndroidDeviceInfoRepository.kt */
public final class AndroidDeviceInfoRepository implements DeviceInfoRepository {
    private final v<vb.v> allowedPii;
    private final String analyticsUserId;
    private final DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource;
    private final PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource;
    private final SessionRepository sessionRepository;
    private final StaticDeviceInfoDataSource staticDeviceInfoDataSource;
    private final e<VolumeSettingsChange> volumeSettingsChange;

    public AndroidDeviceInfoRepository(StaticDeviceInfoDataSource staticDeviceInfoDataSource2, DynamicDeviceInfoDataSource dynamicDeviceInfoDataSource2, PrivacyDeviceInfoDataSource privacyDeviceInfoDataSource2, SessionRepository sessionRepository2) {
        m.e(staticDeviceInfoDataSource2, "staticDeviceInfoDataSource");
        m.e(dynamicDeviceInfoDataSource2, "dynamicDeviceInfoDataSource");
        m.e(privacyDeviceInfoDataSource2, "privacyDeviceInfoDataSource");
        m.e(sessionRepository2, "sessionRepository");
        this.staticDeviceInfoDataSource = staticDeviceInfoDataSource2;
        this.dynamicDeviceInfoDataSource = dynamicDeviceInfoDataSource2;
        this.privacyDeviceInfoDataSource = privacyDeviceInfoDataSource2;
        this.sessionRepository = sessionRepository2;
        vb.v h02 = vb.v.h0();
        m.d(h02, "getDefaultInstance()");
        this.allowedPii = k0.a(h02);
        this.analyticsUserId = staticDeviceInfoDataSource2.getAnalyticsUserId();
        this.volumeSettingsChange = dynamicDeviceInfoDataSource2.getVolumeSettingsChange();
    }

    public b3 cachedStaticDeviceInfo() {
        return this.staticDeviceInfoDataSource.fetchCached();
    }

    public v<vb.v> getAllowedPii() {
        return this.allowedPii;
    }

    public String getAnalyticsUserId() {
        return this.analyticsUserId;
    }

    public String getAppName() {
        return this.staticDeviceInfoDataSource.getAppName();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043 A[SYNTHETIC, Splitter:B:18:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getAuidByteString(xd.d<? super com.google.protobuf.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1 r0 = (com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1 r0 = new com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository$getAuidByteString$1
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r5)
            goto L_0x003d
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            sd.p.b(r5)
            r0.label = r3
            java.lang.Object r5 = r4.getAuidString(r0)
            if (r5 != r1) goto L_0x003d
            return r1
        L_0x003d:
            java.lang.String r5 = (java.lang.String) r5
            r0 = 0
            if (r5 != 0) goto L_0x0043
            return r0
        L_0x0043:
            java.util.UUID r5 = java.util.UUID.fromString(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "fromString(auidString)"
            kotlin.jvm.internal.m.d(r5, r1)     // Catch:{ all -> 0x0050 }
            com.google.protobuf.i r0 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toByteString(r5)     // Catch:{ all -> 0x0050 }
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.AndroidDeviceInfoRepository.getAuidByteString(xd.d):java.lang.Object");
    }

    public Object getAuidString(d<? super String> dVar) {
        return this.staticDeviceInfoDataSource.getAuid(dVar);
    }

    public String getConnectionTypeStr() {
        return this.dynamicDeviceInfoDataSource.getConnectionTypeStr();
    }

    public a1 getDynamicDeviceInfo() {
        return this.dynamicDeviceInfoDataSource.fetch();
    }

    public boolean getHasInternet() {
        return this.dynamicDeviceInfoDataSource.hasInternet();
    }

    public Object getIdfi(d<? super String> dVar) {
        return this.staticDeviceInfoDataSource.getIdfi(dVar);
    }

    public String getManufacturer() {
        return this.staticDeviceInfoDataSource.getManufacturer();
    }

    public String getModel() {
        return this.staticDeviceInfoDataSource.getModel();
    }

    public String getOrientation() {
        return this.dynamicDeviceInfoDataSource.getOrientation();
    }

    public String getOsVersion() {
        return this.staticDeviceInfoDataSource.getOsVersion();
    }

    public m2 getPiiData() {
        return this.privacyDeviceInfoDataSource.fetch(getAllowedPii().getValue());
    }

    public int getRingerMode() {
        return this.dynamicDeviceInfoDataSource.getRingerMode();
    }

    public e<VolumeSettingsChange> getVolumeSettingsChange() {
        return this.volumeSettingsChange;
    }

    public Object staticDeviceInfo(d<? super b3> dVar) {
        StaticDeviceInfoDataSource staticDeviceInfoDataSource2 = this.staticDeviceInfoDataSource;
        List<String> n02 = this.sessionRepository.getNativeConfiguration().n0();
        m.d(n02, "sessionRepository.native…ditionalStorePackagesList");
        return staticDeviceInfoDataSource2.fetch(n02, dVar);
    }
}
