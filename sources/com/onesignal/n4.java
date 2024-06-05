package com.onesignal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import com.applovin.sdk.AppLovinEventParameters;
import com.onesignal.k3;
import com.onesignal.v3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: TrackGooglePurchase */
class n4 {
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static int f28060i = -99;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static Class<?> f28061j;

    /* renamed from: a  reason: collision with root package name */
    private ServiceConnection f28062a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Object f28063b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Method f28064c;

    /* renamed from: d  reason: collision with root package name */
    private Method f28065d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Context f28066e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<String> f28067f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f28068g = true;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f28069h;

    /* compiled from: TrackGooglePurchase */
    class a implements ServiceConnection {
        a() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                Method h10 = n4.q(Class.forName("com.android.vending.billing.IInAppBillingService$Stub"));
                h10.setAccessible(true);
                Object unused = n4.this.f28063b = h10.invoke((Object) null, new Object[]{iBinder});
                n4.this.b();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            int unused = n4.f28060i = -99;
            Object unused2 = n4.this.f28063b = null;
        }
    }

    /* compiled from: TrackGooglePurchase */
    class b implements Runnable {
        b() {
        }

        public void run() {
            boolean unused = n4.this.f28069h = true;
            try {
                if (n4.this.f28064c == null) {
                    Method unused2 = n4.this.f28064c = n4.r(n4.f28061j);
                    n4.this.f28064c.setAccessible(true);
                }
                Bundle bundle = (Bundle) n4.this.f28064c.invoke(n4.this.f28063b, new Object[]{3, n4.this.f28066e.getPackageName(), "inapp", null});
                if (bundle.getInt("RESPONSE_CODE") == 0) {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    for (int i10 = 0; i10 < stringArrayList2.size(); i10++) {
                        String str = stringArrayList.get(i10);
                        String string = new JSONObject(stringArrayList2.get(i10)).getString("purchaseToken");
                        if (!n4.this.f28067f.contains(string) && !arrayList2.contains(string)) {
                            arrayList2.add(string);
                            arrayList.add(str);
                        }
                    }
                    if (arrayList.size() > 0) {
                        n4.this.t(arrayList, arrayList2);
                    } else if (stringArrayList2.size() == 0) {
                        boolean unused3 = n4.this.f28068g = false;
                        t3.j("GTPlayerPurchases", "ExistingPurchases", false);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            boolean unused4 = n4.this.f28069h = false;
        }
    }

    /* compiled from: TrackGooglePurchase */
    class c extends v3.g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f28072a;

        c(ArrayList arrayList) {
            this.f28072a = arrayList;
        }

        public void b(String str) {
            n4.this.f28067f.addAll(this.f28072a);
            t3.m("GTPlayerPurchases", "purchaseTokens", n4.this.f28067f.toString());
            t3.j("GTPlayerPurchases", "ExistingPurchases", true);
            boolean unused = n4.this.f28068g = false;
            boolean unused2 = n4.this.f28069h = false;
        }
    }

    n4(Context context) {
        boolean z10 = false;
        this.f28069h = false;
        this.f28066e = context;
        this.f28067f = new ArrayList<>();
        try {
            JSONArray jSONArray = new JSONArray(t3.f("GTPlayerPurchases", "purchaseTokens", "[]"));
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                this.f28067f.add(jSONArray.get(i10).toString());
            }
            z10 = jSONArray.length() == 0 ? true : z10;
            this.f28068g = z10;
            if (z10) {
                this.f28068g = t3.b("GTPlayerPurchases", "ExistingPurchases", true);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        u();
    }

    static boolean a(Context context) {
        if (f28060i == -99) {
            f28060i = context.checkCallingOrSelfPermission("com.android.vending.BILLING");
        }
        try {
            if (f28060i == 0) {
                f28061j = Class.forName("com.android.vending.billing.IInAppBillingService");
            }
            if (f28060i == 0) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            f28060i = 0;
            return false;
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        if (!this.f28069h) {
            new Thread(new b()).start();
        }
    }

    /* access modifiers changed from: private */
    public static Method q(Class cls) {
        for (Method method : cls.getMethods()) {
            Class<IBinder>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == IBinder.class) {
                return method;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static Method r(Class cls) {
        Class<String> cls2 = String.class;
        for (Method method : cls.getMethods()) {
            Class<String>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls2 && parameterTypes[2] == cls2 && parameterTypes[3] == cls2) {
                return method;
            }
        }
        return null;
    }

    private static Method s(Class cls) {
        Class<String> cls2 = String.class;
        for (Method method : cls.getMethods()) {
            Class<Bundle>[] parameterTypes = method.getParameterTypes();
            Class<?> returnType = method.getReturnType();
            if (parameterTypes.length == 4 && parameterTypes[0] == Integer.TYPE && parameterTypes[1] == cls2 && parameterTypes[2] == cls2 && parameterTypes[3] == Bundle.class && returnType == Bundle.class) {
                return method;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public void t(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        try {
            if (this.f28065d == null) {
                Method s10 = s(f28061j);
                this.f28065d = s10;
                s10.setAccessible(true);
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Bundle bundle2 = (Bundle) this.f28065d.invoke(this.f28063b, new Object[]{3, this.f28066e.getPackageName(), "inapp", bundle});
            if (bundle2.getInt("RESPONSE_CODE") == 0) {
                ArrayList<String> stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                HashMap hashMap = new HashMap();
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject = new JSONObject(it.next());
                    String string = jSONObject.getString(InAppPurchaseMetaData.KEY_PRODUCT_ID);
                    BigDecimal divide = new BigDecimal(jSONObject.getString("price_amount_micros")).divide(new BigDecimal(1000000));
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(AppLovinEventParameters.PRODUCT_IDENTIFIER, string);
                    jSONObject2.put("iso", jSONObject.getString("price_currency_code"));
                    jSONObject2.put(AppLovinEventParameters.REVENUE_AMOUNT, divide.toString());
                    hashMap.put(string, jSONObject2);
                }
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    if (hashMap.containsKey(next)) {
                        jSONArray.put(hashMap.get(next));
                    }
                }
                if (jSONArray.length() > 0) {
                    k3.i2(jSONArray, this.f28068g, new c(arrayList2));
                }
            }
        } catch (Throwable th) {
            k3.b(k3.r0.WARN, "Failed to track IAP purchases", th);
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        if (this.f28062a == null) {
            this.f28062a = new a();
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            this.f28066e.bindService(intent, this.f28062a, 1);
        } else if (this.f28063b != null) {
            b();
        }
    }
}
