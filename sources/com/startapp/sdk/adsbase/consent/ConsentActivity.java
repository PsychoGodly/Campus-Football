package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.startapp.a0;
import com.startapp.i3;
import com.startapp.j3;
import com.startapp.j9;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.u1;
import java.net.URI;

/* compiled from: Sta */
public class ConsentActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public WebView f16983a;

    /* renamed from: b  reason: collision with root package name */
    public String f16984b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f16985c;

    public void onBackPressed() {
        WebView webView = this.f16983a;
        if (webView == null) {
            this.f16985c = true;
            super.onBackPressed();
            return;
        }
        String url = webView.getUrl();
        String str = this.f16984b;
        if (str != null && url != null && url.contains(str)) {
            this.f16983a.loadUrl("javascript:startappBackPressed();");
        } else if (this.f16983a.canGoBack()) {
            this.f16983a.goBack();
        } else {
            this.f16985c = true;
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        String dataString = getIntent().getDataString();
        if (!TextUtils.isEmpty(dataString)) {
            try {
                URI uri = new URI(dataString);
                this.f16984b = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), (String) null, (String) null).toString();
                WebView b10 = ComponentLocator.a((Context) this).x().b();
                this.f16983a = b10;
                b10.setWebViewClient(new a());
                this.f16983a.getSettings().setJavaScriptEnabled(true);
                this.f16983a.setHorizontalScrollBarEnabled(false);
                this.f16983a.setVerticalScrollBarEnabled(false);
                if (Build.VERSION.SDK_INT >= 15) {
                    this.f16983a.getSettings().setTextZoom(100);
                } else {
                    this.f16983a.getSettings().setTextSize(WebSettings.TextSize.NORMAL);
                }
                this.f16983a.loadUrl(dataString);
                this.f16983a.setBackgroundColor(0);
                a0.a(this.f16983a, (Paint) null);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams2.addRule(13);
                relativeLayout.addView(this.f16983a, layoutParams2);
            } catch (Throwable th) {
                i3.a(th);
            }
        }
        setContentView(relativeLayout, layoutParams);
    }

    public void onStop() {
        super.onStop();
        ConsentConfig o10 = MetaData.f17070k.o();
        if (!this.f16985c && o10 != null && o10.j() && j9.g(this) && j9.e((Context) this)) {
            i3 i3Var = new i3(j3.f15951d);
            i3Var.f15914d = "ConsentActivityHasBeenCovered";
            i3Var.a();
            finish();
            try {
                startActivity(getIntent());
            } catch (Throwable th) {
                i3.a(th);
            }
        }
        u1 g10 = ComponentLocator.a((Context) this).g();
        g10.f17358d = false;
        Intent intent = g10.f17357c;
        if (intent != null) {
            try {
                g10.f17355a.startActivity(intent);
            } catch (Throwable th2) {
                i3.a(th2);
            }
        }
    }

    /* compiled from: Sta */
    public class a extends WebViewClient {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0053 A[Catch:{ all -> 0x005c }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(android.net.Uri r12) {
            /*
                r11 = this;
                java.lang.String r0 = r12.getScheme()
                java.lang.String r1 = r12.getHost()
                com.startapp.sdk.adsbase.remoteconfig.MetaData r2 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f17070k
                com.startapp.sdk.adsbase.consent.ConsentConfig r2 = r2.o()
                r3 = 0
                if (r0 == 0) goto L_0x008c
                java.lang.String r4 = "startappad"
                boolean r0 = r0.equalsIgnoreCase(r4)
                if (r0 == 0) goto L_0x008c
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 != 0) goto L_0x008c
                if (r2 != 0) goto L_0x0022
                goto L_0x008c
            L_0x0022:
                java.lang.String r0 = "setconsent"
                boolean r0 = r1.equalsIgnoreCase(r0)
                r4 = 1
                if (r0 == 0) goto L_0x0079
                java.lang.String r0 = "status"
                java.lang.String r0 = r12.getQueryParameter(r0)
                java.lang.String r1 = "apc"
                java.lang.String r12 = r12.getQueryParameter(r1)
                r1 = 0
                boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ NumberFormatException -> 0x004c, all -> 0x0048 }
                if (r3 != 0) goto L_0x004c
                int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x004c, all -> 0x0048 }
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x004c, all -> 0x0048 }
                r6 = r0
                goto L_0x004d
            L_0x0048:
                r0 = move-exception
                com.startapp.i3.a((java.lang.Throwable) r0)
            L_0x004c:
                r6 = r1
            L_0x004d:
                boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x005c }
                if (r0 != 0) goto L_0x0060
                boolean r12 = java.lang.Boolean.parseBoolean(r12)     // Catch:{ all -> 0x005c }
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x005c }
                goto L_0x0060
            L_0x005c:
                r12 = move-exception
                com.startapp.i3.a((java.lang.Throwable) r12)
            L_0x0060:
                r8 = r1
                com.startapp.sdk.adsbase.consent.ConsentActivity r12 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                com.startapp.sdk.components.ComponentLocator r12 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r12)
                com.startapp.u1 r5 = r12.g()
                long r0 = r2.i()
                java.lang.Long r7 = java.lang.Long.valueOf(r0)
                r9 = 1
                r10 = 1
                r5.a(r6, r7, r8, r9, r10)
                return r4
            L_0x0079:
                java.lang.String r12 = "close"
                boolean r12 = r1.equalsIgnoreCase(r12)
                if (r12 == 0) goto L_0x008c
                com.startapp.sdk.adsbase.consent.ConsentActivity r12 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                boolean unused = r12.f16985c = r4
                com.startapp.sdk.adsbase.consent.ConsentActivity r12 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                r12.finish()
                return r4
            L_0x008c:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.consent.ConsentActivity.a.a(android.net.Uri):boolean");
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00d6  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0103  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0116  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x012d  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0144  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x0165  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x017d  */
        /* JADX WARNING: Removed duplicated region for block: B:67:0x0195  */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x01b2  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01c9  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onPageFinished(android.webkit.WebView r8, java.lang.String r9) {
            /*
                r7 = this;
                com.startapp.sdk.adsbase.consent.ConsentActivity r0 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                android.content.Intent r0 = r0.getIntent()
                android.os.Bundle r0 = r0.getExtras()
                if (r0 != 0) goto L_0x000d
                return
            L_0x000d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "javascript:var obj = {};"
                r1.<init>(r2)
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                java.lang.String r3 = "';"
                if (r2 != 0) goto L_0x0027
                java.lang.String r2 = "obj.template = '"
                r1.append(r2)
                r1.append(r9)
                r1.append(r3)
            L_0x0027:
                java.lang.String r9 = "allowCT"
                boolean r2 = r0.containsKey(r9)
                java.lang.String r4 = ";"
                if (r2 == 0) goto L_0x0040
                boolean r9 = r0.getBoolean(r9)
                java.lang.String r2 = "obj.allowCT = "
                r1.append(r2)
                r1.append(r9)
                r1.append(r4)
            L_0x0040:
                com.startapp.sdk.adsbase.consent.ConsentActivity r9 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                java.util.Map<android.app.Activity, java.lang.Integer> r2 = com.startapp.j9.f15982a
                android.content.pm.PackageManager r2 = r9.getPackageManager()     // Catch:{ all -> 0x007e }
                if (r2 != 0) goto L_0x004b
                goto L_0x0082
            L_0x004b:
                java.lang.String r5 = r9.getPackageName()     // Catch:{ all -> 0x007e }
                r6 = 128(0x80, float:1.794E-43)
                android.content.pm.ApplicationInfo r5 = r2.getApplicationInfo(r5, r6)     // Catch:{ all -> 0x007e }
                android.graphics.drawable.Drawable r2 = r5.loadIcon(r2)     // Catch:{ all -> 0x007e }
                if (r2 != 0) goto L_0x005c
                goto L_0x0082
            L_0x005c:
                android.content.res.Resources r9 = r9.getResources()     // Catch:{ all -> 0x007e }
                android.util.DisplayMetrics r9 = r9.getDisplayMetrics()     // Catch:{ all -> 0x007e }
                float r9 = r9.density     // Catch:{ all -> 0x007e }
                r5 = 1111490560(0x42400000, float:48.0)
                float r5 = r5 * r9
                int r5 = (int) r5
                android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x0072 }
                java.lang.String r9 = com.startapp.j9.a((android.graphics.drawable.Drawable) r2, (int) r5, (int) r5, (android.graphics.Bitmap.Config) r6)     // Catch:{ OutOfMemoryError -> 0x0072 }
                goto L_0x0083
            L_0x0072:
                r5 = 1103101952(0x41c00000, float:24.0)
                float r9 = r9 * r5
                int r9 = (int) r9
                android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ OutOfMemoryError -> 0x0082 }
                java.lang.String r9 = com.startapp.j9.a((android.graphics.drawable.Drawable) r2, (int) r9, (int) r9, (android.graphics.Bitmap.Config) r5)     // Catch:{ OutOfMemoryError -> 0x0082 }
                goto L_0x0083
            L_0x007e:
                r9 = move-exception
                com.startapp.i3.a((java.lang.Throwable) r9)
            L_0x0082:
                r9 = 0
            L_0x0083:
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 != 0) goto L_0x0094
                java.lang.String r2 = "obj.imageBase64 = '"
                r1.append(r2)
                r1.append(r9)
                r1.append(r3)
            L_0x0094:
                java.lang.String r9 = "dParam"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x00b1
                java.lang.String r9 = r0.getString(r9)
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 != 0) goto L_0x00b1
                java.lang.String r2 = "obj.dParam = '"
                r1.append(r2)
                r1.append(r9)
                r1.append(r3)
            L_0x00b1:
                java.lang.String r9 = "clickUrl"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x00ce
                java.lang.String r9 = r0.getString(r9)
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 != 0) goto L_0x00ce
                java.lang.String r2 = "obj.clickUrl = '"
                r1.append(r2)
                r1.append(r9)
                r1.append(r3)
            L_0x00ce:
                java.lang.String r9 = "impressionUrl"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x00eb
                java.lang.String r9 = r0.getString(r9)
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 != 0) goto L_0x00eb
                java.lang.String r2 = "obj.impressionUrl = '"
                r1.append(r2)
                r1.append(r9)
                r1.append(r3)
            L_0x00eb:
                com.startapp.sdk.adsbase.consent.ConsentActivity r9 = com.startapp.sdk.adsbase.consent.ConsentActivity.this
                com.startapp.sdk.components.ComponentLocator r9 = com.startapp.sdk.components.ComponentLocator.a((android.content.Context) r9)
                com.startapp.y4 r9 = r9.p()
                java.lang.Object r9 = r9.b()
                com.startapp.x4 r9 = (com.startapp.x4) r9
                java.lang.String r9 = r9.f17533c
                boolean r2 = android.text.TextUtils.isEmpty(r9)
                if (r2 != 0) goto L_0x010e
                java.lang.String r2 = "obj.locales = '"
                r1.append(r2)
                r1.append(r9)
                r1.append(r3)
            L_0x010e:
                java.lang.String r9 = "timestamp"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x0125
                long r5 = r0.getLong(r9)
                java.lang.String r9 = "obj.timeStamp = "
                r1.append(r9)
                r1.append(r5)
                r1.append(r4)
            L_0x0125:
                java.lang.String r9 = "templateName"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x013c
                int r9 = r0.getInt(r9)
                java.lang.String r2 = "obj.templateName = "
                r1.append(r2)
                r1.append(r9)
                r1.append(r4)
            L_0x013c:
                java.lang.String r9 = "templateId"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x0153
                int r9 = r0.getInt(r9)
                java.lang.String r2 = "obj.templateId = "
                r1.append(r2)
                r1.append(r9)
                r1.append(r4)
            L_0x0153:
                java.lang.String r9 = "obj.os = 'android';"
                r1.append(r9)
                java.lang.String r9 = "obj.consentTypeInfo = {};"
                r1.append(r9)
                java.lang.String r9 = "impression"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x0175
                int r9 = r0.getInt(r9)
                long r5 = (long) r9
                java.lang.String r9 = "obj.consentTypeInfo.impression = "
                r1.append(r9)
                r1.append(r5)
                r1.append(r4)
            L_0x0175:
                java.lang.String r9 = "trueClick"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x018d
                int r9 = r0.getInt(r9)
                long r5 = (long) r9
                java.lang.String r9 = "obj.consentTypeInfo.trueClick = "
                r1.append(r9)
                r1.append(r5)
                r1.append(r4)
            L_0x018d:
                java.lang.String r9 = "falseClick"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x01a5
                int r9 = r0.getInt(r9)
                long r5 = (long) r9
                java.lang.String r9 = "obj.consentTypeInfo.falseClick = "
                r1.append(r9)
                r1.append(r5)
                r1.append(r4)
            L_0x01a5:
                java.lang.String r9 = "obj.infoForExternalLinks = {};"
                r1.append(r9)
                java.lang.String r9 = "advertisingId"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x01c1
                java.lang.String r9 = r0.getString(r9)
                java.lang.String r2 = "obj.infoForExternalLinks.advertisingId = '"
                r1.append(r2)
                r1.append(r9)
                r1.append(r3)
            L_0x01c1:
                java.lang.String r9 = "consentType"
                boolean r2 = r0.containsKey(r9)
                if (r2 == 0) goto L_0x01d8
                int r9 = r0.getInt(r9)
                java.lang.String r0 = "obj.infoForExternalLinks.consentType = "
                r1.append(r0)
                r1.append(r9)
                r1.append(r4)
            L_0x01d8:
                java.lang.String r9 = "startappInit(obj);"
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r8.loadUrl(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.consent.ConsentActivity.a.onPageFinished(android.webkit.WebView, java.lang.String):void");
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return a(webResourceRequest.getUrl());
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return a(Uri.parse(str));
        }
    }
}
