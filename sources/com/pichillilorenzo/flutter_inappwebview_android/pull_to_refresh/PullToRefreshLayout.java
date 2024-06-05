package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import androidx.swiperefreshlayout.widget.c;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import lc.k;

public class PullToRefreshLayout extends c implements Disposable {
    static final String LOG_TAG = "PullToRefreshLayout";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_";
    public PullToRefreshChannelDelegate channelDelegate;
    public PullToRefreshSettings settings = new PullToRefreshSettings();

    public PullToRefreshLayout(Context context, InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Object obj, PullToRefreshSettings pullToRefreshSettings) {
        super(context);
        this.settings = pullToRefreshSettings;
        lc.c cVar = inAppWebViewFlutterPlugin.messenger;
        this.channelDelegate = new PullToRefreshChannelDelegate(this, new k(cVar, METHOD_CHANNEL_NAME_PREFIX + obj));
    }

    public void dispose() {
        PullToRefreshChannelDelegate pullToRefreshChannelDelegate = this.channelDelegate;
        if (pullToRefreshChannelDelegate != null) {
            pullToRefreshChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        removeAllViews();
    }

    public void prepare() {
        setEnabled(this.settings.enabled.booleanValue());
        setOnChildScrollUpCallback(new c.i() {
            public boolean canChildScrollUp(c cVar, View view) {
                if (!(view instanceof InAppWebView)) {
                    return true;
                }
                InAppWebView inAppWebView = (InAppWebView) view;
                if (inAppWebView.canScrollVertically() && inAppWebView.getScrollY() > 0) {
                    return true;
                }
                if (inAppWebView.canScrollVertically() || inAppWebView.getScrollY() != 0) {
                    return false;
                }
                return true;
            }
        });
        setOnRefreshListener(new c.j() {
            public void onRefresh() {
                PullToRefreshChannelDelegate pullToRefreshChannelDelegate = PullToRefreshLayout.this.channelDelegate;
                if (pullToRefreshChannelDelegate == null) {
                    this.setRefreshing(false);
                } else {
                    pullToRefreshChannelDelegate.onRefresh();
                }
            }
        });
        String str = this.settings.color;
        if (str != null) {
            setColorSchemeColors(Color.parseColor(str));
        }
        String str2 = this.settings.backgroundColor;
        if (str2 != null) {
            setProgressBackgroundColorSchemeColor(Color.parseColor(str2));
        }
        Integer num = this.settings.distanceToTriggerSync;
        if (num != null) {
            setDistanceToTriggerSync(num.intValue());
        }
        Integer num2 = this.settings.slingshotDistance;
        if (num2 != null) {
            setSlingshotDistance(num2.intValue());
        }
        Integer num3 = this.settings.size;
        if (num3 != null) {
            setSize(num3.intValue());
        }
    }

    public PullToRefreshLayout(Context context) {
        super(context);
    }

    public PullToRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
