package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: a  reason: collision with root package name */
    private Random f721a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, String> f722b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    final Map<String, Integer> f723c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, d> f724d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    ArrayList<String> f725e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final transient Map<String, c<?>> f726f = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    final Map<String, Object> f727g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    final Bundle f728h = new Bundle();

    class a extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g.a f734b;

        a(String str, g.a aVar) {
            this.f733a = str;
            this.f734b = aVar;
        }

        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f723c.get(this.f733a);
            if (num != null) {
                ActivityResultRegistry.this.f725e.add(this.f733a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f734b, i10, cVar);
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f725e.remove(this.f733a);
                    throw e10;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f734b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            ActivityResultRegistry.this.l(this.f733a);
        }
    }

    class b extends c<I> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f736a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g.a f737b;

        b(String str, g.a aVar) {
            this.f736a = str;
            this.f737b = aVar;
        }

        public void b(I i10, androidx.core.app.c cVar) {
            Integer num = ActivityResultRegistry.this.f723c.get(this.f736a);
            if (num != null) {
                ActivityResultRegistry.this.f725e.add(this.f736a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f737b, i10, cVar);
                } catch (Exception e10) {
                    ActivityResultRegistry.this.f725e.remove(this.f736a);
                    throw e10;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f737b + " and input " + i10 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        public void c() {
            ActivityResultRegistry.this.l(this.f736a);
        }
    }

    private static class c<O> {

        /* renamed from: a  reason: collision with root package name */
        final b<O> f739a;

        /* renamed from: b  reason: collision with root package name */
        final g.a<?, O> f740b;

        c(b<O> bVar, g.a<?, O> aVar) {
            this.f739a = bVar;
            this.f740b = aVar;
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final i f741a;

        /* renamed from: b  reason: collision with root package name */
        private final ArrayList<m> f742b = new ArrayList<>();

        d(i iVar) {
            this.f741a = iVar;
        }

        /* access modifiers changed from: package-private */
        public void a(m mVar) {
            this.f741a.a(mVar);
            this.f742b.add(mVar);
        }

        /* access modifiers changed from: package-private */
        public void b() {
            Iterator<m> it = this.f742b.iterator();
            while (it.hasNext()) {
                this.f741a.d(it.next());
            }
            this.f742b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f722b.put(Integer.valueOf(i10), str);
        this.f723c.put(str, Integer.valueOf(i10));
    }

    private <O> void d(String str, int i10, Intent intent, c<O> cVar) {
        if (cVar == null || cVar.f739a == null || !this.f725e.contains(str)) {
            this.f727g.remove(str);
            this.f728h.putParcelable(str, new a(i10, intent));
            return;
        }
        cVar.f739a.a(cVar.f740b.c(i10, intent));
        this.f725e.remove(str);
    }

    private int e() {
        int nextInt = this.f721a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f722b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f721a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (this.f723c.get(str) == null) {
            a(e(), str);
        }
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = this.f722b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, this.f726f.get(str));
        return true;
    }

    public final <O> boolean c(int i10, O o10) {
        b<O> bVar;
        String str = this.f722b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        c cVar = this.f726f.get(str);
        if (cVar == null || (bVar = cVar.f739a) == null) {
            this.f728h.remove(str);
            this.f727g.put(str, o10);
            return true;
        } else if (!this.f725e.remove(str)) {
            return true;
        } else {
            bVar.a(o10);
            return true;
        }
    }

    public abstract <I, O> void f(int i10, g.a<I, O> aVar, I i11, androidx.core.app.c cVar);

    public final void g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f725e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f721a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f728h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
                    String str = stringArrayList.get(i10);
                    if (this.f723c.containsKey(str)) {
                        Integer remove = this.f723c.remove(str);
                        if (!this.f728h.containsKey(str)) {
                            this.f722b.remove(remove);
                        }
                    }
                    a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
                }
            }
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f723c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f723c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f725e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f728h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f721a);
    }

    public final <I, O> c<I> i(final String str, p pVar, final g.a<I, O> aVar, final b<O> bVar) {
        i lifecycle = pVar.getLifecycle();
        if (!lifecycle.b().c(i.b.STARTED)) {
            k(str);
            d dVar = this.f724d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new m() {
                public void onStateChanged(p pVar, i.a aVar) {
                    if (i.a.ON_START.equals(aVar)) {
                        ActivityResultRegistry.this.f726f.put(str, new c(bVar, aVar));
                        if (ActivityResultRegistry.this.f727g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f727g.get(str);
                            ActivityResultRegistry.this.f727g.remove(str);
                            bVar.a(obj);
                        }
                        a aVar2 = (a) ActivityResultRegistry.this.f728h.getParcelable(str);
                        if (aVar2 != null) {
                            ActivityResultRegistry.this.f728h.remove(str);
                            bVar.a(aVar.c(aVar2.d(), aVar2.c()));
                        }
                    } else if (i.a.ON_STOP.equals(aVar)) {
                        ActivityResultRegistry.this.f726f.remove(str);
                    } else if (i.a.ON_DESTROY.equals(aVar)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f724d.put(str, dVar);
            return new a(str, aVar);
        }
        throw new IllegalStateException("LifecycleOwner " + pVar + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final <I, O> c<I> j(String str, g.a<I, O> aVar, b<O> bVar) {
        k(str);
        this.f726f.put(str, new c(bVar, aVar));
        if (this.f727g.containsKey(str)) {
            Object obj = this.f727g.get(str);
            this.f727g.remove(str);
            bVar.a(obj);
        }
        a aVar2 = (a) this.f728h.getParcelable(str);
        if (aVar2 != null) {
            this.f728h.remove(str);
            bVar.a(aVar.c(aVar2.d(), aVar2.c()));
        }
        return new b(str, aVar);
    }

    /* access modifiers changed from: package-private */
    public final void l(String str) {
        Integer remove;
        if (!this.f725e.contains(str) && (remove = this.f723c.remove(str)) != null) {
            this.f722b.remove(remove);
        }
        this.f726f.remove(str);
        if (this.f727g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f727g.get(str));
            this.f727g.remove(str);
        }
        if (this.f728h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f728h.getParcelable(str));
            this.f728h.remove(str);
        }
        d dVar = this.f724d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f724d.remove(str);
        }
    }
}
