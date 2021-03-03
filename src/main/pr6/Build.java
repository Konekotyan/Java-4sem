package main.pr6;

public class Build {
    public static class GoodClass {
        private final int reqFieldOne;
        private final int reqFieldTwo;
        private final int optFieldOne;
        private final int optFieldTwo;
        private final int optFieldThird;
        private final int optFieldFour;

        public static class Builder {
            // Обязательные параметры
            private final int reqFieldOne;
            private final int reqFieldTwo;

            // Необязательные параметры с значениями по умолчанию
            private int optFieldOne = 0;
            private int optFieldTwo = 0;
            private int optFieldThird = 0;
            private int optFieldFour = 0;

            public Builder(int reqFieldOne, int reqFieldTwo) {
                this.reqFieldOne = reqFieldOne;
                this.reqFieldTwo = reqFieldTwo;
            }

            public Builder optFieldOne(int val) {
                optFieldOne = val;
                System.out.println(optFieldOne);
                return this;
            }

            public Builder optFieldTwo(int val) {
                optFieldTwo = val;
                System.out.println(optFieldTwo);
                return this;
            }

            public Builder optFieldThird(int val) {
                optFieldThird = val;
                System.out.println(optFieldThird);
                return this;
            }

            public Builder optFieldFour(int val) {
                optFieldFour = val;
                System.out.println(optFieldFour);
                return this;
            }

            public GoodClass build() {
                return new GoodClass(this);
            }
        }

        private GoodClass(Builder builder) {
            reqFieldOne = builder.reqFieldOne;
            reqFieldTwo = builder.reqFieldTwo;
            optFieldOne = builder.optFieldOne;
            optFieldTwo = builder.optFieldTwo;
            optFieldThird = builder.optFieldThird;
            optFieldFour = builder.optFieldFour;
        }
    }
    public static void main(String[] args)
    {
        GoodClass goodClass = new GoodClass.Builder(40, 20)
                .optFieldOne(2)
                .optFieldTwo(4)
                .optFieldThird(23)
                .optFieldFour(9)
                .build();
    }
}
