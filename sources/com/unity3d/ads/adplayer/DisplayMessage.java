package com.unity3d.ads.adplayer;

import android.webkit.WebView;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: DisplayMessage.kt */
public abstract class DisplayMessage {
    private final String opportunityId;

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayError extends DisplayMessage {
        private final String reason;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DisplayError(String str, String str2) {
            super(str, (h) null);
            m.e(str, "opportunityId");
            m.e(str2, "reason");
            this.reason = str2;
        }

        public final String getReason() {
            return this.reason;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayFinishRequest extends DisplayMessage {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DisplayFinishRequest(String str) {
            super(str, (h) null);
            m.e(str, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class DisplayReady extends DisplayMessage {
        private final Map<String, Object> showOptions;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DisplayReady(String str, Map<String, ? extends Object> map) {
            super(str, (h) null);
            m.e(str, "opportunityId");
            this.showOptions = map;
        }

        public final Map<String, Object> getShowOptions() {
            return this.showOptions;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DisplayReady(String str, Map map, int i10, h hVar) {
            this(str, (i10 & 2) != 0 ? null : map);
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class FocusChanged extends DisplayMessage {
        private final boolean isFocused;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public FocusChanged(String str, boolean z10) {
            super(str, (h) null);
            m.e(str, "opportunityId");
            this.isFocused = z10;
        }

        public final boolean isFocused() {
            return this.isFocused;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class VisibilityChanged extends DisplayMessage {
        private final boolean isVisible;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public VisibilityChanged(String str, boolean z10) {
            super(str, (h) null);
            m.e(str, "opportunityId");
            this.isVisible = z10;
        }

        public final boolean isVisible() {
            return this.isVisible;
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class WebViewInstanceRequest extends DisplayMessage {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WebViewInstanceRequest(String str) {
            super(str, (h) null);
            m.e(str, "opportunityId");
        }
    }

    /* compiled from: DisplayMessage.kt */
    public static final class WebViewInstanceResponse extends DisplayMessage {
        private final WebView webView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public WebViewInstanceResponse(String str, WebView webView2) {
            super(str, (h) null);
            m.e(str, "opportunityId");
            m.e(webView2, "webView");
            this.webView = webView2;
        }

        public final WebView getWebView() {
            return this.webView;
        }
    }

    private DisplayMessage(String str) {
        this.opportunityId = str;
    }

    public /* synthetic */ DisplayMessage(String str, h hVar) {
        this(str);
    }

    public final String getOpportunityId() {
        return this.opportunityId;
    }
}
