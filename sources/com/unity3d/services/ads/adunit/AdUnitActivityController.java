package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.api.Intent;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

public class AdUnitActivityController {
    private int _activityId;
    private final IAdUnitActivity _adUnitActivity;
    private final IAdUnitViewHandlerFactory _adUnitViewHandlerFactory;
    private int _displayCutoutMode;
    private final IEventSender _eventSender;
    boolean _keepScreenOn;
    private ArrayList<Integer> _keyEventList;
    protected AdUnitRelativeLayout _layout;
    private int _orientation = -1;
    private int _systemUiVisibility;
    private Map<String, IAdUnitViewHandler> _viewHandlers;
    private String[] _views;

    public AdUnitActivityController(IAdUnitActivity iAdUnitActivity, IEventSender iEventSender, IAdUnitViewHandlerFactory iAdUnitViewHandlerFactory) {
        this._adUnitActivity = iAdUnitActivity;
        this._eventSender = iEventSender;
        this._adUnitViewHandlerFactory = iAdUnitViewHandlerFactory;
    }

    private IAdUnitViewHandler createViewHandler(String str) {
        return this._adUnitViewHandlerFactory.createViewHandler(str);
    }

    private boolean handleViewPlacement(View view) {
        if (view == null) {
            this._adUnitActivity.finish();
            DeviceLog.error("Could not place view because it is null, finishing activity");
            return false;
        } else if (view.getParent() == null || !view.getParent().equals(this._layout)) {
            ViewUtilities.removeViewFromParent(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            layoutParams.setMargins(0, 0, 0, 0);
            view.setPadding(0, 0, 0, 0);
            this._layout.addView(view, layoutParams);
            return true;
        } else {
            this._layout.bringChildToFront(view);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void createLayout() {
        if (this._layout == null) {
            AdUnitRelativeLayout adUnitRelativeLayout = new AdUnitRelativeLayout(this._adUnitActivity.getContext());
            this._layout = adUnitRelativeLayout;
            adUnitRelativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ViewUtilities.setBackground(this._layout, new ColorDrawable(-16777216));
        }
    }

    public AdUnitRelativeLayout getLayout() {
        return this._layout;
    }

    public Map<String, Integer> getViewFrame(String str) {
        IAdUnitViewHandler viewHandler = getViewHandler(str);
        if (str.equals("adunit")) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this._layout.getLayoutParams();
            HashMap hashMap = new HashMap();
            hashMap.put("x", Integer.valueOf(layoutParams.leftMargin));
            hashMap.put("y", Integer.valueOf(layoutParams.topMargin));
            hashMap.put("width", Integer.valueOf(this._layout.getWidth()));
            hashMap.put("height", Integer.valueOf(this._layout.getHeight()));
            return hashMap;
        }
        View view = viewHandler != null ? viewHandler.getView() : null;
        if (view == null) {
            return null;
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("x", Integer.valueOf(layoutParams2.leftMargin));
        hashMap2.put("y", Integer.valueOf(layoutParams2.topMargin));
        hashMap2.put("width", Integer.valueOf(view.getWidth()));
        hashMap2.put("height", Integer.valueOf(view.getHeight()));
        return hashMap2;
    }

    public IAdUnitViewHandler getViewHandler(String str) {
        Map<String, IAdUnitViewHandler> map = this._viewHandlers;
        if (map != null && map.containsKey(str)) {
            return this._viewHandlers.get(str);
        }
        IAdUnitViewHandler createViewHandler = createViewHandler(str);
        if (createViewHandler != null) {
            if (this._viewHandlers == null) {
                this._viewHandlers = new HashMap();
            }
            this._viewHandlers.put(str, createViewHandler);
        }
        return createViewHandler;
    }

    public String[] getViews() {
        return this._views;
    }

    public void onCreate(Bundle bundle) {
        AdUnitEvent adUnitEvent;
        if (!this._eventSender.canSend()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onCreate");
            this._adUnitActivity.finish();
            return;
        }
        AdUnit.setAdUnitActivity(this._adUnitActivity);
        Intent.setActiveActivity(this._adUnitActivity.getActivity());
        createLayout();
        ViewUtilities.removeViewFromParent(this._layout);
        IAdUnitActivity iAdUnitActivity = this._adUnitActivity;
        AdUnitRelativeLayout adUnitRelativeLayout = this._layout;
        iAdUnitActivity.addContentView(adUnitRelativeLayout, adUnitRelativeLayout.getLayoutParams());
        if (bundle == null) {
            this._views = this._adUnitActivity.getIntent().getStringArrayExtra(AdUnitActivity.EXTRA_VIEWS);
            this._keyEventList = this._adUnitActivity.getIntent().getIntegerArrayListExtra(AdUnitActivity.EXTRA_KEY_EVENT_LIST);
            if (this._adUnitActivity.getIntent().hasExtra(AdUnitActivity.EXTRA_ORIENTATION)) {
                this._orientation = this._adUnitActivity.getIntent().getIntExtra(AdUnitActivity.EXTRA_ORIENTATION, -1);
            }
            if (this._adUnitActivity.getIntent().hasExtra(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY)) {
                this._systemUiVisibility = this._adUnitActivity.getIntent().getIntExtra(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, 0);
            }
            if (this._adUnitActivity.getIntent().hasExtra(AdUnitActivity.EXTRA_ACTIVITY_ID)) {
                this._activityId = this._adUnitActivity.getIntent().getIntExtra(AdUnitActivity.EXTRA_ACTIVITY_ID, -1);
            }
            if (this._adUnitActivity.getIntent().hasExtra(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE)) {
                this._displayCutoutMode = this._adUnitActivity.getIntent().getIntExtra(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, 0);
            }
            adUnitEvent = AdUnitEvent.ON_CREATE;
        } else {
            this._views = bundle.getStringArray(AdUnitActivity.EXTRA_VIEWS);
            this._orientation = bundle.getInt(AdUnitActivity.EXTRA_ORIENTATION, -1);
            this._systemUiVisibility = bundle.getInt(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, 0);
            this._keyEventList = bundle.getIntegerArrayList(AdUnitActivity.EXTRA_KEY_EVENT_LIST);
            this._keepScreenOn = bundle.getBoolean(AdUnitActivity.EXTRA_KEEP_SCREEN_ON);
            this._activityId = bundle.getInt(AdUnitActivity.EXTRA_ACTIVITY_ID, -1);
            this._displayCutoutMode = bundle.getInt(AdUnitActivity.EXTRA_DISPLAY_CUTOUT_MODE, 0);
            setKeepScreenOn(this._keepScreenOn);
            adUnitEvent = AdUnitEvent.ON_RESTORE;
        }
        setOrientation(this._orientation);
        setSystemUiVisibility(this._systemUiVisibility);
        setLayoutInDisplayCutoutMode(this._displayCutoutMode);
        String[] strArr = this._views;
        if (strArr != null) {
            for (String viewHandler : strArr) {
                IAdUnitViewHandler viewHandler2 = getViewHandler(viewHandler);
                if (viewHandler2 != null) {
                    viewHandler2.onCreate(this._adUnitActivity, bundle);
                }
            }
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, adUnitEvent, Integer.valueOf(this._activityId));
    }

    public void onDestroy() {
        if (this._eventSender.canSend()) {
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_DESTROY, Boolean.valueOf(this._adUnitActivity.isFinishing()), Integer.valueOf(this._activityId));
            Map<String, IAdUnitViewHandler> map = this._viewHandlers;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((IAdUnitViewHandler) next.getValue()).onDestroy(this._adUnitActivity);
                    }
                }
            }
            if (AdUnit.getCurrentAdUnitActivityId() == this._activityId) {
                AdUnit.setAdUnitActivity((IAdUnitActivity) null);
            }
            Intent.removeActiveActivity(this._adUnitActivity.getActivity());
        } else if (!this._adUnitActivity.isFinishing()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onDestroy");
            this._adUnitActivity.finish();
        }
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        ArrayList<Integer> arrayList = this._keyEventList;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(i10))) {
            return false;
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.KEY_DOWN, Integer.valueOf(i10), Long.valueOf(keyEvent.getEventTime()), Long.valueOf(keyEvent.getDownTime()), Integer.valueOf(keyEvent.getRepeatCount()), Integer.valueOf(this._activityId));
        return true;
    }

    public void onPause() {
        if (this._eventSender.canSend()) {
            if (WebViewApp.getCurrentApp().getWebView() == null) {
                DeviceLog.warning("Unity Ads web view is null, from onPause");
            } else if (this._adUnitActivity.isFinishing()) {
                ViewUtilities.removeViewFromParent(WebViewApp.getCurrentApp().getWebView());
            }
            Map<String, IAdUnitViewHandler> map = this._viewHandlers;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((IAdUnitViewHandler) next.getValue()).onPause(this._adUnitActivity);
                    }
                }
            }
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_PAUSE, Boolean.valueOf(this._adUnitActivity.isFinishing()), Integer.valueOf(this._activityId));
        } else if (!this._adUnitActivity.isFinishing()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onPause");
            this._adUnitActivity.finish();
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArray2 = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            for (int put2 : iArr) {
                jSONArray2.put(put2);
            }
            this._eventSender.sendEvent(WebViewEventCategory.PERMISSIONS, PermissionsEvent.PERMISSIONS_RESULT, Integer.valueOf(i10), jSONArray, jSONArray2);
        } catch (Exception e10) {
            this._eventSender.sendEvent(WebViewEventCategory.PERMISSIONS, PermissionsEvent.PERMISSIONS_ERROR, e10.getMessage());
        }
    }

    public void onResume() {
        if (this._eventSender.canSend()) {
            setViews(this._views);
            Map<String, IAdUnitViewHandler> map = this._viewHandlers;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((IAdUnitViewHandler) next.getValue()).onResume(this._adUnitActivity);
                    }
                }
            }
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_RESUME, Integer.valueOf(this._activityId));
        } else if (!this._adUnitActivity.isFinishing()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onResume");
            this._adUnitActivity.finish();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt(AdUnitActivity.EXTRA_ORIENTATION, this._orientation);
        bundle.putInt(AdUnitActivity.EXTRA_SYSTEM_UI_VISIBILITY, this._systemUiVisibility);
        bundle.putIntegerArrayList(AdUnitActivity.EXTRA_KEY_EVENT_LIST, this._keyEventList);
        bundle.putBoolean(AdUnitActivity.EXTRA_KEEP_SCREEN_ON, this._keepScreenOn);
        bundle.putStringArray(AdUnitActivity.EXTRA_VIEWS, this._views);
        bundle.putInt(AdUnitActivity.EXTRA_ACTIVITY_ID, this._activityId);
    }

    public void onStart() {
        if (this._eventSender.canSend()) {
            Map<String, IAdUnitViewHandler> map = this._viewHandlers;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((IAdUnitViewHandler) next.getValue()).onStart(this._adUnitActivity);
                    }
                }
            }
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_START, Integer.valueOf(this._activityId));
        } else if (!this._adUnitActivity.isFinishing()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStart");
            this._adUnitActivity.finish();
        }
    }

    public void onStop() {
        if (this._eventSender.canSend()) {
            Map<String, IAdUnitViewHandler> map = this._viewHandlers;
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    if (next.getValue() != null) {
                        ((IAdUnitViewHandler) next.getValue()).onStop(this._adUnitActivity);
                    }
                }
            }
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_STOP, Integer.valueOf(this._activityId));
        } else if (!this._adUnitActivity.isFinishing()) {
            DeviceLog.error("Unity Ads web app is null, closing Unity Ads activity from onStop");
            this._adUnitActivity.finish();
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        if (z10) {
            this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_FOCUS_GAINED, Integer.valueOf(this._activityId));
            return;
        }
        this._eventSender.sendEvent(WebViewEventCategory.ADUNIT, AdUnitEvent.ON_FOCUS_LOST, Integer.valueOf(this._activityId));
    }

    public boolean setKeepScreenOn(boolean z10) {
        this._keepScreenOn = z10;
        if (this._adUnitActivity.getWindow() == null) {
            return false;
        }
        if (z10) {
            this._adUnitActivity.getWindow().addFlags(128);
            return true;
        }
        this._adUnitActivity.getWindow().clearFlags(128);
        return true;
    }

    public void setKeyEventList(ArrayList<Integer> arrayList) {
        this._keyEventList = arrayList;
    }

    public void setLayoutInDisplayCutoutMode(int i10) {
        this._displayCutoutMode = i10;
        if (Build.VERSION.SDK_INT >= 28 && this._adUnitActivity.getWindow() != null) {
            WindowManager.LayoutParams attributes = this._adUnitActivity.getWindow().getAttributes();
            try {
                attributes.getClass().getField("layoutInDisplayCutoutMode").setInt(attributes, i10);
            } catch (IllegalAccessException e10) {
                DeviceLog.debug("Error setting layoutInDisplayCutoutMode", e10);
            } catch (NoSuchFieldException e11) {
                DeviceLog.debug("Error getting layoutInDisplayCutoutMode", e11);
            }
        }
    }

    public void setOrientation(int i10) {
        this._orientation = i10;
        this._adUnitActivity.setRequestedOrientation(i10);
    }

    public boolean setSystemUiVisibility(int i10) {
        this._systemUiVisibility = i10;
        if (Build.VERSION.SDK_INT >= 11) {
            try {
                this._adUnitActivity.getWindow().getDecorView().setSystemUiVisibility(i10);
                return true;
            } catch (Exception e10) {
                DeviceLog.exception("Error while setting SystemUIVisibility", e10);
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setViewFrame(java.lang.String r3, int r4, int r5, int r6, int r7) {
        /*
            r2 = this;
            com.unity3d.services.ads.adunit.IAdUnitViewHandler r0 = r2.getViewHandler(r3)
            java.lang.String r1 = "adunit"
            boolean r3 = r3.equals(r1)
            r1 = 0
            if (r3 == 0) goto L_0x001b
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r6, r7)
            r3.setMargins(r4, r5, r1, r1)
            com.unity3d.services.ads.adunit.AdUnitRelativeLayout r0 = r2._layout
            r0.setLayoutParams(r3)
            goto L_0x0022
        L_0x001b:
            if (r0 == 0) goto L_0x0022
            android.view.View r3 = r0.getView()
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            if (r3 == 0) goto L_0x0030
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            r0.<init>(r6, r7)
            r0.setMargins(r4, r5, r1, r1)
            r3.setLayoutParams(r0)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.ads.adunit.AdUnitActivityController.setViewFrame(java.lang.String, int, int, int, int):void");
    }

    public void setViews(String[] strArr) {
        if (strArr == null) {
            strArr = new String[0];
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        if (this._views == null) {
            this._views = new String[0];
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(this._views));
        arrayList2.removeAll(arrayList);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            getViewHandler((String) it.next()).destroy();
        }
        this._views = strArr;
        for (String str : strArr) {
            if (str != null) {
                IAdUnitViewHandler viewHandler = getViewHandler(str);
                viewHandler.create(this._adUnitActivity);
                if (!handleViewPlacement(viewHandler.getView())) {
                    return;
                }
            }
        }
    }
}
