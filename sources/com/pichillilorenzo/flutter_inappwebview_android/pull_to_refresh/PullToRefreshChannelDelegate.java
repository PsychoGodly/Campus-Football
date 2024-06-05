package com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh;

import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import java.util.HashMap;
import lc.k;

public class PullToRefreshChannelDelegate extends ChannelDelegateImpl {
    private PullToRefreshLayout pullToRefreshView;

    public PullToRefreshChannelDelegate(PullToRefreshLayout pullToRefreshLayout, k kVar) {
        super(kVar);
        this.pullToRefreshView = pullToRefreshLayout;
    }

    public void dispose() {
        super.dispose();
        this.pullToRefreshView = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(lc.j r6, lc.k.d r7) {
        /*
            r5 = this;
            java.lang.String r0 = r6.f36116a
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            r3 = 1
            r4 = 0
            switch(r1) {
                case -1790841290: goto L_0x0079;
                case 154556713: goto L_0x006e;
                case 1235582893: goto L_0x0063;
                case 1364071551: goto L_0x0058;
                case 1389555745: goto L_0x004d;
                case 1743806995: goto L_0x0042;
                case 1807783361: goto L_0x0037;
                case 1849446385: goto L_0x002c;
                case 1984958339: goto L_0x001f;
                case 2105594551: goto L_0x0012;
                default: goto L_0x000f;
            }
        L_0x000f:
            r0 = -1
            goto L_0x0083
        L_0x0012:
            java.lang.String r1 = "isEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001b
            goto L_0x000f
        L_0x001b:
            r0 = 9
            goto L_0x0083
        L_0x001f:
            java.lang.String r1 = "setSize"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x000f
        L_0x0028:
            r0 = 8
            goto L_0x0083
        L_0x002c:
            java.lang.String r1 = "isRefreshing"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0035
            goto L_0x000f
        L_0x0035:
            r0 = 7
            goto L_0x0083
        L_0x0037:
            java.lang.String r1 = "setDistanceToTriggerSync"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0040
            goto L_0x000f
        L_0x0040:
            r0 = 6
            goto L_0x0083
        L_0x0042:
            java.lang.String r1 = "setBackgroundColor"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x004b
            goto L_0x000f
        L_0x004b:
            r0 = 5
            goto L_0x0083
        L_0x004d:
            java.lang.String r1 = "setColor"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0056
            goto L_0x000f
        L_0x0056:
            r0 = 4
            goto L_0x0083
        L_0x0058:
            java.lang.String r1 = "setEnabled"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0061
            goto L_0x000f
        L_0x0061:
            r0 = 3
            goto L_0x0083
        L_0x0063:
            java.lang.String r1 = "getDefaultSlingshotDistance"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x006c
            goto L_0x000f
        L_0x006c:
            r0 = 2
            goto L_0x0083
        L_0x006e:
            java.lang.String r1 = "setRefreshing"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0077
            goto L_0x000f
        L_0x0077:
            r0 = 1
            goto L_0x0083
        L_0x0079:
            java.lang.String r1 = "setSlingshotDistance"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0082
            goto L_0x000f
        L_0x0082:
            r0 = 0
        L_0x0083:
            java.lang.String r1 = "color"
            switch(r0) {
                case 0: goto L_0x0194;
                case 1: goto L_0x0173;
                case 2: goto L_0x016b;
                case 3: goto L_0x0146;
                case 4: goto L_0x0121;
                case 5: goto L_0x0100;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00c8;
                case 8: goto L_0x00a5;
                case 9: goto L_0x008d;
                default: goto L_0x0088;
            }
        L_0x0088:
            r7.notImplemented()
            goto L_0x01b4
        L_0x008d:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r6 = r5.pullToRefreshView
            if (r6 == 0) goto L_0x009e
            boolean r6 = r6.isEnabled()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r7.success(r6)
            goto L_0x01b4
        L_0x009e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
            goto L_0x01b4
        L_0x00a5:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = "size"
            java.lang.Object r6 = r6.a(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            int r6 = r6.intValue()
            r0.setSize(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.success(r6)
            goto L_0x01b4
        L_0x00c1:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
            goto L_0x01b4
        L_0x00c8:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r6 = r5.pullToRefreshView
            if (r6 == 0) goto L_0x00d3
            boolean r6 = r6.isRefreshing()
            if (r6 == 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            r3 = 0
        L_0x00d4:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            r7.success(r6)
            goto L_0x01b4
        L_0x00dd:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = "distanceToTriggerSync"
            java.lang.Object r6 = r6.a(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            int r6 = r6.intValue()
            r0.setDistanceToTriggerSync(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.success(r6)
            goto L_0x01b4
        L_0x00f9:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
            goto L_0x01b4
        L_0x0100:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            if (r0 == 0) goto L_0x011a
            java.lang.Object r6 = r6.a(r1)
            java.lang.String r6 = (java.lang.String) r6
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setProgressBackgroundColorSchemeColor(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.success(r6)
            goto L_0x01b4
        L_0x011a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
            goto L_0x01b4
        L_0x0121:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            if (r0 == 0) goto L_0x013f
            java.lang.Object r6 = r6.a(r1)
            java.lang.String r6 = (java.lang.String) r6
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            int[] r1 = new int[r3]
            int r6 = android.graphics.Color.parseColor(r6)
            r1[r4] = r6
            r0.setColorSchemeColors(r1)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.success(r6)
            goto L_0x01b4
        L_0x013f:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
            goto L_0x01b4
        L_0x0146:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            if (r0 == 0) goto L_0x0165
            java.lang.String r0 = "enabled"
            java.lang.Object r6 = r6.a(r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings r1 = r0.settings
            r1.enabled = r6
            boolean r6 = r6.booleanValue()
            r0.setEnabled(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.success(r6)
            goto L_0x01b4
        L_0x0165:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
            goto L_0x01b4
        L_0x016b:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r7.success(r6)
            goto L_0x01b4
        L_0x0173:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            if (r0 == 0) goto L_0x018e
            java.lang.String r0 = "refreshing"
            java.lang.Object r6 = r6.a(r0)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            boolean r6 = r6.booleanValue()
            r0.setRefreshing(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.success(r6)
            goto L_0x01b4
        L_0x018e:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
            goto L_0x01b4
        L_0x0194:
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            if (r0 == 0) goto L_0x01af
            java.lang.String r0 = "slingshotDistance"
            java.lang.Object r6 = r6.a(r0)
            java.lang.Integer r6 = (java.lang.Integer) r6
            com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout r0 = r5.pullToRefreshView
            int r6 = r6.intValue()
            r0.setSlingshotDistance(r6)
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r7.success(r6)
            goto L_0x01b4
        L_0x01af:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r7.success(r6)
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshChannelDelegate.onMethodCall(lc.j, lc.k$d):void");
    }

    public void onRefresh() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onRefresh", new HashMap());
        }
    }
}
