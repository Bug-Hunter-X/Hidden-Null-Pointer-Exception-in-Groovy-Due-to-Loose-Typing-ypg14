# Groovy Hidden Null Pointer Exception

This repository demonstrates a subtle bug in Groovy code that can lead to unexpected behavior and masked null pointer exceptions.  The issue arises from Groovy's dynamic typing and the lack of explicit type checking.

The `myMethod` in `bug.groovy` attempts to handle a null input. However, it does so incorrectly, leading to a potential exception when the input isn't a String or an object with a `length()` method. The solution in `bugSolution.groovy` addresses this using explicit type checking.