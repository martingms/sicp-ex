(ns sicp-ex.test.chapterone
  (:use [sicp-ex.chapterone])
  (:use [clojure.test]))

;; Exercise 1.1

(deftest ex1-1-1-equals-ten
  (is (= ex1-1-1 10) (str "ex1-1-1 should be 10. Was " ex1-1-1 ".")))

(deftest ex1-1-2-equals-twelve
  (is (= ex1-1-2 12) (str "ex1-1-2 should be 12. Was " ex1-1-2 ".")))

(deftest ex1-1-3-equals-eight
  (is (= ex1-1-3 8) (str "ex1-1-3 should be 8. Was " ex1-1-3 ".")))

(deftest ex1-1-4-equals-three
  (is (= ex1-1-4 3) (str "ex1-1-4 should be 3. Was " ex1-1-4 ".")))

(deftest ex1-1-5-equals-six
  (is (= ex1-1-5 6) (str "ex1-1-5 should be 6. Was " ex1-1-5 ".")))

(deftest ex1-1-a-equals-three
  (is (= ex1-1-a 3) (str "ex1-1-a should be 3. Was " ex1-1-a ".")))

(deftest ex1-1-b-equals-four
  (is (= ex1-1-b 4) (str "ex1-1-b should be 4. Was " ex1-1-b ".")))

(deftest ex1-1-7-equals-nineteen
  (is (= ex1-1-7 19) (str "ex1-1-7 should be 19. Was " ex1-1-7 ".")))

(deftest ex1-1-8-equals-false
  (is (not ex1-1-8) (str "ex1-1-8 should be false. Was " ex1-1-8 ".")))

(deftest ex1-1-9-equals-four
  (is (= ex1-1-9 4) (str "ex1-1-9 should be 4. Was " ex1-1-9 ".")))

(deftest ex1-1-10-equals-sixteen
  (is (= ex1-1-10 16) (str "ex1-1-10 should be 16. Was " ex1-1-10 ".")))

(deftest ex1-1-11-equals-six
  (is (= ex1-1-11 6) (str "ex1-1-11 should be 6. Was " ex1-1-11 ".")))

(deftest ex1-1-12-equals-sixteen
  (is (= ex1-1-12 16) (str "ex1-1-12 should be 16. Was " ex1-1-12 ".")))


;; Exercise 1.2

(deftest ex1-2-is-correct-translation
  (is (= ex1-2 -37/150) (str "ex1-2 should be -37/150. Was " ex1-2 ".")))


;; Exercise 1.3

(deftest square-correctly-squares-number
  (is (= (square -2) 4) (str "(square -2) should be 4. Was " (square -2) ".")))

(deftest sum-of-squares-calculates-correctly
  (is (= (sum-of-squares -2 3 4) 29) (str "(sum-of-squares -2 3 4) should be 29. Was " (sum-of-squares -2 3 4) ".")))

(deftest sum-of-squares-of-top-two-test
  (is (= (sum-of-squares-of-top-two -2 3 4) 25)
      (str "(sum-of-squares-of-top-two -2 3 4) should be 25. Was " (sum-of-squares-of-top-two -2 3 4) ".")))
