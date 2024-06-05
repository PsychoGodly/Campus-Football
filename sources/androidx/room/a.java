package androidx.room;

import android.content.Context;
import androidx.room.h;
import c1.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final c.C0106c f4675a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4676b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4677c;

    /* renamed from: d  reason: collision with root package name */
    public final h.d f4678d;

    /* renamed from: e  reason: collision with root package name */
    public final List<h.b> f4679e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4680f;

    /* renamed from: g  reason: collision with root package name */
    public final h.c f4681g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f4682h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f4683i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f4684j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f4685k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f4686l;

    /* renamed from: m  reason: collision with root package name */
    private final Set<Integer> f4687m;

    /* renamed from: n  reason: collision with root package name */
    public final String f4688n;

    /* renamed from: o  reason: collision with root package name */
    public final File f4689o;

    public a(Context context, String str, c.C0106c cVar, h.d dVar, List<h.b> list, boolean z10, h.c cVar2, Executor executor, Executor executor2, boolean z11, boolean z12, boolean z13, Set<Integer> set, String str2, File file) {
        this.f4675a = cVar;
        this.f4676b = context;
        this.f4677c = str;
        this.f4678d = dVar;
        this.f4679e = list;
        this.f4680f = z10;
        this.f4681g = cVar2;
        this.f4682h = executor;
        this.f4683i = executor2;
        this.f4684j = z11;
        this.f4685k = z12;
        this.f4686l = z13;
        this.f4687m = set;
        this.f4688n = str2;
        this.f4689o = file;
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if ((!(i10 > i11) || !this.f4686l) && this.f4685k && ((set = this.f4687m) == null || !set.contains(Integer.valueOf(i10)))) {
            return true;
        }
        return false;
    }
}
