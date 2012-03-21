#!/bin/sh

for x in target/dependency/*.jar;
do
    export CLASSPATH=$CLASSPATH:$x;
done

groovy wsclient.gv