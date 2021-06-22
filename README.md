## Testcase for MDEP-757

https://issues.apache.org/jira/browse/MDEP-757


- run `mvn clean install`

==> using dependency plugin 3.2.0; fails with

```
INFO] --- maven-dependency-plugin:3.2.0:analyze-only (basepom.default) @ testcase ---
[WARNING] Non-test scoped test only dependencies found:
[WARNING]    com.fasterxml.jackson.core:jackson-databind:jar:2.12.2:compile
```

- uncomment the `<properties>` block in the POM.
- run `mvn clean install`

==> using dependency plugin 3.1.2; succeeds
