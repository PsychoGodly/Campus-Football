package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.impl.fe;
import com.applovin.impl.he;
import com.applovin.impl.r;
import com.applovin.impl.sdk.k;
import com.applovin.impl.zb;
import com.applovin.mediation.MaxDebuggerMultiAdActivity;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.R;

public abstract class ge extends ne {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public he f8011a;

    /* renamed from: b  reason: collision with root package name */
    private ListView f8012b;

    class a implements zb.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ fe f8013a;

        /* renamed from: com.applovin.impl.ge$a$a  reason: collision with other inner class name */
        class C0120a implements r.b {
            C0120a() {
            }

            public void a(MaxDebuggerMultiAdActivity maxDebuggerMultiAdActivity) {
                maxDebuggerMultiAdActivity.initialize(a.this.f8013a);
            }
        }

        a(fe feVar) {
            this.f8013a = feVar;
        }

        public void a(hb hbVar, yb ybVar) {
            if (hbVar.b() == he.a.TEST_ADS.ordinal()) {
                k o10 = this.f8013a.o();
                fe.b x10 = this.f8013a.x();
                if (!ge.this.f8011a.a(hbVar)) {
                    zp.a(ybVar.c(), ybVar.b(), (Context) ge.this);
                } else if (fe.b.READY == x10) {
                    r.a(ge.this, MaxDebuggerMultiAdActivity.class, o10.e(), new C0120a());
                } else if (fe.b.DISABLED == x10) {
                    o10.n0().a();
                    zp.a(ybVar.c(), ybVar.b(), (Context) ge.this);
                } else {
                    zp.a(ybVar.c(), ybVar.b(), (Context) ge.this);
                }
            } else {
                zp.a(ybVar.c(), ybVar.b(), (Context) ge.this);
            }
        }
    }

    public ge() {
        this.communicatorTopics.add("adapter_initialization_status");
        this.communicatorTopics.add("network_sdk_version_updated");
    }

    /* access modifiers changed from: protected */
    public k getSdk() {
        he heVar = this.f8011a;
        if (heVar != null) {
            return heVar.h().o();
        }
        return null;
    }

    public void initialize(fe feVar) {
        setTitle(feVar.g());
        he heVar = new he(feVar, this);
        this.f8011a = heVar;
        heVar.a((zb.a) new a(feVar));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        ListView listView = (ListView) findViewById(R.id.listView);
        this.f8012b = listView;
        listView.setAdapter(this.f8011a);
    }

    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if (this.f8011a.h().b().equals(appLovinCommunicatorMessage.getMessageData().getString("adapter_class", MaxReward.DEFAULT_LABEL))) {
            this.f8011a.k();
            this.f8011a.c();
        }
    }
}
