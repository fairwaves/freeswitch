#!/bin/sh

PATH=$PATH:/bin:/usr/bin
mods=$1
on='[01;00;35m'
off='[0m'

prefix=`cat ../config.log | grep ^prefix=\' | awk -F \' '{print $2}'`
mods=${prefix}/mod;

if [ -z $mods ] ; then
    mods="/usr/local/freeswitch/mod"
fi

echo "Checking module integrity in target [$mods]"
echo

here=`pwd`

cd $mods
files=`ls mod_*.dylib mod_*.so 2>/dev/null`
cd $here

for i in $files ; do
    mod=${i%%.*}

    infile=`grep ^.*$mod\$ ../modules.conf`
    commented=`grep ^\#.*$mod\$ ../modules.conf`

    if [ -z "$infile" ] ; then
	echo "${on}WARNING: installed module: $i was not installed by this build.  It is not present in modules.conf.${off}"
    elif [ -n "$commented" ] ; then
	echo "${on}WARNING: installed module: $i was not installed by this build.  It is commented from modules.conf. [$commented]${off}"
    fi

done


echo
