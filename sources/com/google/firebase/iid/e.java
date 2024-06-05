package com.google.firebase.iid;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class e implements OnCompleteListener {

    /* renamed from: a  reason: collision with root package name */
    private final CountDownLatch f26612a;

    e(CountDownLatch countDownLatch) {
        this.f26612a = countDownLatch;
    }

    public void onComplete(Task task) {
        this.f26612a.countDown();
    }
}
