package com.applovin.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface x7 {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f13292a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13293b;

        /* renamed from: c  reason: collision with root package name */
        private final int f13294c;

        public a(byte[] bArr, String str, int i10) {
            this.f13292a = bArr;
            this.f13293b = str;
            this.f13294c = i10;
        }

        public byte[] a() {
            return this.f13292a;
        }

        public String b() {
            return this.f13293b;
        }
    }

    public interface b {
        void a(x7 x7Var, byte[] bArr, int i10, int i11, byte[] bArr2);
    }

    public interface c {
        x7 a(UUID uuid);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f13295a;

        /* renamed from: b  reason: collision with root package name */
        private final String f13296b;

        public d(byte[] bArr, String str) {
            this.f13295a = bArr;
            this.f13296b = str;
        }

        public byte[] a() {
            return this.f13295a;
        }

        public String b() {
            return this.f13296b;
        }
    }

    a a(byte[] bArr, List list, int i10, HashMap hashMap);

    void a();

    void a(b bVar);

    void a(byte[] bArr);

    void a(byte[] bArr, byte[] bArr2);

    boolean a(byte[] bArr, String str);

    d b();

    Map b(byte[] bArr);

    byte[] b(byte[] bArr, byte[] bArr2);

    int c();

    void c(byte[] bArr);

    x4 d(byte[] bArr);

    byte[] d();
}
