# Archetype плагин Maven

---
## Maven Quickstart Archetype

### Чтобы получить структуру нового проекта архетипа "quickstart":
* ```
    mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
  ```

* затем заполнить обязательную информацию о проекте ```groupId```, ```artefactId```, ```version``` и ```package```

```
project
|-- pom.xml
`-- src
    |-- main
    |   `-- java
    |       `-- $package
    |           `-- App.java
    `-- test
        `-- java
            `-- $package
                `-- AppTest.java
```
[Источник](https://maven.apache.org/archetypes/maven-archetype-quickstart/)

---
