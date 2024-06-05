package com.pichillilorenzo.flutter_inappwebview_android.headless_in_app_webview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.Size2D;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.FlutterWebView;
import java.util.Map;
import lc.c;
import lc.k;

public class HeadlessInAppWebView implements Disposable {
    protected static final String LOG_TAG = "HeadlessInAppWebView";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_headless_inappwebview_";
    public HeadlessWebViewChannelDelegate channelDelegate;
    public FlutterWebView flutterWebView;

    /* renamed from: id  reason: collision with root package name */
    public final String f28491id;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, FlutterWebView flutterWebView2) {
        this.f28491id = str;
        this.plugin = inAppWebViewFlutterPlugin;
        this.flutterWebView = flutterWebView2;
        c cVar = inAppWebViewFlutterPlugin.messenger;
        this.channelDelegate = new HeadlessWebViewChannelDelegate(this, new k(cVar, METHOD_CHANNEL_NAME_PREFIX + str));
    }

    public void dispose() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView2;
        HeadlessWebViewChannelDelegate headlessWebViewChannelDelegate = this.channelDelegate;
        if (headlessWebViewChannelDelegate != null) {
            headlessWebViewChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            HeadlessInAppWebViewManager headlessInAppWebViewManager = inAppWebViewFlutterPlugin.headlessInAppWebViewManager;
            if (headlessInAppWebViewManager != null && headlessInAppWebViewManager.webViews.containsKey(this.f28491id)) {
                headlessInAppWebViewManager.webViews.put(this.f28491id, (Object) null);
            }
            Activity activity = this.plugin.activity;
            if (!(activity == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null || (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) == null || (flutterWebView2 = this.flutterWebView) == null || flutterWebView2.getView() == null)) {
                viewGroup2.removeView(this.flutterWebView.getView());
            }
        }
        FlutterWebView flutterWebView3 = this.flutterWebView;
        if (flutterWebView3 != null) {
            flutterWebView3.dispose();
        }
        this.flutterWebView = null;
        this.plugin = null;
    }

    public FlutterWebView disposeAndGetFlutterWebView() {
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null) {
            View view = flutterWebView2.getView();
            if (view != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                view.setVisibility(0);
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
            }
            this.flutterWebView = null;
            dispose();
        }
        return flutterWebView2;
    }

    public Size2D getSize() {
        View view;
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 == null || flutterWebView2.webView == null || (view = flutterWebView2.getView()) == null) {
            return null;
        }
        float pixelDensity = Util.getPixelDensity(view.getContext());
        Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        double width = fullscreenSize.getWidth();
        int i10 = layoutParams.width;
        double d10 = width == ((double) i10) ? (double) i10 : (double) (((float) i10) / pixelDensity);
        double height = fullscreenSize.getHeight();
        int i11 = layoutParams.height;
        return new Size2D(d10, height == ((double) i11) ? (double) i11 : (double) (((float) i11) / pixelDensity));
    }

    public void onWebViewCreated() {
        HeadlessWebViewChannelDelegate headlessWebViewChannelDelegate = this.channelDelegate;
        if (headlessWebViewChannelDelegate != null) {
            headlessWebViewChannelDelegate.onWebViewCreated();
        }
    }

    public void prepare(Map<String, Object> map) {
        Activity activity;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView2;
        View view;
        View view2;
        FlutterWebView flutterWebView3 = this.flutterWebView;
        if (!(flutterWebView3 == null || (view2 = flutterWebView3.getView()) == null)) {
            Size2D fromMap = Size2D.fromMap((Map) map.get("initialSize"));
            if (fromMap == null) {
                fromMap = new Size2D(-1.0d, -1.0d);
            }
            setSize(fromMap);
            view2.setVisibility(4);
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && (activity = inAppWebViewFlutterPlugin.activity) != null && (viewGroup = (ViewGroup) activity.findViewById(16908290)) != null && (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) != null && (flutterWebView2 = this.flutterWebView) != null && (view = flutterWebView2.getView()) != null) {
            viewGroup2.addView(view, 0);
        }
    }

    public void setSize(Size2D size2D) {
        View view;
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null && flutterWebView2.webView != null && (view = flutterWebView2.getView()) != null) {
            float pixelDensity = Util.getPixelDensity(view.getContext());
            Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
            view.setLayoutParams(new FrameLayout.LayoutParams((int) (size2D.getWidth() == -1.0d ? fullscreenSize.getWidth() : size2D.getWidth() * ((double) pixelDensity)), (int) (size2D.getWidth() == -1.0d ? fullscreenSize.getHeight() : ((double) pixelDensity) * size2D.getHeight())));
        }
    }
}
