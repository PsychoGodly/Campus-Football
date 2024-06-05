package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;

public interface IAdUnitViewHandler {
    boolean create(IAdUnitActivity iAdUnitActivity);

    boolean destroy();

    View getView();

    void onCreate(IAdUnitActivity iAdUnitActivity, Bundle bundle);

    void onDestroy(IAdUnitActivity iAdUnitActivity);

    void onPause(IAdUnitActivity iAdUnitActivity);

    void onResume(IAdUnitActivity iAdUnitActivity);

    void onStart(IAdUnitActivity iAdUnitActivity);

    void onStop(IAdUnitActivity iAdUnitActivity);
}
