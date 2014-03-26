(defproject schema_error "0.1.0-SNAPSHOT"
  :description "Schema issue!"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-version "2.3.0"
  :uberjar-name "schema-standalone.jar"
  :source-paths ["src/clj"]
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [prismatic/schema "0.2.1"]]
  :main schema-error.core
  :profiles {:uberjar {:aot :all
                       :omit-source true
                       :prep-tasks [["clean"] ["javac"] ["compile" ":all"]]}
             :dev {:injections [(require 'schema.core)
                                (schema.core/set-fn-validation! true)]}})
