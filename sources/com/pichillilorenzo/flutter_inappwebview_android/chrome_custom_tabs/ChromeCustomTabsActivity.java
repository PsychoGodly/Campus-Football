package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.browser.customtabs.a;
import androidx.browser.customtabs.b;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.i;
import androidx.browser.customtabs.j;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.c;
import lc.k;

public class ChromeCustomTabsActivity extends Activity implements Disposable {
    public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    protected static final String LOG_TAG = "CustomTabsActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
    public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
    public CustomTabsActionButton actionButton;
    public d.b builder;
    public ChromeCustomTabsChannelDelegate channelDelegate;
    public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    public i customTabsSession;

    /* renamed from: id  reason: collision with root package name */
    public String f28488id;
    public Map<String, String> initialHeaders;
    public List<String> initialOtherLikelyURLs;
    public String initialReferrer;
    public String initialUrl;
    protected boolean isBindSuccess = false;
    public ChromeSafariBrowserManager manager;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();
    protected boolean onCompletedInitialLoad = false;
    protected boolean onOpened = false;
    public CustomTabsSecondaryToolbar secondaryToolbar;

    private PendingIntent createPendingIntent(int i10) {
        Intent intent = new Intent(this, ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i10);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f28488id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.f28489id : null);
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast(this, i10, intent, 167772160);
        }
        return PendingIntent.getBroadcast(this, i10, intent, 134217728);
    }

    private void prepareCustomTabs() {
        d.b bVar = this.builder;
        if (bVar != null) {
            ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
            Boolean bool = chromeCustomTabsSettings.addDefaultShareMenuItem;
            if (bool != null) {
                bVar.l(bool.booleanValue() ? 1 : 2);
            } else {
                bVar.l(chromeCustomTabsSettings.shareState.intValue());
            }
            a.C0017a aVar = new a.C0017a();
            String str = this.customSettings.toolbarBackgroundColor;
            if (str != null && !str.isEmpty()) {
                aVar.e(Color.parseColor(this.customSettings.toolbarBackgroundColor));
            }
            String str2 = this.customSettings.navigationBarColor;
            if (str2 != null && !str2.isEmpty()) {
                aVar.b(Color.parseColor(this.customSettings.navigationBarColor));
            }
            String str3 = this.customSettings.navigationBarDividerColor;
            if (str3 != null && !str3.isEmpty()) {
                aVar.c(Color.parseColor(this.customSettings.navigationBarDividerColor));
            }
            String str4 = this.customSettings.secondaryToolbarColor;
            if (str4 != null && !str4.isEmpty()) {
                aVar.d(Color.parseColor(this.customSettings.secondaryToolbarColor));
            }
            this.builder.f(aVar.a());
            this.builder.m(this.customSettings.showTitle.booleanValue());
            this.builder.o(this.customSettings.enableUrlBarHiding.booleanValue());
            this.builder.h(this.customSettings.instantAppsEnabled.booleanValue());
            if (this.customSettings.startAnimations.size() == 2) {
                this.builder.n(this, this.customSettings.startAnimations.get(0).getIdentifier(this), this.customSettings.startAnimations.get(1).getIdentifier(this));
            }
            if (this.customSettings.exitAnimations.size() == 2) {
                this.builder.g(this, this.customSettings.exitAnimations.get(0).getIdentifier(this), this.customSettings.exitAnimations.get(1).getIdentifier(this));
            }
            for (CustomTabsMenuItem next : this.menuItems) {
                this.builder.a(next.getLabel(), createPendingIntent(next.getId()));
            }
            CustomTabsActionButton customTabsActionButton = this.actionButton;
            if (customTabsActionButton != null) {
                byte[] icon = customTabsActionButton.getIcon();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inMutable = true;
                this.builder.c(BitmapFactory.decodeByteArray(icon, 0, icon.length, options), this.actionButton.getDescription(), createPendingIntent(this.actionButton.getId()), this.actionButton.isShouldTint());
            }
            CustomTabsSecondaryToolbar customTabsSecondaryToolbar = this.secondaryToolbar;
            if (customTabsSecondaryToolbar != null) {
                AndroidResource layout = customTabsSecondaryToolbar.getLayout();
                RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
                int[] iArr = new int[this.secondaryToolbar.getClickableIDs().size()];
                int size = this.secondaryToolbar.getClickableIDs().size();
                for (int i10 = 0; i10 < size; i10++) {
                    iArr[i10] = this.secondaryToolbar.getClickableIDs().get(i10).getIdentifier(this);
                }
                this.builder.i(remoteViews, iArr, getSecondaryToolbarOnClickPendingIntent());
            }
        }
    }

    private void prepareCustomTabsIntent(d dVar) {
        String str = this.customSettings.packageName;
        if (str != null) {
            dVar.f1921a.setPackage(str);
        } else {
            dVar.f1921a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, dVar.f1921a);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            d.c(dVar.f1921a);
        }
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.onClosed();
        }
    }

    public void customTabsConnected() {
        String str;
        i session = this.customTabActivityHelper.getSession();
        this.customTabsSession = session;
        if (session != null) {
            try {
                Bundle bundle = new Bundle();
                if (this.customTabsSession.h(bundle)) {
                    this.customTabsSession.m(new j() {
                        public void onGreatestScrollPercentageIncreased(int i10, Bundle bundle) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onGreatestScrollPercentageIncreased(i10);
                            }
                        }

                        public void onSessionEnded(boolean z10, Bundle bundle) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onSessionEnded(z10);
                            }
                        }

                        public void onVerticalScrollEvent(boolean z10, Bundle bundle) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onVerticalScrollEvent(z10);
                            }
                        }
                    }, bundle);
                }
            } catch (Throwable th) {
                Log.d(LOG_TAG, "Custom Tabs Engagement Signals API not supported", th);
            }
        }
        if (this.isBindSuccess && (str = this.initialUrl) != null) {
            launchUrl(str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
        }
    }

    public void dispose() {
        onStop();
        onDestroy();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.browsers.containsKey(this.f28488id)) {
            this.manager.browsers.put(this.f28488id, (Object) null);
        }
        this.manager = null;
    }

    public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
        Intent intent = new Intent(this, ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.f28488id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.f28489id : null);
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getBroadcast(this, 0, intent, 167772160);
        }
        return PendingIntent.getBroadcast(this, 0, intent, 134217728);
    }

    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        launchUrlWithSession(this.customTabsSession, str, map, str2, list);
    }

    public void launchUrlWithSession(i iVar, String str, Map<String, String> map, String str2, List<String> list) {
        mayLaunchUrl(str, list);
        this.builder = new d.b(iVar);
        prepareCustomTabs();
        d b10 = this.builder.b();
        prepareCustomTabsIntent(b10);
        CustomTabActivityHelper.openCustomTab((Activity) this, b10, Uri.parse(str), map, str2 != null ? Uri.parse(str2) : null, 100);
    }

    public boolean mayLaunchUrl(String str, List<String> list) {
        Uri parse = str != null ? Uri.parse(str) : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Bundle bundle = new Bundle();
            for (String putString : list) {
                bundle.putString("android.support.customtabs.otherurls.URL", putString);
            }
        }
        return this.customTabActivityHelper.mayLaunchUrl(parse, (Bundle) null, arrayList);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 100) {
            close();
            dispose();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
        super.onCreate(bundle);
        setContentView(R.layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f28488id = extras.getString("id");
            ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
            this.manager = chromeSafariBrowserManager;
            if (chromeSafariBrowserManager != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && inAppWebViewFlutterPlugin.messenger != null) {
                chromeSafariBrowserManager.browsers.put(this.f28488id, this);
                c cVar = this.manager.plugin.messenger;
                this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new k(cVar, METHOD_CHANNEL_NAME_PREFIX + this.f28488id));
                this.initialUrl = extras.getString("url");
                this.initialHeaders = (Map) extras.getSerializable("headers");
                this.initialReferrer = extras.getString("referrer");
                this.initialOtherLikelyURLs = extras.getStringArrayList("otherLikelyURLs");
                ChromeCustomTabsSettings chromeCustomTabsSettings = new ChromeCustomTabsSettings();
                this.customSettings = chromeCustomTabsSettings;
                chromeCustomTabsSettings.parse((Map) (HashMap) extras.getSerializable("settings"));
                this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
                this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map) extras.getSerializable("secondaryToolbar"));
                for (Map fromMap : (List) extras.getSerializable("menuItemList")) {
                    this.menuItems.add(CustomTabsMenuItem.fromMap(fromMap));
                }
                if (this.customSettings.noHistory.booleanValue() && (noHistoryCustomTabsActivityCallbacks = this.manager.plugin.noHistoryCustomTabsActivityCallbacks) != null) {
                    Map<String, String> map = noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs;
                    String str = this.f28488id;
                    map.put(str, str);
                }
                this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() {
                    public void onCustomTabsConnected() {
                        ChromeCustomTabsActivity.this.customTabsConnected();
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onServiceConnected();
                        }
                    }

                    public void onCustomTabsDisconnected() {
                        this.close();
                        ChromeCustomTabsActivity.this.dispose();
                    }
                });
                this.customTabActivityHelper.setCustomTabsCallback(new b() {
                    public void extraCallback(String str, Bundle bundle) {
                    }

                    public void onMessageChannelReady(Bundle bundle) {
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onMessageChannelReady();
                        }
                    }

                    public void onNavigationEvent(int i10, Bundle bundle) {
                        if (i10 == 5) {
                            ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                            if (!chromeCustomTabsActivity.onOpened) {
                                chromeCustomTabsActivity.onOpened = true;
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = chromeCustomTabsActivity.channelDelegate;
                                if (chromeCustomTabsChannelDelegate != null) {
                                    chromeCustomTabsChannelDelegate.onOpened();
                                }
                            }
                        }
                        if (i10 == 2) {
                            ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                            if (!chromeCustomTabsActivity2.onCompletedInitialLoad) {
                                chromeCustomTabsActivity2.onCompletedInitialLoad = true;
                                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate2 = chromeCustomTabsActivity2.channelDelegate;
                                if (chromeCustomTabsChannelDelegate2 != null) {
                                    chromeCustomTabsChannelDelegate2.onCompletedInitialLoad();
                                }
                            }
                        }
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate3 = ChromeCustomTabsActivity.this.channelDelegate;
                        if (chromeCustomTabsChannelDelegate3 != null) {
                            chromeCustomTabsChannelDelegate3.onNavigationEvent(i10);
                        }
                    }

                    public void onPostMessage(String str, Bundle bundle) {
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onPostMessage(str);
                        }
                    }

                    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10, Bundle bundle) {
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onRelationshipValidationResult(i10, uri, z10);
                        }
                    }
                });
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        String str;
        super.onStart();
        boolean bindCustomTabsService = this.customTabActivityHelper.bindCustomTabsService(this);
        this.isBindSuccess = bindCustomTabsService;
        if (!bindCustomTabsService && (str = this.initialUrl) != null) {
            launchUrlWithSession((i) null, str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
        this.isBindSuccess = false;
    }

    public void updateActionButton(byte[] bArr, String str) {
        if (this.customTabsSession != null && this.actionButton != null) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            this.customTabsSession.l(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), str);
            this.actionButton.setIcon(bArr);
            this.actionButton.setDescription(str);
        }
    }

    public void updateSecondaryToolbar(CustomTabsSecondaryToolbar customTabsSecondaryToolbar) {
        if (this.customTabsSession != null) {
            AndroidResource layout = customTabsSecondaryToolbar.getLayout();
            RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
            int[] iArr = new int[customTabsSecondaryToolbar.getClickableIDs().size()];
            int size = customTabsSecondaryToolbar.getClickableIDs().size();
            for (int i10 = 0; i10 < size; i10++) {
                iArr[i10] = customTabsSecondaryToolbar.getClickableIDs().get(i10).getIdentifier(this);
            }
            this.customTabsSession.n(remoteViews, iArr, getSecondaryToolbarOnClickPendingIntent());
            this.secondaryToolbar = customTabsSecondaryToolbar;
        }
    }
}
