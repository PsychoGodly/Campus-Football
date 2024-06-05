package com.google.firebase.iid;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.iid.u;

/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
final /* synthetic */ class i implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInstanceId f26623a;

    /* renamed from: b  reason: collision with root package name */
    private final u.a f26624b;

    i(FirebaseInstanceId firebaseInstanceId, u.a aVar) {
        this.f26623a = firebaseInstanceId;
        this.f26624b = aVar;
    }

    public void onSuccess(Object obj) {
        this.f26623a.w(this.f26624b, (l) obj);
    }
}
