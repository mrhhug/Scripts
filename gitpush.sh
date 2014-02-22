#!/bin/bash
for i in {'CS3540','CS4150','CS3610','CS3510'}
do
	cd $HOME/School/CSCI/$i
	echo 'Start '$i
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End '$i
done
cd ~/School/Clubs/ACM/CommonsMenuApp
echo 'Start CommonsMenuApp'
git add -A
git commit -m 'commit from script'
git push origin master
echo 'End CommonsMenuApp'
for i in {$HOME/Scripts,'/srv/http'}
do
	cd $i
	echo 'Start '$i
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End '$i
done
