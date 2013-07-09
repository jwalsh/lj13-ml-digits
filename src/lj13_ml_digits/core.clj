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

(def examples (read-line get-data))

;; Coercion
(defn line
  "Use a single line for testing"
  [digit]
  (map #(Long. %) digit))

(defn square [x]
  (* x x))

(defn distance
  "Show the distance for a digit sequences"
  [x y]
  (let [sub-v (map - x y)]
    (apply + (map square sub-v))))

;; Tests for the REPL
 (distance
  (line (first examples))
  (line (second examples)))


;; Alternative distance calculations 
(def distance-metric-cubic)
(def distance-metric-windowing)


(defn closest-neighbor-classifier
  []
  ())

(defn classify-digit
  "Classify the digit"
  [s]
  ())
