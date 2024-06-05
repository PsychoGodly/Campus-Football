package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.bridge.SharedInstances;

public class AdUnitTransparentActivity extends AdUnitActivity {
    /* access modifiers changed from: protected */
    public AdUnitActivityController createController() {
        return new AdUnitTransparentActivityController(this, SharedInstances.INSTANCE.getWebViewEventSender(), new AdUnitViewHandlerFactory());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewUtilities.setBackground(this._controller._layout, new ColorDrawable(0));
    }
}
