package ea;

import android.text.TextUtils;
import ea.b;
import java.util.HashSet;
import org.json.JSONObject;
import x9.o;
import z9.c;

public class f extends a {
    public f(b.C0300b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(bVar, hashSet, jSONObject, j10);
    }

    private void e(String str) {
        c e10 = c.e();
        if (e10 != null) {
            for (o next : e10.c()) {
                if (this.f28832c.contains(next.o())) {
                    next.p().m(str, this.f28834e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            e(str);
        }
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String doInBackground(Object... objArr) {
        if (ca.c.u(this.f28833d, this.f28836b.a())) {
            return null;
        }
        this.f28836b.a(this.f28833d);
        return this.f28833d.toString();
    }
}
