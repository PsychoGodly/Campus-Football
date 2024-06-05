package com.unity3d.services.core.connectivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConnectivityMonitor {
    private static int _connected = -1;
    private static Set<IConnectivityListener> _listeners = null;
    private static boolean _listening = false;
    private static int _networkType = -1;
    private static boolean _webappMonitoring = false;
    private static boolean _wifi = false;

    /* renamed from: com.unity3d.services.core.connectivity.ConnectivityMonitor$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.services.core.connectivity.ConnectivityEvent[] r0 = com.unity3d.services.core.connectivity.ConnectivityEvent.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent = r0
                com.unity3d.services.core.connectivity.ConnectivityEvent r1 = com.unity3d.services.core.connectivity.ConnectivityEvent.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.connectivity.ConnectivityEvent r1 = com.unity3d.services.core.connectivity.ConnectivityEvent.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.connectivity.ConnectivityEvent r1 = com.unity3d.services.core.connectivity.ConnectivityEvent.NETWORK_CHANGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.connectivity.ConnectivityMonitor.AnonymousClass1.<clinit>():void");
        }
    }

    public static void addListener(IConnectivityListener iConnectivityListener) {
        if (_listeners == null) {
            _listeners = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        _listeners.add(iConnectivityListener);
        updateListeningStatus();
    }

    public static void connected() {
        if (_connected != 1) {
            DeviceLog.debug("Unity Ads connectivity change: connected");
            initConnectionStatus();
            Set<IConnectivityListener> set = _listeners;
            if (set != null) {
                for (IConnectivityListener onConnected : set) {
                    onConnected.onConnected();
                }
            }
            sendToWebview(ConnectivityEvent.CONNECTED, _wifi, _networkType);
        }
    }

    public static void connectionStatusChanged() {
        NetworkInfo activeNetworkInfo;
        boolean z10 = true;
        if (_connected == 1 && (activeNetworkInfo = ((ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() != 1) {
                z10 = false;
            }
            int i10 = -1;
            try {
                i10 = ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
            } catch (SecurityException unused) {
                DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
            }
            boolean z11 = _wifi;
            if (z10 != z11 || (i10 != _networkType && !z11)) {
                _wifi = z10;
                _networkType = i10;
                DeviceLog.debug("Unity Ads connectivity change: network change");
                sendToWebview(ConnectivityEvent.NETWORK_CHANGE, z10, i10);
            }
        }
    }

    public static void disconnected() {
        if (_connected != 0) {
            _connected = 0;
            DeviceLog.debug("Unity Ads connectivity change: disconnected");
            Set<IConnectivityListener> set = _listeners;
            if (set != null) {
                for (IConnectivityListener onDisconnected : set) {
                    onDisconnected.onDisconnected();
                }
            }
            sendToWebview(ConnectivityEvent.DISCONNECTED, false, 0);
        }
    }

    private static void initConnectionStatus() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ClientProperties.getApplicationContext().getSystemService("connectivity");
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z10 = false;
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                _connected = 0;
                return;
            }
            _connected = 1;
            if (activeNetworkInfo.getType() == 1) {
                z10 = true;
            }
            _wifi = z10;
            if (!z10) {
                try {
                    _networkType = ((TelephonyManager) ClientProperties.getApplicationContext().getSystemService("phone")).getNetworkType();
                } catch (SecurityException unused) {
                    DeviceLog.warning("Unity Ads was not able to get current network type due to missing permission");
                }
            }
        }
    }

    public static void removeListener(IConnectivityListener iConnectivityListener) {
        Set<IConnectivityListener> set = _listeners;
        if (set != null) {
            set.remove(iConnectivityListener);
            updateListeningStatus();
        }
    }

    private static void sendToWebview(ConnectivityEvent connectivityEvent, boolean z10, int i10) {
        WebViewApp currentApp;
        if (_webappMonitoring && (currentApp = WebViewApp.getCurrentApp()) != null && currentApp.isWebAppLoaded()) {
            int i11 = AnonymousClass1.$SwitchMap$com$unity3d$services$core$connectivity$ConnectivityEvent[connectivityEvent.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.DISCONNECTED, new Object[0]);
                } else if (i11 == 3) {
                    if (z10) {
                        currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, Boolean.valueOf(z10), 0);
                        return;
                    }
                    currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.NETWORK_CHANGE, Boolean.valueOf(z10), Integer.valueOf(i10));
                }
            } else if (z10) {
                currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, Boolean.valueOf(z10), 0);
            } else {
                currentApp.sendEvent(WebViewEventCategory.CONNECTIVITY, ConnectivityEvent.CONNECTED, Boolean.valueOf(z10), Integer.valueOf(i10));
            }
        }
    }

    public static void setConnectionMonitoring(boolean z10) {
        _webappMonitoring = z10;
        updateListeningStatus();
    }

    private static void startListening() {
        if (!_listening) {
            _listening = true;
            initConnectionStatus();
            if (Build.VERSION.SDK_INT < 21) {
                ConnectivityChangeReceiver.register();
            } else {
                ConnectivityNetworkCallback.register();
            }
        }
    }

    public static void stopAll() {
        _listeners = null;
        _webappMonitoring = false;
        updateListeningStatus();
    }

    private static void stopListening() {
        if (_listening) {
            _listening = false;
            if (Build.VERSION.SDK_INT < 21) {
                ConnectivityChangeReceiver.unregister();
            } else {
                ConnectivityNetworkCallback.unregister();
            }
        }
    }

    private static void updateListeningStatus() {
        Set<IConnectivityListener> set;
        if (_webappMonitoring || ((set = _listeners) != null && !set.isEmpty())) {
            startListening();
        } else {
            stopListening();
        }
    }
}
