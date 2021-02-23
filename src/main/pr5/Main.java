package main.pr5;

public class Main {
    public static void main(String[] args){
        class Singleton {
            private Singleton instance;

            private Singleton(){}

            public synchronized Singleton getInstance() {
                if (instance == null) {
                    instance = new Singleton();
                }
                return instance;
            }
        }
    }
    public static class Singleton1 {
        private Singleton1(){}

        private static class SingletonHolder {
            private final static Singleton1 instance = new Singleton1();
        }
        public static Singleton1 getInstance(){
            return SingletonHolder.instance;
        }
    }

    class Singleton2{
        private Singleton2 instance = new Singleton2();
        private Singleton2(){}
        public Singleton2 getInstance(){
            return instance;
        }
    }
}
