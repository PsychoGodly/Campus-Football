package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public interface zzcu extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(zzcv zzcv) throws RemoteException;

    void getAppInstanceId(zzcv zzcv) throws RemoteException;

    void getCachedAppInstanceId(zzcv zzcv) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzcv zzcv) throws RemoteException;

    void getCurrentScreenClass(zzcv zzcv) throws RemoteException;

    void getCurrentScreenName(zzcv zzcv) throws RemoteException;

    void getGmpAppId(zzcv zzcv) throws RemoteException;

    void getMaxUserProperties(String str, zzcv zzcv) throws RemoteException;

    void getSessionId(zzcv zzcv) throws RemoteException;

    void getTestFlag(zzcv zzcv, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, zzcv zzcv) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(a aVar, zzdd zzdd, long j10) throws RemoteException;

    void isDataCollectionEnabled(zzcv zzcv) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcv zzcv, long j10) throws RemoteException;

    void logHealthData(int i10, String str, a aVar, a aVar2, a aVar3) throws RemoteException;

    void onActivityCreated(a aVar, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(a aVar, long j10) throws RemoteException;

    void onActivityPaused(a aVar, long j10) throws RemoteException;

    void onActivityResumed(a aVar, long j10) throws RemoteException;

    void onActivitySaveInstanceState(a aVar, zzcv zzcv, long j10) throws RemoteException;

    void onActivityStarted(a aVar, long j10) throws RemoteException;

    void onActivityStopped(a aVar, long j10) throws RemoteException;

    void performAction(Bundle bundle, zzcv zzcv, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(zzda zzda) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(a aVar, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzda zzda) throws RemoteException;

    void setInstanceIdProvider(zzdb zzdb) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, a aVar, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzda zzda) throws RemoteException;
}
