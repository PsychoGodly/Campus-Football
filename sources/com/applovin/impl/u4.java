package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.r;
import com.applovin.impl.v4;
import com.applovin.impl.zb;
import com.applovin.sdk.R;

public abstract class u4 extends Activity {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public v4 f12516a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f12517b;

    /* renamed from: c  reason: collision with root package name */
    private ListView f12518c;

    class a implements zb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f12519a;

        /* renamed from: com.applovin.impl.u4$a$a  reason: collision with other inner class name */
        class C0141a implements r.b {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ hb f12521a;

            C0141a(hb hbVar) {
                this.f12521a = hbVar;
            }

            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((u6) u4.this.f12516a.d().get(this.f12521a.a()), u4.this.f12516a.e());
            }
        }

        a(q qVar) {
            this.f12519a = qVar;
        }

        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == v4.a.RECENT_ADS.ordinal()) {
                r.a(u4.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f12519a, new C0141a(hbVar));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f12517b = (FrameLayout) findViewById(16908290);
        this.f12518c = (ListView) findViewById(R.id.listView);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        v4 v4Var = this.f12516a;
        if (v4Var != null) {
            v4Var.a((zb.a) null);
            this.f12516a.g();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        v4 v4Var = this.f12516a;
        if (v4Var == null) {
            finish();
            return;
        }
        this.f12518c.setAdapter(v4Var);
        v4 v4Var2 = this.f12516a;
        if (v4Var2 == null || v4Var2.e().v().g()) {
            v4 v4Var3 = this.f12516a;
            if (v4Var3 != null && v4Var3.f()) {
                a(R.string.applovin_creative_debugger_no_ads_text);
                return;
            }
            return;
        }
        a(R.string.applovin_creative_debugger_disabled_text);
    }

    public void a(v4 v4Var, q qVar) {
        this.f12516a = v4Var;
        v4Var.a((zb.a) new a(qVar));
    }

    private void a(int i10) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i10);
        this.f12517b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f12517b.bringChildToFront(textView);
    }
}
