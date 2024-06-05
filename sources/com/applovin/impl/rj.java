package com.applovin.impl;

public class rj extends qj {
    public static final rj Q;
    public static final rj R = new rj("com.applovin.taboola.api.user_id_creation_date", Long.class);
    public static final rj S;

    static {
        Class<String> cls = String.class;
        Q = new rj("com.applovin.taboola.api.user_id", cls);
        S = new rj("com.applovin.nimbus.instance_id", cls);
    }

    public rj(String str, Class cls) {
        super(str, cls);
    }
}
