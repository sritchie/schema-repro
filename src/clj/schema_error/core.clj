(ns schema-error.core
  (:gen-class)
  (:require [schema-error.util :as u]
            [schema.core :as s]))

(u/clone-ns schema-error.types)

(s/defn describe-wobblies :- WobblyBits
  [n :- s/Int]
  (str n " Wobbly Bits!"))

(defn -main [n]
  (-> (Integer/parseInt n)
      (describe-wobblies)
      (println)))
