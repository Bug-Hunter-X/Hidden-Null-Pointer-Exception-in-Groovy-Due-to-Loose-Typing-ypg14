```groovy
class MyClass {
    def myMethod(param) {
        if (param == null) {
            return 0 // This is incorrect for a String-typed parameter 
        }
        return param.length()
    }
}

assert new MyClass().myMethod(null) == 0 //This assertion will pass, masking the bug
assert new MyClass().myMethod("hello") == 5
assert new MyClass().myMethod(123) == 3 // This will throw a GroovyCastException
```