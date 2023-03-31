;; lein test :only info.setmy.csv

(ns info.setmy.csv
    (:require [clojure.data.csv :as csv])
    (:require [clojure.java.io :as io])
    (:use clojure.test))

(deftest read-file
    (testing "Read CSV file"
             (with-open [reader (io/reader "./src/test/resources/in-file.csv")]
                 (doall
                  (csv/read-csv reader)))))

(deftest write-file
    (testing "Write CSV file"
             (with-open [writer (io/writer "./target/out-file.csv")]
                 (csv/write-csv writer
                                [["Column 1" "column 2"]
                                 ["abc" "def"]
                                 ["ghi" "jkl"]]))))

(defn copy-csv [from to]
    (with-open [reader (io/reader from)
                writer (io/writer to)]
        (->> (csv/read-csv reader)
             (drop 1)
             ;; (fn [row] (println row) row) - how to do that middle printout?
             ;; (map #(rest (butlast %)))
             (csv/write-csv writer))))

(deftest copy-csv-test
    (testing "Copy CSV file"
             (copy-csv "./src/test/resources/in-file.csv" "./target/copy-file.csv")))
