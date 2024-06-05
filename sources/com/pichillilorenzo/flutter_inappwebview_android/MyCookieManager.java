package com.pichillilorenzo.flutter_inappwebview_android;

import android.os.Build;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.applovin.mediation.MaxReward;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.unity3d.ads.metadata.MediationMetaData;
import j1.a;
import j1.s;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import lc.j;
import lc.k;

public class MyCookieManager extends ChannelDelegateImpl {
    protected static final String LOG_TAG = "MyCookieManager";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_cookiemanager";
    public static CookieManager cookieManager;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(new k(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public static String getCookieExpirationDate(Long l10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l10.longValue()));
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e10) {
                if (e10.getMessage() != null && e10.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    return null;
                }
                throw e10;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public void deleteAllCookies(final k.d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            cookieManager2.removeAllCookies(new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                    dVar.success(bool);
                }
            });
            cookieManager.flush();
        } else {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin != null) {
                CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                createInstance.startSync();
                cookieManager.removeAllCookie();
                createInstance.stopSync();
                createInstance.sync();
                dVar.success(Boolean.TRUE);
                return;
            }
            cookieManager2.removeAllCookie();
            dVar.success(Boolean.TRUE);
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final k.d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
            return;
        }
        String str5 = str2 + "=; Path=" + str4 + "; Max-Age=-1";
        if (str3 != null) {
            str5 = str5 + "; Domain=" + str3;
        }
        String str6 = str5 + ";";
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setCookie(str, str6, new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                    dVar.success(bool);
                }
            });
            cookieManager.flush();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
            createInstance.startSync();
            cookieManager.setCookie(str, str6);
            createInstance.stopSync();
            createInstance.sync();
            dVar.success(Boolean.TRUE);
            return;
        }
        cookieManager.setCookie(str, str6);
        dVar.success(Boolean.TRUE);
    }

    public void deleteCookies(String str, String str2, String str3, k.d dVar) {
        CookieSyncManager cookieSyncManager;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
            return;
        }
        String cookie = cookieManager2.getCookie(str);
        if (cookie != null) {
            if (Build.VERSION.SDK_INT >= 21 || (inAppWebViewFlutterPlugin = this.plugin) == null) {
                cookieSyncManager = null;
            } else {
                cookieSyncManager = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                cookieSyncManager.startSync();
            }
            for (String split : cookie.split(";")) {
                String str4 = split.split("=", 2)[0].trim() + "=; Path=" + str3 + "; Max-Age=-1";
                if (str2 != null) {
                    str4 = str4 + "; Domain=" + str2;
                }
                String str5 = str4 + ";";
                if (Build.VERSION.SDK_INT >= 21) {
                    cookieManager.setCookie(str, str5, (ValueCallback) null);
                } else {
                    cookieManager.setCookie(str, str5);
                }
            }
            if (cookieSyncManager != null) {
                cookieSyncManager.stopSync();
                cookieSyncManager.sync();
            } else if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.flush();
            }
        }
        dVar.success(Boolean.TRUE);
    }

    public void dispose() {
        super.dispose();
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) {
        String str2;
        String str3 = str;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            return arrayList;
        }
        List arrayList2 = new ArrayList();
        String str4 = "GET_COOKIE_INFO";
        String str5 = ";";
        if (s.a(str4)) {
            arrayList2 = a.b(cookieManager, str3);
        } else {
            String cookie = cookieManager.getCookie(str3);
            if (cookie != null) {
                arrayList2 = Arrays.asList(cookie.split(str5));
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split(str5);
            if (split.length != 0) {
                String[] split2 = split[0].split("=", 2);
                String trim = split2[0].trim();
                String trim2 = split2.length > 1 ? split2[1].trim() : MaxReward.DEFAULT_LABEL;
                HashMap hashMap = new HashMap();
                hashMap.put(MediationMetaData.KEY_NAME, trim);
                hashMap.put("value", trim2);
                hashMap.put("expiresDate", (Object) null);
                hashMap.put("isSessionOnly", (Object) null);
                hashMap.put("domain", (Object) null);
                hashMap.put("sameSite", (Object) null);
                hashMap.put("isSecure", (Object) null);
                hashMap.put("isHttpOnly", (Object) null);
                hashMap.put("path", (Object) null);
                if (s.a(str4)) {
                    Boolean bool = Boolean.FALSE;
                    hashMap.put("isSecure", bool);
                    hashMap.put("isHttpOnly", bool);
                    int i10 = 1;
                    while (i10 < split.length) {
                        Iterator it2 = it;
                        String[] split3 = split[i10].split("=", 2);
                        String trim3 = split3[0].trim();
                        String str6 = str4;
                        String[] strArr = split;
                        String trim4 = split3.length > 1 ? split3[1].trim() : MaxReward.DEFAULT_LABEL;
                        if (trim3.equalsIgnoreCase("Expires")) {
                            try {
                                str2 = str5;
                                try {
                                    Date parse = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US).parse(trim4);
                                    if (parse != null) {
                                        hashMap.put("expiresDate", Long.valueOf(parse.getTime()));
                                    }
                                } catch (ParseException e10) {
                                    e = e10;
                                    Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e);
                                    i10++;
                                    str4 = str6;
                                    it = it2;
                                    split = strArr;
                                    str5 = str2;
                                }
                            } catch (ParseException e11) {
                                e = e11;
                                str2 = str5;
                                Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e);
                                i10++;
                                str4 = str6;
                                it = it2;
                                split = strArr;
                                str5 = str2;
                            }
                        } else {
                            str2 = str5;
                            if (trim3.equalsIgnoreCase("Max-Age")) {
                                try {
                                    hashMap.put("expiresDate", Long.valueOf(System.currentTimeMillis() + Long.parseLong(trim4)));
                                } catch (NumberFormatException e12) {
                                    Log.e(LOG_TAG, MaxReward.DEFAULT_LABEL, e12);
                                }
                            } else if (trim3.equalsIgnoreCase("Domain")) {
                                hashMap.put("domain", trim4);
                            } else if (trim3.equalsIgnoreCase("SameSite")) {
                                hashMap.put("sameSite", trim4);
                            } else if (trim3.equalsIgnoreCase("Secure")) {
                                hashMap.put("isSecure", Boolean.TRUE);
                            } else if (trim3.equalsIgnoreCase("HttpOnly")) {
                                hashMap.put("isHttpOnly", Boolean.TRUE);
                            } else if (trim3.equalsIgnoreCase("Path")) {
                                hashMap.put("path", trim4);
                            }
                        }
                        i10++;
                        str4 = str6;
                        it = it2;
                        split = strArr;
                        str5 = str2;
                    }
                }
                arrayList.add(hashMap);
                str4 = str4;
                it = it;
                str5 = str5;
            }
        }
        return arrayList;
    }

    public void onMethodCall(j jVar, k.d dVar) {
        j jVar2 = jVar;
        k.d dVar2 = dVar;
        init();
        String str = jVar2.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1222815761:
                if (str.equals("deleteCookie")) {
                    c10 = 0;
                    break;
                }
                break;
            case -913968963:
                if (str.equals("removeSessionCookies")) {
                    c10 = 1;
                    break;
                }
                break;
            case 126640486:
                if (str.equals("setCookie")) {
                    c10 = 2;
                    break;
                }
                break;
            case 747417188:
                if (str.equals("deleteCookies")) {
                    c10 = 3;
                    break;
                }
                break;
            case 822411705:
                if (str.equals("deleteAllCookies")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1989049945:
                if (str.equals("getCookies")) {
                    c10 = 5;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                deleteCookie((String) jVar2.a("url"), (String) jVar2.a(MediationMetaData.KEY_NAME), (String) jVar2.a("domain"), (String) jVar2.a("path"), dVar);
                return;
            case 1:
                removeSessionCookies(dVar2);
                return;
            case 2:
                String str2 = (String) jVar2.a("url");
                String str3 = (String) jVar2.a(MediationMetaData.KEY_NAME);
                String str4 = (String) jVar2.a("value");
                String str5 = (String) jVar2.a("domain");
                String str6 = (String) jVar2.a("path");
                String str7 = (String) jVar2.a("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) jVar2.a("maxAge"), (Boolean) jVar2.a("isSecure"), (Boolean) jVar2.a("isHttpOnly"), (String) jVar2.a("sameSite"), dVar);
                return;
            case 3:
                deleteCookies((String) jVar2.a("url"), (String) jVar2.a("domain"), (String) jVar2.a("path"), dVar2);
                return;
            case 4:
                deleteAllCookies(dVar2);
                return;
            case 5:
                dVar2.success(getCookies((String) jVar2.a("url")));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void removeSessionCookies(final k.d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
        } else if (Build.VERSION.SDK_INT >= 21) {
            cookieManager2.removeSessionCookies(new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                    dVar.success(bool);
                }
            });
            cookieManager.flush();
        } else {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin != null) {
                CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                createInstance.startSync();
                cookieManager.removeSessionCookie();
                createInstance.stopSync();
                createInstance.sync();
                dVar.success(Boolean.TRUE);
                return;
            }
            cookieManager2.removeSessionCookie();
            dVar.success(Boolean.TRUE);
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l10, Integer num, Boolean bool, Boolean bool2, String str6, final k.d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 == null) {
            dVar.success(Boolean.FALSE);
            return;
        }
        String str7 = str2 + "=" + str3 + "; Path=" + str5;
        if (str4 != null) {
            str7 = str7 + "; Domain=" + str4;
        }
        if (l10 != null) {
            str7 = str7 + "; Expires=" + getCookieExpirationDate(l10);
        }
        if (num != null) {
            str7 = str7 + "; Max-Age=" + num.toString();
        }
        if (bool != null && bool.booleanValue()) {
            str7 = str7 + "; Secure";
        }
        if (bool2 != null && bool2.booleanValue()) {
            str7 = str7 + "; HttpOnly";
        }
        if (str6 != null) {
            str7 = str7 + "; SameSite=" + str6;
        }
        String str8 = str7 + ";";
        if (Build.VERSION.SDK_INT >= 21) {
            cookieManager.setCookie(str, str8, new ValueCallback<Boolean>() {
                public void onReceiveValue(Boolean bool) {
                    dVar.success(bool);
                }
            });
            cookieManager.flush();
            return;
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
            createInstance.startSync();
            cookieManager.setCookie(str, str8);
            createInstance.stopSync();
            createInstance.sync();
            dVar.success(Boolean.TRUE);
            return;
        }
        cookieManager.setCookie(str, str8);
        dVar.success(Boolean.TRUE);
    }
}
