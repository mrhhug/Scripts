#!/bin/bash

gcc ./$1.c -o ./$1.out -lm -std=gnu99 && ./$1.out
