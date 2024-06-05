package com.google.protobuf;

import com.google.protobuf.o0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: Reader */
interface l1 {
    @Deprecated
    <T> T A(Class<T> cls, q qVar) throws IOException;

    int B() throws IOException;

    void C(List<String> list) throws IOException;

    <T> void D(T t10, n1<T> n1Var, q qVar) throws IOException;

    <K, V> void E(Map<K, V> map, o0.a<K, V> aVar, q qVar) throws IOException;

    void F(List<String> list) throws IOException;

    i G() throws IOException;

    void H(List<Float> list) throws IOException;

    int I() throws IOException;

    boolean J() throws IOException;

    int K() throws IOException;

    void L(List<i> list) throws IOException;

    void M(List<Double> list) throws IOException;

    long N() throws IOException;

    String O() throws IOException;

    void P(List<Long> list) throws IOException;

    void a(List<Integer> list) throws IOException;

    long b() throws IOException;

    long c() throws IOException;

    void d(List<Integer> list) throws IOException;

    void e(List<Long> list) throws IOException;

    @Deprecated
    <T> void f(List<T> list, n1<T> n1Var, q qVar) throws IOException;

    int g();

    void h(List<Integer> list) throws IOException;

    <T> T i(Class<T> cls, q qVar) throws IOException;

    <T> void j(T t10, n1<T> n1Var, q qVar) throws IOException;

    int k() throws IOException;

    boolean l() throws IOException;

    <T> void m(List<T> list, n1<T> n1Var, q qVar) throws IOException;

    long n() throws IOException;

    void o(List<Long> list) throws IOException;

    int p() throws IOException;

    void q(List<Long> list) throws IOException;

    void r(List<Long> list) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    void s(List<Integer> list) throws IOException;

    void t(List<Integer> list) throws IOException;

    int u() throws IOException;

    void v(List<Integer> list) throws IOException;

    int w() throws IOException;

    long x() throws IOException;

    void y(List<Boolean> list) throws IOException;

    String z() throws IOException;
}
