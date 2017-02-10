#/bin/bash
NEW_DISPLAY=42

echo "Using first available display :${NEW_DISPLAY}"

OLD_DISPLAY=${DISPLAY}
bash script2.sh
vncserver ":${NEW_DISPLAY}" -localhost -geometry 1600x1200 -depth 16
export DISPLAY=:${NEW_DISPLAY}
