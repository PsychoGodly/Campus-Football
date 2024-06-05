package t3;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import k4.n0;
import o3.a;

/* compiled from: DashManifest */
public class c implements a<c> {

    /* renamed from: a  reason: collision with root package name */
    public final long f22586a;

    /* renamed from: b  reason: collision with root package name */
    public final long f22587b;

    /* renamed from: c  reason: collision with root package name */
    public final long f22588c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f22589d;

    /* renamed from: e  reason: collision with root package name */
    public final long f22590e;

    /* renamed from: f  reason: collision with root package name */
    public final long f22591f;

    /* renamed from: g  reason: collision with root package name */
    public final long f22592g;

    /* renamed from: h  reason: collision with root package name */
    public final long f22593h;

    /* renamed from: i  reason: collision with root package name */
    public final o f22594i;

    /* renamed from: j  reason: collision with root package name */
    public final l f22595j;

    /* renamed from: k  reason: collision with root package name */
    public final Uri f22596k;

    /* renamed from: l  reason: collision with root package name */
    public final h f22597l;

    /* renamed from: m  reason: collision with root package name */
    private final List<g> f22598m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, o oVar, l lVar, Uri uri, List<g> list) {
        this.f22586a = j10;
        this.f22587b = j11;
        this.f22588c = j12;
        this.f22589d = z10;
        this.f22590e = j13;
        this.f22591f = j14;
        this.f22592g = j15;
        this.f22593h = j16;
        this.f22597l = hVar;
        this.f22594i = oVar;
        this.f22596k = uri;
        this.f22595j = lVar;
        this.f22598m = list == null ? Collections.emptyList() : list;
    }

    private static ArrayList<a> c(List<a> list, LinkedList<o3.c> linkedList) {
        o3.c poll = linkedList.poll();
        int i10 = poll.f21071a;
        ArrayList<a> arrayList = new ArrayList<>();
        do {
            int i11 = poll.f21072b;
            a aVar = list.get(i11);
            List<j> list2 = aVar.f22578c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(poll.f21073c));
                poll = linkedList.poll();
                if (!(poll.f21071a == i10 && poll.f21072b == i11)) {
                    arrayList.add(new a(aVar.f22576a, aVar.f22577b, arrayList2, aVar.f22579d, aVar.f22580e, aVar.f22581f));
                }
                arrayList2.add(list2.get(poll.f21073c));
                poll = linkedList.poll();
                break;
            } while (poll.f21072b == i11);
            arrayList.add(new a(aVar.f22576a, aVar.f22577b, arrayList2, aVar.f22579d, aVar.f22580e, aVar.f22581f));
        } while (poll.f21071a == i10);
        linkedList.addFirst(poll);
        return arrayList;
    }

    /* renamed from: b */
    public final c a(List<o3.c> list) {
        long j10;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new o3.c(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j11 = 0;
        int i10 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i10 >= e()) {
                break;
            }
            if (((o3.c) linkedList.peek()).f21071a != i10) {
                long f10 = f(i10);
                if (f10 != -9223372036854775807L) {
                    j11 += f10;
                }
            } else {
                g d10 = d(i10);
                arrayList.add(new g(d10.f22621a, d10.f22622b - j11, c(d10.f22623c, linkedList), d10.f22624d));
            }
            i10++;
        }
        long j12 = this.f22587b;
        if (j12 != -9223372036854775807L) {
            j10 = j12 - j11;
        }
        return new c(this.f22586a, j10, this.f22588c, this.f22589d, this.f22590e, this.f22591f, this.f22592g, this.f22593h, this.f22597l, this.f22594i, this.f22595j, this.f22596k, arrayList);
    }

    public final g d(int i10) {
        return this.f22598m.get(i10);
    }

    public final int e() {
        return this.f22598m.size();
    }

    public final long f(int i10) {
        if (i10 != this.f22598m.size() - 1) {
            return this.f22598m.get(i10 + 1).f22622b - this.f22598m.get(i10).f22622b;
        }
        long j10 = this.f22587b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - this.f22598m.get(i10).f22622b;
    }

    public final long g(int i10) {
        return n0.C0(f(i10));
    }
}
