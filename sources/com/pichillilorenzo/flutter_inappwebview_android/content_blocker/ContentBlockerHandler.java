package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import android.util.Log;
import android.webkit.WebResourceResponse;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class ContentBlockerHandler {
    protected static final String LOG_TAG = "ContentBlockerHandler";
    protected List<ContentBlocker> ruleList = new ArrayList();

    /* renamed from: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType[] r0 = com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType = r0
                com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType r1 = com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType.BLOCK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType     // Catch:{ NoSuchFieldError -> 0x001d }
                com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType r1 = com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType.CSS_DISPLAY_NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType r1 = com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType.MAKE_HTTPS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.AnonymousClass3.<clinit>():void");
        }
    }

    public ContentBlockerHandler() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.webkit.WebResourceResponse checkUrl(com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView r27, com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt r28, com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTriggerResourceType r29) throws java.net.URISyntaxException, java.lang.InterruptedException, java.net.MalformedURLException {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "charset="
            com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings r0 = r2.customSettings
            java.util.List<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>>> r0 = r0.contentBlockers
            r4 = 0
            if (r0 != 0) goto L_0x000e
            return r4
        L_0x000e:
            java.lang.String r5 = r28.getUrl()
            r6 = 0
            java.net.URI r0 = new java.net.URI     // Catch:{ URISyntaxException -> 0x0019 }
            r0.<init>(r5)     // Catch:{ URISyntaxException -> 0x0019 }
            goto L_0x004b
        L_0x0019:
            java.lang.String r0 = ":"
            java.lang.String[] r0 = r5.split(r0)
            r8 = r0[r6]
            java.net.URL r0 = new java.net.URL
            java.lang.String r7 = "https"
            java.lang.String r7 = r5.replace(r8, r7)
            r0.<init>(r7)
            java.net.URI r15 = new java.net.URI
            java.lang.String r9 = r0.getUserInfo()
            java.lang.String r10 = r0.getHost()
            int r11 = r0.getPort()
            java.lang.String r12 = r0.getPath()
            java.lang.String r13 = r0.getQuery()
            java.lang.String r14 = r0.getRef()
            r7 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r0 = r15
        L_0x004b:
            java.lang.String r7 = r0.getHost()
            int r8 = r0.getPort()
            java.lang.String r9 = r0.getScheme()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.List<com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker> r10 = r1.ruleList
            r0.<init>(r10)
            java.util.Iterator r10 = r0.iterator()
        L_0x0062:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x036e
            java.lang.Object r0 = r10.next()
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker r0 = (com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlocker) r0
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTrigger r11 = r0.getTrigger()
            java.util.List r12 = r11.getResourceType()
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTriggerResourceType r13 = com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTriggerResourceType.IMAGE
            boolean r13 = r12.contains(r13)
            if (r13 == 0) goto L_0x0089
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTriggerResourceType r13 = com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTriggerResourceType.SVG_DOCUMENT
            boolean r14 = r12.contains(r13)
            if (r14 != 0) goto L_0x0089
            r12.add(r13)
        L_0x0089:
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerAction r0 = r0.getAction()
            java.util.regex.Pattern r13 = r11.getUrlFilterPatternCompiled()
            java.util.regex.Matcher r13 = r13.matcher(r5)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L_0x0361
            boolean r13 = r12.isEmpty()
            if (r13 != 0) goto L_0x00aa
            r13 = r29
            boolean r12 = r12.contains(r13)
            if (r12 != 0) goto L_0x00ac
            return r4
        L_0x00aa:
            r13 = r29
        L_0x00ac:
            java.util.List r12 = r11.getIfDomain()
            boolean r12 = r12.isEmpty()
            java.lang.String r14 = "*"
            java.lang.String r15 = ""
            if (r12 != 0) goto L_0x00ef
            java.util.List r12 = r11.getIfDomain()
            java.util.Iterator r12 = r12.iterator()
        L_0x00c2:
            boolean r17 = r12.hasNext()
            if (r17 == 0) goto L_0x00ea
            java.lang.Object r17 = r12.next()
            r6 = r17
            java.lang.String r6 = (java.lang.String) r6
            boolean r17 = r6.startsWith(r14)
            if (r17 == 0) goto L_0x00e0
            java.lang.String r4 = r6.replace(r14, r15)
            boolean r4 = r7.endsWith(r4)
            if (r4 != 0) goto L_0x00e6
        L_0x00e0:
            boolean r4 = r6.equals(r7)
            if (r4 == 0) goto L_0x00e8
        L_0x00e6:
            r4 = 1
            goto L_0x00eb
        L_0x00e8:
            r4 = 0
            goto L_0x00c2
        L_0x00ea:
            r4 = 0
        L_0x00eb:
            if (r4 != 0) goto L_0x00ef
            r4 = 0
            return r4
        L_0x00ef:
            java.util.List r4 = r11.getUnlessDomain()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0125
            java.util.List r4 = r11.getUnlessDomain()
            java.util.Iterator r4 = r4.iterator()
        L_0x0101:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0125
            java.lang.Object r6 = r4.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r12 = r6.startsWith(r14)
            if (r12 == 0) goto L_0x011d
            java.lang.String r12 = r6.replace(r14, r15)
            boolean r12 = r7.endsWith(r12)
            if (r12 != 0) goto L_0x0123
        L_0x011d:
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0101
        L_0x0123:
            r2 = 0
            return r2
        L_0x0125:
            r4 = 1
            java.lang.String[] r6 = new java.lang.String[r4]
            java.util.List r4 = r11.getLoadType()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0146
            java.util.List r4 = r11.getIfTopUrl()
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0146
            java.util.List r4 = r11.getUnlessTopUrl()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0160
        L_0x0146:
            java.util.concurrent.CountDownLatch r4 = new java.util.concurrent.CountDownLatch
            r12 = 1
            r4.<init>(r12)
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r14 = r27.getWebViewLooper()
            r12.<init>(r14)
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler$1 r14 = new com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler$1
            r14.<init>(r6, r2, r4)
            r12.post(r14)
            r4.await()
        L_0x0160:
            r4 = 0
            r12 = r6[r4]
            if (r12 == 0) goto L_0x0212
            java.util.List r12 = r11.getLoadType()
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L_0x01b9
            java.net.URI r12 = new java.net.URI
            r14 = r6[r4]
            r12.<init>(r14)
            java.lang.String r4 = r12.getHost()
            int r14 = r12.getPort()
            java.lang.String r12 = r12.getScheme()
            r18 = r10
            java.util.List r10 = r11.getLoadType()
            java.lang.String r13 = "first-party"
            boolean r10 = r10.contains(r13)
            if (r10 == 0) goto L_0x01a3
            if (r4 == 0) goto L_0x01a3
            boolean r10 = r12.equals(r9)
            if (r10 == 0) goto L_0x01a1
            boolean r10 = r4.equals(r7)
            if (r10 == 0) goto L_0x01a1
            if (r14 != r8) goto L_0x01a1
            goto L_0x01a3
        L_0x01a1:
            r2 = 0
            goto L_0x01b8
        L_0x01a3:
            java.util.List r10 = r11.getLoadType()
            java.lang.String r12 = "third-party"
            boolean r10 = r10.contains(r12)
            if (r10 == 0) goto L_0x01bb
            if (r4 == 0) goto L_0x01bb
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x01bb
            goto L_0x01a1
        L_0x01b8:
            return r2
        L_0x01b9:
            r18 = r10
        L_0x01bb:
            java.util.List r4 = r11.getIfTopUrl()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x01e9
            java.util.List r4 = r11.getIfTopUrl()
            java.util.Iterator r4 = r4.iterator()
        L_0x01cd:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x01e4
            java.lang.Object r10 = r4.next()
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
            r13 = r6[r12]
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x01cd
            r4 = 1
            goto L_0x01e5
        L_0x01e4:
            r4 = 0
        L_0x01e5:
            if (r4 != 0) goto L_0x01e9
            r4 = 0
            return r4
        L_0x01e9:
            java.util.List r4 = r11.getUnlessTopUrl()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0214
            java.util.List r4 = r11.getUnlessTopUrl()
            java.util.Iterator r4 = r4.iterator()
        L_0x01fb:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0214
            java.lang.Object r10 = r4.next()
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r12 = r6[r11]
            boolean r10 = r12.startsWith(r10)
            if (r10 == 0) goto L_0x01fb
            r10 = 0
            return r10
        L_0x0212:
            r18 = r10
        L_0x0214:
            int[] r4 = com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.AnonymousClass3.$SwitchMap$com$pichillilorenzo$flutter_inappwebview_android$content_blocker$ContentBlockerActionType
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerActionType r6 = r0.getType()
            int r6 = r6.ordinal()
            r4 = r4[r6]
            r6 = 1
            if (r4 == r6) goto L_0x035a
            r6 = 2
            if (r4 == r6) goto L_0x0321
            r0 = 3
            if (r4 == r0) goto L_0x022e
        L_0x0229:
            r16 = r3
        L_0x022b:
            r3 = 0
            goto L_0x0366
        L_0x022e:
            java.lang.String r0 = "http"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0229
            r0 = -1
            if (r8 == r0) goto L_0x023d
            r0 = 80
            if (r8 != r0) goto L_0x0229
        L_0x023d:
            java.lang.String r0 = "http://"
            java.lang.String r4 = "https://"
            java.lang.String r0 = r5.replace(r0, r4)
            java.lang.String r4 = r28.getMethod()
            java.util.Map r6 = r28.getHeaders()
            java.net.HttpURLConnection r4 = com.pichillilorenzo.flutter_inappwebview_android.Util.makeHttpRequest(r0, r4, r6)
            if (r4 == 0) goto L_0x0229
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ Exception -> 0x030c }
            byte[] r0 = com.pichillilorenzo.flutter_inappwebview_android.Util.readAllBytes(r0)     // Catch:{ Exception -> 0x030c }
            if (r0 != 0) goto L_0x0262
            r4.disconnect()
            r2 = 0
            return r2
        L_0x0262:
            java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x030c }
            r6.<init>(r0)     // Catch:{ Exception -> 0x030c }
            java.lang.String r0 = r4.getContentEncoding()     // Catch:{ Exception -> 0x030c }
            java.lang.String r10 = r4.getContentType()     // Catch:{ Exception -> 0x030c }
            if (r10 != 0) goto L_0x0276
            java.lang.String r10 = "text/plain"
            r12 = r10
            r11 = 0
            goto L_0x029e
        L_0x0276:
            java.lang.String r11 = ";"
            java.lang.String[] r10 = r10.split(r11)     // Catch:{ Exception -> 0x030c }
            r11 = 0
            r12 = r10[r11]     // Catch:{ Exception -> 0x030c }
            java.lang.String r12 = r12.trim()     // Catch:{ Exception -> 0x030c }
            if (r0 != 0) goto L_0x029e
            int r0 = r10.length     // Catch:{ Exception -> 0x030c }
            r13 = 1
            if (r0 <= r13) goto L_0x029c
            r0 = r10[r13]     // Catch:{ Exception -> 0x030c }
            boolean r0 = r0.contains(r3)     // Catch:{ Exception -> 0x030c }
            if (r0 == 0) goto L_0x029c
            r0 = r10[r13]     // Catch:{ Exception -> 0x030c }
            java.lang.String r0 = r0.replace(r3, r15)     // Catch:{ Exception -> 0x030c }
            java.lang.String r0 = r0.trim()     // Catch:{ Exception -> 0x030c }
            goto L_0x029e
        L_0x029c:
            java.lang.String r0 = "utf-8"
        L_0x029e:
            java.lang.String r23 = r4.getResponseMessage()     // Catch:{ Exception -> 0x030c }
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x030c }
            r13 = 21
            if (r10 < r13) goto L_0x02fd
            if (r23 == 0) goto L_0x02fd
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x030c }
            r10.<init>()     // Catch:{ Exception -> 0x030c }
            java.util.Map r13 = r4.getHeaderFields()     // Catch:{ Exception -> 0x030c }
            java.util.Set r13 = r13.entrySet()     // Catch:{ Exception -> 0x030c }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Exception -> 0x030c }
        L_0x02bb:
            boolean r14 = r13.hasNext()     // Catch:{ Exception -> 0x030c }
            if (r14 == 0) goto L_0x02e4
            java.lang.Object r14 = r13.next()     // Catch:{ Exception -> 0x030c }
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14     // Catch:{ Exception -> 0x030c }
            java.lang.Object r16 = r14.getKey()     // Catch:{ Exception -> 0x030c }
            r11 = r16
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x030c }
            r16 = r3
            java.lang.String r3 = ","
            java.lang.Object r14 = r14.getValue()     // Catch:{ Exception -> 0x0308 }
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ Exception -> 0x0308 }
            java.lang.String r3 = android.text.TextUtils.join(r3, r14)     // Catch:{ Exception -> 0x0308 }
            r10.put(r11, r3)     // Catch:{ Exception -> 0x0308 }
            r3 = r16
            r11 = 0
            goto L_0x02bb
        L_0x02e4:
            r16 = r3
            android.webkit.WebResourceResponse r3 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x0308 }
            int r22 = r4.getResponseCode()     // Catch:{ Exception -> 0x0308 }
            r19 = r3
            r20 = r12
            r21 = r0
            r24 = r10
            r25 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0308 }
            r4.disconnect()
            return r3
        L_0x02fd:
            r16 = r3
            android.webkit.WebResourceResponse r3 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x0308 }
            r3.<init>(r12, r0, r6)     // Catch:{ Exception -> 0x0308 }
            r4.disconnect()
            return r3
        L_0x0308:
            r0 = move-exception
            goto L_0x030f
        L_0x030a:
            r0 = move-exception
            goto L_0x031d
        L_0x030c:
            r0 = move-exception
            r16 = r3
        L_0x030f:
            boolean r3 = r0 instanceof javax.net.ssl.SSLHandshakeException     // Catch:{ all -> 0x030a }
            if (r3 != 0) goto L_0x0318
            java.lang.String r3 = "ContentBlockerHandler"
            android.util.Log.e(r3, r15, r0)     // Catch:{ all -> 0x030a }
        L_0x0318:
            r4.disconnect()
            goto L_0x022b
        L_0x031d:
            r4.disconnect()
            throw r0
        L_0x0321:
            r16 = r3
            java.lang.String r0 = r0.getSelector()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "(function(d) {    function hide () {        if (d.body != null && !d.getElementById('flutter_inappwebview-css-display-none-style')) {            var c = d.createElement('style');            c.id = 'flutter_inappwebview-css-display-none-style';            c.innerHTML = '"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = " { display: none !important; }';            d.body.appendChild(c);        }       d.querySelectorAll('"
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = "').forEach(function (item, index) {            item.setAttribute('style', 'display: none !important;');        });    };    hide();    d.addEventListener('DOMContentLoaded', function(event) { hide(); }); })(document);"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r27.getWebViewLooper()
            r3.<init>(r4)
            com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler$2 r4 = new com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler$2
            r4.<init>(r2, r0)
            r10 = 800(0x320, double:3.953E-321)
            r3.postDelayed(r4, r10)
            goto L_0x022b
        L_0x035a:
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse
            r3 = 0
            r0.<init>(r15, r15, r3)
            return r0
        L_0x0361:
            r16 = r3
            r3 = r4
            r18 = r10
        L_0x0366:
            r4 = r3
            r3 = r16
            r10 = r18
            r6 = 0
            goto L_0x0062
        L_0x036e:
            r3 = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerHandler.checkUrl(com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView, com.pichillilorenzo.flutter_inappwebview_android.types.WebResourceRequestExt, com.pichillilorenzo.flutter_inappwebview_android.content_blocker.ContentBlockerTriggerResourceType):android.webkit.WebResourceResponse");
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromContentType(String str) {
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        if (str.equals("text/css")) {
            return ContentBlockerTriggerResourceType.STYLE_SHEET;
        }
        if (str.equals("image/svg+xml")) {
            return ContentBlockerTriggerResourceType.SVG_DOCUMENT;
        }
        if (str.startsWith("image/")) {
            return ContentBlockerTriggerResourceType.IMAGE;
        }
        if (str.startsWith("font/")) {
            return ContentBlockerTriggerResourceType.FONT;
        }
        if (str.startsWith("audio/") || str.startsWith("video/") || str.equals("application/ogg")) {
            return ContentBlockerTriggerResourceType.MEDIA;
        }
        if (str.endsWith("javascript")) {
            return ContentBlockerTriggerResourceType.SCRIPT;
        }
        if (str.startsWith("text/")) {
            return ContentBlockerTriggerResourceType.DOCUMENT;
        }
        return contentBlockerTriggerResourceType;
    }

    public ContentBlockerTriggerResourceType getResourceTypeFromUrl(WebResourceRequestExt webResourceRequestExt) {
        HttpURLConnection makeHttpRequest;
        ContentBlockerTriggerResourceType contentBlockerTriggerResourceType = ContentBlockerTriggerResourceType.RAW;
        String url = webResourceRequestExt.getUrl();
        if ((url.startsWith("http://") || url.startsWith("https://")) && (makeHttpRequest = Util.makeHttpRequest(url, "HEAD", webResourceRequestExt.getHeaders())) != null) {
            try {
                String contentType = makeHttpRequest.getContentType();
                if (contentType != null) {
                    contentBlockerTriggerResourceType = getResourceTypeFromContentType(contentType.split(";")[0].trim());
                }
            } catch (Exception e10) {
                Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
            } catch (Throwable th) {
                makeHttpRequest.disconnect();
                throw th;
            }
            makeHttpRequest.disconnect();
        }
        return contentBlockerTriggerResourceType;
    }

    public List<ContentBlocker> getRuleList() {
        return this.ruleList;
    }

    public void setRuleList(List<ContentBlocker> list) {
        this.ruleList = list;
    }

    public ContentBlockerHandler(List<ContentBlocker> list) {
        this.ruleList = list;
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt) throws URISyntaxException, InterruptedException, MalformedURLException {
        return checkUrl(inAppWebView, webResourceRequestExt, getResourceTypeFromUrl(webResourceRequestExt));
    }

    public WebResourceResponse checkUrl(InAppWebView inAppWebView, WebResourceRequestExt webResourceRequestExt, String str) throws URISyntaxException, InterruptedException, MalformedURLException {
        return checkUrl(inAppWebView, webResourceRequestExt, getResourceTypeFromContentType(str));
    }
}
