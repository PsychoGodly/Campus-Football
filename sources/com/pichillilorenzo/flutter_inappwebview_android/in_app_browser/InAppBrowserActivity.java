package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import androidx.appcompat.app.a;
import androidx.appcompat.app.d;
import androidx.appcompat.view.menu.g;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionSettings;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import ec.c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.k;

public class InAppBrowserActivity extends d implements InAppBrowserDelegate, Disposable {
    protected static final String LOG_TAG = "InAppBrowserActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappbrowser_";
    public a actionBar;
    private List<ActivityResultListener> activityResultListeners = new ArrayList();
    public InAppBrowserChannelDelegate channelDelegate;
    public InAppBrowserSettings customSettings = new InAppBrowserSettings();
    public String fromActivity;

    /* renamed from: id  reason: collision with root package name */
    public String f28492id;
    public boolean isHidden = false;
    public InAppBrowserManager manager;
    public Menu menu;
    public List<InAppBrowserMenuItem> menuItems = new ArrayList();
    public ProgressBar progressBar;
    public PullToRefreshLayout pullToRefreshLayout;
    public SearchView searchView;
    public InAppWebView webView;
    public Integer windowId;

    private void prepareView() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.prepare();
        }
        if (this.customSettings.hidden.booleanValue()) {
            hide();
        } else {
            show();
        }
        ProgressBar progressBar2 = (ProgressBar) findViewById(R.id.progressBar);
        this.progressBar = progressBar2;
        if (progressBar2 != null) {
            if (this.customSettings.hideProgressBar.booleanValue()) {
                this.progressBar.setMax(0);
            } else {
                this.progressBar.setMax(100);
            }
        }
        a aVar = this.actionBar;
        if (aVar != null) {
            aVar.u(!this.customSettings.hideTitleBar.booleanValue());
            if (this.customSettings.hideToolbarTop.booleanValue()) {
                this.actionBar.k();
            }
            String str = this.customSettings.toolbarTopBackgroundColor;
            if (str != null && !str.isEmpty()) {
                this.actionBar.s(new ColorDrawable(Color.parseColor(this.customSettings.toolbarTopBackgroundColor)));
            }
            String str2 = this.customSettings.toolbarTopFixedTitle;
            if (str2 != null && !str2.isEmpty()) {
                this.actionBar.w(this.customSettings.toolbarTopFixedTitle);
            }
        }
    }

    public boolean canGoBack() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    public boolean canGoForward() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    public void close(k.d dVar) {
        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
        if (inAppBrowserChannelDelegate != null) {
            inAppBrowserChannelDelegate.onExit();
        }
        dispose();
        if (dVar != null) {
            dVar.success(Boolean.TRUE);
        }
    }

    public void closeButtonClicked(MenuItem menuItem) {
        close((k.d) null);
    }

    public void didChangeProgress(int i10) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setVisibility(0);
            if (Build.VERSION.SDK_INT >= 24) {
                this.progressBar.setProgress(i10, true);
            } else {
                this.progressBar.setProgress(i10);
            }
            if (i10 == 100) {
                this.progressBar.setVisibility(8);
            }
        }
    }

    public void didChangeTitle(String str) {
        if (this.actionBar != null) {
            String str2 = this.customSettings.toolbarTopFixedTitle;
            if (str2 == null || str2.isEmpty()) {
                this.actionBar.w(str);
            }
        }
    }

    public void didFailNavigation(String str, int i10, String str2) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void didFinishNavigation(String str) {
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
    }

    public void didStartNavigation(String str) {
        ProgressBar progressBar2 = this.progressBar;
        if (progressBar2 != null) {
            progressBar2.setProgress(0);
        }
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
    }

    public void didUpdateVisitedHistory(String str) {
        SearchView searchView2 = this.searchView;
        if (searchView2 != null) {
            searchView2.setQuery(str, false);
        }
    }

    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        c cVar;
        InAppWebViewChromeClient inAppWebViewChromeClient;
        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
        if (inAppBrowserChannelDelegate != null) {
            inAppBrowserChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.activityResultListeners.clear();
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            InAppBrowserManager inAppBrowserManager = this.manager;
            if (!(inAppBrowserManager == null || (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) == null || (cVar = inAppWebViewFlutterPlugin.activityPluginBinding) == null || (inAppWebViewChromeClient = inAppWebView.inAppWebViewChromeClient) == null)) {
                cVar.e(inAppWebViewChromeClient);
            }
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.container);
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            this.webView.dispose();
            this.webView = null;
            finish();
        }
    }

    public Activity getActivity() {
        return this;
    }

    public List<ActivityResultListener> getActivityResultListeners() {
        return this.activityResultListeners;
    }

    public Map<String, Object> getCustomSettings() {
        InAppWebView inAppWebView = this.webView;
        Map<String, Object> customSettings2 = inAppWebView != null ? inAppWebView.getCustomSettings() : null;
        InAppBrowserSettings inAppBrowserSettings = this.customSettings;
        if (inAppBrowserSettings == null || customSettings2 == null) {
            return null;
        }
        Map<String, Object> realSettings = inAppBrowserSettings.getRealSettings(this);
        realSettings.putAll(customSettings2);
        return realSettings;
    }

    public void goBack() {
        if (this.webView != null && canGoBack()) {
            this.webView.goBack();
        }
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        goBack();
    }

    public void goForward() {
        if (this.webView != null && canGoForward()) {
            this.webView.goForward();
        }
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        goForward();
    }

    public void hide() {
        if (this.fromActivity != null) {
            try {
                this.isHidden = true;
                Intent intent = new Intent(this, Class.forName(this.fromActivity));
                intent.setFlags(131072);
                startActivityIfNeeded(intent, 0);
            } catch (ClassNotFoundException e10) {
                Log.d(LOG_TAG, MaxReward.DEFAULT_LABEL, e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        for (ActivityResultListener onActivityResult : this.activityResultListeners) {
            if (onActivityResult.onActivityResult(i10, i11, intent)) {
                return;
            }
        }
        super.onActivityResult(i10, i11, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        URLRequest fromMap;
        InAppWebViewManager inAppWebViewManager;
        Message message;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f28492id = extras.getString("id");
            InAppBrowserManager inAppBrowserManager = InAppBrowserManager.shared.get(extras.getString("managerId"));
            this.manager = inAppBrowserManager;
            if (inAppBrowserManager != null && (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) != null && inAppWebViewFlutterPlugin.messenger != null) {
                Map map = (Map) extras.getSerializable("settings");
                this.customSettings.parse(map);
                this.windowId = Integer.valueOf(extras.getInt("windowId"));
                setContentView(R.layout.activity_web_view);
                lc.c cVar = this.manager.plugin.messenger;
                k kVar = new k(cVar, PullToRefreshLayout.METHOD_CHANNEL_NAME_PREFIX + this.f28492id);
                PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
                pullToRefreshSettings.parse((Map) extras.getSerializable("pullToRefreshInitialSettings"));
                PullToRefreshLayout pullToRefreshLayout2 = (PullToRefreshLayout) findViewById(R.id.pullToRefresh);
                this.pullToRefreshLayout = pullToRefreshLayout2;
                pullToRefreshLayout2.channelDelegate = new PullToRefreshChannelDelegate(pullToRefreshLayout2, kVar);
                PullToRefreshLayout pullToRefreshLayout3 = this.pullToRefreshLayout;
                pullToRefreshLayout3.settings = pullToRefreshSettings;
                pullToRefreshLayout3.prepare();
                InAppWebView inAppWebView = (InAppWebView) findViewById(R.id.webView);
                this.webView = inAppWebView;
                String str = this.f28492id;
                inAppWebView.f28503id = str;
                inAppWebView.windowId = this.windowId;
                inAppWebView.inAppBrowserDelegate = this;
                InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.manager.plugin;
                inAppWebView.plugin = inAppWebViewFlutterPlugin2;
                FindInteractionController findInteractionController = new FindInteractionController(inAppWebView, inAppWebViewFlutterPlugin2, str, (FindInteractionSettings) null);
                this.webView.findInteractionController = findInteractionController;
                findInteractionController.prepare();
                lc.c cVar2 = this.manager.plugin.messenger;
                k kVar2 = new k(cVar2, METHOD_CHANNEL_NAME_PREFIX + this.f28492id);
                this.channelDelegate = new InAppBrowserChannelDelegate(kVar2);
                InAppWebView inAppWebView2 = this.webView;
                inAppWebView2.channelDelegate = new WebViewChannelDelegate(inAppWebView2, kVar2);
                this.fromActivity = extras.getString("fromActivity");
                Map<String, Object> map2 = (Map) extras.getSerializable("contextMenu");
                List<Map> list = (List) extras.getSerializable("initialUserScripts");
                for (Map fromMap2 : (List) extras.getSerializable("menuItems")) {
                    this.menuItems.add(InAppBrowserMenuItem.fromMap(fromMap2));
                }
                InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
                inAppWebViewSettings.parse(map);
                InAppWebView inAppWebView3 = this.webView;
                inAppWebView3.customSettings = inAppWebViewSettings;
                inAppWebView3.contextMenu = map2;
                ArrayList arrayList = new ArrayList();
                if (list != null) {
                    for (Map fromMap3 : list) {
                        arrayList.add(UserScript.fromMap(fromMap3));
                    }
                }
                this.webView.userContentController.addUserOnlyScripts(arrayList);
                this.actionBar = getSupportActionBar();
                prepareView();
                if (this.windowId.intValue() != -1) {
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.webView.plugin;
                    if (!(inAppWebViewFlutterPlugin3 == null || (inAppWebViewManager = inAppWebViewFlutterPlugin3.inAppWebViewManager) == null || (message = inAppWebViewManager.windowWebViewMessages.get(this.windowId)) == null)) {
                        ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                        message.sendToTarget();
                    }
                } else {
                    String string = extras.getString("initialFile");
                    Map map3 = (Map) extras.getSerializable("initialUrlRequest");
                    String string2 = extras.getString("initialData");
                    if (string != null) {
                        try {
                            this.webView.loadFile(string);
                        } catch (IOException e10) {
                            Log.e(LOG_TAG, string + " asset file cannot be found!", e10);
                            return;
                        }
                    } else if (string2 != null) {
                        String string3 = extras.getString("initialMimeType");
                        String string4 = extras.getString("initialEncoding");
                        this.webView.loadDataWithBaseURL(extras.getString("initialBaseUrl"), string2, string3, string4, extras.getString("initialHistoryUrl"));
                    } else if (!(map3 == null || (fromMap = URLRequest.fromMap(map3)) == null)) {
                        this.webView.loadUrl(fromMap);
                    }
                }
                InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
                if (inAppBrowserChannelDelegate != null) {
                    inAppBrowserChannelDelegate.onBrowserCreated();
                }
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu2) {
        String str;
        this.menu = menu2;
        a aVar = this.actionBar;
        String str2 = MaxReward.DEFAULT_LABEL;
        if (aVar != null && ((str = this.customSettings.toolbarTopFixedTitle) == null || str.isEmpty())) {
            a aVar2 = this.actionBar;
            InAppWebView inAppWebView = this.webView;
            aVar2.w(inAppWebView != null ? inAppWebView.getTitle() : str2);
        }
        Menu menu3 = this.menu;
        if (menu3 == null) {
            return super.onCreateOptionsMenu(menu2);
        }
        if (menu3 instanceof g) {
            ((g) menu3).a0(true);
        }
        getMenuInflater().inflate(R.menu.menu_main, this.menu);
        MenuItem findItem = this.menu.findItem(R.id.menu_search);
        if (findItem != null) {
            if (this.customSettings.hideUrlBar.booleanValue()) {
                findItem.setVisible(false);
            }
            SearchView searchView2 = (SearchView) findItem.getActionView();
            this.searchView = searchView2;
            if (searchView2 != null) {
                searchView2.setFocusable(true);
                SearchView searchView3 = this.searchView;
                InAppWebView inAppWebView2 = this.webView;
                if (inAppWebView2 != null) {
                    str2 = inAppWebView2.getUrl();
                }
                searchView3.setQuery(str2, false);
                this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    public boolean onQueryTextChange(String str) {
                        return false;
                    }

                    public boolean onQueryTextSubmit(String str) {
                        if (str.isEmpty()) {
                            return false;
                        }
                        InAppWebView inAppWebView = InAppBrowserActivity.this.webView;
                        if (inAppWebView != null) {
                            inAppWebView.loadUrl(str);
                        }
                        SearchView searchView = InAppBrowserActivity.this.searchView;
                        if (searchView != null) {
                            searchView.setQuery(MaxReward.DEFAULT_LABEL, false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                        return true;
                    }
                });
                this.searchView.setOnCloseListener(new SearchView.OnCloseListener() {
                    public boolean onClose() {
                        SearchView searchView = InAppBrowserActivity.this.searchView;
                        if (searchView != null && searchView.getQuery().toString().isEmpty()) {
                            InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                            SearchView searchView2 = inAppBrowserActivity.searchView;
                            InAppWebView inAppWebView = inAppBrowserActivity.webView;
                            searchView2.setQuery(inAppWebView != null ? inAppWebView.getUrl() : MaxReward.DEFAULT_LABEL, false);
                        }
                        return false;
                    }
                });
                this.searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() {
                    public void onFocusChange(View view, boolean z10) {
                        SearchView searchView;
                        if (!z10 && (searchView = InAppBrowserActivity.this.searchView) != null) {
                            searchView.setQuery(MaxReward.DEFAULT_LABEL, false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                    }
                });
            }
        }
        if (this.customSettings.hideDefaultMenuItems.booleanValue()) {
            MenuItem findItem2 = this.menu.findItem(R.id.action_close);
            if (findItem2 != null) {
                findItem2.setVisible(false);
            }
            MenuItem findItem3 = this.menu.findItem(R.id.action_go_back);
            if (findItem3 != null) {
                findItem3.setVisible(false);
            }
            MenuItem findItem4 = this.menu.findItem(R.id.action_reload);
            if (findItem4 != null) {
                findItem4.setVisible(false);
            }
            MenuItem findItem5 = this.menu.findItem(R.id.action_go_forward);
            if (findItem5 != null) {
                findItem5.setVisible(false);
            }
            MenuItem findItem6 = this.menu.findItem(R.id.action_share);
            if (findItem6 != null) {
                findItem6.setVisible(false);
            }
        }
        for (final InAppBrowserMenuItem next : this.menuItems) {
            MenuItem add = this.menu.add(0, next.getId(), next.getOrder() != null ? next.getOrder().intValue() : 0, next.getTitle());
            if (next.isShowAsAction()) {
                add.setShowAsAction(2);
            }
            Object icon = next.getIcon();
            if (icon != null) {
                if (icon instanceof AndroidResource) {
                    add.setIcon(((AndroidResource) icon).getIdentifier(this));
                } else {
                    add.setIcon(Util.drawableFromBytes(this, (byte[]) icon));
                }
                String iconColor = next.getIconColor();
                if (iconColor != null && !iconColor.isEmpty() && Build.VERSION.SDK_INT >= 21) {
                    add.getIcon().setTint(Color.parseColor(iconColor));
                }
            }
            add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                public boolean onMenuItemClick(MenuItem menuItem) {
                    InAppBrowserChannelDelegate inAppBrowserChannelDelegate = InAppBrowserActivity.this.channelDelegate;
                    if (inAppBrowserChannelDelegate == null) {
                        return true;
                    }
                    inAppBrowserChannelDelegate.onMenuItemClicked(next);
                    return true;
                }
            });
        }
        return true;
    }

    public void onDestroy() {
        dispose();
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4) {
            if (this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
                close((k.d) null);
                return true;
            } else if (this.customSettings.allowGoBackWithBackButton.booleanValue()) {
                if (canGoBack()) {
                    goBack();
                } else if (this.customSettings.closeOnCannotGoBack.booleanValue()) {
                    close((k.d) null);
                }
                return true;
            } else if (!this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
                return true;
            }
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public void reload() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        reload();
    }

    public void setSettings(InAppBrowserSettings inAppBrowserSettings, HashMap<String, Object> hashMap) {
        MenuItem findItem;
        String str;
        String str2;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Boolean bool4;
        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse((Map) hashMap);
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.setSettings(inAppWebViewSettings, hashMap);
        }
        if (!(hashMap.get("hidden") == null || this.customSettings.hidden == (bool4 = inAppBrowserSettings.hidden))) {
            if (bool4.booleanValue()) {
                hide();
            } else {
                show();
            }
        }
        if (!(hashMap.get("hideProgressBar") == null || this.customSettings.hideProgressBar == (bool3 = inAppBrowserSettings.hideProgressBar) || this.progressBar == null)) {
            if (bool3.booleanValue()) {
                this.progressBar.setMax(0);
            } else {
                this.progressBar.setMax(100);
            }
        }
        if (!(this.actionBar == null || hashMap.get("hideTitleBar") == null || this.customSettings.hideTitleBar == (bool2 = inAppBrowserSettings.hideTitleBar))) {
            this.actionBar.u(!bool2.booleanValue());
        }
        if (!(this.actionBar == null || hashMap.get("hideToolbarTop") == null || this.customSettings.hideToolbarTop == (bool = inAppBrowserSettings.hideToolbarTop))) {
            if (bool.booleanValue()) {
                this.actionBar.k();
            } else {
                this.actionBar.y();
            }
        }
        if (!(this.actionBar == null || hashMap.get("toolbarTopBackgroundColor") == null || Util.objEquals(this.customSettings.toolbarTopBackgroundColor, inAppBrowserSettings.toolbarTopBackgroundColor) || (str2 = inAppBrowserSettings.toolbarTopBackgroundColor) == null || str2.isEmpty())) {
            this.actionBar.s(new ColorDrawable(Color.parseColor(inAppBrowserSettings.toolbarTopBackgroundColor)));
        }
        if (!(this.actionBar == null || hashMap.get("toolbarTopFixedTitle") == null || Util.objEquals(this.customSettings.toolbarTopFixedTitle, inAppBrowserSettings.toolbarTopFixedTitle) || (str = inAppBrowserSettings.toolbarTopFixedTitle) == null || str.isEmpty())) {
            this.actionBar.w(inAppBrowserSettings.toolbarTopFixedTitle);
        }
        if (!(this.menu == null || hashMap.get("hideUrlBar") == null || this.customSettings.hideUrlBar == inAppBrowserSettings.hideUrlBar || (findItem = this.menu.findItem(R.id.menu_search)) == null)) {
            findItem.setVisible(!inAppBrowserSettings.hideUrlBar.booleanValue());
        }
        if (!(this.menu == null || hashMap.get("hideDefaultMenuItems") == null || this.customSettings.hideDefaultMenuItems == inAppBrowserSettings.hideDefaultMenuItems)) {
            MenuItem findItem2 = this.menu.findItem(R.id.action_close);
            if (findItem2 != null) {
                findItem2.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem3 = this.menu.findItem(R.id.action_go_back);
            if (findItem3 != null) {
                findItem3.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem4 = this.menu.findItem(R.id.action_reload);
            if (findItem4 != null) {
                findItem4.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem5 = this.menu.findItem(R.id.action_go_forward);
            if (findItem5 != null) {
                findItem5.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem6 = this.menu.findItem(R.id.action_share);
            if (findItem6 != null) {
                findItem6.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
        }
        this.customSettings = inAppBrowserSettings;
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        InAppWebView inAppWebView = this.webView;
        intent.putExtra("android.intent.extra.TEXT", inAppWebView != null ? inAppWebView.getUrl() : MaxReward.DEFAULT_LABEL);
        startActivity(Intent.createChooser(intent, "Share"));
    }

    public void show() {
        this.isHidden = false;
        Intent intent = new Intent(this, InAppBrowserActivity.class);
        intent.setFlags(131072);
        startActivityIfNeeded(intent, 0);
    }
}
