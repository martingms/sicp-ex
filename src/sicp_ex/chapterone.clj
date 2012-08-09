(ns sicp-ex.chapterone)

;; Exercise 1.1
;; Below is a sequence of expressions. What is the result printed by the interpreter
;; in response to each expression? Assume that the sequence is to be evaluated in the
;; order in which it is presented.

(def ex1-1-1 10)

(def ex1-1-2 (+ 5 3 4))

(def ex1-1-3 (- 9 1))

(def ex1-1-4 (/ 6 2))

(def ex1-1-5 (+ (* 2 4) (- 4 6)))

(def ex1-1-a 3) ; a => 3

(def ex1-1-b (+ ex1-1-a 1)) ; b => 4

(def ex1-1-7 (+ ex1-1-a ex1-1-b (* ex1-1-a ex1-1-b)))

(def ex1-1-8 (= ex1-1-a ex1-1-b))

(def ex1-1-9 (if (and (> ex1-1-b ex1-1-a) (< ex1-1-b (* ex1-1-a ex1-1-b))) ex1-1-b ex1-1-a))

(def ex1-1-10
  (cond 
    (= ex1-1-a 4) 6
    (= ex1-1-b 4) (+ 6 7 ex1-1-a)
    :else 24))

(def ex1-1-11 (+ 2 (if (> ex1-1-b ex1-1-a) ex1-1-b ex1-1-a)))

(def ex1-1-12
  (* (cond 
       (> ex1-1-a ex1-1-b) ex1-1-a
       (< ex1-1-a ex1-1-b) ex1-1-b
       :else -1)
     (+ ex1-1-a 1)))


;; Exercise 1.2
;; Translate the following expression into prefix form.
;;
;; 5 + 4 (2 - (3 - (6 + 4/5))) / 3(6 - 2)(2 - 7)

(def ex1-2
  (/ (+ 5 4 (- 2 (- 3 (+ 6 4/5))))
     (* 3 (- 6 2) (- 2 7))))


;; Exercise 1.3
;; Define a procedure that takes three numbers as arguments and returns the sum of the squares of the two larger numbers.

(defn square [x]
  (* x x))

(defn sum-of-squares [x y z]
  (+ (square x) (square y) (square z)))

(defn sum-of-squares-of-top-two [x y z]
  (- (sum-of-squares x y z)
     (square (min x y z))))
