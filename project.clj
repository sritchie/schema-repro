(defproject schema_error "0.1.0-SNAPSHOT"
  :description "Schema issue!"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.3.0"
  :uberjar-name "schema-standalone.jar"
  :source-paths ["src/clj" "target/generated/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [prismatic/schema "0.2.1"]]
  :profiles {:provided {:plugins [[com.keminglabs/cljx "0.3.2"]]}
             :uberjar {:aot :all
                       :omit-source true
                       :main schema-error.core
                       :prep-tasks ^:replace [["clean"]
                                              ["cljx"]
                                              ["javac"]
                                              ["compile" ":all"]]}
             :dev {:injections [(require 'schema.core)
                                (schema.core/set-fn-validation! true)]}}
  :cljx {:builds [{:source-paths ["src/cljx"]
                   :output-path "target/generated/clj"
                   :rules :clj}
                  {:source-paths ["src/cljx"]
                   :output-path "target/generated/cljs"
                   :rules :cljs}]})
