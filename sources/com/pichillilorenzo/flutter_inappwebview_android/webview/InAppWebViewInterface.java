package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslCertificate;
import android.os.Looper;
import android.webkit.ValueCallback;
import android.webkit.WebMessage;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserContentController;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lc.k;

public interface InAppWebViewInterface {
    void addWebMessageListener(WebMessageListener webMessageListener) throws Exception;

    void callAsyncJavaScript(String str, Map<String, Object> map, ContentWorld contentWorld, ValueCallback<String> valueCallback);

    boolean canGoBack();

    boolean canGoBackOrForward(int i10);

    boolean canGoForward();

    boolean canScrollHorizontally();

    boolean canScrollVertically();

    void clearAllCache();

    void clearFocus();

    void clearHistory();

    void clearMatches();

    void clearSslPreferences();

    WebMessageChannel createCompatWebMessageChannel();

    WebMessageChannel createWebMessageChannel(ValueCallback<WebMessageChannel> valueCallback);

    void disposeWebMessageChannels();

    void disposeWebMessageListeners();

    void evaluateJavascript(String str, ContentWorld contentWorld, ValueCallback<String> valueCallback);

    void findAllAsync(String str);

    void findNext(boolean z10);

    SslCertificate getCertificate();

    WebViewChannelDelegate getChannelDelegate();

    int getContentHeight();

    void getContentHeight(ValueCallback<Integer> valueCallback);

    void getContentWidth(ValueCallback<Integer> valueCallback);

    Context getContext();

    Map<String, Object> getContextMenu();

    HashMap<String, Object> getCopyBackForwardList();

    Map<String, Object> getCustomSettings();

    WebView.HitTestResult getHitTestResult();

    void getHitTestResult(ValueCallback<HitTestResult> valueCallback);

    InAppBrowserDelegate getInAppBrowserDelegate();

    String getOriginalUrl();

    InAppWebViewFlutterPlugin getPlugin();

    int getProgress();

    int getScrollX();

    int getScrollY();

    void getSelectedText(ValueCallback<String> valueCallback);

    String getTitle();

    String getUrl();

    UserContentController getUserContentController();

    Map<String, WebMessageChannel> getWebMessageChannels();

    Looper getWebViewLooper();

    float getZoomScale();

    void getZoomScale(ValueCallback<Float> valueCallback);

    void goBack();

    void goBackOrForward(int i10);

    void goForward();

    void injectCSSCode(String str);

    void injectCSSFileFromUrl(String str, Map<String, Object> map);

    void injectJavascriptFileFromUrl(String str, Map<String, Object> map);

    boolean isInFullscreen();

    boolean isLoading();

    void isSecureContext(ValueCallback<Boolean> valueCallback);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadFile(String str) throws IOException;

    void loadUrl(URLRequest uRLRequest);

    void onPause();

    void onResume();

    boolean pageDown(boolean z10);

    boolean pageUp(boolean z10);

    void pauseTimers();

    void postUrl(String str, byte[] bArr);

    void postWebMessage(WebMessage webMessage, Uri uri);

    void postWebMessage(com.pichillilorenzo.flutter_inappwebview_android.types.WebMessage webMessage, Uri uri, ValueCallback<String> valueCallback) throws Exception;

    String printCurrentPage(PrintJobSettings printJobSettings);

    void reload();

    Map<String, Object> requestFocusNodeHref();

    Map<String, Object> requestImageRef();

    void resumeTimers();

    void saveWebArchive(String str, boolean z10, ValueCallback<String> valueCallback);

    void scrollBy(Integer num, Integer num2, Boolean bool);

    void scrollTo(Integer num, Integer num2, Boolean bool);

    void setChannelDelegate(WebViewChannelDelegate webViewChannelDelegate);

    void setContextMenu(Map<String, Object> map);

    void setInAppBrowserDelegate(InAppBrowserDelegate inAppBrowserDelegate);

    void setInFullscreen(boolean z10);

    void setPlugin(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin);

    void setSettings(InAppWebViewSettings inAppWebViewSettings, HashMap<String, Object> hashMap);

    void setUserContentController(UserContentController userContentController);

    void setWebMessageChannels(Map<String, WebMessageChannel> map);

    void stopLoading();

    void takeScreenshot(Map<String, Object> map, k.d dVar);

    void zoomBy(float f10);

    boolean zoomIn();

    boolean zoomOut();
}
