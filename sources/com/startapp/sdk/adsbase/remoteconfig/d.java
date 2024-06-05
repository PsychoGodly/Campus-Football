package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Bundle;
import com.startapp.g4;
import com.startapp.i3;
import com.startapp.o2;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.sdk.jobs.b;
import com.startapp.z5;

/* compiled from: Sta */
public class d extends b {
    public static final String LOG_TAG = d.class.getSimpleName();

    public d(Context context, b.a aVar, Bundle bundle) {
        super(context, aVar, bundle);
    }

    private void sendMetaDataRequest(Context context) {
        AdPreferences adPreferences = new AdPreferences();
        a aVar = new a(context, adPreferences, MetaDataRequest.RequestReason.PERIODIC, context, adPreferences);
        ComponentLocator a10 = ComponentLocator.a(context);
        a10.r().execute(new o2(aVar, a10));
    }

    public void run() {
        try {
            ComponentLocator.a(this.context).w().b();
            MetaData.c(this.context);
            if (MetaData.f17070k.Y()) {
                sendMetaDataRequest(this.context);
            } else {
                this.callback.a(this, false);
            }
        } catch (Throwable th) {
            i3.a(th);
        }
    }

    /* compiled from: Sta */
    public class a extends a {

        /* renamed from: l  reason: collision with root package name */
        public MetaData f17122l;

        /* renamed from: m  reason: collision with root package name */
        public final /* synthetic */ Context f17123m;

        /* renamed from: n  reason: collision with root package name */
        public final /* synthetic */ AdPreferences f17124n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, AdPreferences adPreferences, MetaDataRequest.RequestReason requestReason, Context context2, AdPreferences adPreferences2) {
            super(context, adPreferences, requestReason);
            this.f17123m = context2;
            this.f17124n = adPreferences2;
        }

        public Boolean a() {
            try {
                SimpleTokenUtils.e(this.f17123m);
                MetaDataRequest metaDataRequest = new MetaDataRequest(this.f17123m, ComponentLocator.a(this.f17123m).e(), MetaDataRequest.RequestReason.PERIODIC);
                metaDataRequest.a(this.f17123m, this.f17124n);
                z5.a a10 = a.a(this.f17123m, metaDataRequest);
                if (a10 != null) {
                    MetaData metaData = (MetaData) g4.a(a10.f17586b, MetaData.class);
                    this.f17122l = metaData;
                    return Boolean.valueOf(metaData != null);
                }
            } catch (Throwable th) {
                i3.a(th);
            }
            return Boolean.FALSE;
        }

        public void a(Boolean bool) {
            MetaData metaData;
            Context context;
            try {
                if (!(!bool.booleanValue() || (metaData = this.f17122l) == null || (context = this.f17123m) == null)) {
                    MetaData.a(context, metaData, MetaDataRequest.RequestReason.PERIODIC, this.f17118k);
                }
                d.this.callback.a(d.this, false);
            } catch (Throwable th) {
                i3.a(th);
            }
        }
    }
}
