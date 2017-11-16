#GivenWhenThen
Simple test library for given/when/then phrases

## Example
#### Test for 'String' object

```java
    beginTest(String.class)
        .given(() -> {
            doSomething();
            return expectedValue;
        })
        .when(() -> {
            doSomething2();
            return testMethod();
        })
        .then((expected, actual) -> {
            assertThat(actual, equalTo(expected));
        });
```

* Specify the Target class in beginTest() method.
* Return expected value in given() method. <br/>
* Return actual value from the test method in when() method. <br/>
* Do verifications with expected, actual value parameters in then() method

#### Test for 'List' object
```java
    beginTest(List.class)
        .given(() -> {
            doSomething();
            return expected;
        })
        .when(() -> {
            doSomething2();
            return testMethod();
        })
        .then((expected, actual) -> {
            assertThat(actual, equalTo(expected));
        });
```

  
