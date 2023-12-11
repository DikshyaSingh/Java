public abstract class abstraction_mobile {
    public abstract void doubletap();

    public static class IOS extends abstraction_mobile {
        public void doubletap() {
            System.out.println("ios double tap");
        }
    }

    public static class android extends abstraction_mobile {
        public void doubletap() {
            System.out.println("android double tap");
        }
    }

    public static void main(String[] args) {
        abstraction_mobile m;
        m= new IOS();
        m.doubletap();

        m= new android();
        m.doubletap();
    }
}