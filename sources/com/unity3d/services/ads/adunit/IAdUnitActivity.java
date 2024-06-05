package com.unity3d.services.ads.adunit;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.Map;

public interface IAdUnitActivity {
    void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    void finish();

    Activity getActivity();

    Context getContext();

    Intent getIntent();

    AdUnitRelativeLayout getLayout();

    int getRequestedOrientation();

    Map<String, Integer> getViewFrame(String str);

    String[] getViews();

    Window getWindow();

    boolean isFinishing();

    void requestPermissions(String[] strArr, int i10);

    boolean setKeepScreenOn(boolean z10);

    void setKeyEventList(ArrayList<Integer> arrayList);

    void setLayoutInDisplayCutoutMode(int i10);

    void setOrientation(int i10);

    void setRequestedOrientation(int i10);

    boolean setSystemUiVisibility(int i10);

    void setViewFrame(String str, int i10, int i11, int i12, int i13);

    void setViews(String[] strArr);
}
