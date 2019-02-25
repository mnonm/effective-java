package stream;

import java.util.Map;
import java.util.Optional;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum OperationStream {
    PLUS("+", (x, y) -> x + y),
    MINUS("-", (x, y) -> x - y),
    TIMES("*", (x, y) -> x * y),
    DIVIDE("/", (x, y) -> x / y);

    private final String symbol;
    private final DoubleBinaryOperator op;

    OperationStream(String symbol, DoubleBinaryOperator op) {
        this.symbol = symbol;
        this.op = op;
    }

    @Override
    public String toString() { return symbol; }

    public double apply(double x, double y) {
        return op.applyAsDouble(x, y);
    };

    private static final Map<String, OperationStream> stringToEnum = Stream.of(values()).collect(
                                                                Collectors.toMap(Object::toString, e -> e));

    public static Optional<OperationStream> fromString(String symbol) {
        return Optional.ofNullable(stringToEnum.get(symbol));
    }
}
