package com.unity3d.ads.core.data.manager;

import com.unity3d.services.store.gpbl.BillingResultResponseCode;
import com.unity3d.services.store.gpbl.bridges.BillingResultBridge;
import com.unity3d.services.store.gpbl.bridges.PurchaseBridge;
import com.unity3d.services.store.gpbl.bridges.SkuDetailsBridge;
import fe.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import pe.x;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1", f = "TransactionEventManager.kt", l = {76, 93, 96}, m = "invokeSuspend")
/* compiled from: TransactionEventManager.kt */
final class TransactionEventManager$onPurchasesReceived$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ List<PurchaseBridge> $purchases;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ TransactionEventManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TransactionEventManager$onPurchasesReceived$1(List<? extends PurchaseBridge> list, TransactionEventManager transactionEventManager, d<? super TransactionEventManager$onPurchasesReceived$1> dVar) {
        super(2, dVar);
        this.$purchases = list;
        this.this$0 = transactionEventManager;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(List list, int i10, List list2, TransactionEventManager transactionEventManager, PurchaseBridge purchaseBridge, BillingResultBridge billingResultBridge, List list3) {
        if (list3 == null || billingResultBridge.getResponseCode() != BillingResultResponseCode.OK) {
            ((x) list.get(i10)).n0(w.f38141a);
            return;
        }
        ArrayList arrayList = new ArrayList(r.j(list3, 10));
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            arrayList.add(transactionEventManager.getTransactionData.invoke(purchaseBridge, (SkuDetailsBridge) it.next()));
        }
        list2.addAll(arrayList);
        ((x) list.get(i10)).n0(w.f38141a);
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new TransactionEventManager$onPurchasesReceived$1(this.$purchases, this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((TransactionEventManager$onPurchasesReceived$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x005b
            if (r2 == r6) goto L_0x002e
            if (r2 == r5) goto L_0x0024
            if (r2 != r4) goto L_0x001c
            sd.p.b(r22)
            r2 = r22
            r9 = r0
            goto L_0x0189
        L_0x001c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0024:
            java.lang.Object r2 = r0.L$0
            java.util.List r2 = (java.util.List) r2
            sd.p.b(r22)
            r9 = r0
            goto L_0x016e
        L_0x002e:
            long r8 = r0.J$0
            int r2 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$4
            com.unity3d.services.store.gpbl.bridges.PurchaseBridge r11 = (com.unity3d.services.store.gpbl.bridges.PurchaseBridge) r11
            java.lang.Object r12 = r0.L$3
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r0.L$2
            com.unity3d.ads.core.data.manager.TransactionEventManager r13 = (com.unity3d.ads.core.data.manager.TransactionEventManager) r13
            java.lang.Object r14 = r0.L$1
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r15 = r0.L$0
            java.util.List r15 = (java.util.List) r15
            sd.p.b(r22)
            r4 = r0
            r3 = r10
            r16 = r13
            r10 = r2
            r13 = r11
            r2 = r15
            r15 = r22
            r18 = r14
            r14 = r12
            r12 = r18
            goto L_0x00e9
        L_0x005b:
            sd.p.b(r22)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List<com.unity3d.services.store.gpbl.bridges.PurchaseBridge> r8 = r0.$purchases
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = td.r.j(r8, r10)
            r9.<init>(r10)
            java.util.Iterator r8 = r8.iterator()
        L_0x0074:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0088
            java.lang.Object r10 = r8.next()
            com.unity3d.services.store.gpbl.bridges.PurchaseBridge r10 = (com.unity3d.services.store.gpbl.bridges.PurchaseBridge) r10
            pe.x r10 = pe.z.b(r7, r6, r7)
            r9.add(r10)
            goto L_0x0074
        L_0x0088:
            java.util.List<com.unity3d.services.store.gpbl.bridges.PurchaseBridge> r8 = r0.$purchases
            com.unity3d.ads.core.data.manager.TransactionEventManager r10 = r0.this$0
            java.util.Iterator r8 = r8.iterator()
            r12 = r8
            r14 = r9
            r13 = r10
            r8 = 0
            r9 = r0
        L_0x0095:
            boolean r10 = r12.hasNext()
            if (r10 == 0) goto L_0x0149
            java.lang.Object r10 = r12.next()
            int r11 = r8 + 1
            if (r8 >= 0) goto L_0x00a6
            td.q.i()
        L_0x00a6:
            com.unity3d.services.store.gpbl.bridges.PurchaseBridge r10 = (com.unity3d.services.store.gpbl.bridges.PurchaseBridge) r10
            org.json.JSONObject r15 = r10.getOriginalJson()
            java.lang.String r4 = "purchaseTime"
            java.lang.Object r4 = r15.get(r4)
            java.lang.String r15 = "null cannot be cast to non-null type kotlin.Long"
            kotlin.jvm.internal.m.c(r4, r15)
            java.lang.Long r4 = (java.lang.Long) r4
            long r3 = r4.longValue()
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r15 = r13.iapTransactionStore
            r9.L$0 = r2
            r9.L$1 = r14
            r9.L$2 = r13
            r9.L$3 = r12
            r9.L$4 = r10
            r9.I$0 = r11
            r9.I$1 = r8
            r9.J$0 = r3
            r9.label = r6
            java.lang.Object r15 = r15.get(r9)
            if (r15 != r1) goto L_0x00da
            return r1
        L_0x00da:
            r16 = r13
            r13 = r10
            r10 = r8
            r18 = r3
            r4 = r9
            r8 = r18
            r3 = r11
            r20 = r14
            r14 = r12
            r12 = r20
        L_0x00e9:
            c r15 = (defpackage.c) r15
            com.google.protobuf.i r11 = r15.g0()
            com.google.protobuf.t1 r11 = com.google.protobuf.t1.l0(r11)
            long r5 = r11.j0()
            float r5 = (float) r5
            float r6 = (float) r8
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r8
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0131
            com.unity3d.services.store.StoreMonitor r5 = r16.storeMonitor
            r6 = 42
            org.json.JSONObject r8 = r13.getOriginalJson()
            java.lang.String r9 = "productId"
            java.lang.Object r8 = r8.get(r9)
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            kotlin.jvm.internal.m.c(r8, r9)
            java.lang.String r8 = (java.lang.String) r8
            java.util.List r11 = td.p.b(r8)
            com.unity3d.ads.core.data.manager.b r9 = new com.unity3d.ads.core.data.manager.b
            r8 = r9
            r15 = r9
            r9 = r12
            r7 = r11
            r11 = r2
            r17 = r12
            r12 = r16
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.String r8 = "inapp"
            r5.getSkuDetails(r6, r8, r7, r15)
            r5 = r17
            goto L_0x013d
        L_0x0131:
            r5 = r12
            java.lang.Object r6 = r5.get(r10)
            pe.x r6 = (pe.x) r6
            sd.w r7 = sd.w.f38141a
            r6.n0(r7)
        L_0x013d:
            r8 = r3
            r9 = r4
            r12 = r14
            r13 = r16
            r4 = 3
            r6 = 1
            r7 = 0
            r14 = r5
            r5 = 2
            goto L_0x0095
        L_0x0149:
            r3 = 0
            pe.x[] r3 = new pe.x[r3]
            java.lang.Object[] r3 = r14.toArray(r3)
            pe.x[] r3 = (pe.x[]) r3
            int r4 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            pe.x0[] r3 = (pe.x0[]) r3
            r9.L$0 = r2
            r4 = 0
            r9.L$1 = r4
            r9.L$2 = r4
            r9.L$3 = r4
            r9.L$4 = r4
            r4 = 2
            r9.label = r4
            java.lang.Object r3 = pe.f.a(r3, r9)
            if (r3 != r1) goto L_0x016e
            return r1
        L_0x016e:
            boolean r3 = r2.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x0194
            com.unity3d.ads.core.data.manager.TransactionEventManager r3 = r9.this$0
            com.unity3d.ads.core.domain.events.GetTransactionRequest r3 = r3.getTransactionRequest
            r4 = 0
            r9.L$0 = r4
            r4 = 3
            r9.label = r4
            java.lang.Object r2 = r3.invoke(r2, r9)
            if (r2 != r1) goto L_0x0189
            return r1
        L_0x0189:
            vb.m3 r2 = (vb.m3) r2
            com.unity3d.ads.core.data.manager.TransactionEventManager r1 = r9.this$0
            com.unity3d.ads.core.data.repository.TransactionEventRepository r1 = r1.transactionEventRepository
            r1.addTransactionEvent(r2)
        L_0x0194:
            sd.w r1 = sd.w.f38141a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.TransactionEventManager$onPurchasesReceived$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
