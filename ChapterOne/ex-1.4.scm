;; Exercise 1.4
;; Observe that our model of evaluation allows for combinations whose operators
;; are compound expressions. Use this observation to describe the behavior of the
;; following procedure:

(define (a-plus-abs-b a b)
  ((if (> b 0) + -) a b))

; If b > 0, the if statement returns +, else it returns -.
; This means that the body of a-plus-abs-b becomes (+ a b) if b > 0 and (- a b) if b <= 0.
; Thus, this procedure returns a plus the absolute value of b.
