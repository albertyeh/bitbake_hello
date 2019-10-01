#Step 1:<br />
	cp -Rf meta-tym into QCS405_WS/apps_proc/poky <br />
<br />
#Step 2:<br />
	<QCS405_WS>$ cd apps_proc/poky<br />
	<QCS405_WS>/apps_proc/poky$export SHELL=/bin/bash<br />
	<QCS405_WS>/apps_proc/poky$source build/conf/set_bb_env.sh<br />
<br />
#Step 3:<br />
	build-qcs405-som1-qsap-perf-image<br />
or<br />
	MACHINE=qcs405-som1 ; DISTRO=qsap ; VARIANT=perf  ; bitbake tym-hello<br />
<br />
  
