(ns guestbook.core
  (:require [reagent.core :as r]
            [reagent.dom :as dom]))

;; [:tag-name {:attribute-key "attribute value"} tag body]
;; <tag-name attribute-key= "attribute value" >tag body</tag-name>
;; structure of vector representing the HTML nodes

(dom/render
 [:h1 "success, reagent add"]
 (.getElementById js/document "content"))