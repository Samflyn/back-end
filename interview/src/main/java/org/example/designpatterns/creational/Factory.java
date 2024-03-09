package org.example.designpatterns.creational;

interface OS {
    void spec();
}

public class Factory {
    public static void main(String[] args) {
        OS os = OsFactory.getInstance("LINUX");
        os.spec();
    }
}

class Windows implements OS {
    @Override
    public void spec() {
        System.out.println("WINDOWS");
    }
}

class Linux implements OS {
    @Override
    public void spec() {
        System.out.println("LINUX");
    }
}

class OsFactory {
    public static OS getInstance(String type) {
        return switch (type) {
            case "WINDOWS" -> new Windows();
            case "LINUX" -> new Linux();
            default -> null;
        };
    }
}
