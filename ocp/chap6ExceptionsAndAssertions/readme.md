# Exceptions and assertions

## Exceptions

### Runtime exceptions

- ArithmeticException
- ArrayOutOfBondsException
- ClassCastException
- IllegalArgumentException
- NullPointerException
- NumberFormatException

- IllegalStateException
- UnsupportedOperationException
- MissingResourceException
- DateTimeParseException
- ArrayStoreException
- DateTimeException


### Checked exceptions

- SQLException
- ParseException
- IOException
- FileNotFoundException
- NotSerializableException



### try/catch/finally

- finally does not catch exception
- in a multi-catch, the exception variable cannot be re-assigned (implicitely final)
- {} are required after try, even if only one instruction
- Closeable throws IOException
- Autocloseable throws Exception

Closeable implements AutoCloseable

## Assertions

- /!\ Check if assertions are enabled at runtime
> java -ea -da:ExcludedClass MainClass

- ea: enable assertions
- da: disable assertions