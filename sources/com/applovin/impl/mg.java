package com.applovin.impl;

import android.content.Context;
import android.util.Log;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sm;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mg {

    /* renamed from: a  reason: collision with root package name */
    private final k f9799a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f9800b = k.k();

    /* renamed from: c  reason: collision with root package name */
    private String f9801c;

    public mg(k kVar) {
        this.f9799a = kVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.f9801c == null) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.f9800b.getResources().openRawResource(R.raw.omsdk_v1_4_12)));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            this.f9801c = sb2.toString();
                            try {
                                bufferedReader.close();
                                return;
                            } catch (IOException e10) {
                                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e10);
                                return;
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e11) {
                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e11);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                this.f9799a.L();
                if (t.a()) {
                    this.f9799a.L().a("OpenMeasurementService", "Failed to retrieve resource omsdk_v1_4_12.js", th2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        long currentTimeMillis = System.currentTimeMillis();
        Omid.activate(this.f9800b);
        this.f9799a.L();
        if (t.a()) {
            t L = this.f9799a.L();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Init ");
            sb2.append(d() ? "succeeded" : "failed");
            sb2.append(" and took ");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append("ms");
            L.a("OpenMeasurementService", sb2.toString());
        }
        h();
    }

    private void h() {
        this.f9799a.l0().a((xl) new kn(this.f9799a, "OpenMeasurementService", new ez(this)), sm.b.OTHER);
    }

    public String a() {
        return this.f9801c;
    }

    public Partner b() {
        return Partner.createPartner((String) this.f9799a.a(oj.f10296f0), AppLovinSdk.VERSION);
    }

    public String c() {
        return Omid.getVersion();
    }

    public boolean d() {
        return Omid.isActive();
    }

    public boolean e() {
        String str = this.f9799a.g0().getExtraParameters().get("enable_omsdk_testing");
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }

    public void i() {
        if (((Boolean) this.f9799a.a(oj.f10288e0)).booleanValue()) {
            this.f9799a.L();
            if (t.a()) {
                t L = this.f9799a.L();
                L.a("OpenMeasurementService", "Initializing Open Measurement SDK v" + c() + "...");
            }
            AppLovinSdkUtils.runOnUiThread(new fz(this));
        }
    }

    public String a(String str) {
        String str2;
        try {
            if (e()) {
                String a10 = ng.a(this.f9799a);
                if (StringUtils.isValidString(a10)) {
                    str2 = ScriptInjector.injectScriptContentIntoHtml(a10, str);
                    return ScriptInjector.injectScriptContentIntoHtml(this.f9801c, str2);
                }
            }
            str2 = str;
            return ScriptInjector.injectScriptContentIntoHtml(this.f9801c, str2);
        } catch (Throwable th) {
            this.f9799a.L();
            if (t.a()) {
                this.f9799a.L().a("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }
}
