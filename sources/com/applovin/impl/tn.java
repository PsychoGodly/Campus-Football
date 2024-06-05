package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.impl.sdk.k;
import com.applovin.sdk.R;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;

public abstract class tn extends ne {

    /* renamed from: a  reason: collision with root package name */
    private k f12433a;

    /* renamed from: b  reason: collision with root package name */
    private String f12434b;

    /* renamed from: c  reason: collision with root package name */
    private String f12435c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", this.f12435c);
        intent.putExtra("android.intent.extra.TITLE", this.f12434b);
        intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, this.f12434b);
        startActivity(Intent.createChooser(intent, (CharSequence) null));
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        return this.f12433a;
    }

    public void initialize(String str, String str2, k kVar) {
        this.f12433a = kVar;
        this.f12434b = str;
        this.f12435c = str2;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f12434b);
        ((TextView) findViewById(R.id.textView)).setText(this.f12435c);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
