package com.startapp;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import com.startapp.sdk.omsdk.VerificationDetails;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import s9.c;

/* compiled from: Sta */
public class b6 {

    /* renamed from: a  reason: collision with root package name */
    public final o f15654a;

    /* renamed from: b  reason: collision with root package name */
    public final l f15655b;

    /* renamed from: c  reason: collision with root package name */
    public final a5 f15656c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicBoolean f15657d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f15658e = new AtomicBoolean();

    public b6(WebView webView) {
        o b10 = r.b(webView);
        this.f15654a = b10;
        webView.getContext();
        this.f15655b = r.a(b10);
        this.f15656c = null;
    }

    public void a() {
        o oVar = this.f15654a;
        if (oVar != null) {
            eb ebVar = (eb) oVar;
            if (!ebVar.f15797g) {
                ebVar.f15794d.clear();
                if (!ebVar.f15797g) {
                    ebVar.f15793c.clear();
                }
                ebVar.f15797g = true;
                ec.f15801a.a(ebVar.f15795e.c(), "finishSession", new Object[0]);
                cb cbVar = cb.f15708c;
                boolean b10 = cbVar.b();
                cbVar.f15709a.remove(ebVar);
                cbVar.f15710b.remove(ebVar);
                if (b10 && !cbVar.b()) {
                    kc a10 = kc.a();
                    a10.getClass();
                    w8 w8Var = w8.f17503h;
                    w8Var.getClass();
                    Handler handler = w8.f17505j;
                    if (handler != null) {
                        handler.removeCallbacks(w8.f17507l);
                        w8.f17505j = null;
                    }
                    w8Var.f17508a.clear();
                    w8.f17504i.post(new x8(w8Var));
                    nb nbVar = nb.f16187d;
                    nbVar.f16188a = false;
                    nbVar.f16189b = false;
                    nbVar.f16190c = null;
                    cc ccVar = a10.f16073d;
                    ccVar.f15711a.getContentResolver().unregisterContentObserver(ccVar);
                }
                ebVar.f15795e.b();
                ebVar.f15795e = null;
            }
        }
    }

    public void b() {
        if (this.f15655b != null && this.f15657d.compareAndSet(false, true)) {
            l lVar = this.f15655b;
            fc.b(lVar.f16075a);
            fc.c(lVar.f16075a);
            if (!lVar.f16075a.c()) {
                try {
                    lVar.f16075a.a();
                } catch (Exception unused) {
                }
            }
            if (lVar.f16075a.c()) {
                eb ebVar = lVar.f16075a;
                if (!ebVar.f15799i) {
                    ec.f15801a.a(ebVar.f15795e.c(), "publishImpressionEvent", new Object[0]);
                    ebVar.f15799i = true;
                    return;
                }
                throw new IllegalStateException("Impression event can only be sent once");
            }
        }
    }

    public boolean c() {
        return this.f15654a != null;
    }

    public void d() {
        if (this.f15655b != null && this.f15658e.compareAndSet(false, true)) {
            l lVar = this.f15655b;
            fc.a(lVar.f16075a);
            fc.c(lVar.f16075a);
            eb ebVar = lVar.f16075a;
            if (!ebVar.f15800j) {
                ec.f15801a.a(ebVar.f15795e.c(), "publishLoadedEvent", new Object[0]);
                ebVar.f15800j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public void e() {
        o oVar = this.f15654a;
        if (oVar != null) {
            oVar.a();
        }
    }

    public b6(Context context, List<VerificationDetails> list, boolean z10) {
        o b10 = r.b(context, list, z10);
        this.f15654a = b10;
        this.f15655b = r.a(b10);
        this.f15656c = z10 ? r.b(b10) : null;
    }

    public void a(View view) {
        o oVar = this.f15654a;
        if (oVar != null) {
            eb ebVar = (eb) oVar;
            if (!ebVar.f15797g) {
                fc.a((Object) view, "AdView is null");
                if (ebVar.b() != view) {
                    ebVar.f15794d = new kb(view);
                    ebVar.f15795e.a();
                    Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(cb.f15708c.f15709a);
                    if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
                        for (T t10 : unmodifiableCollection) {
                            if (t10 != ebVar && t10.b() == view) {
                                t10.f15794d.clear();
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(View view, c cVar, String str) {
        ub ubVar;
        o oVar = this.f15654a;
        if (oVar != null) {
            eb ebVar = (eb) oVar;
            if (!ebVar.f15797g) {
                if (view != null) {
                    Iterator<ub> it = ebVar.f15793c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            ubVar = null;
                            break;
                        }
                        ubVar = it.next();
                        if (ubVar.f17381a.get() == view) {
                            break;
                        }
                    }
                    if (ubVar == null) {
                        ebVar.f15793c.add(new ub(view, cVar, (String) null));
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FriendlyObstruction is null");
            }
        }
    }
}
