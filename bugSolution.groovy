```groovy
class MyClass {
    def myMethod(param) {
        if (param == null || !(param instanceof String)) {
            return null // Or throw a more informative exception
        }
        return param.length()
    }
}

assert new MyClass().myMethod(null) == null
assert new MyClass().myMethod("hello") == 5
assert new MyClass().myMethod(123) == null //Correct handling of non-String input
```