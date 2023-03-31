# Getting Started

```shell
.\mvnw clean install
```

```shell
./mvnw clean install
```

### Execution

```shell
.\mvnw -Dspring-boot.run.arguments="-n info.setmy.core -s info/setmy/core.clj"
```

```shell
./mvnw -Dspring-boot.run.arguments="-n info.setmy.core -s info/setmy/core.clj"
```

```shell
java -jar ./target/clojure-start-project-0.0.0-SNAPSHOT.jar -n info.setmy.core -s info/setmy/core.clj
```

#### Clojure run

```shell
.\mvnw clojure:run

```

```shell
./mvnw clojure:run
```

# Leiningen

[Leiningen](https://leiningen.org/)

[Lein tutorial](https://codeberg.org/leiningen/leiningen/src/branch/stable/doc/TUTORIAL.md)

## How it's done

```shell
mkdir leiningen
cd leiningen
lein new app tutorial
cd tutorial
lein run
lein test
lein uberjar
java -jar ./build/default+uberjar/clojure-project-0.0.0-SNAPSHOT-standalone.jar fff
```

## See also

[LISP know how](https://setmy-info.github.io/src/site/markdown/lisp.html)
