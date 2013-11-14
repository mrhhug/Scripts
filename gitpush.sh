for i in 'ACM-ICPC','CS4520','CS3530','CS3310' 
do
	cd ~/School/CSCI/$i
	echo 'Start $i'
	git add -A
	git commit -m 'commit from script'
	git push origin master
	echo 'End $i'
done
cd ~/Scripts
git add -A
git commit -m 'commit from script'
git push origin master
cd /srv/http
git add -A
git commit -m 'commit from script'
git push origin master
