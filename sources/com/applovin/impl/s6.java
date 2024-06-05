package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.R;

public abstract class s6 extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private u6 f11301a;

    /* renamed from: b  reason: collision with root package name */
    private k f11302b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f11303c;

    /* renamed from: d  reason: collision with root package name */
    private Button f11304d;

    private void b() {
        lc lcVar = new lc();
        lcVar.a(this.f11302b.v().a(this.f11301a));
        String b10 = this.f11302b.v().b(this.f11301a.a());
        if (b10 != null) {
            lcVar.a("\nBid Response Preview:\n");
            lcVar.a(b10);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f11303c = textView;
        textView.setText(lcVar.toString());
        this.f11303c.setTextColor(-16777216);
    }

    public void a(u6 u6Var, k kVar) {
        this.f11301a = u6Var;
        this.f11302b = kVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f11301a.c() + " - " + this.f11301a.d());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f11304d = button;
        button.setOnClickListener(new p40(this));
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        } else if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.f11302b.v().a(this.f11301a, (Context) this, false);
            return true;
        }
    }

    private boolean a() {
        return (this.f11301a == null || this.f11302b == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f11302b.v().a(this.f11301a, (Context) this, true);
    }
}
