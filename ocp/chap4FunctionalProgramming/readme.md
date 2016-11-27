# Functional programming

- Stream only executed if there is a terminal operation

Terminal operations
- collect()
- count()
- sum()
Only applies to IntStream
- min/max
- reduction is a terminal operation that looks at each element of the stream
- IntStream.average() returns an OptionalInt (could be empty)
- IntStream.sum() returns an int
- findFirst/findAny

Intermediate:
- map()
- peak()


Unary: special type of function where parameterType = returnType

2 common types: double, int, long


### Interesting links:
- [leveluplunch Stream terminal operations](http://www.leveluplunch.com/java/examples/stream-terminal-operations-example/) 