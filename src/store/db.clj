(ns store.db)

(def order1 {:user 15
             :itens {:bag {:id :bag :quantity 2 :price 80}
                     :t-shirt {:id :t-shirt :quantity 3 :price 40}
                     :shoes {:id :shoes :quantity 1}
                     }
             })

(def order2 {:user 15
             :itens {:bag {:id :bag :quantity 1 :price 80}
                     :t-shirt {:id :t-shirt :quantity 3 :price 40}
                     :shoes {:id :shoes :quantity 1}
                     }
             })

(def order3 {:user 12
             :itens {:bag {:id :bag :quantity 2 :price 80}
                     :t-shirt {:id :t-shirt :quantity 3 :price 40}
                     :shoes {:id :shoes :quantity 1}
                     }
             })

(def order4 {:user 14
             :itens {:bag {:id :bag :quantity 2 :price 80}
                     :t-shirt {:id :t-shirt :quantity 3 :price 40}
                     :shoes {:id :shoes :quantity 1}
                     }
             })

(def order5 {:user 10
             :itens {:bag {:id :bag :quantity 20 :price 80}
                     :t-shirt {:id :t-shirt :quantity 3 :price 40}
                     :shoes {:id :shoes :quantity 1}
                     }
             })

(def order6 {:user 20
             :itens {:bag {:id :bag :quantity 2 :price 80}
                     :t-shirt {:id :t-shirt :quantity 10 :price 40}
                     :shoes {:id :shoes :quantity 1}
                     }
             })

(defn all-orders []
  [order1 order2 order3 order4 order5 order6])
