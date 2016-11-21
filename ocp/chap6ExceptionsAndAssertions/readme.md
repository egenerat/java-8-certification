# Exceptions and assertions

## Exceptions

### Runtime exceptions

- IllegalStateException
- MissingResourceException
- DateTimeParseException


### try/catch/finally

- finally does not catch exception
- in a multi-catch, the exception variable cannot be re-assigned (implicitely final)
- Closeable throws IOException
- Autocloseable throws Exception

## Assertions

> java -ea -da:ExcludedClass MainClass

- ea: enable assertions
- da: disable assertions