package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.p;
import com.applovin.impl.sdk.t;
import com.applovin.impl.xl;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends xl {

    /* renamed from: h  reason: collision with root package name */
    private final b f11927h;

    /* renamed from: i  reason: collision with root package name */
    private final t f11928i;

    /* renamed from: j  reason: collision with root package name */
    private AtomicBoolean f11929j = new AtomicBoolean();

    /* renamed from: k  reason: collision with root package name */
    private boolean f11930k = false;

    c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.f11927h = bVar;
        this.f11928i = kVar.L();
    }

    public List a(int i10) {
        ArrayList arrayList = new ArrayList();
        p D = this.f13421a.D();
        if (!D.b("persistent_postback_cache.json", k.k())) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File a10 = D.a("persistent_postback_cache.json", k.k());
        String e10 = D.e(a10);
        if (TextUtils.isEmpty(e10)) {
            t.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z10 = false;
        try {
            JSONArray jSONArray = new JSONObject(e10).getJSONArray("pb");
            if (t.a()) {
                t tVar = this.f11928i;
                tVar.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f13421a.a(oj.V2);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                d dVar = new d(jSONArray.getJSONObject(i11), this.f13421a);
                if (dVar.c() < num.intValue()) {
                    arrayList.add(dVar);
                } else {
                    t.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                }
            }
            if (t.a()) {
                t tVar2 = this.f11928i;
                tVar2.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th) {
            try {
                t.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th);
                this.f13421a.B().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th);
                if (((Boolean) this.f13421a.a(oj.f10313h1)).booleanValue()) {
                    D.a(a10, "removeAfterDeserializationFail");
                }
            } catch (Throwable th2) {
                th = th2;
                z10 = true;
                D.a(a10, "removeAfterDeserializationFail");
                throw th;
            }
        }
        this.f11930k = arrayList.isEmpty();
        return arrayList;
    }

    public void run() {
        a(this.f11927h.d());
    }

    private void a(List list) {
        if ((!this.f11930k || !list.isEmpty()) && this.f11929j.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th) {
                    t.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th);
                    this.f13421a.B().a("PersistentPostbackQueueSaveTask", "serializePostback", th);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                p D = this.f13421a.D();
                if (D.a((InputStream) byteArrayInputStream, D.a("persistent_postback_cache.json", k.k()), true)) {
                    if (t.a()) {
                        this.f11928i.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (t.a()) {
                    this.f11928i.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th2) {
                t.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th2);
                this.f13421a.B().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th2);
            }
            this.f11929j.set(false);
        }
    }
}
