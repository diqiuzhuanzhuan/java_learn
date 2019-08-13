#!/usr/bin/env bash

g++ -I/Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/include/ -I/Library/Java/JavaVirtualMachines/jdk1.8.0_91.jdk/Contents/Home/include/darwin  -dynamiclib sample1.cpp  -o sample1.dylib
