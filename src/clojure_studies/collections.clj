(ns clojure-studies.collections)


(println "\n\n\n\nMy Map")
(defn my-map
  [function sequential]
  (let [first (first sequential)]
    (if (not (nil? first))
      (do
        (function first
          (my-map function (rest sequential)))))))
(my-map println ["Joey" "Ross" "Monica" "Chandler" "Rachel"])
(my-map println ["Joey" false "Ross" "Monica" "Chandler" "Rachel"])
