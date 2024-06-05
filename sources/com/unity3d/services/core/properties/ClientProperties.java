package com.unity3d.services.core.properties;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.log.DeviceLog;
import java.io.ByteArrayInputStream;
import java.lang.ref.WeakReference;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class ClientProperties {
    private static final X500Principal DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
    private static WeakReference<Activity> _activity;
    private static Application _application;
    private static Context _applicationContext;
    private static String _gameId;

    public static Activity getActivity() {
        return (Activity) _activity.get();
    }

    public static String getAppName() {
        Context context = _applicationContext;
        if (context == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        return context.getPackageName();
    }

    public static String getAppVersion() {
        String packageName = getApplicationContext().getPackageName();
        PackageManager packageManager = getApplicationContext().getPackageManager();
        try {
            if (packageManager.getPackageInfo(packageName, 0).versionName == null) {
                return AndroidStaticDeviceInfoDataSource.APP_VERSION_FAKE;
            }
            return packageManager.getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Error getting package info", e10);
            return null;
        }
    }

    public static Application getApplication() {
        return _application;
    }

    public static Context getApplicationContext() {
        return _applicationContext;
    }

    public static String getGameId() {
        return _gameId;
    }

    public static boolean isAppDebuggable() {
        boolean z10;
        if (getApplicationContext() == null) {
            return false;
        }
        PackageManager packageManager = getApplicationContext().getPackageManager();
        String packageName = getApplicationContext().getPackageName();
        boolean z11 = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            int i10 = applicationInfo.flags & 2;
            applicationInfo.flags = i10;
            if (i10 == 0) {
                z11 = false;
            }
            z10 = z11;
            z11 = false;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Could not find name", e10);
            z10 = false;
        }
        if (z11) {
            try {
                for (Signature byteArray : packageManager.getPackageInfo(packageName, 64).signatures) {
                    z10 = ((X509Certificate) CertificateFactory.getInstance(AndroidStaticDeviceInfoDataSource.CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(byteArray.toByteArray()))).getSubjectX500Principal().equals(DEBUG_CERT);
                    if (z10) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e11) {
                DeviceLog.exception("Could not find name", e11);
            } catch (CertificateException e12) {
                DeviceLog.exception("Certificate exception", e12);
            }
        }
        return z10;
    }

    public static void setActivity(Activity activity) {
        _activity = new WeakReference<>(activity);
    }

    public static void setApplication(Application application) {
        _application = application;
    }

    public static void setApplicationContext(Context context) {
        _applicationContext = context;
    }

    public static void setGameId(String str) {
        _gameId = str;
    }
}
