package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.ads.internal.client.l2;
import com.google.android.gms.ads.internal.client.x;
import com.google.android.gms.dynamic.b;
import com.google.android.gms.internal.ads.zzbnc;
import n4.u;
import n4.v;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class OutOfContextTestingActivity extends Activity {
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l2 f10 = x.a().f(this, new zzbnc());
        if (f10 == null) {
            finish();
            return;
        }
        setContentView(v.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(u.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            f10.zze(stringExtra, b.B1(this), b.B1(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
