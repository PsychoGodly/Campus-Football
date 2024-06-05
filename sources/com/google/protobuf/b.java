package com.google.protobuf;

import com.google.protobuf.v0;

/* compiled from: AbstractParser */
public abstract class b<MessageType extends v0> implements f1<MessageType> {

    /* renamed from: a  reason: collision with root package name */
    private static final q f26935a = q.b();

    private MessageType d(MessageType messagetype) throws e0 {
        if (messagetype == null || messagetype.isInitialized()) {
            return messagetype;
        }
        throw e(messagetype).a().k(messagetype);
    }

    private u1 e(MessageType messagetype) {
        if (messagetype instanceof a) {
            return ((a) messagetype).o();
        }
        return new u1(messagetype);
    }

    /* renamed from: f */
    public MessageType a(i iVar, q qVar) throws e0 {
        return d(h(iVar, qVar));
    }

    /* renamed from: g */
    public MessageType b(j jVar, q qVar) throws e0 {
        return d((v0) c(jVar, qVar));
    }

    public MessageType h(i iVar, q qVar) throws e0 {
        MessageType messagetype;
        try {
            j D = iVar.D();
            messagetype = (v0) c(D, qVar);
            D.a(0);
            return messagetype;
        } catch (e0 e10) {
            throw e10.k(messagetype);
        } catch (e0 e11) {
            throw e11;
        }
    }
}
