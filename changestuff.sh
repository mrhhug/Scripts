#! /bin/bash
echo dude
sed -i 's/Type in your name here/Michael Hug/' ./*.html
var1="Great collection of free templates <a href="http://www.websitetemplatesonline.com" target="_blank">here</a>. | <a href="http://www.getjoomlatemplatesfree.com/" title="Joomla!">www.GetJoomlaTemplatesFree.com</a>. Templates best for Joomla."
sed -i 's/$var1//' ./*.html
