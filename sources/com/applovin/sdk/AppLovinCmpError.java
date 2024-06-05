package com.applovin.sdk;

public interface AppLovinCmpError {

    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f14093a;

        private Code(int i10) {
            this.f14093a = i10;
        }

        public int getValue() {
            return this.f14093a;
        }
    }

    int getCmpCode();

    String getCmpMessage();

    Code getCode();

    String getMessage();
}
