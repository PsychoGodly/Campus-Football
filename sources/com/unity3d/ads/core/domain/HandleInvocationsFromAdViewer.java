package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import com.unity3d.ads.core.data.model.AdData;
import com.unity3d.ads.core.data.model.AdDataRefreshToken;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.ImpressionConfig;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import fe.l;
import kotlin.jvm.internal.h;
import sd.s;
import sd.w;
import se.e;
import se.g;
import se.z;
import xd.d;

/* compiled from: HandleInvocationsFromAdViewer.kt */
public final class HandleInvocationsFromAdViewer implements IServiceComponent {
    public static final Companion Companion = new Companion((h) null);
    public static final String KEY_AD_DATA = "adData";
    public static final String KEY_AD_DATA_REFRESH_TOKEN = "adDataRefreshToken";
    public static final String KEY_DOWNLOAD_PRIORITY = "priority";
    public static final String KEY_DOWNLOAD_URL = "url";
    public static final String KEY_IMPRESSION_CONFIG = "impressionConfig";
    public static final String KEY_LOAD_OPTIONS = "loadOptions";
    public static final String KEY_NATIVE_CONTEXT = "nativeContext";
    public static final String KEY_OMID = "openMeasurement";
    public static final String KEY_OMJS_SERVICE = "serviceFilePath";
    public static final String KEY_OMJS_SESSION = "sessionFilePath";
    public static final String KEY_OM_PARTNER = "partnerName";
    public static final String KEY_OM_PARTNER_VERSION = "partnerVersion";
    public static final String KEY_OM_VERSION = "version";
    public static final String KEY_PACKAGE_NAME = "packageName";
    public static final String KEY_PRIVACY_UPDATE_CONTENT = "content";
    public static final String KEY_PRIVACY_UPDATE_VERSION = "version";
    public static final String KEY_TRACKING_TOKEN = "trackingToken";

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public final Object invoke(z<Invocation> zVar, String str, String str2, String str3, AdObject adObject, l<? super d<? super w>, ? extends Object> lVar, d<? super e<Invocation>> dVar) {
        return g.x(g.z(zVar, new HandleInvocationsFromAdViewer$invoke$2(lVar, (d<? super HandleInvocationsFromAdViewer$invoke$2>) null)), new HandleInvocationsFromAdViewer$invoke$3(k0.j(s.a(ExposedFunctionLocation.GET_AD_CONTEXT, new HandleInvocationsFromAdViewer$invoke$definition$1(this, AdData.m12constructorimpl(str), ImpressionConfig.m26constructorimpl(str3), AdDataRefreshToken.m19constructorimpl(str2), adObject)), s.a(ExposedFunctionLocation.GET_CONNECTION_TYPE, new HandleInvocationsFromAdViewer$invoke$definition$2(this)), s.a(ExposedFunctionLocation.GET_DEVICE_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$3(this)), s.a(ExposedFunctionLocation.GET_DEVICE_MAX_VOLUME, new HandleInvocationsFromAdViewer$invoke$definition$4(this)), s.a(ExposedFunctionLocation.GET_SCREEN_HEIGHT, new HandleInvocationsFromAdViewer$invoke$definition$5(this)), s.a(ExposedFunctionLocation.GET_SCREEN_WIDTH, new HandleInvocationsFromAdViewer$invoke$definition$6(this)), s.a(ExposedFunctionLocation.OPEN_URL, new HandleInvocationsFromAdViewer$invoke$definition$7(this)), s.a(ExposedFunctionLocation.SEND_OPERATIVE_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$8(this, adObject)), s.a(ExposedFunctionLocation.STORAGE_WRITE, HandleInvocationsFromAdViewer$invoke$definition$9.INSTANCE), s.a(ExposedFunctionLocation.STORAGE_READ, HandleInvocationsFromAdViewer$invoke$definition$10.INSTANCE), s.a(ExposedFunctionLocation.STORAGE_DELETE, HandleInvocationsFromAdViewer$invoke$definition$11.INSTANCE), s.a(ExposedFunctionLocation.STORAGE_CLEAR, HandleInvocationsFromAdViewer$invoke$definition$12.INSTANCE), s.a(ExposedFunctionLocation.STORAGE_GET_KEYS, HandleInvocationsFromAdViewer$invoke$definition$13.INSTANCE), s.a(ExposedFunctionLocation.STORAGE_GET, HandleInvocationsFromAdViewer$invoke$definition$14.INSTANCE), s.a(ExposedFunctionLocation.STORAGE_SET, HandleInvocationsFromAdViewer$invoke$definition$15.INSTANCE), s.a(ExposedFunctionLocation.GET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$16(this)), s.a(ExposedFunctionLocation.SET_PRIVACY_FSM, new HandleInvocationsFromAdViewer$invoke$definition$17(this)), s.a(ExposedFunctionLocation.GET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$18(this)), s.a(ExposedFunctionLocation.SET_PRIVACY, new HandleInvocationsFromAdViewer$invoke$definition$19(this)), s.a(ExposedFunctionLocation.GET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$20(this)), s.a(ExposedFunctionLocation.SET_ALLOWED_PII, new HandleInvocationsFromAdViewer$invoke$definition$21(this)), s.a(ExposedFunctionLocation.GET_SESSION_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$22(this)), s.a(ExposedFunctionLocation.MARK_CAMPAIGN_STATE_SHOWN, new HandleInvocationsFromAdViewer$invoke$definition$23(this, adObject)), s.a(ExposedFunctionLocation.REFRESH_AD_DATA, new HandleInvocationsFromAdViewer$invoke$definition$24(this, adObject)), s.a(ExposedFunctionLocation.UPDATE_TRACKING_TOKEN, new HandleInvocationsFromAdViewer$invoke$definition$25(adObject)), s.a(ExposedFunctionLocation.SEND_PRIVACY_UPDATE_REQUEST, new HandleInvocationsFromAdViewer$invoke$definition$26(this)), s.a(ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT, new HandleInvocationsFromAdViewer$invoke$definition$27(this, adObject)), s.a(ExposedFunctionLocation.INCREMENT_BANNER_IMPRESSION_COUNT, new HandleInvocationsFromAdViewer$invoke$definition$28(this)), s.a(ExposedFunctionLocation.DOWNLOAD, new HandleInvocationsFromAdViewer$invoke$definition$29(this, adObject)), s.a(ExposedFunctionLocation.IS_FILE_CACHED, new HandleInvocationsFromAdViewer$invoke$definition$30(this)), s.a(ExposedFunctionLocation.OM_START_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$31(this, adObject)), s.a(ExposedFunctionLocation.OM_FINISH_SESSION, new HandleInvocationsFromAdViewer$invoke$definition$32(this, adObject)), s.a(ExposedFunctionLocation.OM_IMPRESSION, new HandleInvocationsFromAdViewer$invoke$definition$33(this, adObject)), s.a(ExposedFunctionLocation.OM_GET_DATA, new HandleInvocationsFromAdViewer$invoke$definition$34(this))), (d<? super HandleInvocationsFromAdViewer$invoke$3>) null));
    }
}
