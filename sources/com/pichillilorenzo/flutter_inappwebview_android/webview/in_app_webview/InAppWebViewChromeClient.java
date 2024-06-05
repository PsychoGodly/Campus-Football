package com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.MimeTypeMap;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import androidx.core.content.a;
import androidx.core.content.b;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFileProvider;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener;
import com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.types.CreateWindowAction;
import com.pichillilorenzo.flutter_inappwebview_android.types.GeolocationPermissionShowPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsAlertResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsBeforeUnloadResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsConfirmResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.JsPromptResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.PermissionResponse;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.core.device.MimeTypes;
import ec.c;
import h.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.m;
import lc.o;

public class InAppWebViewChromeClient extends WebChromeClient implements m, ActivityResultListener {
    protected static final FrameLayout.LayoutParams FULLSCREEN_LAYOUT_PARAMS = new FrameLayout.LayoutParams(-1, -1, 17);
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY = 1798;
    protected static final int FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT = 7942;
    protected static final String LOG_TAG = "IABWebChromeClient";
    private static final int PICKER = 1;
    private static final int PICKER_LEGACY = 3;
    final String DEFAULT_MIME_TYPES = "*/*";
    final Map<DialogInterface, JsResult> dialogs = new HashMap();
    private ValueCallback<Uri[]> filePathCallback;
    private ValueCallback<Uri> filePathCallbackLegacy;
    private Uri imageOutputFileUri;
    private InAppBrowserDelegate inAppBrowserDelegate;
    public InAppWebView inAppWebView;
    private View mCustomView;
    private WebChromeClient.CustomViewCallback mCustomViewCallback;
    private int mOriginalOrientation;
    private int mOriginalSystemUiVisibility;
    public InAppWebViewFlutterPlugin plugin;
    private Uri videoOutputFileUri;

