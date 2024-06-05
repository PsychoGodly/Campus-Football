package z7;

import a7.a;
import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.p;
import b8.b;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import e7.c;
import e7.e;
import e7.f0;
import e7.r;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import l8.i;
import org.json.JSONArray;
import org.json.JSONObject;
import z7.j;

/* compiled from: DefaultHeartBeatController */
public class f implements i, j {

    /* renamed from: a  reason: collision with root package name */
    private final b<k> f31438a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f31439b;

    /* renamed from: c  reason: collision with root package name */
    private final b<i> f31440c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<g> f31441d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f31442e;

    private f(Context context, String str, Set<g> set, b<i> bVar, Executor executor) {
        this((b<k>) new b(context, str), set, executor, bVar, context);
    }

    public static c<f> g() {
        f0<Executor> a10 = f0.a(a.class, Executor.class);
        return c.f(f.class, i.class, j.class).b(r.k(Context.class)).b(r.k(y6.f.class)).b(r.m(g.class)).b(r.l(i.class)).b(r.j(a10)).f(new c(a10)).d();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ f h(f0 f0Var, e eVar) {
        return new f((Context) eVar.a(Context.class), ((y6.f) eVar.a(y6.f.class)).s(), eVar.g(g.class), eVar.c(i.class), (Executor) eVar.f(f0Var));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String i() throws Exception {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            k kVar = this.f31438a.get();
            List<l> c10 = kVar.c();
            kVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < c10.size(); i10++) {
                l lVar = c10.get(i10);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", lVar.c());
                jSONObject.put("dates", new JSONArray(lVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", CommonGetHeaderBiddingToken.HB_TOKEN_VERSION);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ k j(Context context, String str) {
        return new k(context, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void k() throws Exception {
        synchronized (this) {
            this.f31438a.get().k(System.currentTimeMillis(), this.f31440c.get().a());
        }
        return null;
    }

    public Task<String> a() {
        if (!p.a(this.f31439b)) {
            return Tasks.forResult(MaxReward.DEFAULT_LABEL);
        }
        return Tasks.call(this.f31442e, new e(this));
    }

    public synchronized j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = this.f31438a.get();
        if (kVar.i(currentTimeMillis)) {
            kVar.g();
            return j.a.GLOBAL;
        }
        return j.a.NONE;
    }

    public Task<Void> l() {
        if (this.f31441d.size() <= 0) {
            return Tasks.forResult(null);
        }
        if (!p.a(this.f31439b)) {
            return Tasks.forResult(null);
        }
        return Tasks.call(this.f31442e, new d(this));
    }

    f(b<k> bVar, Set<g> set, Executor executor, b<i> bVar2, Context context) {
        this.f31438a = bVar;
        this.f31441d = set;
        this.f31442e = executor;
        this.f31440c = bVar2;
        this.f31439b = context;
    }
}
