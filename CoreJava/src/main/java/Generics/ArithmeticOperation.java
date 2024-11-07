package Generics;

public enum ArithmeticOperation implements Calculator<Integer>{
    ADD {
        public Integer calculate(Integer a, Integer b) {
            return a + b;
        }
    },
    SUBTRACT {
        public Integer calculate(Integer a, Integer b) {
            return a - b;
        }
    },

    MULTIPLY {
        public Integer calculate(Integer a, Integer b) {
            return a * b;
        }
    },
    DIVISION {
        public Integer calculate(Integer a, Integer b) {
            return a / b;
        }
    };
}
