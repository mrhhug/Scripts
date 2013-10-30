(defun factor (n)
  "Return a list of factors of N."
  (when (> n 1)
    (loop with max-d = (isqrt n)
	  for d = 2 then (if (evenp d) (+ d 1) (+ d 2)) do
	  (cond ((> d max-d) (return (list n))) ; n is prime
		((zerop (rem n d)) (return (cons d (factor (truncate n d)))))))))
(defun vecterpusher()
  (vector-push-extend bri *jimmay*)
    (setf bri ""))
(defparameter counter 0)
(defparameter CURRENTNUM 600)
(defparameter consecutivenumbs/distinctprimes 4)
(defparameter conditional 1)

(loop do     
    (defparameter michal (prin1-to-string (factor CURRENTNUM) ))
    (defparameter bri "")
    (setf *jimmay* (make-array 0 :fill-pointer t :adjustable t))
    (loop for i from 1 to (- (length michal) 2 )do 
      (if (string= " " (subseq michal i (+ i 1) ) ) (vecterpusher) (setf bri (concatenate 'string bri (subseq michal i (+ i 1) ) ) ))
    )
    (vecterpusher)
    (delete-duplicates *jimmay* :test #'equal :from-end t)
    (if (= consecutivenumbs/distinctprimes (length *jimmay*)) (incf counter) (setf counter 0))
    (if (= consecutivenumbs/distinctprimes counter) (decf conditional) )  
    (incf CURRENTNUM)
while (< 0 conditional))
(print (- CURRENTNUM consecutivenumbs/distinctprimes)) ;;;;; i have the last number;  the problem asks for the first.




