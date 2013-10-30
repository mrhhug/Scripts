#! /usr/bin/python
#Michael's script, running list of dependancies: python ffmpeg(source http://ubuntuforums.org/showthread.php?t=786095) Arista http://www.transcoder.org/presets/

master = raw_input("gimme your original: ")
output = raw_input("Can i have your desired basename: ")
import os
os.system("ffmpeg -i "+master +" -y -an -v 1 -acodec mp4a.40.2 -vcodec libx264 -b 500k -bt 175k -refs 1 -deblockalpha 0 -deblockbeta 0 -subq 1 -bf 0 -level 30 -g 300 -keyint_min 30 -sc_threshold 40 -rc_eq 'blurCplx^(1-qComp)' -qcomp 0.7 -qmax 51 -qdiff 4 -i_qfactor 0.71428572 -maxrate 768k -bufsize 2M -cmp 1 -f mp4 -pass 1 /dev/null")
import os
os.system("ffmpeg -i "+master +" -y -v 1  -acodec mp4a.40.2 -vcodec libx264 -b 500k -bt 175k -refs 1 -deblockalpha 0 -deblockbeta 0 -subq 6 -bf 0 -level 30 -g 300 -keyint_min 30 -sc_threshold 40 -rc_eq 'blurCplx^(1-qComp)' -qcomp 0.7 -qmax 51 -qdiff 4 -i_qfactor 0.71428572 -maxrate 768k -bufsize 2M -cmp 1 -acodec libfaac -ab 96 -ar 48000 -ac 2 -f mp4 -pass 2 " +output +".mp4")
import os
os.remove('ffmpeg2pass-0.log')
import os
os.remove('x264_2pass.log')
import os
os.remove('x264_2pass.log.mbtree')
import os
os.system("ffmpeg -i " +master +" " +output +".ogv -strict experimental -acodec vorbis -vcodec theora -f ogg")
import os
os.system("arista-transcode " +output +".ogv" +" " +output +".webm")
print "Created a txt file so your lazy ass can copy and paste."
text_file = open("copypaste.txt", "w")
text_file.write("<video width=\"TODO\" height=\"TODO\" controls preload=\"none\">\n")
text_file.write("    <source src=\"" +output +"\".mp4\" type=\'video/mp4; codecs=\"avc1.42E01E, mp4a.40.2\"\'>\n")
text_file.write("    <source src=\"" +output +"\".webm\" type=\'video/webm; codecs=\"vp8, vorbis\"\'>\n")
text_file.write("    <source src=\"" +output +"\".ogv\"  type=\'video/ogg; codecs=\"theora, vorbis\"\'>\n")
text_file.write("</video>")
text_file.close()

#/home/michael/Desktop/temp/sample.avi
