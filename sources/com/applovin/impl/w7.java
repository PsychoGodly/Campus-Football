package com.applovin.impl;

import com.applovin.mediation.MaxReward;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class w7 {

    /* renamed from: a  reason: collision with root package name */
    private final ByteArrayOutputStream f13018a;

    /* renamed from: b  reason: collision with root package name */
    private final DataOutputStream f13019b;

    public w7() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f13018a = byteArrayOutputStream;
        this.f13019b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(u7 u7Var) {
        this.f13018a.reset();
        try {
            a(this.f13019b, u7Var.f12536a);
            String str = u7Var.f12537b;
            if (str == null) {
                str = MaxReward.DEFAULT_LABEL;
            }
            a(this.f13019b, str);
            this.f13019b.writeLong(u7Var.f12538c);
            this.f13019b.writeLong(u7Var.f12539d);
            this.f13019b.write(u7Var.f12540f);
            this.f13019b.flush();
            return this.f13018a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static void a(DataOutputStream dataOutputStream, String str) {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }
}
