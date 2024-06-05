package androidx.media2.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.util.c;
import i1.b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class SessionCommand implements b {

    /* renamed from: d  reason: collision with root package name */
    static final SparseArray<List<Integer>> f4227d;

    /* renamed from: e  reason: collision with root package name */
    static final SparseArray<List<Integer>> f4228e;

    /* renamed from: f  reason: collision with root package name */
    static final SparseArray<List<Integer>> f4229f;

    /* renamed from: g  reason: collision with root package name */
    static final SparseArray<List<Integer>> f4230g;

    /* renamed from: h  reason: collision with root package name */
    static final SparseArray<List<Integer>> f4231h;

    /* renamed from: a  reason: collision with root package name */
    int f4232a;

    /* renamed from: b  reason: collision with root package name */
    String f4233b;

    /* renamed from: c  reason: collision with root package name */
    Bundle f4234c;

    static {
        SparseArray<List<Integer>> sparseArray = new SparseArray<>();
        f4227d = sparseArray;
        SparseArray<List<Integer>> sparseArray2 = new SparseArray<>();
        f4228e = sparseArray2;
        sparseArray.put(1, Arrays.asList(new Integer[]{10000, 10001, 10002, 10003, 10004, 11000, 11001, 11002}));
        sparseArray2.put(1, Arrays.asList(new Integer[]{10005, 10006, 10007, 10008, 10009, 10010, 10011, 10012, 10013, 10014, 10015, 10016, 10017, 10018}));
        sparseArray2.put(2, Collections.singletonList(10019));
        SparseArray<List<Integer>> sparseArray3 = new SparseArray<>();
        f4229f = sparseArray3;
        sparseArray3.put(1, Arrays.asList(new Integer[]{30000, 30001}));
        SparseArray<List<Integer>> sparseArray4 = new SparseArray<>();
        f4230g = sparseArray4;
        sparseArray4.put(1, Arrays.asList(new Integer[]{40000, 40001, 40002, 40003, 40010}));
        sparseArray4.put(2, Collections.singletonList(40011));
        SparseArray<List<Integer>> sparseArray5 = new SparseArray<>();
        f4231h = sparseArray5;
        sparseArray5.put(1, Arrays.asList(new Integer[]{50000, 50001, 50002, 50003, 50004, 50005, 50006}));
    }

    SessionCommand() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        if (this.f4232a != sessionCommand.f4232a || !TextUtils.equals(this.f4233b, sessionCommand.f4233b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return c.b(this.f4233b, Integer.valueOf(this.f4232a));
    }
}
