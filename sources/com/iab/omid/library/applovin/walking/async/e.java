package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.adsession.a;
import com.iab.omid.library.applovin.internal.c;
import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

public class e extends a {
    public e(b.C0288b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        c c10 = c.c();
        if (c10 != null) {
            for (a next : c10.b()) {
                if (this.f27461c.contains(next.getAdSessionId())) {
                    next.getAdSessionStatePublisher().a(str, this.f27463e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String doInBackground(Object... objArr) {
        return this.f27462d.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
