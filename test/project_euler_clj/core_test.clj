(ns project-euler-clj.core-test
  (:require [clojure.test :refer :all]
            [project-euler-clj.core :refer :all]))

(deftest problem01-sample-test
  (testing "Sum of multiples below 10"
    (is (= 23 (problem01 10)))))

(deftest problem01-final-test
  (testing "Sum of multiples below 1000"
    (is (= 233168 (problem01 1000)))))

