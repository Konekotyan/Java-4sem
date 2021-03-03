package main.pr6;

public class Proto {
    interface Copyable {
        Copyable copy();
    }
    static class ComplicatedObject implements Copyable {
        private Type type;
        public enum Type {
            ONE, TWO
        }
        public ComplicatedObject copy() {
            ComplicatedObject complicatedobject = new ComplicatedObject();
            return complicatedobject;
        }
        public void setType(Type type) {
            this.type = type;
        }
    }

        public static void main(String[] args) {
            ComplicatedObject prototype = new ComplicatedObject();
            ComplicatedObject clone = prototype.copy();
            clone.setType(ComplicatedObject.Type.ONE);
            System.out.println(clone.type);
        }
}
