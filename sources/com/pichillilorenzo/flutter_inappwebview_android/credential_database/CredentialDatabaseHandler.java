package com.pichillilorenzo.flutter_inappwebview_android.credential_database;

import android.content.Context;
import android.webkit.WebViewDatabase;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLCredential;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLProtectionSpace;
import java.util.ArrayList;
import java.util.HashMap;
import lc.j;
import lc.k;

public class CredentialDatabaseHandler extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "CredentialDatabaseHandler";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_credential_database";
    public static CredentialDatabase credentialDatabase;
    public InAppWebViewFlutterPlugin plugin;

    public CredentialDatabaseHandler(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static void init(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        if (credentialDatabase == null) {
            credentialDatabase = CredentialDatabase.getInstance(inAppWebViewFlutterPlugin.applicationContext);
        }
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
        credentialDatabase = null;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        Context context;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            init(inAppWebViewFlutterPlugin);
        }
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1851697792:
                if (str.equals("clearAllAuthCredentials")) {
                    c10 = 0;
                    break;
                }
                break;
            case -410271914:
                if (str.equals("getHttpAuthCredentials")) {
                    c10 = 1;
                    break;
                }
                break;
            case 589173355:
                if (str.equals("removeHttpAuthCredential")) {
                    c10 = 2;
                    break;
                }
                break;
            case 998955721:
                if (str.equals("setHttpAuthCredential")) {
                    c10 = 3;
                    break;
                }
                break;
            case 1084504936:
                if (str.equals("removeHttpAuthCredentials")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1930845769:
                if (str.equals("getAllAuthCredentials")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                CredentialDatabase credentialDatabase2 = credentialDatabase;
                if (credentialDatabase2 != null) {
                    credentialDatabase2.clearAllAuthCredentials();
                    InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
                    if (!(inAppWebViewFlutterPlugin2 == null || (context = inAppWebViewFlutterPlugin2.applicationContext) == null)) {
                        WebViewDatabase.getInstance(context).clearHttpAuthUsernamePassword();
                    }
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 1:
                ArrayList arrayList = new ArrayList();
                if (credentialDatabase != null) {
                    for (URLCredential map : credentialDatabase.getHttpAuthCredentials((String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.a("protocol"), (String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT))) {
                        arrayList.add(map.toMap());
                    }
                }
                dVar.success(arrayList);
                return;
            case 2:
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredential((String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.a("protocol"), (String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) jVar.a("username"), (String) jVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 3:
                if (credentialDatabase != null) {
                    credentialDatabase.setHttpAuthCredential((String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.a("protocol"), (String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT), (String) jVar.a("username"), (String) jVar.a(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD));
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 4:
                if (credentialDatabase != null) {
                    credentialDatabase.removeHttpAuthCredentials((String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST), (String) jVar.a("protocol"), (String) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM), (Integer) jVar.a(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT));
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 5:
                ArrayList arrayList2 = new ArrayList();
                CredentialDatabase credentialDatabase3 = credentialDatabase;
                if (credentialDatabase3 != null) {
                    for (URLProtectionSpace next : credentialDatabase3.protectionSpaceDao.getAll()) {
                        ArrayList arrayList3 = new ArrayList();
                        for (URLCredential map2 : credentialDatabase.credentialDao.getAllByProtectionSpaceId(next.getId())) {
                            arrayList3.add(map2.toMap());
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("protectionSpace", next.toMap());
                        hashMap.put("credentials", arrayList3);
                        arrayList2.add(hashMap);
                    }
                }
                dVar.success(arrayList2);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
