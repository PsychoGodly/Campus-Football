package com.startapp;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.ads.AdSDKNotificationListener;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.consent.ConsentActivity;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.consent.ConsentTypeInfoConfig;
import com.startapp.sdk.adsbase.e;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.adsbase.remoteconfig.c;
import com.startapp.sdk.components.ComponentLocator;

/* compiled from: Sta */
public final class u1 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Context f17355a;

    /* renamed from: b  reason: collision with root package name */
    public final e f17356b;

    /* renamed from: c  reason: collision with root package name */
    public Intent f17357c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f17358d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17359e = true;

    public u1(Context context, e eVar) {
        this.f17355a = context;
        this.f17356b = eVar;
    }

    public void a(Integer num, Long l10, Boolean bool, boolean z10, boolean z11) {
        if (d()) {
            long j10 = this.f17356b.getLong("consentTimestamp", 0);
            int i10 = this.f17356b.getInt("consentType", -1);
            boolean contains = this.f17356b.contains("consentApc");
            boolean z12 = true;
            boolean z13 = (num == null || i10 == num.intValue()) ? false : true;
            boolean z14 = bool != null && (!contains || this.f17356b.getBoolean("consentApc", false) != bool.booleanValue());
            if (l10 == null || l10.longValue() <= j10) {
                z12 = false;
            }
            if (!z10 && !z12) {
                return;
            }
            if (z13 || z14) {
                e.a a10 = this.f17356b.edit();
                if (z13) {
                    int intValue = num.intValue();
                    a10.a("consentType", Integer.valueOf(intValue));
                    a10.f17013a.putInt("consentType", intValue);
                }
                if (z14) {
                    boolean booleanValue = bool.booleanValue();
                    a10.a("consentApc", Boolean.valueOf(booleanValue));
                    a10.f17013a.putBoolean("consentApc", booleanValue);
                }
                if (z12) {
                    long longValue = l10.longValue();
                    a10.a("consentTimestamp", Long.valueOf(longValue));
                    a10.f17013a.putLong("consentTimestamp", longValue);
                }
                a10.apply();
                if (z11) {
                    MetaData.f17070k.a(this.f17355a, new AdPreferences(), MetaDataRequest.RequestReason.CONSENT, false, (c) null, true);
                }
            }
        }
    }

    public Integer b() {
        if (d()) {
            int hashCode = ComponentLocator.a(this.f17355a).a().a().f17341a.hashCode();
            if (!this.f17356b.contains("advIdHash") || this.f17356b.getInt("advIdHash", 0) != hashCode) {
                e.a a10 = this.f17356b.edit().remove("consentType").remove("consentTimestamp");
                a10.a("advIdHash", Integer.valueOf(hashCode));
                a10.f17013a.putInt("advIdHash", hashCode);
                a10.apply();
            }
        }
        if (!d() || !this.f17356b.contains("consentType")) {
            return null;
        }
        return Integer.valueOf(this.f17356b.getInt("consentType", -1));
    }

    public boolean c() {
        Boolean a10 = a();
        return a10 != null && a10.booleanValue();
    }

    public final boolean d() {
        ConsentConfig o10 = MetaData.f17070k.o();
        return this.f17359e && o10 != null && o10.k();
    }

    public Boolean a() {
        if (!d() || !this.f17356b.contains("consentApc")) {
            return null;
        }
        return Boolean.valueOf(this.f17356b.getBoolean("consentApc", false));
    }

    public final void a(boolean z10, String str, String str2, String str3) {
        ConsentConfig o10;
        String str4;
        int i10;
        int i11;
        Integer b10;
        if ((!z10 && !StartAppSDKInternal.c()) || (o10 = MetaData.f17070k.o()) == null) {
            return;
        }
        if ((!d() && !z10) || this.f17358d || !j9.g(this.f17355a) || !j9.e(this.f17355a)) {
            return;
        }
        if (z10 || !(o10.h() == null || o10.g() == null || this.f17356b.contains("consentApc"))) {
            if (z10) {
                str4 = AdInformationMetaData.f16857a.a().c();
            } else {
                str4 = o10.f();
            }
            if (str4 != null) {
                Intent intent = new Intent(this.f17355a, ConsentActivity.class);
                intent.setFlags(805306368);
                intent.setData(Uri.parse(str4));
                intent.putExtra("allowCT", o10.k());
                intent.putExtra("timestamp", o10.i());
                if (z10) {
                    i10 = 4;
                } else {
                    i10 = o10.h().intValue();
                }
                Integer valueOf = Integer.valueOf(i10);
                if (valueOf != null) {
                    intent.putExtra("templateName", valueOf);
                }
                if (z10) {
                    i11 = 7;
                } else {
                    i11 = o10.g().intValue();
                }
                Integer valueOf2 = Integer.valueOf(i11);
                if (valueOf2 != null) {
                    intent.putExtra("templateId", valueOf2);
                }
                if (!z10) {
                    str = o10.d();
                }
                if (str != null) {
                    intent.putExtra("dParam", str);
                }
                if (!z10) {
                    str2 = o10.e();
                }
                if (str2 != null) {
                    intent.putExtra("impressionUrl", str2);
                }
                if (!z10) {
                    str3 = o10.a();
                }
                if (str3 != null) {
                    intent.putExtra("clickUrl", str3);
                }
                if (z10) {
                    intent.putExtra("advertisingId", ComponentLocator.a(this.f17355a).a().a().f17341a);
                    if (this.f17356b.contains("consentType")) {
                        intent.putExtra("consentType", this.f17356b.getInt("consentType", -1));
                    }
                }
                ConsentTypeInfoConfig c10 = o10.c();
                if (c10 != null) {
                    if (c10.b() != null) {
                        intent.putExtra(AdSDKNotificationListener.IMPRESSION_EVENT, c10.b());
                    }
                    if (c10.a() != null) {
                        intent.putExtra("falseClick", c10.a());
                    }
                    if (c10.c() != null) {
                        intent.putExtra("trueClick", c10.c());
                    }
                }
                if (z10 && (b10 = AdInformationMetaData.f16857a.a().b()) != null) {
                    intent.putExtra("trueClick", b10);
                }
                try {
                    this.f17355a.startActivity(intent);
                    this.f17358d = true;
                } catch (ActivityNotFoundException unused) {
                } catch (Throwable th) {
                    i3.a(th);
                }
            }
        }
    }

    public void a(MetaDataRequest.RequestReason requestReason) {
        MetaData.f17070k.a((c) this);
    }

    public void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
        MetaData.f17070k.a((c) this);
        ConsentConfig o10 = MetaData.f17070k.o();
        if (o10 != null && d()) {
            Integer b10 = o10.b();
            if (b10 != null) {
                a(b10, Long.valueOf(o10.i()), (Boolean) null, false, false);
            }
            if (requestReason == MetaDataRequest.RequestReason.CONSENT) {
                e.a a10 = this.f17356b.edit();
                long i10 = o10.i();
                a10.a("consentTimestamp", Long.valueOf(i10));
                a10.f17013a.putLong("consentTimestamp", i10);
                a10.apply();
            } else if (requestReason == MetaDataRequest.RequestReason.LAUNCH) {
                a(false, (String) null, (String) null, (String) null);
            }
        }
    }
}
