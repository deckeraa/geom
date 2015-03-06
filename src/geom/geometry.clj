(ns geom.geometry)

(+ 3 2)

(defstruct point :x :y)
(defstruct line  :l :r)

(:x (struct point 1 2))

(defn length [line]
  (Math/sqrt 
   (+
    (Math/pow (- (:x (:l line)) (:x (:r line))) 2)
    (Math/pow (- (:y (:l line)) (:y (:r line))) 2))))
              
(length (struct line (struct point 0 0) (struct point 0 3)))