    public InAppWebViewChromeClient(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, InAppWebView inAppWebView2, InAppBrowserDelegate inAppBrowserDelegate2) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.inAppWebView = inAppWebView2;
        this.inAppBrowserDelegate = inAppBrowserDelegate2;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.getActivityResultListeners().add(this);
        }
        o oVar = inAppWebViewFlutterPlugin.registrar;
        if (oVar != null) {
            oVar.b(this);
            return;
        }
        c cVar = inAppWebViewFlutterPlugin.activityPluginBinding;
        if (cVar != null) {
            cVar.b(this);
        }
    }

    private Boolean acceptsAny(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return Boolean.TRUE;
        }
        for (String equals : strArr) {
            if (equals.equals("*/*")) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private Boolean acceptsImages(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", MaxReward.DEFAULT_LABEL));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains("image"));
    }

    private Boolean acceptsVideo(String str) {
        if (str.matches("\\.\\w+")) {
            str = getMimeTypeFromExtension(str.replace(".", MaxReward.DEFAULT_LABEL));
        }
        return Boolean.valueOf(str.isEmpty() || str.toLowerCase().contains(MimeTypes.BASE_TYPE_VIDEO));
    }

    private Boolean arrayContainsString(String[] strArr, String str) {
        for (String str2 : strArr) {
            if (str2 != null && str2.contains(str)) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private String[] getAcceptedMimeType(String[] strArr) {
        if (isArrayEmpty(strArr).booleanValue()) {
            return new String[]{"*/*"};
        }
        String[] strArr2 = new String[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (str.matches("\\.\\w+")) {
                strArr2[i10] = getMimeTypeFromExtension(str.replace(".", MaxReward.DEFAULT_LABEL));
            } else {
                strArr2[i10] = str;
            }
        }
        return strArr2;
    }

    private Activity getActivity() {
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            return inAppBrowserDelegate2.getActivity();
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            return inAppWebViewFlutterPlugin.activity;
        }
        return null;
    }

    private File getCapturedFile(String str) throws IOException {
        String str2;
        String str3;
        boolean equals = str.equals("android.media.action.IMAGE_CAPTURE");
        String str4 = MaxReward.DEFAULT_LABEL;
        if (equals) {
            str4 = Environment.DIRECTORY_PICTURES;
            str2 = "image";
            str3 = ".jpg";
        } else if (str.equals("android.media.action.VIDEO_CAPTURE")) {
            str4 = Environment.DIRECTORY_MOVIES;
            str2 = MimeTypes.BASE_TYPE_VIDEO;
            str3 = ".mp4";
        } else {
            str2 = str4;
            str3 = str2;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return new File(Environment.getExternalStoragePublicDirectory(str4), String.format("%s-%d%s", new Object[]{str2, Long.valueOf(System.currentTimeMillis()), str3}));
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return File.createTempFile(str2, str3, activity.getApplicationContext().getExternalFilesDir((String) null));
    }

    private Uri getCapturedMediaFile() {
        Uri uri = this.imageOutputFileUri;
        if (uri != null && isFileNotEmpty(uri)) {
            return this.imageOutputFileUri;
        }
        Uri uri2 = this.videoOutputFileUri;
        if (uri2 == null || !isFileNotEmpty(uri2)) {
            return null;
        }
        return this.videoOutputFileUri;
    }

    private Intent getFileChooserIntent(String str) {
        String str2 = str.isEmpty() ? "*/*" : str;
        if (str.matches("\\.\\w+")) {
            str2 = getMimeTypeFromExtension(str.replace(".", MaxReward.DEFAULT_LABEL));
        }
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(str2);
        return intent;
    }

    private String getMimeTypeFromExtension(String str) {
        if (str != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        }
        return null;
    }

    private Uri getOutputUri(String str) {
        File file;
        try {
            file = getCapturedFile(str);
        } catch (IOException e10) {
            Log.e(LOG_TAG, "Error occurred while creating the File", e10);
            file = null;
        }
        if (file == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return Uri.fromFile(file);
        }
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        try {
            return b.getUriForFile(activity.getApplicationContext(), activity.getApplicationContext().getPackageName() + "." + InAppWebViewFileProvider.fileProviderAuthorityExtension, file);
        } catch (Exception e11) {
            Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e11);
            return null;
        }
    }

    private Intent getPhotoIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.IMAGE_CAPTURE");
        this.imageOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Uri[] getSelectedFiles(Intent intent, int i10) {
        if (intent == null || intent.getData() == null) {
            if (intent == null || intent.getClipData() == null) {
                Uri capturedMediaFile = getCapturedMediaFile();
                if (capturedMediaFile == null) {
                    return null;
                }
                return new Uri[]{capturedMediaFile};
            }
            int itemCount = intent.getClipData().getItemCount();
            Uri[] uriArr = new Uri[itemCount];
            for (int i11 = 0; i11 < itemCount; i11++) {
                uriArr[i11] = intent.getClipData().getItemAt(i11).getUri();
            }
            return uriArr;
        } else if (i10 != -1 || Build.VERSION.SDK_INT < 21) {
            return null;
        } else {
            return WebChromeClient.FileChooserParams.parseResult(i10, intent);
        }
    }

    private Intent getVideoIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        Uri outputUri = getOutputUri("android.media.action.VIDEO_CAPTURE");
        this.videoOutputFileUri = outputUri;
        intent.putExtra("output", outputUri);
        return intent;
    }

    private Boolean isArrayEmpty(String[] strArr) {
        boolean z10 = false;
        if (strArr.length == 0 || (strArr.length == 1 && strArr[0].length() == 0)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    private boolean isFileNotEmpty(Uri uri) {
        Activity activity = getActivity();
        if (activity == null) {
            return false;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = activity.getContentResolver().openAssetFileDescriptor(uri, AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            long length = openAssetFileDescriptor.getLength();
            openAssetFileDescriptor.close();
            if (length > 0) {
                return true;
            }
            return false;
        } catch (IOException unused) {
            return false;
        }
    }

    public void createAlertDialog(String str, final JsResult jsResult, String str2, String str3) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        AnonymousClass2 r62 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            c.a aVar = new c.a(activity, i.f18301c);
            aVar.f(str);
            if (str3 == null || str3.isEmpty()) {
                aVar.k(17039370, r62);
            } else {
                aVar.l(str3, r62);
            }
            aVar.i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            androidx.appcompat.app.c a10 = aVar.a();
            this.dialogs.put(a10, jsResult);
            a10.show();
        }
    }

    public void createBeforeUnloadDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        AnonymousClass13 r72 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        AnonymousClass14 r02 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            c.a aVar = new c.a(activity, i.f18301c);
            aVar.f(str);
            if (str3 == null || str3.isEmpty()) {
                aVar.k(17039370, r72);
            } else {
                aVar.l(str3, r72);
            }
            if (str4 == null || str4.isEmpty()) {
                aVar.g(17039360, r02);
            } else {
                aVar.h(str4, r02);
            }
            aVar.i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            androidx.appcompat.app.c a10 = aVar.a();
            this.dialogs.put(a10, jsResult);
            a10.show();
        }
    }

    public void createConfirmDialog(String str, final JsResult jsResult, String str2, String str3, String str4) {
        if (str2 != null && !str2.isEmpty()) {
            str = str2;
        }
        AnonymousClass5 r72 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                jsResult.confirm();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        AnonymousClass6 r02 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                jsResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            c.a aVar = new c.a(activity, i.f18301c);
            aVar.f(str);
            if (str3 == null || str3.isEmpty()) {
                aVar.k(17039370, r72);
            } else {
                aVar.l(str3, r72);
            }
            if (str4 == null || str4.isEmpty()) {
                aVar.g(17039360, r02);
            } else {
                aVar.h(str4, r02);
            }
            aVar.i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            androidx.appcompat.app.c a10 = aVar.a();
            this.dialogs.put(a10, jsResult);
            a10.show();
        }
    }

    public void createPromptDialog(WebView webView, String str, String str2, final JsPromptResult jsPromptResult, String str3, String str4, final String str5, String str6, String str7) {
        FrameLayout frameLayout = new FrameLayout(webView.getContext());
        final EditText editText = new EditText(webView.getContext());
        editText.setMaxLines(1);
        if (str4 != null && !str4.isEmpty()) {
            str2 = str4;
        }
        editText.setText(str2);
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        frameLayout.setPaddingRelative(45, 15, 45, 0);
        frameLayout.addView(editText);
        if (str3 != null && !str3.isEmpty()) {
            str = str3;
        }
        AnonymousClass9 r32 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                String obj = editText.getText().toString();
                JsPromptResult jsPromptResult = jsPromptResult;
                String str = str5;
                if (str != null) {
                    obj = str;
                }
                jsPromptResult.confirm(obj);
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        AnonymousClass10 r52 = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i10) {
                jsPromptResult.cancel();
                dialogInterface.dismiss();
                InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
            }
        };
        Activity activity = getActivity();
        if (activity != null) {
            c.a aVar = new c.a(activity, i.f18301c);
            aVar.f(str);
            if (str7 == null || str7.isEmpty()) {
                aVar.k(17039370, r32);
            } else {
                aVar.l(str7, r32);
            }
            if (str6 == null || str6.isEmpty()) {
                aVar.g(17039360, r52);
            } else {
                aVar.h(str6, r52);
            }
            aVar.i(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    jsPromptResult.cancel();
                    dialogInterface.dismiss();
                    InAppWebViewChromeClient.this.dialogs.remove(dialogInterface);
                }
            });
            androidx.appcompat.app.c a10 = aVar.a();
            a10.j(frameLayout);
            this.dialogs.put(a10, jsPromptResult);
            a10.show();
        }
    }

    public void dispose() {
        ec.c cVar;
        for (Map.Entry next : this.dialogs.entrySet()) {
            ((JsResult) next.getValue()).cancel();
            ((DialogInterface) next.getKey()).dismiss();
        }
        this.dialogs.clear();
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (!(inAppWebViewFlutterPlugin == null || (cVar = inAppWebViewFlutterPlugin.activityPluginBinding) == null)) {
            cVar.e(this);
        }
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.getActivityResultListeners().clear();
            this.inAppBrowserDelegate = null;
        }
        this.filePathCallbackLegacy = null;
        this.filePathCallback = null;
        this.videoOutputFileUri = null;
        this.imageOutputFileUri = null;
        this.inAppWebView = null;
        this.plugin = null;
    }

    public Bitmap getDefaultVideoPoster() {
        byte[] bArr;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (bArr = inAppWebView2.customSettings.defaultVideoPoster) == null) {
            return Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
    }

    /* access modifiers changed from: protected */
    public ViewGroup getRootView() {
        Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        return (ViewGroup) activity.findViewById(16908290);
    }

    /* access modifiers changed from: protected */
    public boolean needsCameraPermission() {
        Activity activity = getActivity();
        if (activity == null) {
            return true;
        }
        try {
            if (!Arrays.asList(activity.getPackageManager().getPackageInfo(activity.getApplicationContext().getPackageName(), 4096).requestedPermissions).contains("android.permission.CAMERA") || a.checkSelfPermission(activity, "android.permission.CAMERA") == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (this.filePathCallback == null && this.filePathCallbackLegacy == null) {
            return true;
        }
        if (i10 == 1) {
            Uri[] selectedFiles = i11 == -1 ? getSelectedFiles(intent, i11) : null;
            ValueCallback<Uri[]> valueCallback = this.filePathCallback;
            if (valueCallback != null) {
                valueCallback.onReceiveValue(selectedFiles);
            }
        } else if (i10 == 3) {
            Uri data = i11 == -1 ? intent != null ? intent.getData() : getCapturedMediaFile() : null;
            ValueCallback<Uri> valueCallback2 = this.filePathCallbackLegacy;
            if (valueCallback2 != null) {
                valueCallback2.onReceiveValue(data);
            }
        }
        this.filePathCallback = null;
        this.filePathCallbackLegacy = null;
        this.imageOutputFileUri = null;
        this.videoOutputFileUri = null;
        return true;
    }

    public void onCloseWindow(WebView webView) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (!(inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null)) {
            webViewChannelDelegate.onCloseWindow();
        }
        super.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
            return true;
        }
        webViewChannelDelegate.onConsoleMessage(consoleMessage.message(), consoleMessage.messageLevel().ordinal());
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        final int i10;
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebViewManager inAppWebViewManager;
        String string;
        InAppWebViewManager inAppWebViewManager2;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin == null || (inAppWebViewManager2 = inAppWebViewFlutterPlugin.inAppWebViewManager) == null) {
            i10 = 0;
        } else {
            i10 = inAppWebViewManager2.windowAutoincrementId + 1;
            inAppWebViewManager2.windowAutoincrementId = i10;
        }
        WebView.HitTestResult hitTestResult = webView.getHitTestResult();
        String extra = hitTestResult.getExtra();
        if (hitTestResult.getType() == 8) {
            Message obtainMessage = webView.getHandler().obtainMessage();
            webView.requestFocusNodeHref(obtainMessage);
            Bundle data = obtainMessage.getData();
            if (!(data == null || (string = data.getString("url")) == null || string.isEmpty())) {
                extra = string;
            }
        }
        CreateWindowAction createWindowAction = new CreateWindowAction(new URLRequest(extra, "GET", (byte[]) null, (Map<String, String>) null), true, z11, false, i10, z10);
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
        if (!(inAppWebViewFlutterPlugin2 == null || (inAppWebViewManager = inAppWebViewFlutterPlugin2.inAppWebViewManager) == null)) {
            inAppWebViewManager.windowWebViewMessages.put(Integer.valueOf(i10), message);
        }
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onCreateWindow(createWindowAction, new WebViewChannelDelegate.CreateWindowCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                defaultBehaviour((Boolean) null);
            }

            public void defaultBehaviour(Boolean bool) {
                InAppWebViewManager inAppWebViewManager;
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = InAppWebViewChromeClient.this.plugin;
                if (inAppWebViewFlutterPlugin != null && (inAppWebViewManager = inAppWebViewFlutterPlugin.inAppWebViewManager) != null) {
                    inAppWebViewManager.windowWebViewMessages.remove(Integer.valueOf(i10));
                }
            }

            public boolean nonNullSuccess(Boolean bool) {
                return !bool.booleanValue();
            }
        });
        return true;
    }

    public void onGeolocationPermissionsHidePrompt() {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 != null && (webViewChannelDelegate = inAppWebView2.channelDelegate) != null) {
            webViewChannelDelegate.onGeolocationPermissionsHidePrompt();
        }
    }

    public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
        WebViewChannelDelegate webViewChannelDelegate;
        AnonymousClass17 r02 = new WebViewChannelDelegate.GeolocationPermissionsShowPromptCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                defaultBehaviour((GeolocationPermissionShowPromptResponse) null);
            }

            public void defaultBehaviour(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                callback.invoke(str, false, false);
            }

            public boolean nonNullSuccess(GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse) {
                callback.invoke(geolocationPermissionShowPromptResponse.getOrigin(), geolocationPermissionShowPromptResponse.isAllow(), geolocationPermissionShowPromptResponse.isRetain());
                return false;
            }
        };
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
            r02.defaultBehaviour(null);
        } else {
            webViewChannelDelegate.onGeolocationPermissionsShowPrompt(str, r02);
        }
    }

    public void onHideCustomView() {
        ViewGroup rootView;
        Activity activity = getActivity();
        if (activity != null && (rootView = getRootView()) != null) {
            View view = this.mCustomView;
            if (view != null) {
                ((FrameLayout) rootView).removeView(view);
            }
            this.mCustomView = null;
            rootView.setSystemUiVisibility(this.mOriginalSystemUiVisibility);
            activity.setRequestedOrientation(this.mOriginalOrientation);
            WebChromeClient.CustomViewCallback customViewCallback = this.mCustomViewCallback;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
            this.mCustomViewCallback = null;
            activity.getWindow().clearFlags(512);
            InAppWebView inAppWebView2 = this.inAppWebView;
            if (inAppWebView2 != null) {
                WebViewChannelDelegate webViewChannelDelegate = inAppWebView2.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onExitFullscreen();
                }
                this.inAppWebView.setInFullscreen(false);
            }
        }
    }

    public boolean onJsAlert(WebView webView, String str, final String str2, final JsResult jsResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onJsAlert(str, str2, (Boolean) null, new WebViewChannelDelegate.JsAlertCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                jsResult.cancel();
            }

            public void defaultBehaviour(JsAlertResponse jsAlertResponse) {
                String str;
                String str2 = null;
                if (jsAlertResponse != null) {
                    str2 = jsAlertResponse.getMessage();
                    str = jsAlertResponse.getConfirmButtonTitle();
                } else {
                    str = null;
                }
                InAppWebViewChromeClient.this.createAlertDialog(str2, jsResult, str2, str);
            }

            public boolean nonNullSuccess(JsAlertResponse jsAlertResponse) {
                int i10 = 1;
                if (!jsAlertResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsAlertResponse.getAction();
                if (action != null) {
                    i10 = action.intValue();
                }
                if (Integer.valueOf(i10).intValue() != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }
        });
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, final String str2, final JsResult jsResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onJsBeforeUnload(str, str2, new WebViewChannelDelegate.JsBeforeUnloadCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                jsResult.cancel();
            }

            public void defaultBehaviour(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                String str;
                String str2;
                String str3;
                if (jsBeforeUnloadResponse != null) {
                    String message = jsBeforeUnloadResponse.getMessage();
                    String confirmButtonTitle = jsBeforeUnloadResponse.getConfirmButtonTitle();
                    str = jsBeforeUnloadResponse.getCancelButtonTitle();
                    str3 = message;
                    str2 = confirmButtonTitle;
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createBeforeUnloadDialog(str2, jsResult, str3, str2, str);
            }

            public boolean nonNullSuccess(JsBeforeUnloadResponse jsBeforeUnloadResponse) {
                int i10 = 1;
                if (!jsBeforeUnloadResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsBeforeUnloadResponse.getAction();
                if (action != null) {
                    i10 = action.intValue();
                }
                if (Integer.valueOf(i10).intValue() != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }
        });
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, final String str2, final JsResult jsResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
            return false;
        }
        webViewChannelDelegate.onJsConfirm(str, str2, (Boolean) null, new WebViewChannelDelegate.JsConfirmCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                jsResult.cancel();
            }

            public void defaultBehaviour(JsConfirmResponse jsConfirmResponse) {
                String str;
                String str2;
                String str3;
                if (jsConfirmResponse != null) {
                    String message = jsConfirmResponse.getMessage();
                    String confirmButtonTitle = jsConfirmResponse.getConfirmButtonTitle();
                    str = jsConfirmResponse.getCancelButtonTitle();
                    str3 = message;
                    str2 = confirmButtonTitle;
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createConfirmDialog(str2, jsResult, str3, str2, str);
            }

            public boolean nonNullSuccess(JsConfirmResponse jsConfirmResponse) {
                int i10 = 1;
                if (!jsConfirmResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsConfirmResponse.getAction();
                if (action != null) {
                    i10 = action.intValue();
                }
                if (Integer.valueOf(i10).intValue() != 0) {
                    jsResult.cancel();
                    return false;
                }
                jsResult.confirm();
                return false;
            }
        });
        return true;
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
            return false;
        }
        final JsPromptResult jsPromptResult2 = jsPromptResult;
        final WebView webView2 = webView;
        final String str4 = str2;
        final String str5 = str3;
        webViewChannelDelegate.onJsPrompt(str, str2, str3, (Boolean) null, new WebViewChannelDelegate.JsPromptCallback() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(", ");
                if (str2 == null) {
                    str2 = MaxReward.DEFAULT_LABEL;
                }
                sb2.append(str2);
                Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                jsPromptResult2.cancel();
            }

            public void defaultBehaviour(JsPromptResponse jsPromptResponse) {
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                if (jsPromptResponse != null) {
                    String message = jsPromptResponse.getMessage();
                    String defaultValue = jsPromptResponse.getDefaultValue();
                    String value = jsPromptResponse.getValue();
                    String confirmButtonTitle = jsPromptResponse.getConfirmButtonTitle();
                    str2 = jsPromptResponse.getCancelButtonTitle();
                    str5 = message;
                    str4 = defaultValue;
                    str3 = value;
                    str = confirmButtonTitle;
                } else {
                    str5 = null;
                    str4 = null;
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                InAppWebViewChromeClient.this.createPromptDialog(webView2, str4, str5, jsPromptResult2, str5, str4, str3, str2, str);
            }

            public boolean nonNullSuccess(JsPromptResponse jsPromptResponse) {
                int i10 = 1;
                if (!jsPromptResponse.isHandledByClient()) {
                    return true;
                }
                Integer action = jsPromptResponse.getAction();
                if (action != null) {
                    i10 = action.intValue();
                }
                if (Integer.valueOf(i10).intValue() != 0) {
                    jsPromptResult2.cancel();
                    return false;
                }
                jsPromptResult2.confirm(jsPromptResponse.getValue());
                return false;
            }
        });
        return true;
    }

    public void onPermissionRequest(final PermissionRequest permissionRequest) {
        WebViewChannelDelegate webViewChannelDelegate;
        if (Build.VERSION.SDK_INT >= 21) {
            AnonymousClass18 r02 = new WebViewChannelDelegate.PermissionRequestCallback() {
                public void error(String str, String str2, Object obj) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(", ");
                    if (str2 == null) {
                        str2 = MaxReward.DEFAULT_LABEL;
                    }
                    sb2.append(str2);
                    Log.e(InAppWebViewChromeClient.LOG_TAG, sb2.toString());
                    defaultBehaviour((PermissionResponse) null);
                }

                public void defaultBehaviour(PermissionResponse permissionResponse) {
                    permissionRequest.deny();
                }

                public boolean nonNullSuccess(PermissionResponse permissionResponse) {
                    Integer action = permissionResponse.getAction();
                    if (action == null) {
                        return true;
                    }
                    if (action.intValue() != 1) {
                        permissionRequest.deny();
                        return false;
                    }
                    List<String> resources = permissionResponse.getResources();
                    permissionRequest.grant((String[]) resources.toArray(new String[permissionResponse.getResources().size()]));
                    return false;
                }
            };
            InAppWebView inAppWebView2 = this.inAppWebView;
            if (inAppWebView2 == null || (webViewChannelDelegate = inAppWebView2.channelDelegate) == null) {
                r02.defaultBehaviour(null);
            } else {
                webViewChannelDelegate.onPermissionRequest(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()), (Object) null, r02);
            }
        }
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        InAppWebView inAppWebView2;
        WebViewChannelDelegate webViewChannelDelegate;
        if (Build.VERSION.SDK_INT >= 21 && (inAppWebView2 = this.inAppWebView) != null && (webViewChannelDelegate = inAppWebView2.channelDelegate) != null) {
            webViewChannelDelegate.onPermissionRequestCanceled(permissionRequest.getOrigin().toString(), Arrays.asList(permissionRequest.getResources()));
        }
    }

    public void onProgressChanged(WebView webView, int i10) {
        super.onProgressChanged(webView, i10);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didChangeProgress(i10);
        }
        InAppWebView inAppWebView2 = (InAppWebView) webView;
        InAppWebViewClientCompat inAppWebViewClientCompat = inAppWebView2.inAppWebViewClientCompat;
        if (inAppWebViewClientCompat != null) {
            inAppWebViewClientCompat.loadCustomJavaScriptOnPageStarted(webView);
        } else {
            InAppWebViewClient inAppWebViewClient = inAppWebView2.inAppWebViewClient;
            if (inAppWebViewClient != null) {
                inAppWebViewClient.loadCustomJavaScriptOnPageStarted(webView);
            }
        }
        WebViewChannelDelegate webViewChannelDelegate = inAppWebView2.channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onProgressChanged(i10);
        }
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        super.onReceivedIcon(webView, bitmap);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e10) {
            Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
        }
        bitmap.recycle();
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedIcon(byteArrayOutputStream.toByteArray());
        }
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InAppBrowserDelegate inAppBrowserDelegate2 = this.inAppBrowserDelegate;
        if (inAppBrowserDelegate2 != null) {
            inAppBrowserDelegate2.didChangeTitle(str);
        }
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onTitleChanged(str);
        }
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        super.onReceivedTouchIconUrl(webView, str, z10);
        WebViewChannelDelegate webViewChannelDelegate = ((InAppWebView) webView).channelDelegate;
        if (webViewChannelDelegate != null) {
            webViewChannelDelegate.onReceivedTouchIconUrl(str, z10);
        }
    }

    public void onRequestFocus(WebView webView) {
        WebViewChannelDelegate webViewChannelDelegate;
        InAppWebView inAppWebView2 = this.inAppWebView;
        if (inAppWebView2 != null && (webViewChannelDelegate = inAppWebView2.channelDelegate) != null) {
            webViewChannelDelegate.onRequestFocus();
        }
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        ViewGroup rootView;
        if (this.mCustomView != null) {
            onHideCustomView();
            return;
        }
        Activity activity = getActivity();
        if (activity != null && (rootView = getRootView()) != null) {
            this.mCustomView = view;
            this.mOriginalSystemUiVisibility = rootView.getSystemUiVisibility();
            this.mOriginalOrientation = activity.getRequestedOrientation();
            this.mCustomViewCallback = customViewCallback;
            View view2 = this.mCustomView;
            if (view2 != null) {
                view2.setBackgroundColor(-16777216);
            }
            if (Build.VERSION.SDK_INT >= 19) {
                rootView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY_KITKAT);
            } else {
                rootView.setSystemUiVisibility(FULLSCREEN_SYSTEM_UI_VISIBILITY);
            }
            activity.getWindow().setFlags(512, 512);
            ((FrameLayout) rootView).addView(this.mCustomView, FULLSCREEN_LAYOUT_PARAMS);
            InAppWebView inAppWebView2 = this.inAppWebView;
            if (inAppWebView2 != null) {
                WebViewChannelDelegate webViewChannelDelegate = inAppWebView2.channelDelegate;
                if (webViewChannelDelegate != null) {
                    webViewChannelDelegate.onEnterFullscreen();
                }
                this.inAppWebView.setInFullscreen(true);
            }
        }
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        boolean z10 = true;
        if (fileChooserParams.getMode() != 1) {
            z10 = false;
        }
        return startPickerIntent(valueCallback, acceptTypes, z10, fileChooserParams.isCaptureEnabled());
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
        startPickerIntent(valueCallback, str, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startPickerIntent(android.webkit.ValueCallback<android.net.Uri> r3, java.lang.String r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.filePathCallbackLegacy = r3
            java.lang.Boolean r3 = r2.acceptsImages((java.lang.String) r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo((java.lang.String) r4)
            boolean r0 = r0.booleanValue()
            if (r5 == 0) goto L_0x0028
            boolean r5 = r2.needsCameraPermission()
            if (r5 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x0021
            android.content.Intent r5 = r2.getPhotoIntent()
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            android.content.Intent r5 = r2.getVideoIntent()
            goto L_0x0029
        L_0x0028:
            r5 = 0
        L_0x0029:
            if (r5 != 0) goto L_0x0060
            android.content.Intent r4 = r2.getFileChooserIntent(r4)
            java.lang.String r5 = ""
            android.content.Intent r5 = android.content.Intent.createChooser(r4, r5)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L_0x0052
            if (r3 == 0) goto L_0x0049
            android.content.Intent r3 = r2.getPhotoIntent()
            r4.add(r3)
        L_0x0049:
            if (r0 == 0) goto L_0x0052
            android.content.Intent r3 = r2.getVideoIntent()
            r4.add(r3)
        L_0x0052:
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r4.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r4 = "android.intent.extra.INITIAL_INTENTS"
            r5.putExtra(r4, r3)
        L_0x0060:
            android.app.Activity r3 = r2.getActivity()
            if (r3 == 0) goto L_0x0075
            android.content.pm.PackageManager r4 = r3.getPackageManager()
            android.content.ComponentName r4 = r5.resolveActivity(r4)
            if (r4 == 0) goto L_0x0075
            r4 = 3
            r3.startActivityForResult(r5, r4)
            goto L_0x007c
        L_0x0075:
            java.lang.String r3 = "IABWebChromeClient"
            java.lang.String r4 = "there is no Activity to handle this Intent"
            android.util.Log.d(r3, r4)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String, java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback) {
        startPickerIntent(valueCallback, MaxReward.DEFAULT_LABEL, (String) null);
    }

    /* access modifiers changed from: protected */
    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        startPickerIntent(valueCallback, str, str2);
    }

    private Boolean acceptsImages(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), "image").booleanValue());
    }

    private Boolean acceptsVideo(String[] strArr) {
        return Boolean.valueOf(acceptsAny(strArr).booleanValue() || arrayContainsString(getAcceptedMimeType(strArr), MimeTypes.BASE_TYPE_VIDEO).booleanValue());
    }

    private Intent getFileChooserIntent(String[] strArr, boolean z10) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", getAcceptedMimeType(strArr));
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z10);
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean startPickerIntent(android.webkit.ValueCallback<android.net.Uri[]> r3, java.lang.String[] r4, boolean r5, boolean r6) {
        /*
            r2 = this;
            r2.filePathCallback = r3
            java.lang.Boolean r3 = r2.acceptsImages((java.lang.String[]) r4)
            boolean r3 = r3.booleanValue()
            java.lang.Boolean r0 = r2.acceptsVideo((java.lang.String[]) r4)
            boolean r0 = r0.booleanValue()
            if (r6 == 0) goto L_0x0028
            boolean r6 = r2.needsCameraPermission()
            if (r6 != 0) goto L_0x0028
            if (r3 == 0) goto L_0x0021
            android.content.Intent r6 = r2.getPhotoIntent()
            goto L_0x0029
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            android.content.Intent r6 = r2.getVideoIntent()
            goto L_0x0029
        L_0x0028:
            r6 = 0
        L_0x0029:
            if (r6 != 0) goto L_0x0067
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r1 = r2.needsCameraPermission()
            if (r1 != 0) goto L_0x0048
            if (r3 == 0) goto L_0x003f
            android.content.Intent r3 = r2.getPhotoIntent()
            r6.add(r3)
        L_0x003f:
            if (r0 == 0) goto L_0x0048
            android.content.Intent r3 = r2.getVideoIntent()
            r6.add(r3)
        L_0x0048:
            android.content.Intent r3 = r2.getFileChooserIntent(r4, r5)
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.CHOOSER"
            r4.<init>(r5)
            java.lang.String r5 = "android.intent.extra.INTENT"
            r4.putExtra(r5, r3)
            r3 = 0
            android.os.Parcelable[] r3 = new android.os.Parcelable[r3]
            java.lang.Object[] r3 = r6.toArray(r3)
            android.os.Parcelable[] r3 = (android.os.Parcelable[]) r3
            java.lang.String r5 = "android.intent.extra.INITIAL_INTENTS"
            r4.putExtra(r5, r3)
            r6 = r4
        L_0x0067:
            android.app.Activity r3 = r2.getActivity()
            r4 = 1
            if (r3 == 0) goto L_0x007c
            android.content.pm.PackageManager r5 = r3.getPackageManager()
            android.content.ComponentName r5 = r6.resolveActivity(r5)
            if (r5 == 0) goto L_0x007c
            r3.startActivityForResult(r6, r4)
            goto L_0x0083
        L_0x007c:
            java.lang.String r3 = "IABWebChromeClient"
            java.lang.String r5 = "there is no Activity to handle this Intent"
            android.util.Log.d(r3, r5)
        L_0x0083:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient.startPickerIntent(android.webkit.ValueCallback, java.lang.String[], boolean, boolean):boolean");
    }
}
