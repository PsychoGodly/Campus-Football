package t7;

import android.database.Cursor;
import android.util.SparseArray;
import y7.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c4 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f4 f38399a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SparseArray f38400b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int[] f38401c;

    public /* synthetic */ c4(f4 f4Var, SparseArray sparseArray, int[] iArr) {
        this.f38399a = f4Var;
        this.f38400b = sparseArray;
        this.f38401c = iArr;
    }

    public final void accept(Object obj) {
        this.f38399a.w(this.f38400b, this.f38401c, (Cursor) obj);
    }
}
