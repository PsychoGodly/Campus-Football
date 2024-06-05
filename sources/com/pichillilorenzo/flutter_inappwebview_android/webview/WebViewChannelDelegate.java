package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserSettings;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.BaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.ClientCertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ContentWorld;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomSchemeResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.DownloadStartRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HitTestResult;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.HttpAuthenticationChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.NavigationActionPolicy;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.SafeBrowsingResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustAuthResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.ServerTrustChallenge;
import com.pichillilorenzo.flutter_inappwebview_android.types.SslCertificateExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.SyncBaseCallbackResultImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessageCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebMessagePortCompatExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceErrorExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceResponseExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageChannel;
import com.pichillilorenzo.flutter_inappwebview_android.webview.web_message.WebMessageListener;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import j1.l;
import j1.m;
import j1.r;
import j1.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;

public class WebViewChannelDelegate extends ChannelDelegateImpl {
    static final String LOG_TAG = "WebViewChannelDelegate";
    private InAppWebView webView;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate$8  reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods;

        /* JADX WARNING: Can't wrap try/catch for region: R(148:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|(3:147|148|150)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(150:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|150) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x0258 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0264 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:105:0x0270 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:107:0x027c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:109:0x0288 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:111:0x0294 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:113:0x02a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:115:0x02ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:117:0x02b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:119:0x02c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x02d0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:123:0x02dc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:125:0x02e8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:127:0x02f4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:129:0x0300 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x030c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0318 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x0324 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0330 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x033c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0348 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0354 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x0360 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x036c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00d8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0114 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0120 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x012c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0138 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0144 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0150 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x015c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0168 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0174 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0180 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x018c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0198 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01bc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x01ec */
        /* JADX WARNING: Missing exception handler attribute for start block: B:85:0x01f8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:87:0x0204 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0210 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:91:0x021c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0228 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0234 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x0240 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x024c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods[] r0 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods = r0
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getUrl     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getTitle     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getProgress     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.loadUrl     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x003e }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.postUrl     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.loadData     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.loadFile     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.evaluateJavascript     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x006c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.injectJavascriptFileFromUrl     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.injectCSSCode     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.injectCSSFileFromUrl     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.reload     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x009c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.goBack     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.canGoBack     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.goForward     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.canGoForward     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.goBackOrForward     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.canGoBackOrForward     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00e4 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.stopLoading     // Catch:{ NoSuchFieldError -> 0x00e4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e4 }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e4 }
            L_0x00e4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00f0 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.isLoading     // Catch:{ NoSuchFieldError -> 0x00f0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f0 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f0 }
            L_0x00f0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x00fc }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.takeScreenshot     // Catch:{ NoSuchFieldError -> 0x00fc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fc }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fc }
            L_0x00fc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0108 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.setSettings     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r2 = 22
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0114 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getSettings     // Catch:{ NoSuchFieldError -> 0x0114 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0114 }
                r2 = 23
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0114 }
            L_0x0114:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0120 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.close     // Catch:{ NoSuchFieldError -> 0x0120 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0120 }
                r2 = 24
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0120 }
            L_0x0120:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x012c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.show     // Catch:{ NoSuchFieldError -> 0x012c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012c }
                r2 = 25
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x012c }
            L_0x012c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0138 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.hide     // Catch:{ NoSuchFieldError -> 0x0138 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0138 }
                r2 = 26
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0138 }
            L_0x0138:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0144 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.isHidden     // Catch:{ NoSuchFieldError -> 0x0144 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0144 }
                r2 = 27
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0144 }
            L_0x0144:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0150 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getCopyBackForwardList     // Catch:{ NoSuchFieldError -> 0x0150 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0150 }
                r2 = 28
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0150 }
            L_0x0150:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x015c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.startSafeBrowsing     // Catch:{ NoSuchFieldError -> 0x015c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r2 = 29
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0168 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.clearCache     // Catch:{ NoSuchFieldError -> 0x0168 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0168 }
                r2 = 30
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0168 }
            L_0x0168:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0174 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.clearSslPreferences     // Catch:{ NoSuchFieldError -> 0x0174 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0174 }
                r2 = 31
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0174 }
            L_0x0174:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0180 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.findAll     // Catch:{ NoSuchFieldError -> 0x0180 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0180 }
                r2 = 32
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0180 }
            L_0x0180:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x018c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.findNext     // Catch:{ NoSuchFieldError -> 0x018c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x018c }
                r2 = 33
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x018c }
            L_0x018c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0198 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.clearMatches     // Catch:{ NoSuchFieldError -> 0x0198 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0198 }
                r2 = 34
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0198 }
            L_0x0198:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01a4 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.scrollTo     // Catch:{ NoSuchFieldError -> 0x01a4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a4 }
                r2 = 35
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01a4 }
            L_0x01a4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01b0 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.scrollBy     // Catch:{ NoSuchFieldError -> 0x01b0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b0 }
                r2 = 36
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01b0 }
            L_0x01b0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01bc }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.pause     // Catch:{ NoSuchFieldError -> 0x01bc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01bc }
                r2 = 37
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01bc }
            L_0x01bc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01c8 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.resume     // Catch:{ NoSuchFieldError -> 0x01c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c8 }
                r2 = 38
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01c8 }
            L_0x01c8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01d4 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.pauseTimers     // Catch:{ NoSuchFieldError -> 0x01d4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d4 }
                r2 = 39
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01d4 }
            L_0x01d4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01e0 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.resumeTimers     // Catch:{ NoSuchFieldError -> 0x01e0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e0 }
                r2 = 40
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01e0 }
            L_0x01e0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01ec }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.printCurrentPage     // Catch:{ NoSuchFieldError -> 0x01ec }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ec }
                r2 = 41
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01ec }
            L_0x01ec:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x01f8 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getContentHeight     // Catch:{ NoSuchFieldError -> 0x01f8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x01f8 }
                r2 = 42
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x01f8 }
            L_0x01f8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0204 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getContentWidth     // Catch:{ NoSuchFieldError -> 0x0204 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0204 }
                r2 = 43
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0204 }
            L_0x0204:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0210 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.zoomBy     // Catch:{ NoSuchFieldError -> 0x0210 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0210 }
                r2 = 44
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0210 }
            L_0x0210:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x021c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getOriginalUrl     // Catch:{ NoSuchFieldError -> 0x021c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x021c }
                r2 = 45
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x021c }
            L_0x021c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0228 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getZoomScale     // Catch:{ NoSuchFieldError -> 0x0228 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0228 }
                r2 = 46
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0228 }
            L_0x0228:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0234 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getSelectedText     // Catch:{ NoSuchFieldError -> 0x0234 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0234 }
                r2 = 47
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0234 }
            L_0x0234:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0240 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getHitTestResult     // Catch:{ NoSuchFieldError -> 0x0240 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0240 }
                r2 = 48
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0240 }
            L_0x0240:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x024c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.pageDown     // Catch:{ NoSuchFieldError -> 0x024c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x024c }
                r2 = 49
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x024c }
            L_0x024c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0258 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.pageUp     // Catch:{ NoSuchFieldError -> 0x0258 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0258 }
                r2 = 50
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0258 }
            L_0x0258:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0264 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.saveWebArchive     // Catch:{ NoSuchFieldError -> 0x0264 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0264 }
                r2 = 51
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0264 }
            L_0x0264:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0270 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.zoomIn     // Catch:{ NoSuchFieldError -> 0x0270 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0270 }
                r2 = 52
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0270 }
            L_0x0270:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x027c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.zoomOut     // Catch:{ NoSuchFieldError -> 0x027c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x027c }
                r2 = 53
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x027c }
            L_0x027c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0288 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.clearFocus     // Catch:{ NoSuchFieldError -> 0x0288 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0288 }
                r2 = 54
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0288 }
            L_0x0288:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0294 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.setContextMenu     // Catch:{ NoSuchFieldError -> 0x0294 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0294 }
                r2 = 55
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0294 }
            L_0x0294:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02a0 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.requestFocusNodeHref     // Catch:{ NoSuchFieldError -> 0x02a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a0 }
                r2 = 56
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02a0 }
            L_0x02a0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02ac }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.requestImageRef     // Catch:{ NoSuchFieldError -> 0x02ac }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ac }
                r2 = 57
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02ac }
            L_0x02ac:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02b8 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getScrollX     // Catch:{ NoSuchFieldError -> 0x02b8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b8 }
                r2 = 58
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02b8 }
            L_0x02b8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02c4 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getScrollY     // Catch:{ NoSuchFieldError -> 0x02c4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c4 }
                r2 = 59
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02c4 }
            L_0x02c4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02d0 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.getCertificate     // Catch:{ NoSuchFieldError -> 0x02d0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d0 }
                r2 = 60
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02d0 }
            L_0x02d0:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02dc }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.clearHistory     // Catch:{ NoSuchFieldError -> 0x02dc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02dc }
                r2 = 61
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02dc }
            L_0x02dc:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02e8 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.addUserScript     // Catch:{ NoSuchFieldError -> 0x02e8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e8 }
                r2 = 62
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02e8 }
            L_0x02e8:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x02f4 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.removeUserScript     // Catch:{ NoSuchFieldError -> 0x02f4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f4 }
                r2 = 63
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x02f4 }
            L_0x02f4:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0300 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.removeUserScriptsByGroupName     // Catch:{ NoSuchFieldError -> 0x0300 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0300 }
                r2 = 64
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0300 }
            L_0x0300:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x030c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.removeAllUserScripts     // Catch:{ NoSuchFieldError -> 0x030c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x030c }
                r2 = 65
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x030c }
            L_0x030c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0318 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.callAsyncJavaScript     // Catch:{ NoSuchFieldError -> 0x0318 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0318 }
                r2 = 66
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0318 }
            L_0x0318:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0324 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.isSecureContext     // Catch:{ NoSuchFieldError -> 0x0324 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0324 }
                r2 = 67
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0324 }
            L_0x0324:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0330 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.createWebMessageChannel     // Catch:{ NoSuchFieldError -> 0x0330 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0330 }
                r2 = 68
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0330 }
            L_0x0330:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x033c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.postWebMessage     // Catch:{ NoSuchFieldError -> 0x033c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x033c }
                r2 = 69
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x033c }
            L_0x033c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0348 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.addWebMessageListener     // Catch:{ NoSuchFieldError -> 0x0348 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0348 }
                r2 = 70
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0348 }
            L_0x0348:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0354 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.canScrollVertically     // Catch:{ NoSuchFieldError -> 0x0354 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0354 }
                r2 = 71
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0354 }
            L_0x0354:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0360 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.canScrollHorizontally     // Catch:{ NoSuchFieldError -> 0x0360 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0360 }
                r2 = 72
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0360 }
            L_0x0360:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x036c }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.isInFullscreen     // Catch:{ NoSuchFieldError -> 0x036c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x036c }
                r2 = 73
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x036c }
            L_0x036c:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods     // Catch:{ NoSuchFieldError -> 0x0378 }
                com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods r1 = com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegateMethods.clearFormData     // Catch:{ NoSuchFieldError -> 0x0378 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0378 }
                r2 = 74
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0378 }
            L_0x0378:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate.AnonymousClass8.<clinit>():void");
        }
    }

    public static class CallJsHandlerCallback extends BaseCallbackResultImpl<Object> {
        public Object decodeResult(Object obj) {
            return obj;
        }
    }

    public static class CreateWindowCallback extends BaseCallbackResultImpl<Boolean> {
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public static class FormResubmissionCallback extends BaseCallbackResultImpl<Integer> {
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class GeolocationPermissionsShowPromptCallback extends BaseCallbackResultImpl<GeolocationPermissionShowPromptResponse> {
        public GeolocationPermissionShowPromptResponse decodeResult(Object obj) {
            return GeolocationPermissionShowPromptResponse.fromMap((Map) obj);
        }
    }

    public static class JsAlertCallback extends BaseCallbackResultImpl<JsAlertResponse> {
        public JsAlertResponse decodeResult(Object obj) {
            return JsAlertResponse.fromMap((Map) obj);
        }
    }

    public static class JsBeforeUnloadCallback extends BaseCallbackResultImpl<JsBeforeUnloadResponse> {
        public JsBeforeUnloadResponse decodeResult(Object obj) {
            return JsBeforeUnloadResponse.fromMap((Map) obj);
        }
    }

    public static class JsConfirmCallback extends BaseCallbackResultImpl<JsConfirmResponse> {
        public JsConfirmResponse decodeResult(Object obj) {
            return JsConfirmResponse.fromMap((Map) obj);
        }
    }

    public static class JsPromptCallback extends BaseCallbackResultImpl<JsPromptResponse> {
        public JsPromptResponse decodeResult(Object obj) {
            return JsPromptResponse.fromMap((Map) obj);
        }
    }

    public static class LoadResourceWithCustomSchemeCallback extends BaseCallbackResultImpl<CustomSchemeResponse> {
        public CustomSchemeResponse decodeResult(Object obj) {
            return CustomSchemeResponse.fromMap((Map) obj);
        }
    }

    public static class PermissionRequestCallback extends BaseCallbackResultImpl<PermissionResponse> {
        public PermissionResponse decodeResult(Object obj) {
            return PermissionResponse.fromMap((Map) obj);
        }
    }

    public static class PrintRequestCallback extends BaseCallbackResultImpl<Boolean> {
        public Boolean decodeResult(Object obj) {
            return Boolean.valueOf((obj instanceof Boolean) && ((Boolean) obj).booleanValue());
        }
    }

    public static class ReceivedClientCertRequestCallback extends BaseCallbackResultImpl<ClientCertResponse> {
        public ClientCertResponse decodeResult(Object obj) {
            return ClientCertResponse.fromMap((Map) obj);
        }
    }

    public static class ReceivedHttpAuthRequestCallback extends BaseCallbackResultImpl<HttpAuthResponse> {
        public HttpAuthResponse decodeResult(Object obj) {
            return HttpAuthResponse.fromMap((Map) obj);
        }
    }

    public static class ReceivedServerTrustAuthRequestCallback extends BaseCallbackResultImpl<ServerTrustAuthResponse> {
        public ServerTrustAuthResponse decodeResult(Object obj) {
            return ServerTrustAuthResponse.fromMap((Map) obj);
        }
    }

    public static class RenderProcessResponsiveCallback extends BaseCallbackResultImpl<Integer> {
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class RenderProcessUnresponsiveCallback extends BaseCallbackResultImpl<Integer> {
        public Integer decodeResult(Object obj) {
            if (obj instanceof Integer) {
                return (Integer) obj;
            }
            return null;
        }
    }

    public static class SafeBrowsingHitCallback extends BaseCallbackResultImpl<SafeBrowsingResponse> {
        public SafeBrowsingResponse decodeResult(Object obj) {
            return SafeBrowsingResponse.fromMap((Map) obj);
        }
    }

    public static class ShouldInterceptRequestCallback extends BaseCallbackResultImpl<WebResourceResponseExt> {
        public WebResourceResponseExt decodeResult(Object obj) {
            return WebResourceResponseExt.fromMap((Map) obj);
        }
    }

    public static class ShouldOverrideUrlLoadingCallback extends BaseCallbackResultImpl<NavigationActionPolicy> {
        public NavigationActionPolicy decodeResult(Object obj) {
            return NavigationActionPolicy.fromValue(Integer.valueOf(obj instanceof Integer ? ((Integer) obj).intValue() : NavigationActionPolicy.CANCEL.rawValue()).intValue());
        }
    }

    public static class SyncLoadResourceWithCustomSchemeCallback extends SyncBaseCallbackResultImpl<CustomSchemeResponse> {
        public CustomSchemeResponse decodeResult(Object obj) {
            return new LoadResourceWithCustomSchemeCallback().decodeResult(obj);
        }
    }

    public static class SyncShouldInterceptRequestCallback extends SyncBaseCallbackResultImpl<WebResourceResponseExt> {
        public WebResourceResponseExt decodeResult(Object obj) {
            return new ShouldInterceptRequestCallback().decodeResult(obj);
        }
    }

    public WebViewChannelDelegate(InAppWebView inAppWebView, k kVar) {
        super(kVar);
        this.webView = inAppWebView;
    }

    public void dispose() {
        super.dispose();
        this.webView = null;
    }

    public void onCallJsHandler(String str, String str2, CallJsHandlerCallback callJsHandlerCallback) {
        k channel = getChannel();
        if (channel == null) {
            callJsHandlerCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("handlerName", str);
        hashMap.put("args", str2);
        channel.d("onCallJsHandler", hashMap, callJsHandlerCallback);
    }

    public void onCloseWindow() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onCloseWindow", new HashMap());
        }
    }

    public void onConsoleMessage(String str, int i10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("messageLevel", Integer.valueOf(i10));
            channel.c("onConsoleMessage", hashMap);
        }
    }

    public void onContextMenuActionItemClicked(int i10, String str) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(i10));
            hashMap.put("androidId", Integer.valueOf(i10));
            hashMap.put("iosId", (Object) null);
            hashMap.put("title", str);
            channel.c("onContextMenuActionItemClicked", hashMap);
        }
    }

    public void onCreateContextMenu(HitTestResult hitTestResult) {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onCreateContextMenu", hitTestResult.toMap());
        }
    }

    public void onCreateWindow(CreateWindowAction createWindowAction, CreateWindowCallback createWindowCallback) {
        k channel = getChannel();
        if (channel == null) {
            createWindowCallback.defaultBehaviour(null);
        } else {
            channel.d("onCreateWindow", createWindowAction.toMap(), createWindowCallback);
        }
    }

    public void onDownloadStartRequest(DownloadStartRequest downloadStartRequest) {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onDownloadStartRequest", downloadStartRequest.toMap());
        }
    }

    public void onEnterFullscreen() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onEnterFullscreen", new HashMap());
        }
    }

    public void onExitFullscreen() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onExitFullscreen", new HashMap());
        }
    }

    @Deprecated
    public void onFindResultReceived(int i10, int i11, boolean z10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("activeMatchOrdinal", Integer.valueOf(i10));
            hashMap.put("numberOfMatches", Integer.valueOf(i11));
            hashMap.put("isDoneCounting", Boolean.valueOf(z10));
            channel.c("onFindResultReceived", hashMap);
        }
    }

    public void onFormResubmission(String str, FormResubmissionCallback formResubmissionCallback) {
        k channel = getChannel();
        if (channel == null) {
            formResubmissionCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.d("onFormResubmission", hashMap, formResubmissionCallback);
    }

    public void onGeolocationPermissionsHidePrompt() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onGeolocationPermissionsHidePrompt", new HashMap());
        }
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissionsShowPromptCallback geolocationPermissionsShowPromptCallback) {
        k channel = getChannel();
        if (channel == null) {
            geolocationPermissionsShowPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        channel.d("onGeolocationPermissionsShowPrompt", hashMap, geolocationPermissionsShowPromptCallback);
    }

    public void onHideContextMenu() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onHideContextMenu", new HashMap());
        }
    }

    public void onJsAlert(String str, String str2, Boolean bool, JsAlertCallback jsAlertCallback) {
        k channel = getChannel();
        if (channel == null) {
            jsAlertCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("isMainFrame", bool);
        channel.d("onJsAlert", hashMap, jsAlertCallback);
    }

    public void onJsBeforeUnload(String str, String str2, JsBeforeUnloadCallback jsBeforeUnloadCallback) {
        k channel = getChannel();
        if (channel == null) {
            jsBeforeUnloadCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        channel.d("onJsBeforeUnload", hashMap, jsBeforeUnloadCallback);
    }

    public void onJsConfirm(String str, String str2, Boolean bool, JsConfirmCallback jsConfirmCallback) {
        k channel = getChannel();
        if (channel == null) {
            jsConfirmCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("isMainFrame", bool);
        channel.d("onJsConfirm", hashMap, jsConfirmCallback);
    }

    public void onJsPrompt(String str, String str2, String str3, Boolean bool, JsPromptCallback jsPromptCallback) {
        k channel = getChannel();
        if (channel == null) {
            jsPromptCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("message", str2);
        hashMap.put("defaultValue", str3);
        hashMap.put("isMainFrame", bool);
        channel.d("onJsPrompt", hashMap, jsPromptCallback);
    }

    public void onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt, LoadResourceWithCustomSchemeCallback loadResourceWithCustomSchemeCallback) {
        k channel = getChannel();
        if (channel == null) {
            loadResourceWithCustomSchemeCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        channel.d("onLoadResourceWithCustomScheme", hashMap, loadResourceWithCustomSchemeCallback);
    }

    public void onLoadStart(String str) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            channel.c("onLoadStart", hashMap);
        }
    }

    public void onLoadStop(String str) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            channel.c("onLoadStop", hashMap);
        }
    }

    public void onLongPressHitTestResult(HitTestResult hitTestResult) {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onLongPressHitTestResult", hitTestResult.toMap());
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        j jVar2 = jVar;
        final k.d dVar2 = dVar;
        try {
            boolean z10 = true;
            Object obj = null;
            switch (AnonymousClass8.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$webview$WebViewChannelDelegateMethods[WebViewChannelDelegateMethods.valueOf(jVar2.f36116a).ordinal()]) {
                case 1:
                    InAppWebView inAppWebView = this.webView;
                    if (inAppWebView != null) {
                        obj = inAppWebView.getUrl();
                    }
                    dVar2.success(obj);
                    return;
                case 2:
                    InAppWebView inAppWebView2 = this.webView;
                    if (inAppWebView2 != null) {
                        obj = inAppWebView2.getTitle();
                    }
                    dVar2.success(obj);
                    return;
                case 3:
                    InAppWebView inAppWebView3 = this.webView;
                    if (inAppWebView3 != null) {
                        obj = Integer.valueOf(inAppWebView3.getProgress());
                    }
                    dVar2.success(obj);
                    return;
                case 4:
                    if (this.webView != null) {
                        this.webView.loadUrl(URLRequest.fromMap((Map) jVar2.a("urlRequest")));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 5:
                    if (this.webView != null) {
                        this.webView.postUrl((String) jVar2.a("url"), (byte[]) jVar2.a("postData"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 6:
                    if (this.webView != null) {
                        this.webView.loadDataWithBaseURL((String) jVar2.a("baseUrl"), (String) jVar2.a(JsonStorageKeyNames.DATA_KEY), (String) jVar2.a("mimeType"), (String) jVar2.a("encoding"), (String) jVar2.a("historyUrl"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 7:
                    if (this.webView != null) {
                        try {
                            this.webView.loadFile((String) jVar2.a("assetFilePath"));
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            dVar2.error(LOG_TAG, e10.getMessage(), (Object) null);
                            return;
                        }
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 8:
                    if (this.webView != null) {
                        this.webView.evaluateJavascript((String) jVar2.a("source"), ContentWorld.fromMap((Map) jVar2.a("contentWorld")), new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                dVar2.success(str);
                            }
                        });
                        return;
                    }
                    dVar2.success((Object) null);
                    return;
                case 9:
                    if (this.webView != null) {
                        this.webView.injectJavascriptFileFromUrl((String) jVar2.a("urlFile"), (Map) jVar2.a("scriptHtmlTagAttributes"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 10:
                    if (this.webView != null) {
                        this.webView.injectCSSCode((String) jVar2.a("source"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 11:
                    if (this.webView != null) {
                        this.webView.injectCSSFileFromUrl((String) jVar2.a("urlFile"), (Map) jVar2.a("cssLinkHtmlTagAttributes"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 12:
                    InAppWebView inAppWebView4 = this.webView;
                    if (inAppWebView4 != null) {
                        inAppWebView4.reload();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 13:
                    InAppWebView inAppWebView5 = this.webView;
                    if (inAppWebView5 != null) {
                        inAppWebView5.goBack();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 14:
                    InAppWebView inAppWebView6 = this.webView;
                    if (inAppWebView6 == null || !inAppWebView6.canGoBack()) {
                        z10 = false;
                    }
                    dVar2.success(Boolean.valueOf(z10));
                    return;
                case 15:
                    InAppWebView inAppWebView7 = this.webView;
                    if (inAppWebView7 != null) {
                        inAppWebView7.goForward();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 16:
                    InAppWebView inAppWebView8 = this.webView;
                    if (inAppWebView8 == null || !inAppWebView8.canGoForward()) {
                        z10 = false;
                    }
                    dVar2.success(Boolean.valueOf(z10));
                    return;
                case 17:
                    InAppWebView inAppWebView9 = this.webView;
                    if (inAppWebView9 != null) {
                        inAppWebView9.goBackOrForward(((Integer) jVar2.a("steps")).intValue());
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 18:
                    InAppWebView inAppWebView10 = this.webView;
                    if (inAppWebView10 == null || !inAppWebView10.canGoBackOrForward(((Integer) jVar2.a("steps")).intValue())) {
                        z10 = false;
                    }
                    dVar2.success(Boolean.valueOf(z10));
                    return;
                case 19:
                    InAppWebView inAppWebView11 = this.webView;
                    if (inAppWebView11 != null) {
                        inAppWebView11.stopLoading();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 20:
                    InAppWebView inAppWebView12 = this.webView;
                    if (inAppWebView12 == null || !inAppWebView12.isLoading()) {
                        z10 = false;
                    }
                    dVar2.success(Boolean.valueOf(z10));
                    return;
                case 21:
                    if (this.webView != null) {
                        this.webView.takeScreenshot((Map) jVar2.a("screenshotConfiguration"), dVar2);
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 22:
                    InAppWebView inAppWebView13 = this.webView;
                    if (inAppWebView13 != null && (inAppWebView13.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppBrowserSettings inAppBrowserSettings = new InAppBrowserSettings();
                        HashMap hashMap = (HashMap) jVar2.a("settings");
                        inAppBrowserSettings.parse((Map) hashMap);
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).setSettings(inAppBrowserSettings, hashMap);
                    } else if (this.webView != null) {
                        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
                        HashMap hashMap2 = (HashMap) jVar2.a("settings");
                        inAppWebViewSettings.parse((Map) hashMap2);
                        this.webView.setSettings(inAppWebViewSettings, hashMap2);
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 23:
                    InAppWebView inAppWebView14 = this.webView;
                    if (inAppWebView14 == null || !(inAppWebView14.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        InAppWebView inAppWebView15 = this.webView;
                        if (inAppWebView15 != null) {
                            obj = inAppWebView15.getCustomSettings();
                        }
                        dVar2.success(obj);
                        return;
                    }
                    dVar2.success(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).getCustomSettings());
                    return;
                case 24:
                    InAppWebView inAppWebView16 = this.webView;
                    if (inAppWebView16 == null || !(inAppWebView16.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        dVar.notImplemented();
                        return;
                    } else {
                        ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).close(dVar2);
                        return;
                    }
                case 25:
                    InAppWebView inAppWebView17 = this.webView;
                    if (inAppWebView17 == null || !(inAppWebView17.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        dVar.notImplemented();
                        return;
                    }
                    ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).show();
                    dVar2.success(Boolean.TRUE);
                    return;
                case 26:
                    InAppWebView inAppWebView18 = this.webView;
                    if (inAppWebView18 == null || !(inAppWebView18.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        dVar.notImplemented();
                        return;
                    }
                    ((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).hide();
                    dVar2.success(Boolean.TRUE);
                    return;
                case 27:
                    InAppWebView inAppWebView19 = this.webView;
                    if (inAppWebView19 == null || !(inAppWebView19.getInAppBrowserDelegate() instanceof InAppBrowserActivity)) {
                        dVar.notImplemented();
                        return;
                    } else {
                        dVar2.success(Boolean.valueOf(((InAppBrowserActivity) this.webView.getInAppBrowserDelegate()).isHidden));
                        return;
                    }
                case 28:
                    InAppWebView inAppWebView20 = this.webView;
                    if (inAppWebView20 != null) {
                        obj = inAppWebView20.getCopyBackForwardList();
                    }
                    dVar2.success(obj);
                    return;
                case 29:
                    if (this.webView == null || !s.a("START_SAFE_BROWSING")) {
                        dVar2.success(Boolean.FALSE);
                        return;
                    } else {
                        r.s(this.webView.getContext(), new ValueCallback<Boolean>() {
                            public void onReceiveValue(Boolean bool) {
                                dVar2.success(bool);
                            }
                        });
                        return;
                    }
                case 30:
                    InAppWebView inAppWebView21 = this.webView;
                    if (inAppWebView21 != null) {
                        inAppWebView21.clearAllCache();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 31:
                    InAppWebView inAppWebView22 = this.webView;
                    if (inAppWebView22 != null) {
                        inAppWebView22.clearSslPreferences();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 32:
                    if (this.webView != null) {
                        this.webView.findAllAsync((String) jVar2.a("find"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 33:
                    if (this.webView != null) {
                        this.webView.findNext(((Boolean) jVar2.a("forward")).booleanValue());
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 34:
                    InAppWebView inAppWebView23 = this.webView;
                    if (inAppWebView23 != null) {
                        inAppWebView23.clearMatches();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 35:
                    if (this.webView != null) {
                        this.webView.scrollTo((Integer) jVar2.a("x"), (Integer) jVar2.a("y"), (Boolean) jVar2.a("animated"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 36:
                    if (this.webView != null) {
                        this.webView.scrollBy((Integer) jVar2.a("x"), (Integer) jVar2.a("y"), (Boolean) jVar2.a("animated"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 37:
                    InAppWebView inAppWebView24 = this.webView;
                    if (inAppWebView24 != null) {
                        inAppWebView24.onPause();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 38:
                    InAppWebView inAppWebView25 = this.webView;
                    if (inAppWebView25 != null) {
                        inAppWebView25.onResume();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 39:
                    InAppWebView inAppWebView26 = this.webView;
                    if (inAppWebView26 != null) {
                        inAppWebView26.pauseTimers();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 40:
                    InAppWebView inAppWebView27 = this.webView;
                    if (inAppWebView27 != null) {
                        inAppWebView27.resumeTimers();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 41:
                    if (this.webView == null || Build.VERSION.SDK_INT < 21) {
                        dVar2.success((Object) null);
                        return;
                    }
                    PrintJobSettings printJobSettings = new PrintJobSettings();
                    Map map = (Map) jVar2.a("settings");
                    if (map != null) {
                        printJobSettings.parse(map);
                    }
                    dVar2.success(this.webView.printCurrentPage(printJobSettings));
                    return;
                case 42:
                    InAppWebView inAppWebView28 = this.webView;
                    if (inAppWebView28 instanceof InAppWebView) {
                        dVar2.success(Integer.valueOf(inAppWebView28.getContentHeight()));
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 43:
                    InAppWebView inAppWebView29 = this.webView;
                    if (inAppWebView29 instanceof InAppWebView) {
                        inAppWebView29.getContentWidth(new ValueCallback<Integer>() {
                            public void onReceiveValue(Integer num) {
                                dVar2.success(num);
                            }
                        });
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 44:
                    if (this.webView != null && Build.VERSION.SDK_INT >= 21) {
                        this.webView.zoomBy((float) ((Double) jVar2.a("zoomFactor")).doubleValue());
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 45:
                    InAppWebView inAppWebView30 = this.webView;
                    if (inAppWebView30 != null) {
                        obj = inAppWebView30.getOriginalUrl();
                    }
                    dVar2.success(obj);
                    return;
                case 46:
                    InAppWebView inAppWebView31 = this.webView;
                    if (inAppWebView31 instanceof InAppWebView) {
                        dVar2.success(Float.valueOf(inAppWebView31.getZoomScale()));
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 47:
                    InAppWebView inAppWebView32 = this.webView;
                    if (!(inAppWebView32 instanceof InAppWebView) || Build.VERSION.SDK_INT < 19) {
                        dVar2.success((Object) null);
                        return;
                    } else {
                        inAppWebView32.getSelectedText(new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                dVar2.success(str);
                            }
                        });
                        return;
                    }
                case 48:
                    InAppWebView inAppWebView33 = this.webView;
                    if (inAppWebView33 instanceof InAppWebView) {
                        dVar2.success(HitTestResult.fromWebViewHitTestResult(inAppWebView33.getHitTestResult()).toMap());
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 49:
                    if (this.webView != null) {
                        dVar2.success(Boolean.valueOf(this.webView.pageDown(((Boolean) jVar2.a("bottom")).booleanValue())));
                        return;
                    } else {
                        dVar2.success(Boolean.FALSE);
                        return;
                    }
                case 50:
                    if (this.webView != null) {
                        dVar2.success(Boolean.valueOf(this.webView.pageUp(((Boolean) jVar2.a("top")).booleanValue())));
                        return;
                    } else {
                        dVar2.success(Boolean.FALSE);
                        return;
                    }
                case 51:
                    if (this.webView != null) {
                        this.webView.saveWebArchive((String) jVar2.a("filePath"), ((Boolean) jVar2.a("autoname")).booleanValue(), new ValueCallback<String>() {
                            public void onReceiveValue(String str) {
                                dVar2.success(str);
                            }
                        });
                        return;
                    }
                    dVar2.success((Object) null);
                    return;
                case 52:
                    InAppWebView inAppWebView34 = this.webView;
                    if (inAppWebView34 != null) {
                        dVar2.success(Boolean.valueOf(inAppWebView34.zoomIn()));
                        return;
                    } else {
                        dVar2.success(Boolean.FALSE);
                        return;
                    }
                case 53:
                    InAppWebView inAppWebView35 = this.webView;
                    if (inAppWebView35 != null) {
                        dVar2.success(Boolean.valueOf(inAppWebView35.zoomOut()));
                        return;
                    } else {
                        dVar2.success(Boolean.FALSE);
                        return;
                    }
                case 54:
                    InAppWebView inAppWebView36 = this.webView;
                    if (inAppWebView36 != null) {
                        inAppWebView36.clearFocus();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 55:
                    if (this.webView != null) {
                        this.webView.setContextMenu((Map) jVar2.a("contextMenu"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 56:
                    InAppWebView inAppWebView37 = this.webView;
                    if (inAppWebView37 != null) {
                        dVar2.success(inAppWebView37.requestFocusNodeHref());
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 57:
                    InAppWebView inAppWebView38 = this.webView;
                    if (inAppWebView38 != null) {
                        dVar2.success(inAppWebView38.requestImageRef());
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 58:
                    InAppWebView inAppWebView39 = this.webView;
                    if (inAppWebView39 != null) {
                        dVar2.success(Integer.valueOf(inAppWebView39.getScrollX()));
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 59:
                    InAppWebView inAppWebView40 = this.webView;
                    if (inAppWebView40 != null) {
                        dVar2.success(Integer.valueOf(inAppWebView40.getScrollY()));
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 60:
                    InAppWebView inAppWebView41 = this.webView;
                    if (inAppWebView41 != null) {
                        dVar2.success(SslCertificateExt.toMap(inAppWebView41.getCertificate()));
                        return;
                    } else {
                        dVar2.success((Object) null);
                        return;
                    }
                case 61:
                    InAppWebView inAppWebView42 = this.webView;
                    if (inAppWebView42 != null) {
                        inAppWebView42.clearHistory();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 62:
                    InAppWebView inAppWebView43 = this.webView;
                    if (inAppWebView43 == null || inAppWebView43.getUserContentController() == null) {
                        dVar2.success(Boolean.FALSE);
                        return;
                    } else {
                        dVar2.success(Boolean.valueOf(this.webView.getUserContentController().addUserOnlyScript(UserScript.fromMap((Map) jVar2.a("userScript")))));
                        return;
                    }
                case 63:
                    InAppWebView inAppWebView44 = this.webView;
                    if (inAppWebView44 == null || inAppWebView44.getUserContentController() == null) {
                        dVar2.success(Boolean.FALSE);
                        return;
                    } else {
                        dVar2.success(Boolean.valueOf(this.webView.getUserContentController().removeUserOnlyScriptAt(((Integer) jVar2.a("index")).intValue(), UserScript.fromMap((Map) jVar2.a("userScript")).getInjectionTime())));
                        return;
                    }
                case 64:
                    InAppWebView inAppWebView45 = this.webView;
                    if (!(inAppWebView45 == null || inAppWebView45.getUserContentController() == null)) {
                        this.webView.getUserContentController().removeUserOnlyScriptsByGroupName((String) jVar2.a("groupName"));
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 65:
                    InAppWebView inAppWebView46 = this.webView;
                    if (!(inAppWebView46 == null || inAppWebView46.getUserContentController() == null)) {
                        this.webView.getUserContentController().removeAllUserOnlyScripts();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                case 66:
                    if (this.webView == null || Build.VERSION.SDK_INT < 21) {
                        dVar2.success((Object) null);
                        return;
                    }
                    this.webView.callAsyncJavaScript((String) jVar2.a("functionBody"), (Map) jVar2.a("arguments"), ContentWorld.fromMap((Map) jVar2.a("contentWorld")), new ValueCallback<String>() {
                        public void onReceiveValue(String str) {
                            dVar2.success(str);
                        }
                    });
                    return;
                case 67:
                    InAppWebView inAppWebView47 = this.webView;
                    if (inAppWebView47 == null || Build.VERSION.SDK_INT < 21) {
                        dVar2.success(Boolean.FALSE);
                        return;
                    } else {
                        inAppWebView47.isSecureContext(new ValueCallback<Boolean>() {
                            public void onReceiveValue(Boolean bool) {
                                dVar2.success(bool);
                            }
                        });
                        return;
                    }
                case 68:
                    InAppWebView inAppWebView48 = this.webView;
                    if (inAppWebView48 == null) {
                        dVar2.success((Object) null);
                        return;
                    } else if (!(inAppWebView48 instanceof InAppWebView) || !s.a("CREATE_WEB_MESSAGE_CHANNEL")) {
                        dVar2.success((Object) null);
                        return;
                    } else {
                        dVar2.success(this.webView.createCompatWebMessageChannel().toMap());
                        return;
                    }
                case 69:
                    if (this.webView == null || !s.a("POST_WEB_MESSAGE")) {
                        dVar2.success(Boolean.TRUE);
                        return;
                    }
                    WebMessageCompatExt fromMap = WebMessageCompatExt.fromMap((Map) jVar2.a("message"));
                    String str = (String) jVar2.a("targetOrigin");
                    ArrayList arrayList = new ArrayList();
                    List<WebMessagePortCompatExt> ports = fromMap.getPorts();
                    if (ports != null) {
                        for (WebMessagePortCompatExt next : ports) {
                            WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get(next.getWebMessageChannelId());
                            if (webMessageChannel != null && (this.webView instanceof InAppWebView)) {
                                arrayList.add(webMessageChannel.compatPorts.get(next.getIndex()));
                            }
                        }
                    }
                    Object data = fromMap.getData();
                    if (this.webView instanceof InAppWebView) {
                        try {
                            if (!s.a("WEB_MESSAGE_ARRAY_BUFFER") || data == null || fromMap.getType() != 1) {
                                r.n(this.webView, new l(data != null ? data.toString() : null, (m[]) arrayList.toArray(new m[0])), Uri.parse(str));
                            } else {
                                r.n(this.webView, new l((byte[]) data, (m[]) arrayList.toArray(new m[0])), Uri.parse(str));
                            }
                            dVar2.success(Boolean.TRUE);
                            return;
                        } catch (Exception e11) {
                            dVar2.error(LOG_TAG, e11.getMessage(), (Object) null);
                            return;
                        }
                    } else {
                        return;
                    }
                case 70:
                    if (this.webView != null) {
                        InAppWebView inAppWebView49 = this.webView;
                        WebMessageListener fromMap2 = WebMessageListener.fromMap(inAppWebView49, inAppWebView49.getPlugin().messenger, (Map) jVar2.a("webMessageListener"));
                        if (!(this.webView instanceof InAppWebView) || !s.a("WEB_MESSAGE_LISTENER")) {
                            dVar2.success(Boolean.TRUE);
                            return;
                        }
                        try {
                            this.webView.addWebMessageListener(fromMap2);
                            dVar2.success(Boolean.TRUE);
                            return;
                        } catch (Exception e12) {
                            dVar2.error(LOG_TAG, e12.getMessage(), (Object) null);
                            return;
                        }
                    } else {
                        dVar2.success(Boolean.TRUE);
                        return;
                    }
                case 71:
                    InAppWebView inAppWebView50 = this.webView;
                    if (inAppWebView50 != null) {
                        dVar2.success(Boolean.valueOf(inAppWebView50.canScrollVertically()));
                        return;
                    } else {
                        dVar2.success(Boolean.FALSE);
                        return;
                    }
                case 72:
                    InAppWebView inAppWebView51 = this.webView;
                    if (inAppWebView51 != null) {
                        dVar2.success(Boolean.valueOf(inAppWebView51.canScrollHorizontally()));
                        return;
                    } else {
                        dVar2.success(Boolean.FALSE);
                        return;
                    }
                case 73:
                    InAppWebView inAppWebView52 = this.webView;
                    if (inAppWebView52 != null) {
                        dVar2.success(Boolean.valueOf(inAppWebView52.isInFullscreen()));
                        return;
                    } else {
                        dVar2.success(Boolean.FALSE);
                        return;
                    }
                case 74:
                    InAppWebView inAppWebView53 = this.webView;
                    if (inAppWebView53 != null) {
                        inAppWebView53.clearFormData();
                    }
                    dVar2.success(Boolean.TRUE);
                    return;
                default:
                    return;
            }
        } catch (IllegalArgumentException unused) {
            dVar.notImplemented();
        }
    }

    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(i10));
            hashMap.put("y", Integer.valueOf(i11));
            hashMap.put("clampedX", Boolean.valueOf(z10));
            hashMap.put("clampedY", Boolean.valueOf(z11));
            channel.c("onOverScrolled", hashMap);
        }
    }

    public void onPageCommitVisible(String str) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            channel.c("onPageCommitVisible", hashMap);
        }
    }

    public void onPermissionRequest(String str, List<String> list, Object obj, PermissionRequestCallback permissionRequestCallback) {
        k channel = getChannel();
        if (channel == null) {
            permissionRequestCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("origin", str);
        hashMap.put("resources", list);
        hashMap.put("frame", obj);
        channel.d("onPermissionRequest", hashMap, permissionRequestCallback);
    }

    public void onPermissionRequestCanceled(String str, List<String> list) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("origin", str);
            hashMap.put("resources", list);
            channel.c("onPermissionRequestCanceled", hashMap);
        }
    }

    public void onPrintRequest(String str, String str2, PrintRequestCallback printRequestCallback) {
        k channel = getChannel();
        if (channel == null) {
            printRequestCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("printJobId", str2);
        channel.d("onPrintRequest", hashMap, printRequestCallback);
    }

    public void onProgressChanged(int i10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("progress", Integer.valueOf(i10));
            channel.c("onProgressChanged", hashMap);
        }
    }

    public void onReceivedClientCertRequest(ClientCertChallenge clientCertChallenge, ReceivedClientCertRequestCallback receivedClientCertRequestCallback) {
        k channel = getChannel();
        if (channel == null) {
            receivedClientCertRequestCallback.defaultBehaviour(null);
        } else {
            channel.d("onReceivedClientCertRequest", clientCertChallenge.toMap(), receivedClientCertRequestCallback);
        }
    }

    public void onReceivedError(WebResourceRequestExt webResourceRequestExt, WebResourceErrorExt webResourceErrorExt) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("request", webResourceRequestExt.toMap());
            hashMap.put("error", webResourceErrorExt.toMap());
            channel.c("onReceivedError", hashMap);
        }
    }

    public void onReceivedHttpAuthRequest(HttpAuthenticationChallenge httpAuthenticationChallenge, ReceivedHttpAuthRequestCallback receivedHttpAuthRequestCallback) {
        k channel = getChannel();
        if (channel == null) {
            receivedHttpAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.d("onReceivedHttpAuthRequest", httpAuthenticationChallenge.toMap(), receivedHttpAuthRequestCallback);
        }
    }

    public void onReceivedHttpError(WebResourceRequestExt webResourceRequestExt, WebResourceResponseExt webResourceResponseExt) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("request", webResourceRequestExt.toMap());
            hashMap.put("errorResponse", webResourceResponseExt.toMap());
            channel.c("onReceivedHttpError", hashMap);
        }
    }

    public void onReceivedIcon(byte[] bArr) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("icon", bArr);
            channel.c("onReceivedIcon", hashMap);
        }
    }

    public void onReceivedLoginRequest(String str, String str2, String str3) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, str);
            hashMap.put("account", str2);
            hashMap.put("args", str3);
            channel.c("onReceivedLoginRequest", hashMap);
        }
    }

    public void onReceivedServerTrustAuthRequest(ServerTrustChallenge serverTrustChallenge, ReceivedServerTrustAuthRequestCallback receivedServerTrustAuthRequestCallback) {
        k channel = getChannel();
        if (channel == null) {
            receivedServerTrustAuthRequestCallback.defaultBehaviour(null);
        } else {
            channel.d("onReceivedServerTrustAuthRequest", serverTrustChallenge.toMap(), receivedServerTrustAuthRequestCallback);
        }
    }

    public void onReceivedTouchIconUrl(String str, boolean z10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("precomposed", Boolean.valueOf(z10));
            channel.c("onReceivedTouchIconUrl", hashMap);
        }
    }

    public void onRenderProcessGone(boolean z10, int i10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("didCrash", Boolean.valueOf(z10));
            hashMap.put("rendererPriorityAtExit", Integer.valueOf(i10));
            channel.c("onRenderProcessGone", hashMap);
        }
    }

    public void onRenderProcessResponsive(String str, RenderProcessResponsiveCallback renderProcessResponsiveCallback) {
        k channel = getChannel();
        if (channel == null) {
            renderProcessResponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.d("onRenderProcessResponsive", hashMap, renderProcessResponsiveCallback);
    }

    public void onRenderProcessUnresponsive(String str, RenderProcessUnresponsiveCallback renderProcessUnresponsiveCallback) {
        k channel = getChannel();
        if (channel == null) {
            renderProcessUnresponsiveCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        channel.d("onRenderProcessUnresponsive", hashMap, renderProcessUnresponsiveCallback);
    }

    public void onRequestFocus() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onRequestFocus", new HashMap());
        }
    }

    public void onSafeBrowsingHit(String str, int i10, SafeBrowsingHitCallback safeBrowsingHitCallback) {
        k channel = getChannel();
        if (channel == null) {
            safeBrowsingHitCallback.defaultBehaviour(null);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("url", str);
        hashMap.put("threatType", Integer.valueOf(i10));
        channel.d("onSafeBrowsingHit", hashMap, safeBrowsingHitCallback);
    }

    public void onScrollChanged(int i10, int i11) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(i10));
            hashMap.put("y", Integer.valueOf(i11));
            channel.c("onScrollChanged", hashMap);
        }
    }

    public void onTitleChanged(String str) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("title", str);
            channel.c("onTitleChanged", hashMap);
        }
    }

    public void onUpdateVisitedHistory(String str, boolean z10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("url", str);
            hashMap.put("isReload", Boolean.valueOf(z10));
            channel.c("onUpdateVisitedHistory", hashMap);
        }
    }

    public void onZoomScaleChanged(float f10, float f11) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("oldScale", Float.valueOf(f10));
            hashMap.put("newScale", Float.valueOf(f11));
            channel.c("onZoomScaleChanged", hashMap);
        }
    }

    public void shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt, ShouldInterceptRequestCallback shouldInterceptRequestCallback) {
        k channel = getChannel();
        if (channel == null) {
            shouldInterceptRequestCallback.defaultBehaviour(null);
        } else {
            channel.d("shouldInterceptRequest", webResourceRequestExt.toMap(), shouldInterceptRequestCallback);
        }
    }

    public void shouldOverrideUrlLoading(NavigationAction navigationAction, ShouldOverrideUrlLoadingCallback shouldOverrideUrlLoadingCallback) {
        k channel = getChannel();
        if (channel == null) {
            shouldOverrideUrlLoadingCallback.defaultBehaviour(null);
        } else {
            channel.d("shouldOverrideUrlLoading", navigationAction.toMap(), shouldOverrideUrlLoadingCallback);
        }
    }

    public WebResourceResponseExt shouldInterceptRequest(WebResourceRequestExt webResourceRequestExt) throws InterruptedException {
        k channel = getChannel();
        if (channel == null) {
            return null;
        }
        return (WebResourceResponseExt) Util.invokeMethodAndWaitResult(channel, "shouldInterceptRequest", webResourceRequestExt.toMap(), new SyncShouldInterceptRequestCallback());
    }

    public CustomSchemeResponse onLoadResourceWithCustomScheme(WebResourceRequestExt webResourceRequestExt) throws InterruptedException {
        k channel = getChannel();
        if (channel == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("request", webResourceRequestExt.toMap());
        return (CustomSchemeResponse) Util.invokeMethodAndWaitResult(channel, "onLoadResourceWithCustomScheme", hashMap, new SyncLoadResourceWithCustomSchemeCallback());
    }
}
