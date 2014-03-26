(ns schema-error.types
  (:require [schema.core :as s]))

(def WobblyBits
  (s/named s/Str "Describing the shiz."))
