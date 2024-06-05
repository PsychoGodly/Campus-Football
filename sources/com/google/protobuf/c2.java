package com.google.protobuf;

import com.google.protobuf.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Writer */
interface c2 {

    /* compiled from: Writer */
    public enum a {
        ASCENDING,
        DESCENDING
    }

    void A(int i10, List<Integer> list, boolean z10) throws IOException;

    void B(int i10, List<Boolean> list, boolean z10) throws IOException;

    <K, V> void C(int i10, o0.a<K, V> aVar, Map<K, V> map) throws IOException;

    void D(int i10, List<Integer> list, boolean z10) throws IOException;

    void E(int i10, List<Long> list, boolean z10) throws IOException;

    void F(int i10, long j10) throws IOException;

    void G(int i10, float f10) throws IOException;

    @Deprecated
    void H(int i10) throws IOException;

    void I(int i10, List<Integer> list, boolean z10) throws IOException;

    void J(int i10, int i11) throws IOException;

    void K(int i10, List<Long> list, boolean z10) throws IOException;

    void L(int i10, List<Integer> list, boolean z10) throws IOException;

    void M(int i10, List<Double> list, boolean z10) throws IOException;

    void N(int i10, int i11) throws IOException;

    void O(int i10, List<i> list) throws IOException;

    void a(int i10, List<?> list, n1 n1Var) throws IOException;

    @Deprecated
    void b(int i10, List<?> list, n1 n1Var) throws IOException;

    void c(int i10, List<Float> list, boolean z10) throws IOException;

    void d(int i10, int i11) throws IOException;

    void e(int i10, Object obj) throws IOException;

    void f(int i10, int i11) throws IOException;

    void g(int i10, double d10) throws IOException;

    void h(int i10, List<Long> list, boolean z10) throws IOException;

    void i(int i10, List<Long> list, boolean z10) throws IOException;

    void j(int i10, Object obj, n1 n1Var) throws IOException;

    void k(int i10, long j10) throws IOException;

    a l();

    void m(int i10, List<String> list) throws IOException;

    void n(int i10, String str) throws IOException;

    void o(int i10, long j10) throws IOException;

    void p(int i10, List<Integer> list, boolean z10) throws IOException;

    void q(int i10, long j10) throws IOException;

    void r(int i10, boolean z10) throws IOException;

    @Deprecated
    void s(int i10, Object obj, n1 n1Var) throws IOException;

    void t(int i10, int i11) throws IOException;

    @Deprecated
    void u(int i10) throws IOException;

    void v(int i10, i iVar) throws IOException;

    void w(int i10, int i11) throws IOException;

    void x(int i10, List<Long> list, boolean z10) throws IOException;

    void y(int i10, List<Integer> list, boolean z10) throws IOException;

    void z(int i10, long j10) throws IOException;
}
