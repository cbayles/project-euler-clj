(ns project-euler-clj.core-test
  (:require [clojure.test :refer :all]
            [project-euler-clj.core :refer :all]))

(deftest problem01-sample-test
  (testing "Sum of multiples below 10"
    (is (= 23 (problem01 10)))))

(deftest problem01-final-test
  (testing "Sum of multiples below 1000"
    (is (= 233168 (problem01 1000)))))

(deftest problem02-fibonacci-numbers
  (testing "Find fibonacci numbers below a maximum number"
    (is (= [0] (fibonacci 0)))
    (is (= [0] (fibonacci 1)))
    (is (= [0 1 1] (fibonacci 2)))
    (is (= [0 1 1 2] (fibonacci 3)))
    (is (= [0 1 1 2 3 5 8] (fibonacci 10)))
    (is (= [0 1 1 2 3 5 8 13 21 34 55 89] (fibonacci 100)))))

(deftest problem02-sample-test
  (testing "Sum of even fibonacci up to 100"
    (is (= 44 (problem02 100)))))

(deftest problem02-final-test
  (testing "Sum of even fibonacci up to four million"
    (is (= 4613732 (problem02 4000000)))))
