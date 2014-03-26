(ns schema-error.core
  (:gen-class)
  (:require [schema-error.util :as u]
            [schema.core :as s]
            [schema.macros :as sm]))

(u/clone-ns schema-error.types)

(sm/defn describe-wobblies :- WobblyBits
  [n :- s/Int]
  (str n " Wobbly Bits!"))

(defn -main [n]
  (-> (Integer/parseInt n)
      (describe-wobblies)
      (println)))
