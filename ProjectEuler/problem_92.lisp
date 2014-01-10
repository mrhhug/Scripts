(defparameter eightynine 0)
(defparameter one 0)

(defun incramentone()
  (incf one)
)

(defun incramenteightynine()
  (incf eightynine)
)

(defun dowork(*my-string*)
  (defparameter total 0)
  (defparameter count 0)
  (loop for i from 0 to (- (length *my-string*) 1) do 
    (setf *my-sub* (subseq *my-string* i (+ 1 i)))
    (setf count (* (parse-integer *my-sub*) (parse-integer *my-sub*)))
    (setf total (+ count total))
  )
;;   (print total)
  (if (= 89 total) (incramenteightynine) (if (= 1 total) (incramentone) (dowork (write-to-string total)) ))
)

(loop for i from 1 to 10000000 do 
(defparameter *my-string* (write-to-string i))
;; (print *my-string*)
(dowork *my-string*)
)
(print eightynine)
