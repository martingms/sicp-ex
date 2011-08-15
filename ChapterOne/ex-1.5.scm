#lang scheme

;; Exercise 1.5
;; Ben Bitdiddle has invented a test to determine whether the interpreter he is
;; faced with is using applicative-order evaluation or normal-order evaluation.
;; He defines the following two procedures:

(define (p) (p))

(define (test x y)
  (if (= x 0)
      0
      y))

;; Then he evaluates the expression:

(test 0 (p))

;; What behavior will Ben observe with an interpreter that uses applicative-order evaluation?
;; What behavior will he observe with an interpreter that uses normal-order evaluation?
;; Explain your answer.
;; (Assume that the evaluation rule for the special form if is the same whether the interpreter
;; is using normal or applicative order: The predicate expression is evaluated first, and the 
;; result determines whether to evaluate the consequent or the alternative expression.)

; When using an interpreter with applicative-order evaluation, the interpreter will try to
; simplify the operands as much as possible before executing the function. In this case, this
; will lead to an infinite loop.

(test 0 (p))

(test 0 (p))

(test 0 (p))
; and so on..

; When using normal-order evaluation on the other hand, the expression evaluates step by step
; like so:

(test 0 (p))

(if (= 0 0) 0 (p))

(if (#t) 0 (p))

0
