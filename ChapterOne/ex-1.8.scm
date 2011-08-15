#lang scheme

;; Exercise 1.8
;; Newton's method for cube roots is based on the fact that if y is an approximation 
;; to the cube root of x, then a better approximation is given by the value
;; ((r/y^2)+2y)/3
;; Use this formula to implement a cube-root procedure analogous to the
;; square-root procedure.

(define (cube-root-iter guess x)
  (if (good-enough? guess x) guess
      (cube-root-iter (improve guess x) x)))

(define (improve guess x)
  (average guess (new-approximation guess x)))

(define (new-approximation guess x)
  (/ (+ (/ x (square guess))
        (* 2 guess))
     3))

(define (square x)
  (* x x))

(define (average x y)
  (/ (+ x y) 2))

; Same good-enough function as exercise 1.7.
(define (good-enough? guess x)
  (< (abs (- (improve guess x) guess))
     (abs (* guess 0.001)))) ; make this number smaller to increase precision

(define (cube-root x)
  (cube-root-iter 1.0 x))

(cube-root 1) ; should be 1
; 1.0

(cube-root 8) ; should be 2
; 2.0030460006435002

(cube-root 27); should be 3
; 3.0037346267695018



