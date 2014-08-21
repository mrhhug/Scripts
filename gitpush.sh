#!/bin/bash
for i in {'CS4500','CS4850'}
do
	cd $HOME/School/CSCI/$i
	echo 'Start '$i
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End '$i
done

#for i in {$HOME/Scripts} #,'/srv/http'}
#do
	cd $HOME/Scripts
	echo 'Start ' Scripts
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End ' Scripts
#done

#for i in {MATH\ 3332} #,'/srv/http'}
#do
	cd $HOME/School/MATH/MATH\ 3332
	echo 'Start 'MATH 3332
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End 'MATH 3332
#done
exit 0
