package main.pr6;

public class Abstract {
    public interface CarsFactory {
        Sedan createSedan();
        Coupe createCoupe();
    }

    public static class ToyotaFactory implements CarsFactory {
        @Override
        public Sedan createSedan() {
            return new  ToyotaSedan();
        }

        @Override
        public Coupe createCoupe() {
            return new ToyotaCoupe();
        }
    }

    public class FordFactory implements CarsFactory {
        @Override
        public Sedan createSedan() {
            return new  FordSedan();
        }

        @Override
        public Coupe createCoupe() {
            return new FordCoupe();
        }
    }
    public interface Sedan {}

    public interface Coupe {}

    public static class ToyotaCoupe implements Coupe {
        public ToyotaCoupe() {
            System.out.println("Create Toyota Coupe");
        }
    }

    public static class ToyotaSedan implements Sedan {
        public ToyotaSedan() {
            System.out.println("Create Toyota Sedan");
        }
    }

    public class FordCoupe implements Coupe {
        public FordCoupe () {
            System.out.println("Create Ford Coupe");
        }
    }

    public class FordSedan implements Sedan {
        public FordSedan() {
            System.out.println("Create Ford Sedan");
        }
    }

    public static void main(String[] args)
    {
        CarsFactory factory;
        factory = new ToyotaFactory();
        factory.createSedan();

    }
}
