package com.unity3d.services.core.properties;

/* compiled from: Session.kt */
public interface Session {
    public static final Default Default = Default.$$INSTANCE;

    /* compiled from: Session.kt */
    public static final class Default implements Session {
        static final /* synthetic */ Default $$INSTANCE = new Default();

        /* renamed from: id  reason: collision with root package name */
        private static final String f32076id = SessionIdReader.INSTANCE.getSessionId();

        private Default() {
        }

        public String getId() {
            return f32076id;
        }
    }

    String getId();
}
