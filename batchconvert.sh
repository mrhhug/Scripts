#for f in *.flv; do ffmpeg -i "$f" "${f%.m4a}.mp3"; done
#for f in *.mp4; do ffmpeg -i "$f" "${f%.m4a}.mp3"; done
#
#for f in *.flv; do mplayer -ao pcm:file="${f%.flv}.mp3" "$f"; done
#for f in *.mp4; do mplayer -ao pcm:file="${f%.mp4}.mp3" "$f"; done
#
#these damn mplayer scripts ephin make you watch the video - consider ffmpeg
#
#
#youtubes been using all mp4s if you find a flv you'll need to change this
#
for f in *.mp4; do ffmpeg -i "$f" "${f%.mp4}.mp3"; done

