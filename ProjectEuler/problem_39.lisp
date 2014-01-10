(loop for p from 1 to 1000 do
  (defparameter *count* 0)
  (loop for j from 1 to 1000 do
    (loop for k from 1 to 1000 do
      (defparameter c2  (sqrt (+ (* j j) (* k k))))
;;       (print c2)
      (if (= p (+ j k c2)) (incf *count*))
    )
  )
  (defparameter *total* (/ *count* 2))
  (if (< 0 *total*) (print (concatenate 'string (string (write-to-string p)) "  :  " (string (write-to-string *total*)) )))
)