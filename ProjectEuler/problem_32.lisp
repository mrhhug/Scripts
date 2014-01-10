(loop for i from 2 to 100000 do 
   (loop for j from 2 to 100000 do
    (defparameter *running* (* i j))
    (defparameter *string* (concatenate  'string (string (write-to-string i)) (string (write-to-string j)) (string (write-to-string *running*))))
    (defparameter *total* 0)
    (defparameter *running* (length *string*))
    (loop repeat *running* do (incf *total* (parse-integer (subseq *string* (- *running* 1)  *running*))) (setq *running* (1- *running*)))
    (if (string= (sort *string* #'string<) "123456789") (print (concatenate  'string (string (write-to-string i)) " " (string (write-to-string j)) " " (string (write-to-string (* j i))))))
  )
); dude do not forget to omit the dups. once you get a number from column 2 in column 1 kill program, add products 48 * 148 will do it
; answer = 45228