package com.startapp.sdk.adsbase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import com.applovin.mediation.MaxReward;
import com.startapp.a0;
import com.startapp.h0;
import com.startapp.i3;
import com.startapp.j9;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.common.Constants;
import com.startapp.sdk.common.utils.Pair;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.w7;
import com.startapp.x7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: Sta */
public class SimpleTokenUtils {

    /* renamed from: a  reason: collision with root package name */
    public static List<PackageInfo> f16784a = null;

    /* renamed from: b  reason: collision with root package name */
    public static List<PackageInfo> f16785b = null;

    /* renamed from: c  reason: collision with root package name */
    public static long f16786c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static volatile Pair<TokenType, String> f16787d = null;

    /* renamed from: e  reason: collision with root package name */
    public static volatile Pair<TokenType, String> f16788e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f16789f = true;

    /* renamed from: g  reason: collision with root package name */
    public static boolean f16790g = false;

    /* renamed from: h  reason: collision with root package name */
    public static TokenType f16791h = TokenType.UNDEFINED;

    /* compiled from: Sta */
    public enum TokenType {
        T1("token"),
        T2("token2"),
        UNDEFINED(MaxReward.DEFAULT_LABEL);
        
        private final String text;

        /* access modifiers changed from: public */
        TokenType(String str) {
            this.text = str;
        }

        public static TokenType a(String str) {
            TokenType tokenType = T1;
            if (tokenType.text.equals(str)) {
                return tokenType;
            }
            TokenType tokenType2 = T2;
            if (tokenType2.text.equals(str)) {
                return tokenType2;
            }
            return UNDEFINED;
        }

        public String toString() {
            return this.text;
        }
    }

    /* compiled from: Sta */
    public class a extends BroadcastReceiver {
        public void onReceive(Context context, Intent intent) {
            SimpleTokenUtils.f16787d = null;
            SimpleTokenUtils.f16788e = null;
            SimpleTokenUtils.f(context);
        }
    }

    /* compiled from: Sta */
    public class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16797a;

        public c(Context context) {
            this.f16797a = context;
        }

        public void run() {
            SimpleTokenUtils.e(this.f16797a);
        }
    }

    public static Pair<String, String> a() {
        if (f16787d != null) {
            return new Pair<>(((TokenType) f16787d.first).toString(), f16787d.second);
        }
        return new Pair<>(TokenType.T1.toString(), MaxReward.DEFAULT_LABEL);
    }

    public static Pair<String, String> b() {
        if (f16788e != null) {
            return new Pair<>(((TokenType) f16788e.first).toString(), f16788e.second);
        }
        return new Pair<>(TokenType.T2.toString(), MaxReward.DEFAULT_LABEL);
    }

    public static long c() {
        return f16786c;
    }

    public static void d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> v10 = MetaData.f17070k.v();
        Set<String> E = MetaData.f17070k.E();
        f16784a = new CopyOnWriteArrayList();
        f16785b = new CopyOnWriteArrayList();
        try {
            List<PackageInfo> a10 = a0.a(packageManager);
            f16786c = System.currentTimeMillis();
            PackageInfo packageInfo = null;
            for (PackageInfo next : a10) {
                if (!a0.a(next)) {
                    if (Build.VERSION.SDK_INT >= 9) {
                        long j10 = next.firstInstallTime;
                        if (j10 < f16786c && j10 >= 1291593600000L) {
                            f16786c = j10;
                        }
                    }
                    f16784a.add(next);
                    try {
                        String b10 = j9.b(context);
                        if (v10 != null && v10.contains(b10)) {
                            f16785b.add(next);
                        }
                    } catch (Throwable th) {
                        i3.a(th);
                    }
                } else if (E.contains(next.packageName)) {
                    f16784a.add(next);
                } else if (next.packageName.equals(Constants.f17126a)) {
                    packageInfo = next;
                }
            }
            f16784a = a(f16784a);
            f16785b = a(f16785b);
            if (packageInfo != null) {
                f16784a.add(0, packageInfo);
            }
        } catch (Throwable th2) {
            if (!j9.a(th2, (Class<? extends Throwable>) RemoteException.class)) {
                i3.a(th2);
            }
        }
    }

    public static void e(Context context) {
        boolean a10 = MetaData.f17070k.K().a(context);
        synchronized (SimpleTokenUtils.class) {
            if ((f16787d == null || f16788e == null) && a10) {
                try {
                    d(context);
                    f16787d = new Pair<>(TokenType.T1, w7.a(b(f16784a)));
                    f16788e = new Pair<>(TokenType.T2, w7.a(b(f16785b)));
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
        }
        return;
    }

    public static void f(Context context) {
        Context a10 = h0.a(context);
        if (a10 != null) {
            context = a10;
        }
        try {
            if ((f16787d == null || f16788e == null) && MetaData.f17070k.K().a(context)) {
                ComponentLocator.a(context).l().execute(new c(context));
            }
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    public static void c(Context context) {
        Context a10 = h0.a(context);
        if (a10 != null) {
            context = a10;
        }
        f(context);
        f16789f = true;
        f16790g = false;
        f16791h = TokenType.UNDEFINED;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        context.registerReceiver(new a(), intentFilter);
        MetaData.f17070k.a((com.startapp.sdk.adsbase.remoteconfig.c) new b(context));
    }

    public static Pair<TokenType, String> a(Context context) {
        if (f16787d == null) {
            e(context);
        }
        e.a a10 = ComponentLocator.a(context).e().edit();
        String str = (String) f16787d.second;
        a10.a("shared_prefs_simple_token", str);
        a10.f17013a.putString("shared_prefs_simple_token", str);
        a10.apply();
        f16789f = false;
        f16791h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T1, f16787d.second);
    }

    public static Pair<TokenType, String> b(Context context) {
        if (f16788e == null) {
            e(context);
        }
        e.a a10 = ComponentLocator.a(context).e().edit();
        String str = (String) f16788e.second;
        a10.a("shared_prefs_simple_token2", str);
        a10.f17013a.putString("shared_prefs_simple_token2", str);
        a10.apply();
        f16789f = false;
        f16791h = TokenType.UNDEFINED;
        return new Pair<>(TokenType.T2, f16788e.second);
    }

    /* compiled from: Sta */
    public class b implements com.startapp.sdk.adsbase.remoteconfig.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f16796a;

        public b(Context context) {
            this.f16796a = context;
        }

        public void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
            if (z10) {
                SimpleTokenUtils.f16787d = null;
                SimpleTokenUtils.f16788e = null;
                SimpleTokenUtils.f(this.f16796a);
            }
            MetaData.f17070k.a((com.startapp.sdk.adsbase.remoteconfig.c) this);
        }

        public void a(MetaDataRequest.RequestReason requestReason) {
            MetaData.f17070k.a((com.startapp.sdk.adsbase.remoteconfig.c) this);
        }
    }

    public static List<PackageInfo> a(List<PackageInfo> list) {
        if (list.size() <= 100) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        if (Build.VERSION.SDK_INT >= 9) {
            Collections.sort(arrayList, new x7());
        }
        return arrayList.subList(0, 100);
    }

    public static List<String> b(List<PackageInfo> list) {
        ArrayList arrayList = new ArrayList();
        for (PackageInfo packageInfo : list) {
            arrayList.add(packageInfo.packageName);
        }
        return arrayList;
    }
}
