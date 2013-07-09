(ns lj13-ml-digits.core)

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io])

(defn get-data
  "Acquire the training data"
  []
    (drop 1
        (with-open [in-file (io/reader "data/digitscheck.csv")]
          (doall
           (csv/read-csv in-file)))))

(def examples (get-data))

(defn line
  "Use a single line for testing"
  [digit]
  (map #(Long. %) digit))

(defn square [x]
  (* x x))

(defn distance
  "Show the distance for a digit sequences"
  [x y]
  (square
   (- (first x)
      (first y))))

;; Tests for the REPL
(quot
 (distance
  (line (first examples))
  (line (second examples)))
 )

(defn classify-digit
  "Classify the digit"
  [s]
  ())
