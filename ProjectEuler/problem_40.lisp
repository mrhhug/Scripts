(defparameter *concanating* "")
(defparameter *count* 0)
(defparameter original 0)

(defun firstone(i *count* num)
  ;(print *count*)
  (print "")
  (defparameter str (string (write-to-string i)))
  (print (char str (- (length str) (- *count* (- num 1) ) ) ))
  (print " ")
  (setf original num)
)

;; (loop for original from 1 to 999 do
;;   (setf *count* (+ *count* (length(string (write-to-string original)))))
;;    (if (= *count* 1) (print original))
;;    (if (= *count* 11) (print original))
;;    (if (= *count* 101) (print original))
;;    ;(if (> *count* 100) (firstone original *count*))
;;    ;(if (> *count* 1001) (progn (more original *count*) (print *count*)))
;; )
(setf original 0)
(setf *count* 0)
(loop for original from 1 to 10 do
  (setf *count* (+ *count* (length(string (write-to-string original)))))
   (if (> *count* 10) (firstone original *count* 10))
)
(setf original 0)
(setf *count* 0)
(loop for original from 1 to 100 do
  (setf *count* (+ *count* (length(string (write-to-string original)))))
   (if (> *count* 100) (firstone original *count* 100))
)
(setf original 0)
(setf *count* 0)
(loop for original from 1 to 1000 do
  (setf *count* (+ *count* (length(string (write-to-string original)))))
   (if (> *count* 1000) (firstone original *count* 1000))
)
(setf original 0)
(setf *count* 0)
(loop for original from 1 to 10000 do
  (setf *count* (+ *count* (length(string (write-to-string original)))))
   (if (> *count* 10000) (firstone original *count* 10000))
)
(setf original 0)
(setf *count* 0)
(loop for original from 1 to 100000 do
  (setf *count* (+ *count* (length(string (write-to-string original)))))
   (if (> *count* 100000) (firstone original *count* 100000))
)
(setf original 0)
(setf *count* 0)
(loop for original from 1 to 1000000 do
  (setf *count* (+ *count* (length(string (write-to-string original)))))
   (if (> *count* 1000000) (firstone original *count* 1000000))
)

(print "multiply the above to get an answer of 210")
;; (loop for i from 1 to 27767 do
;;   (setf *concanating* (concatenate 'string *concanating* (string (write-to-string i)) ))
;;   (if (< (length *concanating*) 9999) (setf *count* i))
;; 
;; ;; )
;; (print (char *concanating* 0))
;; (print (char *concanating* 9))
;; (print (char *concanating* 99))
;; (print (char *concanating* 999))
;; (print (char *concanating* 9999))
;; (print *count*)
;; 
;; (loop for i from 27767 to 277670 do
;;   (setf *concanating* (concatenate 'string *concanating* (string (write-to-string i))))
;; )
;; (print (char *concanating* 90000))|#
;(print (char *concanating* 99999))


;; ;; ;; ;; ;; ;; ;; ;; (loop for i from 1 to 10000000 do
;; ;; ;; ;; ;; ;; ;; ;;   ;(setf *concanating1* (concatenate 'string *concanating1* (string (write-to-string i)))) \
;; ;; ;; ;; ;; ;; ;; ;;   (setf *count* (+ *count* (length (string (write-to-string i)) )))
;; ;; ;; ;; ;; ;; ;; ;;   (if (= *count* 1) (progn (print i) (setf i 10000001) ))
;; ;; ;; ;; ;; ;; ;; ;; )
;; ;; ;; ;; ;; ;; ;; ;; 
;; ;; ;; ;; ;; ;; ;; ;; (loop for i from 1 to 9999999999999999999999 do
;; ;; ;; ;; ;; ;; ;; ;;   (setf *count* (+ *count* (length (string (write-to-string i)) )))
;; ;; ;; ;; ;; ;; ;; ;;   (if (> *count* 10) (progn (print i) (setf i 9999999999999999999999) ))
;; ;; ;; ;; ;; ;; ;; ;; )
;; ;; ;; ;; ;; ;; ;; ;; (loop for i from 10 to 9999999999999999999999 do
;; ;; ;; ;; ;; ;; ;; ;;   (setf *count* (+ *count* (length (string (write-to-string i)) )))
;; ;; ;; ;; ;; ;; ;; ;;   (if (> *count* 100) (progn (print i) (setf i 9999999999999999999999) ))
;; ;; ;; ;; ;; ;; ;; ;; )
;; ;; ;; ;; ;; ;; ;; ;; (loop for i from 100 to 9999999999999999999999 do
;; ;; ;; ;; ;; ;; ;; ;;   (setf *count* (+ *count* (length (string (write-to-string i)) )))
;; ;; ;; ;; ;; ;; ;; ;;   (if (> *count* 1000) (progn (print i) (setf i 9999999999999999999999) ))
;; ;; ;; ;; ;; ;; ;; ;; )
;; ;; ;; ;; ;; ;; ;; ;; (loop for i from 1000 to 9999999999999999999999 do
;; ;; ;; ;; ;; ;; ;; ;;   (setf *count* (+ *count* (length (string (write-to-string i)) )))
;; ;; ;; ;; ;; ;; ;; ;;   (if (> *count* 10000) (progn (print i) (setf i 9999999999999999999999) ))
;; ;; ;; ;; ;; ;; ;; ;; )
;; ;; ;; ;; ;; ;; ;; ;; (loop for i from 10000 to 9999999999999999999999 do
;; ;; ;; ;; ;; ;; ;; ;;   (setf *count* (+ *count* (length (string (write-to-string i)) )))
;; ;; ;; ;; ;; ;; ;; ;;   (if (> *count* 1000000) (progn (print i) (setf i 9999999999999999999999) ))
;; ;; ;; ;; ;; ;; ;; ;; )
;; ;; ;; ;; ;; ;; ;; ;; (loop for i from 1000000 to 9999999999999999999999 do
;; ;; ;; ;; ;; ;; ;; ;;   (setf *count* (+ *count* (length (string (write-to-string i)) )))
;; ;; ;; ;; ;; ;; ;; ;;   (if (> *count* 10000000) (progn (print i) (setf i 9999999999999999999999) ))
;; ;; ;; ;; ;; ;; ;; ;; )
;; ;; ;; ;; ;; ;; ;; ;; ;(print *count*)