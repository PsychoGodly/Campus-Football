package com.applovin.impl.sdk;

import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.text.TextUtils;
import android.view.InputEvent;
import com.applovin.impl.kn;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sm;
import com.applovin.impl.th;
import com.applovin.impl.xl;
import com.applovin.mediation.MaxReward;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONObject;

public class w {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f12082a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f12083b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f12084c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private final Object f12085d = new Object();

    /* renamed from: e  reason: collision with root package name */
    private final MeasurementManager f12086e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference f12087f = new AtomicReference(new JSONArray());

    /* renamed from: g  reason: collision with root package name */
    private final d f12088g = new d(this, (a) null);

    /* renamed from: h  reason: collision with root package name */
    private final TopicsManager f12089h;

    class a implements OutcomeReceiver {
        a() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.f12082a.L();
            if (t.a()) {
                w.this.f12082a.L().a("PrivacySandboxService", "Failed to register impression", exc);
            }
        }

        public void onResult(Object obj) {
            w.this.f12082a.L();
            if (t.a()) {
                w.this.f12082a.L().a("PrivacySandboxService", "Successfully registered impression");
            }
        }
    }

    class b implements OutcomeReceiver {
        b() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.f12082a.L();
            if (t.a()) {
                w.this.f12082a.L().a("PrivacySandboxService", "Failed to register click", exc);
            }
        }

        public void onResult(Object obj) {
            w.this.f12082a.L();
            if (t.a()) {
                w.this.f12082a.L().a("PrivacySandboxService", "Successfully registered click");
            }
        }
    }

    class c implements OutcomeReceiver {
        c() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            w.this.f12082a.L();
            if (t.a()) {
                w.this.f12082a.L().a("PrivacySandboxService", "Failed to register conversion", exc);
            }
        }

        public void onResult(Object obj) {
            w.this.f12082a.L();
            if (t.a()) {
                w.this.f12082a.L().a("PrivacySandboxService", "Successfully registered conversion");
            }
        }
    }

    private class d implements OutcomeReceiver {
        private d() {
        }

        /* renamed from: a */
        public void onResult(GetTopicsResponse getTopicsResponse) {
            List<Topic> topics = getTopicsResponse.getTopics();
            int size = topics.size();
            w.this.f12082a.L();
            if (t.a()) {
                t L = w.this.f12082a.L();
                L.d("PrivacySandboxService", size + " topic(s) received");
            }
            JSONArray jSONArray = new JSONArray();
            for (Topic topic : topics) {
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "id", topic.getTopicId());
                JsonUtils.putLong(jSONObject, "model", topic.getModelVersion());
                JsonUtils.putLong(jSONObject, "taxonomy", topic.getTaxonomyVersion());
                jSONArray.put(jSONObject);
            }
            w.this.f12087f.set(jSONArray);
            w.this.b(((Boolean) w.this.f12082a.a(oj.C6)).booleanValue(), ((Long) w.this.f12082a.a(oj.A6)).longValue());
        }

        /* synthetic */ d(w wVar, a aVar) {
            this();
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            String str;
            Long l10 = (Long) w.this.f12082a.a(oj.B6);
            boolean z10 = l10.longValue() == -1;
            w.this.f12082a.L();
            if (t.a()) {
                t L = w.this.f12082a.L();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to retrieve topics");
                if (z10) {
                    str = MaxReward.DEFAULT_LABEL;
                } else {
                    str = ", retrying in " + l10 + " ms";
                }
                sb2.append(str);
                L.a("PrivacySandboxService", sb2.toString(), exc);
            }
            if (!z10) {
                w.this.b(((Boolean) w.this.f12082a.a(oj.D6)).booleanValue(), l10.longValue());
            }
        }
    }

    protected w(k kVar) {
        this.f12082a = kVar;
        this.f12083b = kVar.l0().a();
        Context k10 = k.k();
        this.f12086e = (MeasurementManager) k10.getSystemService(MeasurementManager.class);
        this.f12089h = (TopicsManager) k10.getSystemService(TopicsManager.class);
        if (((Boolean) kVar.a(oj.f10462z6)).booleanValue()) {
            b(((Boolean) kVar.a(oj.C6)).booleanValue(), 0);
        }
    }

    private boolean c(String str) {
        synchronized (this.f12085d) {
            if (this.f12084c.contains(str)) {
                return false;
            }
            this.f12084c.add(str);
            return true;
        }
    }

    public void b(List list) {
        a("register impression", (Runnable) new t1(this, list));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list) {
        if (list != null && !list.isEmpty() && this.f12086e != null && th.e(k.B0)) {
            this.f12082a.L();
            if (t.a()) {
                this.f12082a.L().a("PrivacySandboxService", "Registering impression...");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f12086e.registerSource(Uri.parse((String) it.next()), (InputEvent) null, this.f12083b, new a());
            }
        }
    }

    public void b(List list, InputEvent inputEvent) {
        a("register click", (Runnable) new u1(this, list, inputEvent));
    }

    public void b(String str) {
        a("register conversion trigger event", (Runnable) new s1(this, str));
    }

    /* access modifiers changed from: private */
    public void b(boolean z10, long j10) {
        a("retrieve topics", (Runnable) new v1(this, z10, j10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(List list, InputEvent inputEvent) {
        if (list != null && !list.isEmpty() && this.f12086e != null && th.e(k.B0)) {
            this.f12082a.L();
            if (t.a()) {
                this.f12082a.L().a("PrivacySandboxService", "Registering click...");
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.f12086e.registerSource(Uri.parse((String) it.next()), inputEvent, this.f12083b, new b());
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        if (!TextUtils.isEmpty(str) && this.f12086e != null && th.e(k.B0)) {
            this.f12082a.L();
            if (t.a()) {
                t L = this.f12082a.L();
                L.a("PrivacySandboxService", "Registering conversion: " + str);
            }
            this.f12086e.registerTrigger(Uri.parse(str), this.f12083b, new c());
        }
    }

    public JSONArray a() {
        return (JSONArray) this.f12087f.get();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, long j10) {
        if (this.f12089h != null) {
            GetTopicsRequest build = new GetTopicsRequest.Builder().setShouldRecordObservation(z10).setAdsSdkName("AppLovin").build();
            if (j10 > 0) {
                this.f12082a.l0().a((xl) new kn(this.f12082a, true, "getTopics", new r1(this, build)), sm.b.OTHER, j10);
                return;
            }
            this.f12089h.getTopics(build, this.f12083b, this.f12088g);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(GetTopicsRequest getTopicsRequest) {
        this.f12089h.getTopics(getTopicsRequest, this.f12083b, this.f12088g);
    }

    private void a(String str, Runnable runnable) {
        try {
            this.f12082a.L();
            if (t.a()) {
                t L = this.f12082a.L();
                L.a("PrivacySandboxService", "Running operation: " + str);
            }
            runnable.run();
        } catch (Throwable th) {
            this.f12082a.L();
            if (t.a()) {
                t L2 = this.f12082a.L();
                L2.a("PrivacySandboxService", "Failed to run operation: " + str, th);
            }
            if (c(str)) {
                this.f12082a.B().a("PrivacySandboxService", str, th);
            }
        }
    }
}
