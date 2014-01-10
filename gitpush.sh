#!/bin/bash
for i in {'ACM-ICPC','CS3540'}
do
	cd $HOME/School/CSCI/$i
	echo 'Start '$i
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End '$i
done
for i in {$HOME/Scripts,'/srv/http'}
do
	cd $i
	echo 'Start '$i
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End '$i
done
