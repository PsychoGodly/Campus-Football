package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import fe.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;
import xd.i;

@f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$invoke$1", f = "TransactionEventManager.kt", l = {34}, m = "invokeSuspend")
/* compiled from: TransactionEventManager.kt */
final class TransactionEventManager$invoke$1 extends l implements p<p0, d<? super w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransactionEventManager$invoke$1(TransactionEventManager transactionEventManager, d<? super TransactionEventManager$invoke$1> dVar) {
        super(2, dVar);
        this.this$0 = transactionEventManager;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(TransactionEventManager transactionEventManager, BillingResultBridge billingResultBridge, List list) {
        transactionEventManager.onPurchasesReceived(billingResultBridge, list);
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new TransactionEventManager$invoke$1(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((TransactionEventManager$invoke$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            if (!this.this$0.storeMonitor.isInitialized()) {
                TransactionEventManager transactionEventManager = this.this$0;
                this.L$0 = transactionEventManager;
                this.label = 1;
                i iVar = new i(c.b(this));
                transactionEventManager.storeMonitor.initialize(new TransactionEventManager$invoke$1$1$1(iVar, transactionEventManager));
                Object a10 = iVar.a();
                if (a10 == d.c()) {
                    h.c(this);
                }
                if (a10 == c10) {
                    return c10;
                }
            }
        } else if (i10 == 1) {
            TransactionEventManager transactionEventManager2 = (TransactionEventManager) this.L$0;
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.storeMonitor.getPurchases(42, "inapp", new a(this.this$0));
        return w.f38141a;
    }
}
