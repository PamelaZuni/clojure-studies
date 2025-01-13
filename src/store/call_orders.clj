(ns store.call-orders
 (:require [store.db :as db]))

(println (db/all-orders))

(println (group-by :user (db/all-orders)))

(defn my-group-function
  [element]
  ;(println "element" element)
  (:user element))

(println (group-by my-group-function (db/all-orders)))

;I want to know how many orders has by user, then I used the function group-by
;It groups with function group-by and returns a key with user id and the value is a vector with all orders.
;For example user 15 has 2 orders...
;{15 [{:user 15, :itens {:bag {:id :bag, :quantity 2, :price 80}, :t-shirt {:id :t-shirt, :quantity 3, :price 40}, :shoes {:id :shoes, :quantity 1}}} {:user 15, :itens {:bag {:id :bag, :quantity 1, :price 80}, :t-shirt {:id :t-shirt, :quantity 3, :price 40}, :shoes {:id :shoes, :quantity 1}}}], 12 [{:user 12, :itens {:bag {:id :bag, :quantity 2, :price 80}, :t-shirt {:id :t-shirt, :quantity 3, :price 40}, :shoes {:id :shoes, :quantity 1}}}], 14 [{:user 14, :itens {:bag {:id :bag, :quantity 2, :price 80}, :t-shirt {:id :t-shirt, :quantity 3, :price 40}, :shoes {:id :shoes, :quantity 1}}}], 10 [{:user 10, :itens {:bag {:id :bag, :quantity 20, :price 80}, :t-shirt {:id :t-shirt, :quantity 3, :price 40}, :shoes {:id :shoes, :quantity 1}}}], 20 [{:user 20, :itens {:bag {:id :bag, :quantity 2, :price 80}, :t-shirt {:id :t-shirt, :quantity 10, :price 40}, :shoes {:id :shoes, :quantity 1}}}]}
