#!/bin/bash
#copypaste from http://ubuntuforums.org/showthread.php?t=718822
#thanks ahaslam !
mencoder x264.mkv -of mpeg -mpegopts format=dvd -srate 48000 -ofps 25 \
-ovc lavc -oac lavc -lavcopts vcodec=mpeg2video:threads=2:vrc_buf_size=1835:\
keyint=15:vrc_maxrate=9800:vbitrate=4900:mbd=2:mv0:trell:aspect=16/9:\
acodec=ac3:abitrate=256 -vf expand=aspect=16/9,scale=720:576,harddup -o dvd.mpeg2
# make iso image:
dvdauthor -t dvd.mpeg2 -o dvd/
dvdauthor -o dvd/ -T
mkisofs -dvd-video -v -o dvd.iso dvd
