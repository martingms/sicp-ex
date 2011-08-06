;; Exercise 1.7
;; The good-enough? test used in computing square roots will not be very effective
;; for finding the square roots of very small numbers. Also, in real computers,
;; arithmetic operations are almost always performed with limited precision.
;; This makes our test inadequate for very large numbers. Explain these statements,
;; with examples showing how the test fails for small and large numbers.
;; An alternative strategy for implementing good-enough? is to watch how guess changes
;; from one iteration to the next and to stop when the change is a very small fraction
;; of the guess. Design a square-root procedure that uses this kind of end test.
;; Does this work better for small and large numbers?

; The original good-enough?-function.
; It works by returning true when the difference between the square of the guess and
; the original number is less than 0.001.
(define (good-enough? guess x)
  (< (abs (- (square guess) x)) 0.001))

; This function obviously breaks down on small numbers, for a few different reasons.
; One is the fact that the square of a number smaller than zero is an even smaller number.
; This means that if you guess that 0.002 is the square root of 0.001 for example, it would
; return true.

; On very large numbers the function also breaks down. This is caused by the fact that the
; computer is unable to represent so tiny differences between large numbers, and the
; sqrt-algorithm never terminates.

; A better function could be something like this:

; This function returns true if the absolute value of the difference between one guess
; and the next is less than 0.001 times the original guess.
(define (new-good-enough? guess x)
  (< (abs (- (improve guess x) guess))
     (abs (* guess 0.001)))

; This works better for both small and large numbers because the test is relative to
; the size of the guess. This means that for a very small number, we will enjoy increased
; precision, while for a large number the function will be very precise yet still terminate
; at some point.



