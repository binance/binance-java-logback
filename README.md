# Binance custom logback-classic

This is an adaptation of `logback-classic` framework, but integrated with the following major customizations:
- Applies `TimeBasedRollingPolicy` for the created log file at working path's `./logs` folder;
- Log pattern is `"%date{yyyy-MM-dd HH:mm:ss.SSS}[%epoch] | %-5level | %-10thread{10} | %-36logger{36} - %msg%n"`;

Logging example:
```
2023-02-27 18:36:42.912[1677490602912] | INFO  | main       | c.b.c.client.utils.RequestHandler    - GET https://api.binance.com/api/v3/account?`
```

For complete details, please refer to `src/main/resources/logback.xml`

## Installation

Add the following dependency to your `pom.xml`:

```
<dependency>
    <groupId>io.github.binance</groupId>
    <artifactId>binance-logback</artifactId>
    <version>VERSION</version>
</dependency>
```

Replace `VERSION` with a published version.

## Contributing
Contributions are welcome! If you've found a bug within this project, please open an issue to discuss what you would like to change.
