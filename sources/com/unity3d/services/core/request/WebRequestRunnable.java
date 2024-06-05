package com.unity3d.services.core.request;

import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebRequestRunnable implements Runnable {
    private final String _body;
    private boolean _canceled = false;
    private final int _connectTimeout;
    private WebRequest _currentRequest;
    private final Map<String, List<String>> _headers;
    private final IWebRequestListener _listener;
    private final int _readTimeout;
    /* access modifiers changed from: private */
    public final String _type;
    /* access modifiers changed from: private */
    public final String _url;

    public WebRequestRunnable(String str, String str2, String str3, int i10, int i11, Map<String, List<String>> map, IWebRequestListener iWebRequestListener) {
        this._url = str;
        this._type = str2;
        this._body = str3;
        this._connectTimeout = i10;
        this._readTimeout = i11;
        this._headers = map;
        this._listener = iWebRequestListener;
    }

    private Map<String, List<String>> getResponseHeaders(Bundle bundle) {
        if (bundle.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            String[] stringArray = bundle.getStringArray(str);
            if (stringArray != null) {
                hashMap.put(str, new ArrayList(Arrays.asList(stringArray)));
            }
        }
        return hashMap;
    }

    private void makeRequest(String str, String str2, Map<String, List<String>> map, String str3, int i10, int i11) throws MalformedURLException {
        if (!this._canceled) {
            WebRequest webRequest = new WebRequest(str, str2, map, i10, i11);
            this._currentRequest = webRequest;
            if (str3 != null) {
                webRequest.setBody(str3);
            }
            try {
                String makeRequest = this._currentRequest.makeRequest();
                if (!this._currentRequest.isCanceled()) {
                    Bundle bundle = new Bundle();
                    Map<String, List<String>> responseHeaders = this._currentRequest.getResponseHeaders();
                    if (responseHeaders != null) {
                        for (String next : responseHeaders.keySet()) {
                            if (next != null && !next.contentEquals("null")) {
                                String[] strArr = new String[responseHeaders.get(next).size()];
                                for (int i12 = 0; i12 < responseHeaders.get(next).size(); i12++) {
                                    strArr[i12] = (String) responseHeaders.get(next).get(i12);
                                }
                                bundle.putStringArray(next, strArr);
                            }
                        }
                    }
                    if (!this._currentRequest.isCanceled()) {
                        onSucceed(makeRequest, this._currentRequest.getResponseCode(), getResponseHeaders(bundle));
                    }
                }
            } catch (Exception e10) {
                DeviceLog.exception("Error completing request", e10);
                onFailed(e10.getClass().getName() + ": " + e10.getMessage());
            }
        }
    }

    private void onFailed(String str) {
        this._listener.onFailed(this._url, str);
    }

    private void onSucceed(String str, int i10, Map<String, List<String>> map) {
        this._listener.onComplete(this._url, str, i10, map);
    }

    public void run() {
        DeviceLog.debug("Handling request message: " + this._url + " type=" + this._type);
        try {
            makeRequest(this._url, this._type, this._headers, this._body, this._connectTimeout, this._readTimeout);
        } catch (MalformedURLException e10) {
            DeviceLog.exception("Malformed URL", e10);
            onFailed("Malformed URL");
        } catch (Error unused) {
            DeviceLog.error("Out of memory error while doing web request.");
            ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class)).sendEvent("native_webview_oom", (String) null, new HashMap<String, String>() {
                {
                    put("src", "WebRequestRunnable");
                    put("url", WebRequestRunnable.this._url);
                    put("type", WebRequestRunnable.this._type);
                }
            });
            onFailed("Out of memory error while doing web request.");
        }
    }

    public void setCancelStatus(boolean z10) {
        WebRequest webRequest;
        this._canceled = z10;
        if (z10 && (webRequest = this._currentRequest) != null) {
            webRequest.cancel();
        }
    }
}
