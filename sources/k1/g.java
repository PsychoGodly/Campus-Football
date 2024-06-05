package k1;

import android.text.TextUtils;
import androidx.work.a0;
import androidx.work.p;
import androidx.work.s;
import androidx.work.x;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import s1.b;

/* compiled from: WorkContinuationImpl */
public class g extends x {

    /* renamed from: j  reason: collision with root package name */
    private static final String f19566j = p.f("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final i f19567a;

    /* renamed from: b  reason: collision with root package name */
    private final String f19568b;

    /* renamed from: c  reason: collision with root package name */
    private final androidx.work.g f19569c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends a0> f19570d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f19571e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f19572f;

    /* renamed from: g  reason: collision with root package name */
    private final List<g> f19573g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f19574h;

    /* renamed from: i  reason: collision with root package name */
    private s f19575i;

    public g(i iVar, List<? extends a0> list) {
        this(iVar, (String) null, androidx.work.g.KEEP, list, (List<g>) null);
    }

    private static boolean i(g gVar, Set<String> set) {
        set.addAll(gVar.c());
        Set<String> l10 = l(gVar);
        for (String contains : set) {
            if (l10.contains(contains)) {
                return true;
            }
        }
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g i10 : e10) {
                if (i(i10, set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set<String> l(g gVar) {
        HashSet hashSet = new HashSet();
        List<g> e10 = gVar.e();
        if (e10 != null && !e10.isEmpty()) {
            for (g c10 : e10) {
                hashSet.addAll(c10.c());
            }
        }
        return hashSet;
    }

    public s a() {
        if (!this.f19574h) {
            b bVar = new b(this);
            this.f19567a.r().b(bVar);
            this.f19575i = bVar.d();
        } else {
            p.c().h(f19566j, String.format("Already enqueued work ids (%s)", new Object[]{TextUtils.join(", ", this.f19571e)}), new Throwable[0]);
        }
        return this.f19575i;
    }

    public androidx.work.g b() {
        return this.f19569c;
    }

    public List<String> c() {
        return this.f19571e;
    }

    public String d() {
        return this.f19568b;
    }

    public List<g> e() {
        return this.f19573g;
    }

    public List<? extends a0> f() {
        return this.f19570d;
    }

    public i g() {
        return this.f19567a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f19574h;
    }

    public void k() {
        this.f19574h = true;
    }

    public g(i iVar, String str, androidx.work.g gVar, List<? extends a0> list) {
        this(iVar, str, gVar, list, (List<g>) null);
    }

    public g(i iVar, String str, androidx.work.g gVar, List<? extends a0> list, List<g> list2) {
        this.f19567a = iVar;
        this.f19568b = str;
        this.f19569c = gVar;
        this.f19570d = list;
        this.f19573g = list2;
        this.f19571e = new ArrayList(list.size());
        this.f19572f = new ArrayList();
        if (list2 != null) {
            for (g gVar2 : list2) {
                this.f19572f.addAll(gVar2.f19572f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            String b10 = ((a0) list.get(i10)).b();
            this.f19571e.add(b10);
            this.f19572f.add(b10);
        }
    }
}
