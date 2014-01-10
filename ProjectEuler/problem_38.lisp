;; (loop for i from 2 to 9876543211 do
;;   (defparameter *concanating* "")
;;   (loop for j from 1 to 9 do 
;;     (setf *string* (string (write-to-string (* i j))))
;;     (defparameter *concanating* (concatenate 'string *string* *concanating*))
;;   )
;; ;;   (print *concanating*)
;;   (if (string= (sort *concanating* #'string<) "123456789") (print i))
;; )

(loop for i from 2 to 10000 do
  (defparameter *concanating* "")
  (setf j 1)
  (loop for j from 1 to 4 do 
;;     (print i)
;;     (print j)
;;     (print *concanating*)
    (setf h (* i j))
    (if (> h 9876543211) (setf j 9876543211))
    (setf *string* (string (write-to-string h)))
;;     (print *concanating*)
    (defparameter *result* (concatenate 'string *concanating* *string*))
    (setf *concanating* (concatenate 'string *concanating* *string*))
    (if (string= (sort *result* #'string<) "123456789") (print *concanating*))
  )
)
;;;;;;;;answer is 932718654. 