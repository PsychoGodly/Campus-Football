package com.google.firebase.firestore;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import y7.p;
import y7.x;

/* compiled from: AggregateQuery */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final v0 f26443a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f26444b;

    c(v0 v0Var, List<a> list) {
        this.f26443a = v0Var;
        this.f26444b = list;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object d(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(new d(this, (Map) task.getResult()));
            return null;
        }
        taskCompletionSource.setException(task.getException());
        return null;
    }

    public Task<d> b(e eVar) {
        x.c(eVar, "AggregateSource must not be null");
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f26443a.f26544b.s().g0(this.f26443a.f26543a, this.f26444b).continueWith(p.f31400b, new b(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public v0 c() {
        return this.f26443a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f26443a.equals(cVar.f26443a) || !this.f26444b.equals(cVar.f26444b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f26443a, this.f26444b});
    }
}
