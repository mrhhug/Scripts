(loop for i from 2 to 1000000 do 
	(defparameter *string* (string (write-to-string i)))
	(defparameter *total* 0)
	(defparameter *running* (length *string*))
	(loop repeat *running* do (incf *total* (expt (parse-integer (subseq *string* (- *running* 1)  *running*)) 5)) (setq *running* (1- *running*)))
	;(print *string*)
	(if (= i *total*) (print i))
	)
