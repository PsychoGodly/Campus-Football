package com.pichillilorenzo.flutter_inappwebview_android.webview;

import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobController;
import com.pichillilorenzo.flutter_inappwebview_android.print_job.PrintJobSettings;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    /* access modifiers changed from: private */
    public InAppWebView inAppWebView;

    public JavaScriptBridgeInterface(InAppWebView inAppWebView2) {
        this.inAppWebView = inAppWebView2;
    }

    @JavascriptInterface
    public void _callHandler(final String str, final String str2, final String str3) {
        if (this.inAppWebView != null) {
            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() {
                public void run() {
                    if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                        if (str.equals("onPrintRequest") && Build.VERSION.SDK_INT >= 21) {
                            PrintJobSettings printJobSettings = new PrintJobSettings();
                            printJobSettings.handledByClient = Boolean.TRUE;
                            final String printCurrentPage = JavaScriptBridgeInterface.this.inAppWebView.printCurrentPage(printJobSettings);
                            if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                                JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onPrintRequest(JavaScriptBridgeInterface.this.inAppWebView.getUrl(), printCurrentPage, new WebViewChannelDelegate.PrintRequestCallback() {
                                    public void error(String str, String str2, Object obj) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str);
                                        sb2.append(", ");
                                        if (str2 == null) {
                                            str2 = MaxReward.DEFAULT_LABEL;
                                        }
                                        sb2.append(str2);
                                        Log.e(JavaScriptBridgeInterface.LOG_TAG, sb2.toString());
                                        defaultBehaviour((Boolean) null);
                                    }

                                    public void defaultBehaviour(Boolean bool) {
                                        PrintJobController printJobController;
                                        if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.plugin != null && JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager != null && (printJobController = JavaScriptBridgeInterface.this.inAppWebView.plugin.printJobManager.jobs.get(printCurrentPage)) != null) {
                                            printJobController.disposeNoCancel();
                                        }
                                    }

                                    public boolean nonNullSuccess(Boolean bool) {
                                        return !bool.booleanValue();
                                    }
                                });
                            }
                        } else if (str.equals("callAsyncJavaScript")) {
                            try {
                                JSONObject jSONObject = new JSONArray(str3).getJSONObject(0);
                                String string = jSONObject.getString("resultUuid");
                                ValueCallback valueCallback = JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.get(string);
                                if (valueCallback != null) {
                                    valueCallback.onReceiveValue(jSONObject.toString());
                                    JavaScriptBridgeInterface.this.inAppWebView.callAsyncJavaScriptCallbacks.remove(string);
                                }
                            } catch (JSONException e10) {
                                Log.e(JavaScriptBridgeInterface.LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
                            }
                        } else if (str.equals("evaluateJavaScriptWithContentWorld")) {
                            try {
                                JSONObject jSONObject2 = new JSONArray(str3).getJSONObject(0);
                                String string2 = jSONObject2.getString("resultUuid");
                                ValueCallback valueCallback2 = JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.get(string2);
                                if (valueCallback2 != null) {
                                    valueCallback2.onReceiveValue(jSONObject2.has("value") ? jSONObject2.get("value").toString() : "null");
                                    JavaScriptBridgeInterface.this.inAppWebView.evaluateJavaScriptContentWorldCallbacks.remove(string2);
                                }
                            } catch (JSONException e11) {
                                Log.e(JavaScriptBridgeInterface.LOG_TAG, MaxReward.DEFAULT_LABEL, e11);
                            }
                        } else if (JavaScriptBridgeInterface.this.inAppWebView.channelDelegate != null) {
                            JavaScriptBridgeInterface.this.inAppWebView.channelDelegate.onCallJsHandler(str, str3, new WebViewChannelDelegate.CallJsHandlerCallback() {
                                public void defaultBehaviour(Object obj) {
                                    if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                                        String str = "if (window.flutter_inappwebview[" + str2 + "] != null) { window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "].resolve(" + obj + "); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "]; }";
                                        if (Build.VERSION.SDK_INT >= 19) {
                                            JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(str, (ValueCallback) null);
                                            return;
                                        }
                                        JavaScriptBridgeInterface.this.inAppWebView.loadUrl("javascript:" + str);
                                    }
                                }

                                public void error(String str, String str2, Object obj) {
                                    String str3;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(str);
                                    if (str2 != null) {
                                        str3 = ", " + str2;
                                    } else {
                                        str3 = MaxReward.DEFAULT_LABEL;
                                    }
                                    sb2.append(str3);
                                    String sb3 = sb2.toString();
                                    Log.e(JavaScriptBridgeInterface.LOG_TAG, sb3);
                                    if (JavaScriptBridgeInterface.this.inAppWebView != null) {
                                        String str4 = "if (window.flutter_inappwebview[" + str2 + "] != null) { window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "].reject(new Error(" + JSONObject.quote(sb3) + ")); delete window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "[" + str2 + "]; }";
                                        if (Build.VERSION.SDK_INT >= 19) {
                                            JavaScriptBridgeInterface.this.inAppWebView.evaluateJavascript(str4, (ValueCallback) null);
                                            return;
                                        }
                                        JavaScriptBridgeInterface.this.inAppWebView.loadUrl("javascript:" + str4);
                                    }
                                }
                            });
                        }
                    }
                }
            });
        }
    }

    @JavascriptInterface
    public void _hideContextMenu() {
        if (this.inAppWebView != null) {
            new Handler(this.inAppWebView.getWebViewLooper()).post(new Runnable() {
                public void run() {
                    if (JavaScriptBridgeInterface.this.inAppWebView != null && JavaScriptBridgeInterface.this.inAppWebView.floatingContextMenu != null) {
                        JavaScriptBridgeInterface.this.inAppWebView.hideContextMenu();
                    }
                }
            });
        }
    }

    public void dispose() {
        this.inAppWebView = null;
    }
}
