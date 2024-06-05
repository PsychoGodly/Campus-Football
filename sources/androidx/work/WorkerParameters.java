package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a  reason: collision with root package name */
    private UUID f5094a;

    /* renamed from: b  reason: collision with root package name */
    private e f5095b;

    /* renamed from: c  reason: collision with root package name */
    private Set<String> f5096c;

    /* renamed from: d  reason: collision with root package name */
    private a f5097d;

    /* renamed from: e  reason: collision with root package name */
    private int f5098e;

    /* renamed from: f  reason: collision with root package name */
    private Executor f5099f;

    /* renamed from: g  reason: collision with root package name */
    private t1.a f5100g;

    /* renamed from: h  reason: collision with root package name */
    private b0 f5101h;

    /* renamed from: i  reason: collision with root package name */
    private u f5102i;

    /* renamed from: j  reason: collision with root package name */
    private i f5103j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public List<String> f5104a = Collections.emptyList();

        /* renamed from: b  reason: collision with root package name */
        public List<Uri> f5105b = Collections.emptyList();

        /* renamed from: c  reason: collision with root package name */
        public Network f5106c;
    }

    public WorkerParameters(UUID uuid, e eVar, Collection<String> collection, a aVar, int i10, Executor executor, t1.a aVar2, b0 b0Var, u uVar, i iVar) {
        this.f5094a = uuid;
        this.f5095b = eVar;
        this.f5096c = new HashSet(collection);
        this.f5097d = aVar;
        this.f5098e = i10;
        this.f5099f = executor;
        this.f5100g = aVar2;
        this.f5101h = b0Var;
        this.f5102i = uVar;
        this.f5103j = iVar;
    }

    public Executor a() {
        return this.f5099f;
    }

    public i b() {
        return this.f5103j;
    }

    public UUID c() {
        return this.f5094a;
    }

    public e d() {
        return this.f5095b;
    }

    public Network e() {
        return this.f5097d.f5106c;
    }

    public u f() {
        return this.f5102i;
    }

    public int g() {
        return this.f5098e;
    }

    public Set<String> h() {
        return this.f5096c;
    }

    public t1.a i() {
        return this.f5100g;
    }

    public List<String> j() {
        return this.f5097d.f5104a;
    }

    public List<Uri> k() {
        return this.f5097d.f5105b;
    }

    public b0 l() {
        return this.f5101h;
    }
}
