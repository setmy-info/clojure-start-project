(defproject clojure-project "0.0.0-SNAPSHOT"
    :description "Incubation Clojure project"
    :url "https://github.com/setmy-info/clojure-start-project"
    :license
    {:name "MIT"
     :url  "https://mit-license.org/"}
    :dependencies [[org.clojure/clojure "1.11.1"]
                   [org.apache.groovy/groovy "4.0.10"]
                   [org.slf4j/slf4j-api "2.0.1"]]
    :main ^:skip-aot info.setmy.core
    :target-path "build/%s"
    :source-paths ["src" "src/main/clojure"]
    :test-paths ["src/test/clojure"]
    :java-source-paths ["src/main/java"] ; Java source is stored separately.
    :resource-paths ["src/main/resources" "./target/classes"] ; Non-code files included in classpath/jar.
    :uberjar-exclusions ["src/main/clojure/info/setmy/services.clj"]
    :profiles
    {:uberjar {:aot      :all
               :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
