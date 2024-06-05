package com.applovin.impl.sdk.array;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.array.apphub.aidl.IAppHubDirectDownloadServiceCallback;
import com.applovin.array.apphub.aidl.IAppHubService;
import com.applovin.impl.oj;
import com.applovin.impl.p;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.x3;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public class ArrayService extends IAppHubDirectDownloadServiceCallback.Stub {
    private static final int MAX_RECONNECT_RETRY_COUNT = 3;
    private static final String SERVICE_INTENT_CLASS_NAME = "com.applovin.oem.am.android.external.AppHubService";
    private static final String SERVICE_INTENT_FILTER_ACTION = "com.applovin.am.intent.action.APPHUB_SERVICE";
    private static final String TAG = "ArrayService";
    private String appHubPackageName;
    /* access modifiers changed from: private */
    public IAppHubService appHubService;
    private final Intent appHubServiceIntent;
    private long appHubVersionCode = -1;
    /* access modifiers changed from: private */
    public DirectDownloadState currentDownloadState;
    private int currentRetryCount;
    private final ArrayDataCollector dataCollector;
    private Boolean isDirectDownloadEnabled;
    /* access modifiers changed from: private */
    public final t logger;
    private String randomUserToken;
    private final k sdk;

    public interface DirectDownloadListener {
        void onAppDetailsDismissed();

        void onAppDetailsDisplayed();

        void onFailure();
    }

    private static class DirectDownloadState {
        /* access modifiers changed from: private */
        public final String adToken;
        /* access modifiers changed from: private */
        public final AtomicBoolean errorCallbackInvoked = new AtomicBoolean();
        /* access modifiers changed from: private */
        public final DirectDownloadListener listener;
        /* access modifiers changed from: private */
        public final Bundle parameters;

        public DirectDownloadState(String str, Bundle bundle, DirectDownloadListener directDownloadListener) {
            this.adToken = str;
            this.parameters = bundle;
            this.listener = directDownloadListener;
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof DirectDownloadState;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DirectDownloadState)) {
                return false;
            }
            DirectDownloadState directDownloadState = (DirectDownloadState) obj;
            if (!directDownloadState.canEqual(this)) {
                return false;
            }
            AtomicBoolean errorCallbackInvoked2 = getErrorCallbackInvoked();
            AtomicBoolean errorCallbackInvoked3 = directDownloadState.getErrorCallbackInvoked();
            if (errorCallbackInvoked2 != null ? !errorCallbackInvoked2.equals(errorCallbackInvoked3) : errorCallbackInvoked3 != null) {
                return false;
            }
            String adToken2 = getAdToken();
            String adToken3 = directDownloadState.getAdToken();
            if (adToken2 != null ? !adToken2.equals(adToken3) : adToken3 != null) {
                return false;
            }
            Bundle parameters2 = getParameters();
            Bundle parameters3 = directDownloadState.getParameters();
            if (parameters2 != null ? !parameters2.equals(parameters3) : parameters3 != null) {
                return false;
            }
            DirectDownloadListener listener2 = getListener();
            DirectDownloadListener listener3 = directDownloadState.getListener();
            return listener2 != null ? listener2.equals(listener3) : listener3 == null;
        }

        public String getAdToken() {
            return this.adToken;
        }

        public AtomicBoolean getErrorCallbackInvoked() {
            return this.errorCallbackInvoked;
        }

        public DirectDownloadListener getListener() {
            return this.listener;
        }

        public Bundle getParameters() {
            return this.parameters;
        }

        public int hashCode() {
            AtomicBoolean errorCallbackInvoked2 = getErrorCallbackInvoked();
            int i10 = 43;
            int hashCode = errorCallbackInvoked2 == null ? 43 : errorCallbackInvoked2.hashCode();
            String adToken2 = getAdToken();
            int hashCode2 = ((hashCode + 59) * 59) + (adToken2 == null ? 43 : adToken2.hashCode());
            Bundle parameters2 = getParameters();
            int hashCode3 = (hashCode2 * 59) + (parameters2 == null ? 43 : parameters2.hashCode());
            DirectDownloadListener listener2 = getListener();
            int i11 = hashCode3 * 59;
            if (listener2 != null) {
                i10 = listener2.hashCode();
            }
            return i11 + i10;
        }

        public String toString() {
            return "ArrayService.DirectDownloadState(errorCallbackInvoked=" + getErrorCallbackInvoked() + ", adToken=" + getAdToken() + ", parameters=" + getParameters() + ", listener=" + getListener() + ")";
        }
    }

    public ArrayService(k kVar) {
        this.sdk = kVar;
        this.logger = kVar.L();
        this.dataCollector = new ArrayDataCollector(kVar);
        Intent createAppHubServiceIntent = createAppHubServiceIntent();
        this.appHubServiceIntent = createAppHubServiceIntent;
        if (createAppHubServiceIntent != null) {
            bindAppHubService();
        }
        kVar.e().a(new p() {
            public void onActivityStopped(Activity activity) {
                DirectDownloadState access$000 = ArrayService.this.currentDownloadState;
                if (ArrayService.this.appHubService != null && access$000 != null) {
                    try {
                        t unused = ArrayService.this.logger;
                        if (t.a()) {
                            ArrayService.this.logger.a(ArrayService.TAG, "Dismissing Direct Download Activity");
                        }
                        ArrayService.this.appHubService.dismissDirectDownloadAppDetails(access$000.adToken);
                        access$000.listener.onAppDetailsDismissed();
                        DirectDownloadState unused2 = ArrayService.this.currentDownloadState = null;
                    } catch (RemoteException e10) {
                        t unused3 = ArrayService.this.logger;
                        if (t.a()) {
                            ArrayService.this.logger.a(ArrayService.TAG, "Failed dismiss Direct Download Activity", e10);
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void bindAppHubService() {
        if (this.currentRetryCount <= 3) {
            if (t.a()) {
                this.logger.a(TAG, "Attempting connection to App Hub service...");
            }
            int i10 = 1;
            this.currentRetryCount++;
            try {
                if (x3.c()) {
                    i10 = 513;
                }
                if (!k.k().bindService(this.appHubServiceIntent, new ServiceConnection() {
                    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                        t unused = ArrayService.this.logger;
                        if (t.a()) {
                            t access$200 = ArrayService.this.logger;
                            access$200.a(ArrayService.TAG, "Connection successful: " + componentName);
                        }
                        IAppHubService unused2 = ArrayService.this.appHubService = IAppHubService.Stub.asInterface(iBinder);
                    }

                    public void onServiceDisconnected(ComponentName componentName) {
                        t unused = ArrayService.this.logger;
                        if (t.a()) {
                            t access$200 = ArrayService.this.logger;
                            access$200.b(ArrayService.TAG, "Service disconnected: " + componentName);
                        }
                        IAppHubService unused2 = ArrayService.this.appHubService = null;
                        t unused3 = ArrayService.this.logger;
                        if (t.a()) {
                            ArrayService.this.logger.b(ArrayService.TAG, "Retrying...");
                        }
                        ArrayService.this.bindAppHubService();
                    }
                }, i10) && t.a()) {
                    this.logger.k(TAG, "App Hub not available");
                }
            } catch (Throwable th) {
                if (t.a()) {
                    this.logger.a(TAG, "Failed to bind to service", th);
                }
            }
        } else if (t.a()) {
            this.logger.k(TAG, "Exceeded maximum retry count");
        }
    }

    private Intent createAppHubServiceIntent() {
        Intent intent = new Intent(SERVICE_INTENT_FILTER_ACTION);
        List<ResolveInfo> queryIntentServices = k.k().getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            String str = queryIntentServices.get(0).serviceInfo.packageName;
            this.appHubPackageName = str;
            intent.setClassName(str, SERVICE_INTENT_CLASS_NAME);
            return intent;
        } else if (!t.a()) {
            return null;
        } else {
            this.logger.k(TAG, "App Hub not available");
            return null;
        }
    }

    public void collectAppHubData() {
        if (isAppHubInstalled()) {
            if (t.a()) {
                this.logger.a(TAG, "Collecting data...");
            }
            if (this.isDirectDownloadEnabled == null && ((Boolean) this.sdk.a(oj.f10273c0)).booleanValue()) {
                this.isDirectDownloadEnabled = this.dataCollector.collectDirectDownloadEnabled(this.appHubService);
            }
            if (this.appHubVersionCode == -1 && ((Boolean) this.sdk.a(oj.f10265b0)).booleanValue()) {
                this.appHubVersionCode = this.dataCollector.collectAppHubVersionCode(this.appHubService);
            }
            if (TextUtils.isEmpty(this.randomUserToken) && ((Boolean) this.sdk.a(oj.f10281d0)).booleanValue()) {
                this.randomUserToken = this.dataCollector.collectRandomUserToken(this.appHubService);
            }
        }
    }

    public String getAppHubPackageName() {
        return this.appHubPackageName;
    }

    public long getAppHubVersionCode() {
        return this.appHubVersionCode;
    }

    public Boolean getIsDirectDownloadEnabled() {
        return this.isDirectDownloadEnabled;
    }

    public String getRandomUserToken() {
        return this.randomUserToken;
    }

    public boolean isAppHubInstalled() {
        return this.appHubService != null;
    }

    public void onAppDetailsDismissed(String str) {
        if (t.a()) {
            this.logger.a(TAG, "App details dismissed");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null) {
            directDownloadState.listener.onAppDetailsDismissed();
            this.currentDownloadState = null;
        }
    }

    public void onAppDetailsShown(String str) {
        if (t.a()) {
            this.logger.a(TAG, "App details shown");
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null) {
            directDownloadState.listener.onAppDetailsDisplayed();
        }
    }

    public void onDownloadStarted(String str) {
        if (t.a()) {
            this.logger.a(TAG, "Download started");
        }
    }

    public void onError(String str, String str2) {
        if (t.a()) {
            t tVar = this.logger;
            tVar.b(TAG, "Encountered error: " + str2);
        }
        DirectDownloadState directDownloadState = this.currentDownloadState;
        if (directDownloadState != null && directDownloadState.errorCallbackInvoked.compareAndSet(false, true)) {
            directDownloadState.listener.onFailure();
            this.currentDownloadState = null;
        }
    }

    public void startDirectInstallOrDownloadProcess(ArrayDirectDownloadAd arrayDirectDownloadAd, Bundle bundle, DirectDownloadListener directDownloadListener) {
        if (this.appHubService == null) {
            if (t.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - service disconnected");
            }
            directDownloadListener.onFailure();
        } else if (!arrayDirectDownloadAd.isDirectDownloadEnabled()) {
            if (t.a()) {
                this.logger.b(TAG, "Cannot begin Direct Install / Download process - missing token");
            }
            directDownloadListener.onFailure();
        } else {
            try {
                Bundle directDownloadParameters = arrayDirectDownloadAd.getDirectDownloadParameters();
                if (bundle != null) {
                    directDownloadParameters.putAll(bundle);
                }
                this.currentDownloadState = new DirectDownloadState(arrayDirectDownloadAd.getDirectDownloadToken(), directDownloadParameters, directDownloadListener);
                if (t.a()) {
                    this.logger.a(TAG, "Starting Direct Download Activity");
                }
                if (this.appHubVersionCode >= 21) {
                    this.appHubService.showDirectDownloadAppDetailsWithExtra(this.currentDownloadState.adToken, this.currentDownloadState.parameters, this);
                } else {
                    this.appHubService.showDirectDownloadAppDetails(this.currentDownloadState.adToken, this);
                }
                if (t.a()) {
                    this.logger.a(TAG, "Activity started");
                }
            } catch (Throwable th) {
                if (t.a()) {
                    this.logger.a(TAG, "Failed to execute Direct Install / Download process", th);
                }
                this.sdk.B().a(TAG, "directInstallDownload", th);
                this.currentDownloadState = null;
                directDownloadListener.onFailure();
            }
        }
    }
}
