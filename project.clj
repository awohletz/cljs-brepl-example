(defproject cljs-brepl-example "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :min-lein-version "2.0.0"
            :dependencies [[org.clojure/clojure "1.6.0"]
                           [org.clojure/clojurescript "0.0-2371"]]
            :plugins [[lein-cljsbuild "1.0.3"]]
            :hooks [leiningen.cljsbuild]
            :cljsbuild {
                        :builds [{:source-paths ["src"]
                                  :compiler     {:output-to     "resources/public/main.js"
                                                 :optimizations :whitespace
                                                 :pretty-print  true}}]})