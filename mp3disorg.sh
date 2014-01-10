#!/bin/bash

#This was written my Michael Hug
#this script puts all your mp3s into one directory(up to 5 subdirectories) removing the subdirectories, and placeing them all into one vat
#also removed anything extra windows might add, like images and torrentdata
#Dependancy = xutils-dev
echo will remove mpu too + if you have 2 files same name different subdirectory, it will overwrite
#identify path here
DIR="/home/michael/Music/"
#DIR="/mnt/500gbstorage/michaelbackup/Music/"
echo cd $DIR
cd $DIR
echo
echo "Is this alright with you Michael (y?) "
read INPUT
if [[ $INPUT == "Y" || $INPUT == "y" || $INPUT == "YES" || $INPUT == "yes" ]]; then
        echo "yes sir"
else
        exit
fi

rm $DIR*/*.alb
rm $DIR*/*/*.alb
rm $DIR*/*/*/*.alb
rm $DIR*/*/*/*/*.alb
rm $DIR*/*.cue
rm $DIR*/*/*.cue
rm $DIR*/*/*/*.cue
rm $DIR*/*/*/*/*/.cue
rm $DIR*/*.CUE
rm $DIR*/*/*.CUE
rm $DIR*/*/*/*.CUE
rm $DIR*/*/*/*/*.CUE
rm $DIR*/*.wpl
rm $DIR*/*/*.wpl
rm $DIR*/*/*/*.wpl
rm $DIR*/*/*/*/*.wpl
rm $DIR*/*/*.wpl
rm $DIR*/*/*/*.wpl
rm $DIR*/*/*/*/*.wpl
rm $DIR*/*/*.wpl
rm $DIR*/*/*/*.wpl
rm $DIR*/*/*/*/*.wpl
rm $DIR*/*/*.wpl
rm $DIR*/*/*/*.wpl
rm $DIR*/*/*/*/*.wpl
rm $DIR*/*/*.wpl
rm $DIR*/*/*/*.wpl
rm $DIR*/*/*/*/*.wpl
rm $DIR*/*/*.wpl
rm $DIR*/*/*/*.wpl
rm $DIR*/*/*/*/*.wpl
rm $DIR*/*.html
rm $DIR*/*/*.html
rm $DIR*/*/*/*.html
rm $DIR*/*/*/*/*.html
rm $DIR*/*.htm
rm $DIR*/*/*.htm
rm $DIR*/*/*/*.htm
rm $DIR*/*/*/*/*.html
rm $DIR*/*.chm
rm $DIR*/*/*.chm
rm $DIR*/*/*/*.chm
rm $DIR*/*/*/*/*.cmh
rm $DIR*/*.ion
rm $DIR*/*/*.ion
rm $DIR*/*/*/*.ion
rm $DIR*/*/*/*/*.ion
rm $DIR*/*.exe
rm $DIR*/*/*.exe
rm $DIR*/*/*/*.exe
rm $DIR*/*/*/*/*.exe
rm $DIR*/*.itl
rm $DIR*/*/*.itl
rm $DIR*/*/*/*.itl
rm $DIR*/*/*/*/*.itl
rm $DIR*/*.pdf
rm $DIR*/*/*.pdf
rm $DIR*/*/*/*.pdf
rm $DIR*/*/*/*/*.pdf
rm $DIR*/*.dll
rm $DIR*/*/*.dll
rm $DIR*/*/*/*.dll
rm $DIR*/*/*/*/*.dll
rm $DIR*/*.dat
rm $DIR*/*/*.dat
rm $DIR*/*/*/*.dat
rm $DIR*/*/*/*/*.dat
rm $DIR*/*.doc
rm $DIR*/*/*.doc
rm $DIR*/*/*/*.doc
rm $DIR*/*/*/*/*.doc
rm $DIR*/*.txt
rm $DIR*/*/*.txt
rm $DIR*/*/*/*.txt
rm $DIR*/*/*/*/*.txt
rm $DIR*/*.Jpg
rm $DIR*/*/*.Jpg
rm $DIR*/*/*/*.Jpg
rm $DIR*/*/*/*/*.Jpg
rm $DIR*/*.JPEG
rm $DIR*/*/*.JPEG
rm $DIR*/*/*/*.JPEG
rm $DIR*/*/*/*/*.JPEG
rm $DIR*/*.jpeg
rm $DIR*/*/*.jpeg
rm $DIR*/*/*/*.jpeg
rm $DIR*/*/*/*/*.jpeg
rm $DIR*/*.JPG
rm $DIR*/*/*.JPG
rm $DIR*/*/*/*.JPG
rm $DIR*/*/*/*/*.JPG
rm $DIR*/*.jpg
rm $DIR*/*/*.jpg
rm $DIR*/*/*/*.jpg
rm $DIR*/*/*/*/*.jpg
rm $DIR*/*.gif
rm $DIR*/*/*.gif
rm $DIR*/*/*/*.gif
rm $DIR*/*/*/*/*.gif
rm $DIR*/*.png
rm $DIR*/*/*.png
rm $DIR*/*/*/*.png
rm $DIR*/*/*/*/*.png
rm $DIR*/*.INI
rm $DIR*/*/*.INI
rm $DIR*/*/*/*.INI
rm $DIR*/*/*/*/*.INI
rm $DIR*/*.ini
rm $DIR*/*/*.ini
rm $DIR*/*/*/*.ini
rm $DIR*/*/*/*/*.ini
rm $DIR*/*.db
rm $DIR*/*/*.db
rm $DIR*/*/*/*.db
rm $DIR*/*/*/*/*.db
rm $DIR*/*.xml
rm $DIR*/*/*.xml
rm $DIR*/*/*/*.xml
rm $DIR*/*/*/*/*.xml
rm $DIR*/*.pnm
rm $DIR*/*/*.pnm
rm $DIR*/*/*/*.pnm
rm $DIR*/*/*/*/*.pnm
rm $DIR*/*.nfo
rm $DIR*/*/*.nfo
rm $DIR*/*/*/*.nfo
rm $DIR*/*/*/*/*.nfo
rm $DIR*/*.m3u
rm $DIR*/*/*.m3u
rm $DIR*/*/*/*.m3u
rm $DIR*/*/*/*/*.m3u
rm $DIR*/*.m4p
rm $DIR*/*/*m4p
rm $DIR*/*/*/*m4p
rm $DIR*/*/*/*/*m4p
rm $DIR*/*.rar
rm $DIR*/*/*.rar
rm $DIR*/*/*/*.rar
rm $DIR*/*/*/*/*.rar

mv -f $DIR*/*.* ./
mv -f $DIR*/*/*.* ./
mv -f $DIR*/*/*/*.* ./
mv -f $DIR*/*/*/*/*.* ./

cleanlinks
echo everything should be fine :/
