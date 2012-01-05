#!/bin/sh
#
# admin.sh
#		#basic script to launch the GPOS admin app.  
#		change the share and etc location if you want to point to a different directory
#		
# Version:  @(#) freemercator/bin/run.sh 1.00 (please complete)
#		1.01 piero de salvia dynamically load jars 18Apr2003
#
# Author:	(please complete)
#

# source jarfind
. ./lcp.sh
jarfind ./../thirdparty

if [ -n "$CLASSPATH" ]
then
   LOCALCLASSPATH=$CLASSPATH:$LOCALCLASSPATH
fi

/opt/jdk1.6.0_04/bin/java -Dlog4j.configuration="../etc/log4j.properties" -DSHARE="../share/" -classpath ../lib/mercator.jar:../etc/:$LOCALCLASSPATH com.globalretailtech.admin.ConfigMain $@