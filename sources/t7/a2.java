package t7;

import android.database.Cursor;
import java.util.SortedSet;
import s7.e;
import u7.l;
import u7.q;
import y7.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a2 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SortedSet f38378a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q f38379b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ l f38380c;

    public /* synthetic */ a2(SortedSet sortedSet, q qVar, l lVar) {
        this.f38378a = sortedSet;
        this.f38379b = qVar;
        this.f38380c = lVar;
    }

    public final void accept(Object obj) {
        this.f38378a.add(e.c(this.f38379b.f(), this.f38380c, ((Cursor) obj).getBlob(0), ((Cursor) obj).getBlob(1)));
    }
}
